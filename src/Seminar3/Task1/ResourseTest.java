package Seminar3.Task1;

public class ResourseTest implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("i am clossed");
    }
}
