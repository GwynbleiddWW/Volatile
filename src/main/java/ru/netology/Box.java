package ru.netology;

public class Box extends MyThread {
    public Box(Tumbler tumbler) {
        super(tumbler);
    }

    public void run() {
        while (tumbler.isTurnOn()) {
            System.out.println("Коробка открылась, закрываю!");
            tumbler.close();
            try {
                Thread.sleep(sleepTimeout);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
