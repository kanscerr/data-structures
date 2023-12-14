package questions;
import java.util.*;
public class ceil_floor_array {
    static int ceil = 0, floor = 0;
    static List<Integer> findCeilAndFloor(int[] arr, int p, int q, int target){

        if(p==q){
            ceil = floor = arr[p];
        }
        else{
            int mid = (p+q)/2;
            if(target == arr[mid]){
                ceil = floor = arr[mid];
            }
            else if(target < arr[mid]){
                if(arr[mid-1] < target ){
                    floor = arr[mid-1];
                    ceil = arr[mid];
                }
                else{
                    findCeilAndFloor(arr, p, mid, target);
                }
            }
            else if(target > arr[mid]){
                if(arr[mid+1] > target){
                    floor = arr[mid];
                    ceil = arr[mid+1];
                }
                else{
                    findCeilAndFloor(arr, mid+1, q, target);
                }
            }
        }
        return Arrays.asList(floor, ceil);
    }
    public static void main(String[] args) {
        int[] arr = {3,6,9,10,14,21,38,46,52,63};
        int target = 78;
        if(target < arr[0]){
            System.out.println("[-1, "+arr[0]+"]");
        }
        else if(target > arr[arr.length-1]){
            System.out.println("["+arr[arr.length-1]+" , -1]");
        }
        else{
            System.out.println(findCeilAndFloor(arr, 0, arr.length-1, target));
        }
    }
}
