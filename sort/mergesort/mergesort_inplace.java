package sort.mergesort;
import java.util.Arrays;
public class mergesort_inplace {
    //in-place merge sort
    static void merge(int[] arr, int l, int mid, int r){
        int i = mid+1;
        while(l<=mid && i<=r){
            if(arr[l] <= arr[i]){
                l++;
            }
            else{
                int temp = arr[i];
                int idx = i;
                while(idx != l){
                    arr[idx] = arr[idx-1];
                    idx--;
                }
                arr[l] = temp;
                l++;
                mid++;
                i++;
            }
        }
    }
    static void mergesort(int[] arr, int l, int r){
        if(l<r){
            int mid = (l+r)/2;
            mergesort(arr, l, mid);
            mergesort(arr, mid+1, r);
            merge(arr, l, mid, r);
        }
    }

    public static void main(String[] args){
        int[] arr2 = {5, 89, 21, 0, 33, 22, 87, 65};
        mergesort(arr2, 0, arr2.length-1);
        System.out.println(Arrays.toString(arr2));
    }
}