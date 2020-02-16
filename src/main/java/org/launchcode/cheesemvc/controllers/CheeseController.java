package org.launchcode.cheesemvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("cheese")
public class CheeseController {

//   Request path: /cheese
    @RequestMapping(value = "")
    public String index(Model model) {

        ArrayList<String> cheeses = new ArrayList<>();
        cheeses.add("cheddar");
        cheeses.add("parmesan");
        cheeses.add("munster");


        model.addAttribute("cheeses", cheeses);
        //        the model attribute is what passes things into the view to view on webpage
        model.addAttribute("title", "My Cheeses");
        return "cheese/index";
    }
}


