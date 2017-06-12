package com.training.maven.web;

import com.training.maven.first.HelloWorld;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * User: Prasad
 * Date: 6/12/17
 * Time: 10:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestWebClass {
    public static void main(String args[]) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello();
        helloWorld.sayHelloToMe();
        helloWorld.sayHelloToFriend("Abin");
    }
}
