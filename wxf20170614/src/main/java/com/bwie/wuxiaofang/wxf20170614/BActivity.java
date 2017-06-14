package com.bwie.wuxiaofang.wxf20170614;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * desc:
 * author:吴晓芳
 * date:
 */

public class BActivity extends AppCompatActivity {

    private EditText text;
    private Button btn_back;
    private Context myContext;
    private Intent intent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        initView();
        setClick();
    }

    private void setClick() {
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
intent.putExtra("sec",text.getText().toString());
setResult(1000,intent);

finish();
            }
        });
    }

    private void initView() {
        myContext = BActivity.this;
        text = (EditText) findViewById(R.id.text);
        btn_back = (Button) findViewById(R.id.btn_back);

        intent = getIntent();
        String name = intent.getStringExtra("name");
        String pwd = intent.getStringExtra("pwd");

        text.setText(name+"---"+pwd);

    }
}
