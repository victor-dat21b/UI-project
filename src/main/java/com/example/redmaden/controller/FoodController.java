package com.example.redmaden.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FoodController {

      @GetMapping("/")
      public String index(){
            return "frontpage";
      }

      @GetMapping("/Privatperson")
      public String privatPerson(){
            return "privatPerson";
      }

      @GetMapping("/Organisation")
      public String organisation(){
            return "organisation";
      }

      @GetMapping("/Virksomhed")
      public String virksomhed(){
            return "virksomhed";
      }

      @GetMapping("/Om-os")
      public String omOs(){
            return "omOs";
      }

      @GetMapping("/Hjælp")
      public String hjælp(){
            return "hjælp";
      }

}
