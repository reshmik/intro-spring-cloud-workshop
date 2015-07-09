package io.pivotal.springcloud.distconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class DistConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(DistConfigApplication.class, args);
    }
    @Autowired
    private Greeter greeter;
    
    @RequestMapping("/")
    public String home() {
        return String.format("%s World!", greeter.getGreeting());
    }
}
