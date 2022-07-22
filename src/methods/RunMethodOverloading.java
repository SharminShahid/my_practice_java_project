package methods;

public class RunMethodOverloading {
    public static void main(String[] args){
        MethodOverloading mol = new MethodOverloading();

        System.out.println(mol.plusMethod(3,7));
        System.out.println(mol.plusmethod((float) 3.56, (float) 6.44));
       //System.out.println(mol.plusMethod(10,20,40));// if no print statement in method
        mol.plusMethod(23,12,12); // print statement in method.
    };
}
