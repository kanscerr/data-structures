//using three pointers
package LinkedList;
public class reverseThreePointers {
    public static void main(String[] args){
        linkedList list = new linkedList();
        list.head = new linkedList.Node(1);
        list.head.next = new linkedList.Node(2);
        list.head.next.next = new linkedList.Node(3);
        list.head.next.next.next = new linkedList.Node(4);
        list.head.next.next.next.next = new linkedList.Node(5);

        //printing
        System.out.println("list-");
        linkedList.Node i = list.head;
        while(i != null){
            System.out.print(i.data+" ");
            i = i.next;
        }
        System.out.println();
        //reversing
        System.out.println("rotated-");
        linkedList.Node x = list.head;
        linkedList.Node y = list.head.next;
        x.next = null;

        while(y != null){
            linkedList.Node z = y.next;
            y.next = x;
            x = y;
            y = z;
        }
        list.head = x;

        linkedList.Node j = list.head;
        while(j != null){
            System.out.print(j.data+" ");
            j = j.next;
        }
    }
}
