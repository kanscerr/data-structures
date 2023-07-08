package recursion;

public class subsequenceOfString {
    static void findSubsequence(String str, String seq, int i){
        if(i>=str.length()){
            System.out.println(seq);
            return;
        }
        findSubsequence(str, seq, i+1);
        seq += str.charAt(i);
        findSubsequence(str, seq, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        String seq = "";
        findSubsequence(str, seq, 0);
    }
}
