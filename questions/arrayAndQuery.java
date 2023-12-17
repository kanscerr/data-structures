package questions;

import java.util.ArrayList;
import java.util.List;

public class arrayAndQuery {
    static List<Integer> update(List<Integer> arr, int l, int r){
        arr.set(l, r);
        return arr;
    }
    static int find(List<Integer> arr, int x, int l, int r){
        for(int i=l;i<=r;i++){
            if(arr.get(i) >= x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(2);
        arr.add(4);
        arr.add(6);
        ArrayList<List<Integer>> queries = new ArrayList<>();
        queries.add(List.of(2, 0, 4));
        queries.add(List.of(1, 2, 5));
        queries.add(List.of(4, 0, 4));
        queries.add(List.of(0, 0, 4));

        for(List<Integer> query : queries){
            int x = query.get(0);
            int l = query.get(1);
            int r = query.get(2);
            if(x==1){
                update(arr, l, r);
            }
            else{
                int ans = find(arr, x, l, r);
                System.out.print(ans+" ");
            }
        }
    }
}
