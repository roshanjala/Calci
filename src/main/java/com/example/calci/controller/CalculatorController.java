package com.example.calci.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @RequestMapping(value = "/healthCheck", method = RequestMethod.GET)
    public String healthCheck(){
        return "HEALTHY";
    }

    @RequestMapping(value = "/total", method = RequestMethod.GET)
    public Integer total(@RequestParam(value = "fv") Integer firstValue,
                         @RequestParam(value = "sv") Integer secondValue){
        return firstValue+secondValue;
    }

    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public Integer product(@RequestParam(value = "fv") Integer firstValue,
                           @RequestParam(value = "sv") Integer secondValue){
        return firstValue*secondValue;
    }

    @RequestMapping(value = "/difference", method = RequestMethod.GET)
    public Integer difference(@RequestParam(value = "fv") Integer firstVal,
                              @RequestParam(value = "sv") Integer secVal){
        return firstVal-secVal;
    }

    @RequestMapping(value = "/divide", method = RequestMethod.GET)
    public Integer divide(@RequestParam(value = "fv") Integer firstVal,
                          @RequestParam(value = "sv") Integer secondVal){
        return (Integer) firstVal/secondVal;
    }
}
