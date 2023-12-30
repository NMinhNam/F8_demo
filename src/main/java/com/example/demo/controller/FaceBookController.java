package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//annontation : @name_annontation
@Controller
@RequestMapping("/facebook")
public class FaceBookController {

    @GetMapping("/User")
    public String doGetViewFbUser(Model model,
                                  @RequestParam("userName") String userName,
                                  @RequestParam("age") int age){
        System.out.println(">>> "+ userName + "--" + age);
        model.addAttribute("userName",userName);
        model.addAttribute("age",age);
        return "layout/facebook";
    }

    @GetMapping("/MinhNam")
    public String doGetViewFbMinhNam(){
        return "layoutF/facebookNam";
    }

    @GetMapping("/omachi.cocomy")
    public String doGetViewFbThuc(){
        return "layoutF/facebookThuc";
    }

    @GetMapping("/HuyNguyen")
    public String doGetViewFbHuyNguyen(){
        return "layoutF/facebookHuy";
    }

}
