package com.models;

import com.interfaces.Phone;

public class Smartphone implements Phone {

    @Override
    public void call() {
        System.out.println("You are making a call");
    }

    public void takePhoto(){
        System.out.println("You are taking a picture");
    }
}
