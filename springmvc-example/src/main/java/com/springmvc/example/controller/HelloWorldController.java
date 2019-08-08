package com.springmvc.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

  @RequestMapping(value = "/model", method = RequestMethod.GET)
  public String useModel(Model model) {
    model.addAttribute("greeting", "Hello World from Spring 4 MVC model");
    return "welcome";
  }

  @RequestMapping(value = "/modelmap", method = RequestMethod.GET)
  public String useModelMap(ModelMap model) {
    model.addAttribute("greeting", "Hello World from Spring 4 MVC modelmap");
    return "welcome";
  }

  @RequestMapping(value = "/modelandview", method = RequestMethod.GET)
  public ModelAndView useModelAndView() {
    ModelAndView modelAndView = new ModelAndView();
    modelAndView.addObject("greeting", "Hello World from Spring 4 MVC modelandview");
    modelAndView.setViewName("welcome");
    return modelAndView;
  }
}
