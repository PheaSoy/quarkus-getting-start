package org.acme.getting.started;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    public  String greet(String name){
        return "Hello "+name + " from quarkus serverless style";

    }
}
