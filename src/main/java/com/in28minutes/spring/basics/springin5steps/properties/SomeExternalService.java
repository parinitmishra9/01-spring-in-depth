package com.in28minutes.spring.basics.springin5steps.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Project spring-in5-steps
 * Created by @Author Parinit on 3/9/2020
 * at 7:07 PM
 */
@Component
public class SomeExternalService {

    @Value("${external.service.url}")
    private String url;

    public String returnServiceURL(){
        return url;
    }

}
