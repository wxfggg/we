package com.bwie.wuxiaofang.yunlliinfo.view.fragemnt;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bwie.wuxiaofang.yunlliinfo.R;

/**
 * desc:
 * author:吴晓芳
 * date:
 */

public class UploadFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.uploadfragment,container,false);
    }
}
