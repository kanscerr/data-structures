/*Given an array, find the minimum product possible with the subset of elements
present in the array. The minimum product can be a single element also.
example- Input : a[] = { -1, -1, -2, 4, 3 } Output : -24
*/

package greedy_technique;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class min_product_subset {
    static ArrayList<Integer> subset(ArrayList<Integer> arr){
        ArrayList<Integer> subset = new ArrayList<>();
        int count = 0;
        Collections.sort(arr);
        if(arr.get(0) >= 0){
            subset.add(arr.get(0));
        }
        else{
            for(int i=0;i<arr.size();i++){
                if(arr.get(i) < 0){
                    if(count == 0){
                        subset.add(arr.get(i));
                        count++;
                    }
                    else{
                        if((i < arr.size()-1) && (arr.get(i+1) < 0)){
                            subset.add(arr.get(i));
                            count = 0;
                        }
                    }
                }
                else if(arr.get(i) > 0){
                    subset.add(arr.get(i));
                }
            }
        }
        return subset;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(-1, 0, 4, 5, 6, -3, -4, 2));
        System.out.println(subset(arr));
    }
}
