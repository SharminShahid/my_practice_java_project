package constructor;

public class ChildConstructor extends ParentConstructor{

    static int age = 12;
    public ChildConstructor() {
        super();
    }
    public ChildConstructor(int i){
        super(40);
        this.age = age;
    }

    public static void main(String[] args) {
        ChildConstructor obj = new ChildConstructor();
        ChildConstructor obj1 = new ChildConstructor(40);
        System.out.println(age);

    }

}
