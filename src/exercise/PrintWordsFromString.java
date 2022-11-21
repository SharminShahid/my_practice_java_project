package exercise;

public class PrintWordsFromString {
    public static void main(String[] args) {
        String st = "Sharmin Shahid";
        st = st + " ";
        int l = st.length();
        int p = 0;

        for (int i = 0; i < l; i++) {
            char ch = st.charAt(i);
            if (ch == ' ') {
                String s = st.substring(p, i);
                System.out.println(s);
                p = i + 1;
            }
        }
    }
}
