package ru.netology;

import java.util.concurrent.ThreadLocalRandom;

public class User extends Box {
    public User(Tumbler tumbler) {
        super(tumbler);
    }

    public void run() {
        for (int i = 0; i < 20; i++) {
            tumbler.turnOn();
            System.out.println("Хочу открыть коробку! Включаю тумблер! ");
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 3000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
