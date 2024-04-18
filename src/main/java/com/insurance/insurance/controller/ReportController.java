package com.insurance.insurance.controller;

import com.insurance.insurance.DTO.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// To handle the methods for request and response
@Controller
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping("/Indexpage")
    public String indexPage(){
        String str="indexPage";
        return str;
    }

}
