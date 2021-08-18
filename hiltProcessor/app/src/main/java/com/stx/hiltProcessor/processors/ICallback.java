package com.stx.hiltProcessor.processors;

public interface ICallback {

    public void onSuccess(String result);
    public void onFailure(String error);
}
