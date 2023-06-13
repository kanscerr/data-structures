/*Given an array of size n and a number k. We must modify array K a number of times. Here modify
array means in each operation we can replace any array element arr[i] by -arr[i]. We need to perform
this operation in such a way that after K operations, the sum of the array must be maximum?*/

package greedy_technique;
import java.util.Arrays;
import java.util.stream.*;
public class maximize_array_sum {
    void negate1(int[] arr, int k){ //negate different elements.
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

    void negate2(int[] arr, int k){ //can modify same element multiple times
        Arrays.sort(arr);
        int i = 0;
        while(k > 0){
            if(arr[i] == 0){
                k = 0;
            }
            else if(arr[i] < 0){
                arr[i] = -arr[i];
                k--;
                i = (i+1)%arr.length;
            }
            else{
                Arrays.sort(arr);
                i = 0;
                arr[i] = -arr[i];
                k--;
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
        m.negate2(arr, k);
        System.out.println(Arrays.toString(arr));
        System.out.println("Max sum: "+m.maxSum(arr));
    }
}