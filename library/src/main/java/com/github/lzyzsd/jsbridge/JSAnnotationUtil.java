package com.github.lzyzsd.jsbridge;

import com.github.lzyzsd.jsbridge.model.InjectModel;
import java.lang.reflect.Method;

/**
 * Created by cike on 18-3-13.
 */

public class JSAnnotationUtil {

    private JSAnnotationUtil() {
    }

    public static JSAnnotationUtil getInstance() {
        return JSAnnotationUtilHolder.jsAnnotationUtil;
    }

    private static class JSAnnotationUtilHolder {
        private static final JSAnnotationUtil jsAnnotationUtil = new JSAnnotationUtil();
    }

    public boolean invoke(InjectModel injectModel, String params, CallBackFunction callBackFunction) {
        boolean invokeState = false;
        if (injectModel == null)
            return invokeState;
        try {
            Class clazz = Class.forName(injectModel.getCanonicalName());
            Method method = clazz.getMethod(injectModel.getMethodName(), injectModel.getParameterTypes());
            if (method != null) {
                Object object = clazz.newInstance();
                if (contains(injectModel.getParameterTypes(), CallBackFunction.class.getName())) {
                    method.invoke(object, params, callBackFunction);
                } else {
                    method.invoke(object, params);
                }
                invokeState = true;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            return invokeState;
        }
    }

    private boolean contains(Class<?>[] classes, String className) {
        for (Class clazz : classes) {
            if (clazz.getName().equals(className))
                return true;
        }
        return false;
    }
}
