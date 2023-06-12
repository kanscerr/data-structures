package recursion;
public class reverse_string {
    static String reverse(String str, int x, String rev){
        if(x == 0){
            return rev;
        }
        rev += str.charAt(--x);
        return reverse(str, x, rev);
    }
    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println(reverse(str, str.length(), ""));
    }

}