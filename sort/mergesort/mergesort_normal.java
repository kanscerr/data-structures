package sort.mergesort;
import java.util.Arrays;
public class mergesort_normal {
    //normal merge sort
    static void merge(int[] arr, int l, int mid, int r){
        int n1 = mid-l+1;
        int n2 = r-mid;
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        //array copy
        System.arraycopy(arr, l, arr1, 0, n1);
        System.arraycopy(arr, mid+1, arr2, 0, n2);

        int i=0, j=0, k=l;
        while(i<n1 && j<n2){
            if(arr1[i] < arr2[j]){
                arr[k++] = arr1[i++];
            }
            else{
                arr[k++] = arr2[j++];
            }
        }
        //rest values left in the array
        while(i<n1){
            arr[k++] = arr1[i++];
        }
        while(j<n2){
            arr[k++] = arr2[j++];
        }
    }
    static void mergesort(int[] arr, int l, int r){
        if(l<r){
            int mid = (l+r)/2;
            //divide
            mergesort(arr, l, mid);
            mergesort(arr, mid+1, r);
            //conquer
            merge(arr, l, mid, r);
        }
    }
    public static void main(String[] args){
        int[] arr = {5, 89, 21, 0, 33, 22, 87, 65};
        mergesort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
