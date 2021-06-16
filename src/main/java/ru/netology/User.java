package ru.netology;

public class User extends Box {
    public User(Tumbler tumbler) {
        super(tumbler);
    }

    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("Хочу открыть коробку! Включаю тумблер! ");
            i++;
            try {
                Thread.sleep(sleepTimeout);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        tumbler.shutdown();
    }
}
