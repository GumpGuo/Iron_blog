package com.guo.controller;

import com.guo.model.User;
import com.guo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName： UserController
 * @author： 98231
 * @create： 2019-01-14 21:52
 * @desc： 用户 的控制层
 **/
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 用户登录
     */
    @RequestMapping("/login")
    public ModelAndView login(HttpServletRequest request,
                              HttpServletResponse response,
                              @RequestParam("email") String email,
                              @RequestParam("password") String password) {


        request.getRequestURL();


        ModelAndView modelAndView = new ModelAndView();

        User user = userService.getByEmail(email);

        System.out.println(password);
        System.out.println(user.getPassword());
        if (password.equals(user.getPassword())) {
            String requestURI = request.getParameter("oldURI");

            System.out.println(requestURI);
            System.out.println("--------");
            requestURI = requestURI.substring(14);
            try {
                request.getSession().setAttribute("sessionUserName", user.getUserName());
                request.getRequestDispatcher(requestURI).forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        modelAndView.addObject("message", "用户名或者密码不正确");
        modelAndView.setViewName("/jsp/login");
        return modelAndView;
    }


    @RequestMapping("/loginBefore")
    public ModelAndView loginBefore(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        String requestURI = request.getRequestURI();
        System.out.println(requestURI);
        modelAndView.addObject("requestURI", requestURI);
        modelAndView.setViewName("/jsp/login");
        return modelAndView;
    }


    /**
     * 用户注册
     */
    @RequestMapping("/register")
    public ModelAndView register(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();

        request.getParameter("email");
        String password1 = request.getParameter("password1");
        String password2 = request.getParameter("password2");

        modelAndView.setViewName("/jsp/register");
        return modelAndView;
    }


}
