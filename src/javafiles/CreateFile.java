package javafiles;

import java.io.File;
import java.io.FileWriter;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File myFile = new File("myFile.txt");
            if (myFile.createNewFile()){
                System.out.println("new file created :" +myFile.getName());
            }else {
                System.out.println("file already exists");
            }
        }catch (Exception e){
            System.out.println("some error");
            e.printStackTrace();
        }
        try {
            FileWriter writer = new FileWriter("myFile.txt");
            writer.write("Today is a rainy day.");
            writer.write("Tomorrow is going to be sunny");
            writer.close();
            System.out.println("successfully written");
        }catch (Exception e1){
            System.out.println("an error");
            e1.printStackTrace();

        }
    }
}
