package com.emc.smartcity.ms.ti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.emc.smartcity.ms.ti.commons.Greeter;

import ch.qos.logback.core.pattern.color.GreenCompositeConverter;

@SpringBootApplication
@Controller
@EnableAutoConfiguration
public class TrafficInfoApplication {

    public static void main(String[] args) {
    	System.out.println("TrafficInfoApplication.main()");
        SpringApplication.run(TrafficInfoApplication.class, args);
        
    }
    
    
    @RequestMapping("/")
    @ResponseBody
    String home() {
    	
        return Greeter.sayHello();
    }
}
