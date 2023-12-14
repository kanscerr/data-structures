package LinkedList;

public class reverseTwoPointers {
    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.head = new linkedList.Node(1);
        list.head.next = new linkedList.Node(2);
        list.head.next.next = new linkedList.Node(3);
        list.head.next.next.next = new linkedList.Node(4);
        list.head.next.next.next.next = new linkedList.Node(5);
        //printing original list
        linkedList.Node i = list.head;
        while(i != null){
            System.out.print(i.data+" ");
            i = i.next;
        }

        //reversing with two pointers
        linkedList.Node x = list.head;
        //traversing x to tail node
        while(x.next != null){
            x = x.next;
        }
        linkedList.Node z = x;
        //taking y to x-1 node
        while(x != list.head){
            linkedList.Node y = list.head;
            while(y.next != x){
                y = y.next;
            }
            x.next = y;
            x = y;
        }
        x.next = null;
        list.head = z;

        //printing reverse
        System.out.println();
        linkedList.Node j = list.head;
        while(j != null){
            System.out.print(j.data+" ");
            j = j.next;
        }
    }
}
