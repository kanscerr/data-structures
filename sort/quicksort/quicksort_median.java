//pivot = median element
package sort.quicksort;
import java.util.Arrays;

public class quicksort_median {
    static void quicksort(int[] arr, int l, int r){
        if(l<r){
            int pivot = partition(arr, l, r);
            quicksort(arr, l, pivot-1);
            quicksort(arr, pivot+1, r);
        }
    }
    //pivot as median element
    static int partition(int[] arr, int l, int r){
        int piv_idx = (l+r)/2;
        int pivot = arr[piv_idx];
        swap(arr, piv_idx, r);
        int i=l, j=r-1;
        while(i<j){
            while(arr[i] < pivot){
                i++;
            }
            while(arr[j] > pivot && j>0){
                j--;
            }
            if(i<j){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        swap(arr, i, r);
        return i;
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args){
        int[] arr = {5, 89, 21, 0, 33, 22, 87, 65};
        quicksort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
