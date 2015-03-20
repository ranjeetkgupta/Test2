package com.emc.smartcity.ms.wi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.emc.smartcity.ms.wi.commons.Greeter;

@SpringBootApplication
@Controller
@EnableAutoConfiguration
public class WeatherInfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherInfoApplication.class, args);
    }
    
    
    @RequestMapping("/")
    @ResponseBody
    String home() {
    	return Greeter.sayHello();
        
    }
}
