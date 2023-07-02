package recursion;

public class palindrome {
    static Boolean checkPalindrome(String str, int i){
        if(str.charAt(i) != str.charAt(str.length()-i-1)){
            return false;
        }
        if(i >= str.length()/2){
            return true;
        }
        return checkPalindrome(str, i+1);
    }
    public static void main(String[] args) {
        System.out.println(checkPalindrome("abcadacba", 0));
    }
}
