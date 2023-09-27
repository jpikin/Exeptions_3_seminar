package Seminar3.Task1;

import java.io.FileWriter;


public class Task1 {
    public static <resourseTest> void main(String[] args) throws Exception {
//        try(FileWriter fileWriter = new FileWriter("system.txt")){
//            fileWriter.write("hello!!!");
//}

//        FileWriter fileWriter = new FileWriter("system.txt");
//        try (fileWriter){
//            fileWriter.write("hello!!!");
//}

        FileWriter fileWriter = new FileWriter("sys.txt");
        ResourseTest resourseTest = new ResourseTest();
        try (resourseTest) {

        }
    }
}
