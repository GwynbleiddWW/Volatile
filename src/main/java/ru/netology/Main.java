package ru.netology;

public class Main {
    public static void main(String[] args) throws Exception {
        final int sleepTimeout = 3000;
        Tumbler tumbler = new Tumbler();

        new MyThread(tumbler) {
            public void run() {
                tumbler.setTurnOn(false);
                    if (!tumbler.isTurnOn()) {
                        System.out.println("Хочу открыть коробку! Включаю тумблер! ");
                    }
                }
        }.start();

        new MyThread(tumbler) {
            public void run() {
                try {
                    Thread.sleep(sleepTimeout);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                tumbler.setTurnOn(true);
                if (tumbler.isTurnOn()) {
                    System.out.println("Коробка открылась, закрываю!");
                }
            }
        }.start();
    }
}
