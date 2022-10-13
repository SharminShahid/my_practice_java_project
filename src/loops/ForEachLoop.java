package loops;

public class ForEachLoop {
    public static void main(String[] args){
        String[] cars = {"toyota","honda","volvo","bmw"};
        for (String c:cars
             ) {
            System.out.println(c);

        }

        String[] days = {"sunday,monday,tuesday,wednesday,thursday,friday"};
        for (String weekdays:days
             ) {
            System.out.println(weekdays);

        }
        String[] name = new String[3];
        name[0] = "moly";
        name[1] = "dany";
        name[2] = "paul";

        for (String names:name
             ) {
            System.out.println(names);

        }


        }
    }

