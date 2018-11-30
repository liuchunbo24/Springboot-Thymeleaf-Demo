package com.thymeleaf.controller;

import com.thymeleaf.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/11/30.
 */
@Controller
public class Test {
    @RequestMapping("/testThymeleaf")
    public String index(Model model){
        Person single=new Person("Eminem",0);
        List<Person> people=new ArrayList<Person>();
        Person p1=new Person("Kobe",1);
        Person p2=new Person("James",2);
        Person p3=new Person("Jordan",3);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        model.addAttribute("singlePerson",single);
        model.addAttribute("people",people);
        return "index";
    }

}
