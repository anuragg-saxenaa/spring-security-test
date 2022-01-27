package com.arrayindex.springsecuritytest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {



    @GetMapping(value = "/hi")
   public String promptHello(){
      return "welcom o the appp.....";
    }

    @GetMapping(value = "/admin")
    public String admin(){
        return "admin data accesable ";
    }
}
