package com.stx.hiltProcessor.processors;

import java.util.Map;

public interface IHttpProcessor {
    public void post(String url, Map<String, Object> params, final ICallback callback);
}
