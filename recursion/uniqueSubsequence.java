package recursion;

public class uniqueSubsequence {
    static void findUniqueSubsequence(String str, String seq, int i){
        if(i>=str.length()){
            System.out.println(seq);
            return;
        }
        findUniqueSubsequence(str, seq, i+1);
        if(!seq.contains(str.substring(i, i+1))){
            seq += str.charAt(i);
            findUniqueSubsequence(str, seq, i+1);
        }
    }
    public static void main(String[] args) {
        String str = "aab";
        String seq = "";
        findUniqueSubsequence(str, seq, 0);
    }
}
