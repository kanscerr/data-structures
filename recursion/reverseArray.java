package recursion;

import java.util.Arrays;

public class reverseArray {
    static int[] swap(int[] arr, int l, int r){
        if(l>=r){
            return arr;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        return swap(arr, l+1, r-1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(swap(arr, 0, arr.length-1)));
    }
}
