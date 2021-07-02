
package ru.netology;

public class Main {
    public static void main(String[] args) throws Exception {
        Tumbler tumbler = new Tumbler();

        MyThread user = new User(tumbler);
        MyThread box = new Box(tumbler);
        user.start();
        box.setDaemon(true);
        box.start();
        user.join();
    }
}
