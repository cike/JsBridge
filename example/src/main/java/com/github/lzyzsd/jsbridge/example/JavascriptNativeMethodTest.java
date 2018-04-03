package com.github.lzyzsd.jsbridge.example;

import android.util.Log;

import com.github.lzyzsd.jsbridge.CallBackFunction;
import com.github.lzyzsd.jsbridge.JavascriptEnterInterface;

/**
 * Created by cike on 18-3-13.
 */

public class JavascriptNativeMethodTest {

    @JavascriptEnterInterface(methodName = "submitFromWeb")
    public void submit(String params, CallBackFunction callBackFunction) {
        Log.i(JavascriptNativeMethodTest.class.getSimpleName(), "handler = submitFromWeb, data from web = " + params);
        callBackFunction.onCallBack("submitFromWeb exe, response data 我正在通过回调方法传递结果" + Math.random() * 10);
    }

    @JavascriptEnterInterface(methodName = "test2")
    public void submit2(String params, CallBackFunction callBackFunction) {
        Log.i(JavascriptNativeMethodTest.class.getSimpleName(), "handler = submitFromWeb, data from web = " + params);
        callBackFunction.onCallBack("test1 exe, response data :" + Math.random() * 10);
    }
}
