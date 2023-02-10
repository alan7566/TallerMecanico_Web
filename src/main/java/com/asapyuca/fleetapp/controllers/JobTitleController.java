package com.asapyuca.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JobTitleController {

    @GetMapping("/job-title")
    public String getJobTitle() {
        return "jobTitle";
    }

}
