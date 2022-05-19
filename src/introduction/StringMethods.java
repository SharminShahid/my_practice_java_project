package introduction;

public class StringMethods {
    public static void main(String[] args) {


        //String is a non-primitive variable that contains characters.
        //syntax:
        // String type String name = "String value";

        //declaration of string in two ways:
        //declaration without using new operator--
       // String str = "Hello";
        //declaration using new operator--
       // String str1 = new String("Hello");

        //String Methods

        //String concatenation:

        String greeting = "Hello all";
        String frnds = " friends";
        String output = greeting.concat(frnds);
        System.out.println(output);

        //String manipulation:
        //int.length = returns the number of characters
        int output1 = greeting.length();
        System.out.println(output1);

        // charAt returns the character of given index
        String s = "today is Friday";
        int result = s.charAt(6);
        System.out.println("charAt :" +s.charAt(6));

        //toUpperCase converts the string to uppercase
        String upper = s.toUpperCase();
        System.out.println(s.toUpperCase());

        //substring method gives a new string from the given index to the end.
        String sbstr = s.substring(2);
        System.out.println("substring is :" +s.substring(2));

        //it returns the beginning and ending index character
        System.out.println(s.substring(2,7));

        //index of returns the index value of given character or string
        int indx = s.indexOf('a');
        System.out.println(s.indexOf('a'));
        int indx1 = s.indexOf("is");
        System.out.println(s.indexOf("is"));

        //equal method is used to compare two strings
        String s1= "Asia";
        String s2 = "asia";
        boolean equal = s1.equals(s2);
        System.out.println(s1.equals(s2));
        boolean equal2 = s1.equalsIgnoreCase(s2);
        System.out.println(s1.equalsIgnoreCase(s2));

        //replace a character with the given one
        System.out.println(s1.replace('s','q'));

        //Escape characters
        //String txt = "The "sun" is the main source of light"; (this gives error)
        //so it should be written in the following way----
        System.out.println("The \"sun\" is the main source of light"); // backslash\ is an escape character.
        System.out.println("\'sun\'");
        System.out.println();




        }
    }

