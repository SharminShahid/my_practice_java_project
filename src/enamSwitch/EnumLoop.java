package enamSwitch;

public class EnumLoop {
    public static void main(String[] args){
        for (DaysOfWeek days:DaysOfWeek.values()
             ) {
            System.out.println(days);

        }
    }
}
