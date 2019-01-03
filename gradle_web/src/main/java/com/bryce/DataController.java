package com.bryce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DataController {
    @Autowired
    DataService dataService;

    @RequestMapping("/user")
    public String list() {
        System.out.println("====================");
        return "list";
    }


    @RequestMapping("/save")
    public ModelAndView save(Model model) {
        String data = dataService.getData();
        model.addAttribute("data",data);
        System.out.println("===================="+data);
        ModelAndView modelAndView = new ModelAndView("list");
        return modelAndView;
    }
}
