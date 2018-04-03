package com.github.lzyzsd.jsbridge.model;

/**
 * Created by cike on 18-3-13.
 */

public class InjectModel {
    String canonicalName;           //注入网页window中方法的类的全路径名称
    String methodName;              //native注入的方法的名称
    Class<?>[] parameterTypes;         //native注入的方法的参数

    public InjectModel() {}

    public InjectModel(String canonicalName,String methodName, Class<?>[] parameterTypes) {
        this.canonicalName = canonicalName;
        this.methodName = methodName;
        this.parameterTypes = parameterTypes;
    }

    public String getCanonicalName() {
        return canonicalName;
    }

    public void setCanonicalName(String canonicalName) {
        this.canonicalName = canonicalName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Class<?>[] getParameterTypes() {
        return parameterTypes;
    }

    public void setParameterTypes(Class<?>[] parameterTypes) {
        this.parameterTypes = parameterTypes;
    }
}
