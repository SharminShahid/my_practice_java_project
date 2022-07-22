package methods;

public class MethodOverloading {
    //we can create multiple methods with same name but different parameters. This is called method overloading.
    public int plusMethod(int a,int b){
        return a+b;
    }
    public float plusmethod(float a, float b){
        return a + b;
    }
    public int plusMethod(int x,int y,int z){
        x = 30;
        y = 40;
        z = 10;
        int z1= x+y+z;
        System.out.println(z1);
        return z1;
    }
}
