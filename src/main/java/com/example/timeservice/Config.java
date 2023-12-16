package com.example.timeservice;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class Config {
    @Value("${time.service.sleep}")
    private int sleep;
    @Value("${time.service.numberRequestsError}")
    private int numberRequestsError;
}
