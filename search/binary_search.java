//binary search in 1d sorted array

package search;
public class binary_search{
    static int arr[] = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
    //recursive method
    static int search_recursion(int x, int l, int r){
        int mid = l + (r-l)/2;
        if( l <= r){
            if(x == arr[mid]){
                return mid;
            }
            else{
                if(x > arr[mid]){
                    return search_recursion(x, mid+1, r);
                }
                else{
                    return search_recursion(x, l, mid-1);
                }
            }
        }
        return -1;
    }
    //iterative manner
    static int search_iteration(int x, int l, int r){
        while(l <= r){
            int mid = l + (r-l)/2;
            if(x == arr[mid]){
                return mid;
            }
            else{
                if(x > arr[mid]){
                    l = mid+1;
                }
                else{
                    r = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search_recursion(23, 0, arr.length-1));;
        System.out.println(search_iteration(23, 0, arr.length-1));;
    }
}