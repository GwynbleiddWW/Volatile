
package ru.netology;

public class MyThread extends Thread {
    final int sleepTimeout = 3000;
    protected Tumbler tumbler;

    public MyThread(Tumbler tumbler) {
        this.tumbler = tumbler;
    }

    public void run() {

    }
}