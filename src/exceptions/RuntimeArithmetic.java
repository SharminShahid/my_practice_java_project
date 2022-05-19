package exceptions;

public class RuntimeArithmetic {
    public static void main(String[] args){
        int a = 0;
        int b = 10;

        try {
            System.out.println(b/a);
        }catch (Exception e){
            System.out.println("can't divide any number by 0");
        }finally {
            System.out.println("go to next line");
        }
        System.out.println(a/b);
    }
}
