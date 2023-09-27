package Seminar3.Task4;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        Counter counter = new Counter();
        for (int i = 0; i < 5; i++) {
            counter.add();
            System.out.println("Счетчик: "+counter.count);
        }

        counter.close();
// Если хотим, чтобы программа продолжала работать после исключения, раскоментируем все строчки ниже
//        try {
            counter.add();
//        }catch (Exception e){
//        e.printStackTrace();
//        }
        System.out.println("Счетчик: "+counter.count);
    }
}
