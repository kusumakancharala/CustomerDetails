package com.Bank.CustomerDetails.entities;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

@Configuration
public class JsonConfig {
    @Bean
    public ObjectMapper ConfigureJson() throws JsonProcessingException {

        Jackson2ObjectMapperBuilder a = new Jackson2ObjectMapperBuilder();
        ;        return a.indentOutput(true)
//                .propertyNamingStrategy(PropertyNamingStrategy.UPPER_CAMEL_CASE)
//                .featuresToEnable(SerializationFeature.WRAP_EXCEPTIONS)
                .featuresToEnable(SerializationFeature.WRAP_ROOT_VALUE)
//                .featuresToDisable(SerializationFeature.INDENT_OUTPUT)
                .build();
    }
}
