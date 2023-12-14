package LinkedList;
import java.util.*;
public class Print_rotated {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList();
        //adding elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //print rotated
        System.out.println("Printing list rotated-");
        Iterator i = list.descendingIterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
    }
}
