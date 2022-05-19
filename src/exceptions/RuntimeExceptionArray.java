package exceptions;

public class RuntimeExceptionArray {
    //In java different types of error can occur during executing the code. These ase called exceptions.
    //2 types--- Runtime & Compile time.
    //Runtime exceptions are handled with try and catch statement
    //finally keyword works with try and catch block.

    public static void main(String[] args){
        int[] myNum = new int[3];
        myNum = new int[0];
        myNum = new int[1];
        myNum = new int[2];
         /*int[] myNum1 = {6,8,7};
         myNum1[0] = 6;*/
        try {
            System.out.println(myNum[10]); //ArrayIndexOutOfBound Exception
        }catch (Exception e){
            System.out.println("index 10 is not available");
        }finally {
            System.out.println("try & catch is finished");
        }

    }


}
