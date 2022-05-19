package javafiles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("myFile.txt");
        reader.read();
        System.out.println("successfully read");
    }
}
