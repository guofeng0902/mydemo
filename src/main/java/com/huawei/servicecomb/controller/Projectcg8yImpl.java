package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-10-29T03:09:54.425Z")

@RestSchema(schemaId = "projectcg8y")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class Projectcg8yImpl {

    @Autowired
    private Projectcg8yDelegate userProjectcg8yDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectcg8yDelegate.helloworld(name);
    }

}
