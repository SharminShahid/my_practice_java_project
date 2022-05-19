package encapsulation;

public class RunEmployee {
    public static void main (String[] args){
        Employee person = new Employee();
        person.setname("david");
        System.out.println(person.getName());
        person.setAge(30);
        System.out.println(person.getAge());
    }
}
