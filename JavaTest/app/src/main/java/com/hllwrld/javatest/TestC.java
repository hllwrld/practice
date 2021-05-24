package com.hllwrld.javatest;


import com.google.auto.service.AutoService;
import com.hllwrld.interfaces.ITest;


@AutoService(ITest.class)
public class TestC implements ITest {
    @Override
    public void test() {
        System.out.println("Test C");

    }
}
