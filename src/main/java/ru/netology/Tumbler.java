package ru.netology;

public class Tumbler {
    private volatile boolean turnOn = true;

    public boolean isTurnOn() {
        return turnOn;
    }
    public void shutdown(){
        this.turnOn = false;
    }

}
