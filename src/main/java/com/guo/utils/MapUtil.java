package com.guo.utils;

import java.util.Map;

/**
 * @ClassName： MapUtil
 * @author： 98231
 * @create： 2019-01-14 16:14
 * @desc：
 **/
public class MapUtil {

    public static Map<String,Object> mapPut(Map<String,Object> map, Object... objArr){
        for (Object o : objArr) {
            map.put("o",o);
        }

        return map;
    }
}
