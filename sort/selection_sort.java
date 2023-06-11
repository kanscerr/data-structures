//selection sort
package sort;
public class selection_sort {
    public static void main(String[] args) {
        int[] arr = {65, 7, 13, 93, 57};
        //sorting algorithm
        for (int i = 0; i < 5; i++) {
            int min = i;
            for (int j = i + 1; j < 5; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        //printing sorted array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}