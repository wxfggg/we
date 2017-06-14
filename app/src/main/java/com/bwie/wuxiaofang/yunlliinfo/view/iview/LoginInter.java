package com.bwie.wuxiaofang.yunlliinfo.view.iview;

/**
 * desc:
 * author:吴晓芳
 * date:
 */

public interface LoginInter<T> extends Imvp  {
    void getDataSuccess(T data);
    void getDataFail(T data,T errorCode);
}
