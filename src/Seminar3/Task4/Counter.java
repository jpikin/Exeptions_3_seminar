package Seminar3.Task4;

import java.io.IOException;

public class Counter implements AutoCloseable {
    int count;
    boolean flag;
    public Counter(){
        count = 0;
        flag = true;
    }

    public void add() throws IOException {
        if(flag){
        count++;
        } else{
            throw new IOException("Счетчик закрыт");
        }
    }

    @Override
    public void close() {
        flag = false;
    }
}

