package com.observerPattern.facebookFanPage;

public class Facebook {
    public static void main(String[] args) {
        JhankarMahbubFanPage fanPage = new JhankarMahbubFanPage();

        JhankerMahbubFan fan1 = new JhankerMahbubFan("ihsonnet");
        JhankerMahbubFan fan2 = new JhankerMahbubFan("siam.ahmed");

        fanPage.register(fan1);
        fanPage.register(fan2);

        fanPage.statusUpdates("I will be live tonight 8pm.");

        fanPage.unregister(fan2);

        fanPage.statusUpdates("I am live Now!");
    }
}
