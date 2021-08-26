package com.observerPattern.bankInterest;

import com.observerPattern.Observer;
import com.observerPattern.Subject;

import java.util.ArrayList;

public class BankInterest implements Subject {

    private ArrayList<Observer> observers = new ArrayList<Observer>();

    private double interestRate;

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update("Interest Rate is updated!");
        }
    }

    public void rateUpdates(double rate){
        this.interestRate = rate;
        System.out.println("\nRate Updates: "+this.interestRate+ " %");
        notifyObserver();
    }
}
