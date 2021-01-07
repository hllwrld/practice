package com.hllwrld.kotlingramma;

import java.util.HashMap;

public class JavaRawTypes {


    public static void test() {
        HashMap<String, Integer> hashMap = getHashMap();
        //....
        HashMap map = hashMap;
        map.put("H", "Hello");
        //...
        Integer i = hashMap.get("H");
        System.out.println(i);
    }

    public static HashMap<String, Integer> getHashMap(){
        return new HashMap<String, Integer>();
    }


}
