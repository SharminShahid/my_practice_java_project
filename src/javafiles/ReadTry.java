package javafiles;

import java.io.FileReader;

public class ReadTry {
    public static void main(String[] args){
        try {
            FileReader reader = new FileReader("myFile.txt");
            reader.read();
            System.out.println("successfully read");
        }catch (Exception e){
            System.out.println("can not read");
        }
    }
}
