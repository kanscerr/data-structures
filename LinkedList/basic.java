package LinkedList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Spliterator;

public class basic {
    public static void main(String[] args){
        LinkedList<Integer> l = new LinkedList(); //linked list constructor
        //add elements
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        //add element at an index
        l.add(2, 6);
        //add element at the head
        l.addFirst(89);
        //add element at the tail
        l.addLast(100);
        //printing linked list
        System.out.println(l);
        //remove element from an index
        l.remove(3);
        //retrieve head element
        System.out.println("head: "+l.element());
        //checks if an element exist
        System.out.println("contains 78: "+l.contains(78));

        //setting an iterator from head to tail
        System.out.print("print: ");
        Iterator x = l.listIterator();
        while(x.hasNext()){
            System.out.print(x.next()+" ");
        }
        System.out.println();

        //setting an iterator from tail to head (reverse)
        System.out.print("print in reverse: ");
        Iterator<Integer> y = l.descendingIterator();
        while(y.hasNext()){
            System.out.print(y.next()+" "); //prints in reverse
        }

        //retrive element at an index
        System.out.println(l.get(3));
        //retrieve index of
        System.out.println(("index of 16: "+l.indexOf(16)));
        //add element to tail
        l.offer(487);
        //peek last element
        System.out.println("last element: "+l.peekLast());
        //retrive and remove head
        System.out.println("removed head element: "+l.poll());
        //replace element at an index
        l.set(4, 873);
        //get size
        System.out.println("size: "+l.size());

        //spliterator (not clear yet)
        for(Spliterator s = l.spliterator();
            s.tryAdvance(System.out::print);
            System.out.print("->"+s.estimateSize()+"->"+s.characteristics()+"\n")
            //spliterator.estimateSize()- estimated number of elements ahead
            //spliterator.hasCharacteristics()- idk something
        );

        // convert linked list to array
        for(Object element : l.toArray()){
            System.out.println(element);
        }
    }
}
