package com.guo.utils;

import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName： ModelViewUtil
 * @author： 98231
 * @create： 2019-01-11 15:52
 * @desc：
 **/
public class ModelViewUtil {

    /**
     * 在modelAndview中添加参数
     */
    public static ModelAndView addObject(ModelAndView modelAndView, Object... objArr) {
        for (int i = 0; i < objArr.length; i++) {
            modelAndView.addObject(objArr[1]);
        }
        return modelAndView;
    }
}
