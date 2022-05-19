package methods;

public class RunMethodOverloading {
    public static void main(String[] args){
        MethodOverloading mol = new MethodOverloading();
        System.out.println(mol.plusMethod(3,7));
        System.out.println(mol.plusmethod((float) 3.56, (float) 6.44));
    }
}
