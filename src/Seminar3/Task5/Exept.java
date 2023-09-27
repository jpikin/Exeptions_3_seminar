package Seminar3.Task5;

public class Exept extends IndexOutOfBoundsException{
    public Exept() throws Exept {
        System.out.println("!!!");
        //        throw new IndexOutOfBoundsException("Обращение по неправильному элементу");
//        System.out.println("");
    }
}
