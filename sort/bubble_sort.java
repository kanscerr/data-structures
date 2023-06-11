//Bubble sort
package sort;
public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {65, 7, 13, 93, 57};
        //sorting
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j+1]<arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        //printing
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}