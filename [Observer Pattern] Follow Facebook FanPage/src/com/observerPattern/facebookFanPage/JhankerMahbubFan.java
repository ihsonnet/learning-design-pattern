package com.observerPattern.facebookFanPage;

import com.observerPattern.Observer;

public class JhankerMahbubFan implements Observer {

    private String username;

    //    All Args contractor
    public JhankerMahbubFan(String username) {
        this.username = username;
    }

    @Override
    public void update(String notification) {
        System.out.print("[ In @"+this.username+"'s Facebook ] ");
        System.out.println(notification);
    }
}
