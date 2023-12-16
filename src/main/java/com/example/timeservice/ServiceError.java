package com.example.timeservice;

import lombok.Data;

@Data
public class ServiceError extends Exception{
    public ServiceError(String message) {
        super(message);
    }
}
