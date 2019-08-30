package daniel.com;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader();
        fileReader.readFileAndOutput("C:\\Users\\Daniel\\Desktop\\SCIIT\\JAVA8Homework\\src\\main\\java\\daniel\\com\\Student.txt", 03, "NewStudentFile");
    }
}
