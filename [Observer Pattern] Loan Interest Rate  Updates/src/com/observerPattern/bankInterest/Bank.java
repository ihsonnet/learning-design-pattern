package com.observerPattern.bankInterest;

public class Bank {
    public static void main(String[] args) {
        BankInterest fanPage = new BankInterest();

        Newspaper news1 = new Newspaper("Daily Prothom Alo");
        Newspaper news2 = new Newspaper("Daily Jugantor");

        fanPage.add(news1);
        fanPage.add(news2);

        fanPage.rateUpdates(87.6);

        fanPage.remove(news2);

        fanPage.rateUpdates(98.5);
    }
}
