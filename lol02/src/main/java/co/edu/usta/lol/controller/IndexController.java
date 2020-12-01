package co.edu.usta.lol.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping({"","/","home","index","welcome"})
    public String index(){
        return "Welcome app 02";
    }

}
