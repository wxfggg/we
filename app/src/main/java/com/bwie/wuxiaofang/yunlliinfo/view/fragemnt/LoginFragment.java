package com.bwie.wuxiaofang.yunlliinfo.view.fragemnt;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.bwie.wuxiaofang.yunlliinfo.R;

/**
 * desc:
 * author:吴晓芳
 * date:
 */

public class LoginFragment extends Fragment {

    private TextView include_btn_back;
    private TextView include_btn_haveUploaded;
    private View include_title;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.homefragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initView();
    }

    private void initView() {
        include_title = (View) getView().findViewById(R.id.include_title);
        include_btn_back = (TextView) include_title.findViewById(R.id.include_btn_back);
        include_btn_haveUploaded = (TextView) include_title.findViewById(R.id.include_btn_haveUploaded);
        include_btn_back.setVisibility(View.INVISIBLE);
        include_btn_haveUploaded.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);




    }
}
