package greedy_technique;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class min_product_subarray {
    static int subarray(ArrayList<Integer> arr){
        int curMax = arr.get(0), curMin = arr.get(0), min = arr.get(0);
        for(int i=1; i<arr.size();i++){
            int temp = arr.get(i)*curMax;
            curMax = Math.max(Math.max(arr.get(i), arr.get(i)*curMin), arr.get(i)*curMax);
            curMin = Math.min(Math.min(arr.get(i), arr.get(i)*curMin), temp);
            min = Math.min(min, curMin);
        }
        return min;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2,3,-2,4));
        System.out.println(subarray(arr));
    }
}
