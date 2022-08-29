package com.example.fisrtservice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;
@RestController
public class GeneratePasswordService {

    @RequestMapping(path = "{name:[a-z]+}.generate", method = RequestMethod.GET)
    public String generate(@PathVariable("name") String name) {
        Random rand = new Random();
        int random = rand.nextInt();
        return "Hi" +" "+ name + '\n' + "Your new password is"+" "+random;
    }

}
