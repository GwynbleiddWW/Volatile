package ru.netology;

public class Box extends MyThread {
    public Box(Tumbler tumbler) {
        super(tumbler);
    }

    public void run() {
        while (tumbler.turnOn()) {
            tumbler.turnOff();
            System.out.println("Коробка открылась, закрываю!");
            try {
                Thread.sleep(sleepTimeout);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
