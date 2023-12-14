//find maximum sum subarray of size k
package array_algorithm;
public class slidingWindow {
    static int getMaxSum(int[] arr, int k){
        int maxSum = 0;
        int windowSum = 0;
        int start = 0;
        //window proceeding in O(n)
        for(int i=0;i<arr.length;i++){
            windowSum += arr[i];
            if((i-start+1) == k){
                maxSum = Math.max(windowSum, maxSum);
                windowSum -= arr[start];
                start += 1;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {2,7,5,3,8,1,9};
        int k = 2;
        System.out.println(getMaxSum(arr, k));
    }
}
