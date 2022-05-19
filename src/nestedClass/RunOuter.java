package nestedClass;

public class RunOuter {
    public static void main (String[] args){
        OuterClass out = new OuterClass();
        System.out.println(out.outer);
        System.out.println(out.inner.inner); //calling inner variable by inner object name
        out.outerMethod();
        out.inner.innerMethod(); // calling inner method by inner method name.

    }
}
