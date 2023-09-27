package Seminar3.Task5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exept {
        TestArray arrayList = new TestArray();
        arrayList.array.add(1);
        arrayList.array.add(2);
        arrayList.array.add(3);
        arrayList.array.add(4);


        try {
            System.out.println(arrayList.getNum((ArrayList<Integer>) arrayList.array, 7));
        }catch (Exept ex){
            ex.printStackTrace();
        }


        System.out.println("Работа программы не остановлена");
    }
}
