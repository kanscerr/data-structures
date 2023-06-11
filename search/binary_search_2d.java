//binary search in sorted 2d array

package search;
import java.util.Arrays;
public class binary_search_2d {
    int[] binarySearch(int[][] arr, int target){
        int l = 0;
        int r = arr.length * arr[l].length-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            int row = arr.length-1;
            int col = arr[0].length;
            if(arr[mid/row][mid%col] == target){
                return new int[] {mid/row, mid%col};
            }
            else{
                if(arr[mid/row][mid%col] > target){
                    r = mid-1;
                }
                else{
                    l = mid+1;
                }
            }
        }
        return new int[] {-1};
    }

    public static void main(String[] args){
        int[][] arr = {{0,1,2}, {3,4,5}, {6,7,8}, {9,10,11}};
        binary_search_2d b = new binary_search_2d();
        System.out.println(Arrays.toString(b.binarySearch(arr, 3)));
    }
}