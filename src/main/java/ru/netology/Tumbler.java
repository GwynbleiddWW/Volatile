
package ru.netology;

public class Tumbler {
    private volatile boolean turnOn;

    public boolean isTurnOn(){
        return turnOn;
    }

    public boolean close(){
        return turnOn = false;
    }
}