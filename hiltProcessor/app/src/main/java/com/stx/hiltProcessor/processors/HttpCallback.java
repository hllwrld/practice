package com.stx.hiltProcessor.processors;

import com.google.gson.Gson;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class HttpCallback<T> implements ICallback {

    public void onSuccess(String resultStr) {

        Gson gson = new Gson();
        T result = (T)gson.fromJson(resultStr, parseClass(this));
        onSuccess(result);
    }

    public abstract void onSuccess(T result);

    Class<?> parseClass(Object object) {
        Type type = object.getClass().getGenericSuperclass();
        Type[] params = ((ParameterizedType)type).getActualTypeArguments();
        return (Class<?>) params[0];
    }


    public void onFailure(String error) {


    }
}
