package com.pidobid.spring.introduction;

public class Dog implements Pet {

    @Override
    public void say(){
        System.out.println("Bow-Wow!");
    }
}
