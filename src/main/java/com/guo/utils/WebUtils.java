package com.guo.utils;

/**
 * @ClassName： WebUtils
 * @author： 98231
 * @create： 2019-01-15 22:01
 * @desc： web层工具类
 **/
public class WebUtils {
    public static String urlCut(String url){
        StringBuffer stringBuffer = new StringBuffer(url);
        String string = "/Iron_blog_war/user/loginBefore";
        System.out.println(string.substring(14));

        return url;
    }

    public static void main(String[] args) {
        urlCut("Hrllo!");
    }
}
