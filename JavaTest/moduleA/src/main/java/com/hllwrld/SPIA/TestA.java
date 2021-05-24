package com.hllwrld.SPIA;

import com.google.auto.service.AutoService;
import com.hllwrld.interfaces.ITest;

@AutoService(ITest.class)
public class TestA implements ITest {

    @Override
    public void test() {
        System.out.println("Test A called");
    }
}