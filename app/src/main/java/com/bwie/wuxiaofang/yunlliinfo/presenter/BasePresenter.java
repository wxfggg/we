package com.bwie.wuxiaofang.yunlliinfo.presenter;

import android.mtp.MtpConstants;

import com.bwie.wuxiaofang.yunlliinfo.view.iview.Imvp;

/**
 * desc:
 * author:吴晓芳
 * date:
 */

public class BasePresenter<T extends Imvp> {
    public T tm;
    public T getT(){
        return tm;
    }
    public void attachView(T t){
        this.tm=t;
    }
}
