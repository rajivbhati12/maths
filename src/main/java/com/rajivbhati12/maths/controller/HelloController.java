/**
 * Created by rajivbhati on 3/11/17.
 */
package com.rajivbhati12.maths.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    String message = "Welcome to Spring MVC!";

    @RequestMapping("/hello")
    public ModelAndView showMessage(
            @RequestParam(value = "name", required = false, defaultValue = "World") String name) {
        System.out.println("in controller");

        ModelAndView modelAndView = new ModelAndView("helloworld");
        modelAndView.addObject("message", message);
        modelAndView.addObject("name", name);
        return modelAndView;
    }
}