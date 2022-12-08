package org.ghita.helloworld;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class HelloworldController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Good Evening Dear sir";
    }
}