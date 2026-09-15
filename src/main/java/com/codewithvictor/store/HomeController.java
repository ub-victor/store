package com.codewithvictor.store;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Value()

    @RequestMapping("/")
    public String Index() { // this is the method that will handle the request to the root URL
        return "index.html";
    }
}
