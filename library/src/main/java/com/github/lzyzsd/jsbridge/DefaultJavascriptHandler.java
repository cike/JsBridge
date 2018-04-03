package com.github.lzyzsd.jsbridge;

/**
 * Created by cike on 18-3-13.
 */

public class DefaultJavascriptHandler {

    public void handler(String data, CallBackFunction function) {
        if(function != null){
            function.onCallBack("默认的处理结果");
        }
    }
}
