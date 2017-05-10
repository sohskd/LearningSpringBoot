package com.desmond.data.Controller;

import com.desmond.data.Business.service.WelcomeService;
import com.desmond.data.Configuration.BasicConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by desmond on 21/4/2017.
 */

@RestController
public class WelcomeController {

    @Autowired
    private WelcomeService service;

    @Autowired
    private BasicConfiguration configuration;

    @RequestMapping("/welcome")
    public String welcome(){
        return service.retrieveWelcomeMessage();
    }

    @RequestMapping("dynamic-configuration")
    public Map<String, Object> dynamicConfiguration(){
        Map<String, Object> m = new HashMap<String, Object>();
        m.put("message", configuration.getMessage());
        m.put("number", configuration.getNumber());
        m.put("value", configuration.isValue());
        return m;
    }
}
