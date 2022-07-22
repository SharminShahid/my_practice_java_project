package introduction;

public class IncrementDecrementOperator {
    public static void main(String[] args) {
        int i = 1;
        int j = i++; //post increment
        //here value of i will be given to j 1st then increase the value of i by 1
        //output: i = 2; j=1
        System.out.println(i);
        System.out.println(j);
        System.out.println("---------");

        int a = 1;
        int b = ++a; // pre increment
        // here 1st a will be incremented by 1, then given the value to b, so b= 2
        //and a has already become 2 while incrementation.
        //output a = 2, b = 2

        System.out.println(a);
        System.out.println(b);
        System.out.println("---------");

        int m = 2;
        int n = m--; // post decrement
        //here value of a1 wiil be given to b1 1st(so n= 2) then a1 value will decrease by 1(so m= 1)
        System.out.println(m);
        System.out.println(n);
        System.out.println("--------");

        int p = 2;
        int q = --p;//pre decrement
        // here 1st value of p will decrease by 1 (so p=1 and q = 1)
        System.out.println(p);
        System.out.println(q);
    }

}
