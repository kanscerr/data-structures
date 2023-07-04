package recursion;
import java.util.ArrayList;
public class subsequenceWithSum {
    static void findSubsequenceWithSum(int[] arr, int i, ArrayList<Integer> seq, int sum){
        if(i>=arr.length){
            if(seq.stream().mapToInt(Integer::intValue).sum() == sum){
                System.out.println(seq);
            }
            return;
        }
        seq.add(arr[i]);
        findSubsequenceWithSum(arr, i+1, seq, sum);
        seq.remove(seq.size()-1);
        findSubsequenceWithSum(arr, i+1, seq, sum);
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 2, 6, 8, 0};
        int sum = 8;
        ArrayList<Integer> seq = new ArrayList<>();
        findSubsequenceWithSum(arr, 0, seq, sum);
    }
}