//insertion sort
package sort;
public class insertion_sort {
    public static void main(String[] args) {
        int[] arr = {65, 7, 13, 93, 57};
        //sorting
        for(int i=1;i<arr.length;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i--;
                }
                else{
                    break;
                }
            }
        }
        //printing
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
