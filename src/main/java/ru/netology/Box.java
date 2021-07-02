package ru.netology;

public class Box extends MyThread {
    public Box(Tumbler tumbler) {
        super(tumbler);
    }

    public void run() {
        if (tumbler.turnOn()) {
            while (true) {
                System.out.println("Коробка открылась, закрываю!");
                tumbler.turnOff();
                try {
                    Thread.sleep(sleepTimeout);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
