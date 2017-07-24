
package com.test.controller;

/**
 * Created by Kuwu on 7/21/17.
 */


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

  @RequestMapping("/")
  public ModelAndView helloWorld()
  {
    String name = "Kurt";
    return new
        ModelAndView("index","developerName",name);
  }
  @RequestMapping("/form")
  public String htmlForm()
  {
    return "htmlform";
  }

  @RequestMapping("/success")
  public String formSuccess(Model model, @RequestParam("c_name") String name, @RequestParam("c_type") String coffeeType,
                            @RequestParam("options") String option, @RequestParam("gender") String gender)
  {
    model.addAttribute( "userName", name );
    model.addAttribute( "coffeeChoice", coffeeType);
    model.addAttribute( "coffeeOption", option);
    model.addAttribute( "gender", gender);

    return "formsuccess";
  }

}