package com.lzp.util;

import java.util.HashMap;
import java.util.Map;

public class Constant {
    public  static  Constant singleConstant=null;
    private static Map<String,Integer> keyMap=new HashMap<String,Integer>();

    public Map<String, Integer> getKeyMap() {
        return keyMap;
    }
    static {
        keyMap.put("STAFF",1);
        keyMap.put("WORK_RECORD",2);
    }
    public static Constant getInstance(){
        synchronized (Constant.class){
            if (singleConstant==null){
                singleConstant=new Constant();
            }
        }
        return singleConstant;
    }
}
