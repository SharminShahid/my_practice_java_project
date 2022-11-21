package newPractice;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        String reverse = "";

        int len = str.length();
       //for loop
        for (int i = len-1;i>=0;i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);
        if(str.equalsIgnoreCase(reverse)){
            System.out.println("palindrom");
        }else {
            System.out.println("not palindrom");
        }

        //String Buffer: is mutable. there is reverse method in String Buffer

        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());
    }
}
