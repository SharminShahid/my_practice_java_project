package javafiles;

import java.io.File;

public class GetFileInfo {
    public static void main(String[] args){
        File myFile = new File("myFile.txt");
        if(myFile.exists()){
            System.out.println("File name :" +myFile.getName());
            System.out.println("file path :" +myFile.getAbsolutePath());
            System.out.println("file length :" +myFile.length());
            System.out.println("can read :" + myFile.canRead());
        }
    }
}
