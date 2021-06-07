package ru.netology;

public class Main {
    public static void main(String[] args) throws Exception {
        final int sleepTimeout = 3000;
        Tumbler tumbler = new Tumbler();
        final int counter = 5;

        new MyThread(tumbler) {
            public void run() {
                tumbler.setTurnOn(false);
                if (!tumbler.isTurnOn()) {
                    for (int i = 0; i < counter; i++) {
                        System.out.println("Хочу открыть коробку! Включаю тумблер! ");
                        try {
                            Thread.sleep(sleepTimeout);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }.start();

        new MyThread(tumbler) {
            public void run() {
                tumbler.setTurnOn(true);
                if (tumbler.isTurnOn()) {
                    System.out.println("Коробка открылась, закрываю!");
                    try {
                        Thread.sleep(sleepTimeout);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}
