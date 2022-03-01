package com.example.redmaden.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FoodController {

      @GetMapping("/")
      public String index(){
            return "frontpage";
      }

}
