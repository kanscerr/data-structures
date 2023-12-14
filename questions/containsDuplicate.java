package questions;
import java.util.*;
public class containsDuplicate {
    static boolean checkDuplicate(int[] arr){
        //instantiating hashset
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            if(!set.add(arr[i])){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {12, 16, 12, 13, 34, 28};
        System.out.println(checkDuplicate(arr));
    }
}
