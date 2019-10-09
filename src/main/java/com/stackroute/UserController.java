package com.stackroute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@Controller
@Configuration
@ComponentScan(basePackages = "com.stackroute")
public class UserController {

    @Autowired
    User user;

    @RequestMapping("/welcome")
    public ModelAndView welcome(HttpServletRequest request, HttpServletResponse response)
    {
        user.setFname(request.getParameter("fname"));
        user.setLname(request.getParameter("lname"));

        ModelAndView mv = new ModelAndView();
        mv.setViewName("display");
        mv.addObject("FullName",user.getFname()+" "+user.getLname());
        return mv;

    }




}
