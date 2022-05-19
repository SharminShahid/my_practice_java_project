package enamSwitch;

public class SwichClass {
    public static void main(String[] args){
        DaysOfWeek days = DaysOfWeek.MONDAY;

        switch (days){
            case SUNDAY:
                System.out.println("fun");
                break;
            case MONDAY:
                System.out.println("go to work");
                break;
            case TUESDAY:
                System.out.println("kids have school");
                break;
            case WEDNESDAY:
                System.out.println("outdoor games");
                break;
            case THURSDAY:
                System.out.println("shopping");
                break;
            case FRIDAY:
                System.out.println("swimming");
                break;
            case SATURDAY:
                System.out.println("cooking");
                break;
        }
    }
}
