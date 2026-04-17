package com.jcodes21.retail_banking_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class HomeController {

        @GetMapping("/")
        public String home() {
            return "App is running!";
        }
    }

