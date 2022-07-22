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

    public  String text(){ //return method. Non-static method, so we have to create an object under main method

        String s = "java";
        System.out.println(s);
        return s;
    }
     int number(){
        int d = 10;
        int e = 30;
        int f = d+e;
         System.out.println(f);
         return f;
     }
    public static void main(String[] args){
        ReturnMethod rn = new ReturnMethod();// object for non-static method.

        System.out.println(myReturnMethod(20));
        System.out.println(myReturnMethod(12));
        System.out.println(myReturnMethod1(8,7));
        rn.text();
        rn.number();

    }



}
