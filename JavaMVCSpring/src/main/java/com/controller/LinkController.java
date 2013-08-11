package com.controller;

@Controller  
public class LinkController {  
      
    @RequestMapping(value="/")  
    public ModelAndView mainPage() {  
        return new ModelAndView("home");  
    }  
      
    @RequestMapping(value="/index")  
    public ModelAndView indexPage() {  
        return new ModelAndView("home");  
    }  
  
}