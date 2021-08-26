package com.observerPattern.facebookFanPage;

import com.observerPattern.Observer;
import com.observerPattern.Subject;

import java.util.ArrayList;

public class JhankarMahbubFanPage implements Subject {

    private ArrayList<Observer> observers = new ArrayList<Observer>();

    private String status;

    //    user can register as his fan by doing "Like"
    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    //    user can unregister their self by doing "UnLike"
    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update("You have new notification from Jhankar Mahbub.");
        }
    }

    public void statusUpdates(String status){
        this.status = status;
        System.out.println("\nStatus Updates: "+this.status);
        notifyObserver();
    }
}
