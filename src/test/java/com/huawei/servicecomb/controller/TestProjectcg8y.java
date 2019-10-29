package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectcg8y {

        Projectcg8yDelegate projectcg8yDelegate = new Projectcg8yDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectcg8yDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}