package ru.netology;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final int sleepTimeout = 2000;
        Tumbler tumbler = new Tumbler();
        int i = 0;
        while (i <= 3) {
            i++;
            Thread.sleep(sleepTimeout);
            new MyThread(tumbler) {
                public void run() {
                    tumbler.setBoxClosed(true);
                    if (tumbler.getBoxClosed()) {
                        try {
                            Thread.sleep(sleepTimeout);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("Коробка: открыли коробку) Закрываю!");
                    }
                }
            }.start();

            Thread.sleep(sleepTimeout);
            new MyThread(tumbler) {
                public void run() {
                    tumbler.setBoxClosed(false);
                    if (!tumbler.getBoxClosed()) {
                        try {
                            Thread.sleep(sleepTimeout);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("Пользователь: закрылась коробка( Открываю!");
                    }
                }
            }.start();
        }
    }
}
