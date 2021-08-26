package com.observerPattern.bankInterest;

import com.observerPattern.Observer;

public class Newspaper implements Observer {

    private String name;

    //    All Args contractor
    public Newspaper(String name) {
        this.name = name;
    }

    @Override
    public void update(String notification) {
        System.out.print("[ To "+this.name+" ] ");
        System.out.println(notification);
    }
}
