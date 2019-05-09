package com.guo.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName： DateUtil
 * @author： 98231
 * @create： 2019-01-09 10:14
 * @desc： 日期处理类
 **/
public class DateUtil {

    /**
     * 将日期转换为指定格式字符串
     */
    public static String DateToStr(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(date);
    }

    /**
     * 将指定格式的字符串转换成Date
     */
    public static Date StrToDate(String dateStr) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.parse(dateStr);
    }

    /**
     * 将日期转换成格式为 format 的字符串
     */
    public static String formatDate(Date date, String format) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }

    /**
     * 将Date转换成 格式为 yyyy-MM-dd HH:mm:ss 的字符串
     */
    public static String formatDate1(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(date);
    }

    /**
     * 将日期转换为格式为 yyyy-MM-dd 的字符串
     */
    public static String formatDate2(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(date);
    }

    /**
     * 将日期转换为格式为 yyyy-MM 的字符串
     */
    public static String formatDate3(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM");
        return simpleDateFormat.format(date);
    }
}
