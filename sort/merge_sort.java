package sort;
import java.util.Arrays;
public class merge_sort{
    //in-place merge sort
    static void merge_inplace(int[] arr, int l, int mid, int r){
        int i = r-mid;
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
    static void mergesort_inplace(int[] arr, int l, int r){
        if(l<r){
            int mid = (l+r)/2;
            mergesort_inplace(arr, l, mid);
            mergesort_inplace(arr, mid+1, r);
            merge_inplace(arr, l, mid, r);
        }
    }

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
        int[] arr1 = {12, 11, 13, 5, 6, 7};
        int[] arr2 = {5, 89, 21, 0, 33, 22, 87, 65};
        mergesort_inplace(arr1, 0, arr1.length-1);
        mergesort(arr2, 0, arr2.length-1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}






























//    public static void main(String[] args){
//        int[] arr = {12, 11, 13, 5, 6, 7};
//        mergesort(arr, 0, arr.length-1);
//        System.out.println(Arrays.toString(arr));
//    }