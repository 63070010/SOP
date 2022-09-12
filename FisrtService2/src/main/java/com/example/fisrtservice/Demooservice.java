package com.example.fisrtservice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Demooservice {
  @RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
  public String helloWorld() {
    return "Hello World";
  }
}
