package questions;

public class searchIndex {
    public static int searchInsert(int[] nums, int target) {
        int p=0, q=nums.length-1;
        while(p<=q){
            int mid = (p+q)/2;
            if(target == nums[mid]){
                return mid;
            }
            else{
                if(target > nums[mid]){
                    p = mid+1;
                }
                else{
                    q = mid-1;
                }
            }
        }
        return p;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 9, 18, 23, 27, 35, 49, 63};
        System.out.println(searchInsert(nums, 1));
    }
}
