package ru.netology;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        final int sleepTimeout = 3000;
        Tumbler tumbler = new Tumbler();
        final int counter = 10;

        new MyThread(tumbler) {
            public void run() {
                int i = 0;
                while (i<counter) {
                    System.out.println("Хочу открыть коробку! Включаю тумблер! ");
                    i++;
                    try {
                        Thread.sleep(sleepTimeout);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        new MyThread(tumbler) {
            public void run() {
                while (tumbler.isTurnOn()) {
                    System.out.println("Коробка открылась, закрываю!");
                    try {
                        Thread.sleep(sleepTimeout);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();


        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        tumbler.shutdown();
    }
}
