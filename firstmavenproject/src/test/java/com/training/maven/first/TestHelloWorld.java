package com.training.maven.first;

import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Prasad
 * Date: 6/12/17
 * Time: 10:16 PM
 * To change this template use File | Settings | File Templates.
 */

public class TestHelloWorld {
    @Test
    public void testSayHello() {
        System.out.println("Hello All");
    }

    @Test
    public void testSayHelloToMe() {
        System.out.println("Hello Narayana");
    }

    @Test
    public void testSayHelloToFriend(String name) {
        System.out.println("Hello " + name);
    }
}
