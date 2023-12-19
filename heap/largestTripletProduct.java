package heap;

import javax.swing.text.html.HTMLDocument;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class largestTripletProduct {
    static void getProduct(int[] arr){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int num : arr){
            maxHeap.offer(num);
            if(maxHeap.size() < 3){
                System.out.println(-1);
            }
            else{
                int num1 = maxHeap.poll();
                int num2 = maxHeap.poll();
                int num3 = maxHeap.poll();
                System.out.println(num1*num2*num3);
                maxHeap.offer(num1);
                maxHeap.offer(num2);
                maxHeap.offer(num3);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,5,6,4};
        getProduct(arr);
    }
}
