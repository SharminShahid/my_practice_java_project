package encapsulation;

public class Student {
    String name;
    int serial;
    private char grade;
    private int number;

    public char getGrade(){
        return grade;
    }
    public int getNumber(){
        return number;
    }
    public void setGrade(char grade){
        this.grade=grade;
    }
    public void setNumber(int number){
        this.number=number;
    }
    public String name(String name){
        return name;
    }



}
