package Seminar3.Task3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        doSomething();
        System.out.println("Сообщение после пойманной ошибки!");
    }

    public static void doSomething() {
        try {
            throw new IOException(">>>Пойманная ошибка!<<<");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
