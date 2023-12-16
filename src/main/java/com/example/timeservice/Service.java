package com.example.timeservice;

import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static java.lang.Thread.sleep;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class Service {

    private final Config config;
    private int countRequests = 0;

    public String getTime() throws ServiceError {
        this.countRequests++;
        try {
            if (countRequests == config.getNumberRequestsError()) {
                this.countRequests = 0;
                throw new InterruptedException();
            }
            sleep(config.getSleep());
        } catch (InterruptedException e) {
            throw new ServiceError("season-service");
        }
        LocalDateTime time = LocalDateTime.now();
        return time.toLocalTime().toString();
    }
}
