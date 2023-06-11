package sort;

public class merge_sort {
    static int[] arr = {65, 7, 13, 93, 57};
    static int[] b = new int[arr.length];
    static void sort(int[] arr, int s, int mid, int l){
        int i = s;
        int j = mid+1;
        int k = s;
        while(i<=mid && j<l){
            if(arr[i] > arr[j]){
                b[k] = arr[j];
                j++;
            }
            if(arr[i] < arr[j]){
                b[k] = arr[i];
                i++;
            }
            k++;
        }
    }
    static void mergeSort(int[] arr, int s, int l){
        if (s < l) {
            int mid = (s+l)/2;
            mergeSort(arr, s, mid);
            mergeSort(arr, mid+1, l);
            sort(arr, s, mid, l);
        }
    }
    public static void main(String[] args) {
        mergeSort(arr, 0, arr.length);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
    }
}
