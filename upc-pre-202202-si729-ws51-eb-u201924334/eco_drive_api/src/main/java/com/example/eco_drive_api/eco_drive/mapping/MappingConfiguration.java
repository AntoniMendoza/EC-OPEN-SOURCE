package com.example.eco_drive_api.eco_drive.mapping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("learningMappingConfiguration")
public class MappingConfiguration {
    @Bean
    public ScoreMapper scoreMapper() {
        return new ScoreMapper();
    }

}
