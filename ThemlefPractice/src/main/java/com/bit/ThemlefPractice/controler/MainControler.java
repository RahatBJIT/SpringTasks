package com.bit.ThemlefPractice.controler;

import com.bit.ThemlefPractice.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainControler {

    List <Customer> customerList = new ArrayList<>();

    @GetMapping("/addcustomer")
    public ModelAndView welcomePage( ModelAndView model){
        model.setViewName("WelcomePage.html");
        return model;
    }

    @PostMapping("/registration")
    public ModelAndView  registration(@ModelAttribute Customer customer, ModelAndView model){
        model.setViewName("Registered.html");
        model.addObject("customer", customer);
        customerList.add(customer);
        model.addObject("customerList", customerList);

        return model;
    }

    @GetMapping("/")
    public ModelAndView getAllCustomers(ModelAndView model){


        model.setViewName("AllCustomer.html");
        model.addObject("customerList",customerList);

        return model;
    }


}
