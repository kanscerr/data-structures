//using floyd cycle detection algorithm
package questions;
public class duplicateElement {
    static int getDuplicate(int[] arr){
        int slow = 0;
        int fast = 0;
        while(true){
            slow = arr[slow];
            fast = arr[arr[fast]];
            if(slow == fast){
                break;
            }
        }
        slow = 0;
        while(slow != fast){
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,7,8,6,9,2,1,5,2};
        System.out.println(getDuplicate(arr));
    }
}
