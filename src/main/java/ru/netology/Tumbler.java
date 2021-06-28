
package ru.netology;

public class Tumbler {
    private volatile boolean tumblerPosition;

    public boolean turnOn(){
        return tumblerPosition = true;
    }

    public boolean turnOff(){
        return tumblerPosition = false;
    }
}