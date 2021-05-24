package com.hllwrld.SPIB;

import com.google.auto.service.AutoService;
import com.hllwrld.interfaces.ITest;

@AutoService({ITest.class})
public class TestB implements ITest {
    @Override
    public void test() {
        System.out.println("Test B called");
    }
}