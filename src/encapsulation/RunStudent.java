package encapsulation;

public class RunStudent {
    public static void main(String[] args) {
        Student st = new Student();
        st.setGrade('A');
        System.out.println(st.getGrade());

        st.setNumber(89);
        System.out.println(st.getNumber());


        System.out.println(st.name("jony"));//public variable so we dont need get and set method

    }
}
