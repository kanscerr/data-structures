package recursion;

import java.util.ArrayList;

public class subsequence {
    static void findSubsequence(int[] arr, int i, ArrayList<Integer> seq){
        if(i >= arr.length){
            System.out.println(seq.toString());
            return;
        }
        seq.add(arr[i]);
        findSubsequence(arr, i+1, seq);
        seq.remove(seq.size()-1);
        findSubsequence(arr, i+1, seq);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<Integer> seq = new ArrayList<>();
        findSubsequence(arr, 0, seq);
    }
}
