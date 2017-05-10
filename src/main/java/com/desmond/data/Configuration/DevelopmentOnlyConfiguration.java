package com.desmond.data.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

/**
 * Created by desmond on 21/4/2017.
 */

@Profile("dev")
public class DevelopmentOnlyConfiguration {
    @Bean
    public String dummy(){
        return "something";
    }
}
