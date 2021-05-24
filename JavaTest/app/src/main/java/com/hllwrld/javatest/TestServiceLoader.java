package com.hllwrld.javatest;

import com.hllwrld.interfaces.ITest;

import java.util.ServiceLoader;
import java.util.function.Consumer;

public class TestServiceLoader {

    public static void test() {
        ServiceLoader<ITest> services = ServiceLoader.load(ITest.class);
        services.iterator().forEachRemaining(new Consumer<ITest>() {
            @Override
            public void accept(ITest iTest) {
                iTest.test();
            }
        });
    }

    public static void main(String[] args) {
       test();
    }
}
