package sort;
import java.util.Arrays;
public class heapsort {
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void heapify(int[] arr, int n, int i){
        int largest = i;
        int left = i*2+1;
        int right = i*2+2;
        if(left<n && arr[left]>arr[largest]){
            largest = left;
        }
        if(right<n && arr[right]>arr[largest]){
            largest = right;
        }
        if(largest!=i){
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }
    }
    static void heapSort(int[] arr){
        int n = arr.length;
        //build heap
        for(int i=n/2-1;i>=0;i--){
            heapify(arr, n, i);
        }
        //extract element one by one
        for(int i=n-1;i>=0;i--){
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }
    }
    public static void main(String[] args){
        int[] arr = {12, 6, 8, 44, 9, 0, 31};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
