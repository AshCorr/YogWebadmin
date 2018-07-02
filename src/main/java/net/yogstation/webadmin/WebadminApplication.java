package net.yogstation.webadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class WebadminApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebadminApplication.class, args);
    }
}
