package ru.netology;

public class User extends Box {
    public User(Tumbler tumbler) {
        super(tumbler);
    }

    public void run() {
        while (tumbler.close()) {
            System.out.println("Хочу открыть коробку! Включаю тумблер! ");
            tumbler.isTurnOn();
            try {
                Thread.sleep(sleepTimeout);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
