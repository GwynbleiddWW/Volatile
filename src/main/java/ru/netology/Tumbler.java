package ru.netology;

public class Tumbler {
    private volatile boolean turnOn;

    public boolean isTurnOn() {
        return turnOn;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }
}
