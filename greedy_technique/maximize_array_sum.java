/*Given an array of size n and a number k. We must modify array K a number of times. Here modify
array means in each operation we can replace any array element arr[i] by -arr[i]. We need to perform
this operation in such a way that after K operations, the sum of the array must be maximum?*/

package greedy_technique;
import java.util.Arrays;
import java.util.stream.*;
public class maximize_array_sum {
    void negate(int[] arr, int k){
        Arrays.sort(arr);
        if(k >= arr.length){
            System.out.println("not possible!");
        }
        else{
            for(int i=0;i<k;i++){
                arr[i] = -arr[i];
            }
        }
    }
    int maxSum(int[] arr){
        return IntStream.of(arr).sum();
    }
    public static void main(String[] args) {
        maximize_array_sum m = new maximize_array_sum();
        int[] arr = {2, 6, -4, 9, 0, 7, 8, 5};
        int k = 3;
        m.negate(arr, k);
        System.out.println(Arrays.toString(arr));
        System.out.println("Max sum: "+m.maxSum(arr));
    }
}
