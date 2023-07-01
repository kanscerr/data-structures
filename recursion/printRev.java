package recursion;

public class printRev {
    static void reverse(String s, int i){
        if(i < 0){
            return;
        }
        System.out.print(s.charAt(i));
        reverse(s, i-1);
    }
    public static void main(String[] args) {
        String str = "abcd";
        reverse(str, str.length()-1);
    }
}
