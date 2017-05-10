package com.desmond.data.Business.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by desmond on 21/4/2017.
 */

@Component
public class WelcomeService {

    @Value("${welcome.message}")
    private String welcomeMessage;

    public String retrieveWelcomeMessage() {
        return welcomeMessage;
    }
}
