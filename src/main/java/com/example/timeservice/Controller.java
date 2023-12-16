package com.example.timeservice;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/time")
public class Controller {
    private final Service service;

    @GetMapping("/getTime")
    public String getSeason() throws ServiceError {
       return service.getTime();
    }
}
