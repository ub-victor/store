package com.codewithvictor.store;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/")
    public String Index() { // this is the method that will handle the request to the root URL
        System.out.println("Application Name: " + appName); // print the application name to the console
        return "index.html";
    }
}
