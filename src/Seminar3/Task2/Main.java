package Seminar3.Task2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path pathRead = Paths.get("C:\\Users\\admin\\Desktop\\programming\\Java\\Exeptions\\Exeptions\\src\\Seminar3\\Task2\\input.txt");
        Path pathWrite = Paths.get("C:\\Users\\admin\\Desktop\\programming\\Java\\Exeptions\\Exeptions\\src\\Seminar3\\Task2\\output.txt");

        try {
            rwLine(pathRead,pathWrite);
            System.out.println("Скопирована одна строка из "+ pathRead+ " в "+ pathWrite);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
// C:\Users\admin\Desktop\programming\Java\Exeptions\Exeptions\src\Seminar3\Task2
    public static void rwLine(Path pathRead, Path pathWrite) throws IOException {

        try(BufferedReader in = Files.newBufferedReader(pathRead);
            BufferedWriter out = Files.newBufferedWriter(pathWrite);) {
            out.write(in.readLine());

        } catch (Exception e){

        }
    }
}
