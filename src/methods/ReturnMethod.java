package methods;

public class ReturnMethod {
    /*Return method returns a value. In order to make a method return method, instead of void keyword we use primitive
     variables (int,char etc) in the method.
     -we use return keyword in a return method.
     */
    static int myReturnMethod(int age){

        return age+5;
    }
    //multiple parameter
    static int myReturnMethod1(int x,int y){
        return  x+y;
    }
    public static void main(String[] args){
        System.out.println(myReturnMethod(20));
        System.out.println(myReturnMethod(12));
        System.out.println(myReturnMethod1(8,7));
    }



}
