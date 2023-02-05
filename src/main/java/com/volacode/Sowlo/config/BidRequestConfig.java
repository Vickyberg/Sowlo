package com.volacode.Sowlo.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BidRequestConfig {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
