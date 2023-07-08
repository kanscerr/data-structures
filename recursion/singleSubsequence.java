//return any one subsequence
//trick : return true false

package recursion;

import java.util.ArrayList;

public class singleSubsequence {
    static Boolean findOneSubsequence(int[] arr, ArrayList<Integer>seq, int i, int sum){
        if(i>=arr.length){
            if(seq.stream().mapToInt(Integer::intValue).sum() == sum){
                System.out.println(seq);
                return true;
            }
            else{
                return false;
            }
        }
        seq.add(arr[i]);
        if(findOneSubsequence(arr, seq, i+1, sum)){
            return true;
        }
        seq.remove(seq.size()-1);
        return findOneSubsequence(arr, seq, i+1, sum);
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 2, 6, 8, 0};
        int sum = 8;
        ArrayList<Integer> seq = new ArrayList<>();
        findOneSubsequence(arr, seq, 0, sum);
    }
}
