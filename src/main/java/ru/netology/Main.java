package ru.netology;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final int sleepTimeout = 2000;

        Tumbler tumbler = new Tumbler();


        new MyThread(tumbler) {
            public void run() {
                tumbler.setTurnOn(false);
                    if (!tumbler.isTurnOn()) {
                        try {
                            Thread.sleep(sleepTimeout);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                            System.out.println("Хочу открыть коробку! Включаю тумблер! ");
                    }
                }
        }.start();

        new MyThread(tumbler) {
            public void run() {
                tumbler.setTurnOn(true);
                if (tumbler.isTurnOn()) {
                    try {
                        Thread.sleep(sleepTimeout);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Коробка открылась, закрываю!");
                }
            }
        }.start();
    }
}
