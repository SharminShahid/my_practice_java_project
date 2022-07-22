package constructor;

public class ChildConstructor extends ParentConstructor{
    public ChildConstructor() {
        super();
    }
    public ChildConstructor(int i){
        super(40);
    }

    public static void main(String[] args) {
        ChildConstructor obj = new ChildConstructor();
        ChildConstructor obj1 = new ChildConstructor(40);

    }

}
