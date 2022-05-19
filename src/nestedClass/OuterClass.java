package nestedClass;
//a class inside another one is called nested class.

public class OuterClass {
    InnerClass inner = new InnerClass();
    int outer = 10;

    public OuterClass() {


    }
    public void outerMethod(){
        System.out.println("this is outerMethod");
    }

    public class InnerClass{
        int inner = 45;

        public InnerClass(){

        }
     public void innerMethod(){
         System.out.println("this is innerMethod");
     }
     //to call the InnerClass properties we have to create an object of InnerClass inside the OuterClass
    }
}
