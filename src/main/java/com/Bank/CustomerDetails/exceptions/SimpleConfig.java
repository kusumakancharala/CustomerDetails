package com.Bank.CustomerDetails.exceptions;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "error")
public class SimpleConfig {
    private List<SimpleError> simplerrors;

    public List<SimpleError> getSimplerrors() {
        return simplerrors;
    }

    public void setSimplerrors(List<SimpleError> simplerrors) {
        this.simplerrors = simplerrors;
    }
}