package com.bwie.wuxiaofang.wxf20170614;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edit_name;
    private EditText edit_pwd;
    private Button btn_jump;
    private String name;
    private String pwd;
    private Context myContext;
    private StringBuffer bufferName;
    private StringBuffer bufferNPwd;
    private TextView firsttext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        setClick();
    }

    private void setClick() {
        btn_jump.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {

                name = edit_name.getText().toString();
                pwd = edit_pwd.getText().toString();
                if (TextUtils.isEmpty(name)){
                    Toast.makeText(myContext,"用户名不能为空",Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty(pwd)){
                    Toast.makeText(myContext,"密码不能为空",Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(myContext, BActivity.class);
                    intent.putExtra("name",name.toString());
                    intent.putExtra("pwd",pwd.toString());

                    startActivityForResult(intent,200);
                }
            }
        });
    }

    private void initView() {
        myContext = MainActivity.this;

        edit_name = (EditText) findViewById(R.id.edit_name);
        edit_pwd = (EditText) findViewById(R.id.edit_pwd);
        btn_jump = (Button) findViewById(R.id.btn_jump);
        firsttext = (TextView) findViewById(R.id.firsttext);
    }

    @Override
    protected void onPause() {
        super.onPause();

        bufferName = new StringBuffer(name);
        bufferNPwd = new StringBuffer(pwd);
        bufferName.append("onPause");
        bufferNPwd.append("onPause");

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == 1000&&requestCode==200) {
        firsttext.setText(data.getStringExtra("sec"));
        }
            super.onActivityResult(requestCode, resultCode, data);
        }

}
