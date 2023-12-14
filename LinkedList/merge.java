package LinkedList;

public class merge {
    static linkedList merge(linkedList list1, linkedList list2){
        linkedList list3 = new linkedList();
        linkedList.Node i = list1.head;
        linkedList.Node j = list2.head;

        if((Integer)i.data < (Integer)j.data){
            list3.head = new linkedList.Node(list1.head.data);
            i = list1.head.next;
        }
        else{
            list3.head = new linkedList.Node(list2.head.data);
            j = list2.head.next;
        }
        linkedList.Node k = list3.head;
        while(i.next != null || j.next!=null){
            if((Integer)i.data < (Integer)j.data){
                k.next = i;
                k = k.next;
                k.data = i.data;
                i = i.next;
            }
            else{
                k.next = j;
                k = k.next;
                k.data = j.data;
                j = j.next;
            }
        }
        return list1;
    }
    public static void main(String[] args) {
        //list one
        linkedList listfinal;
        linkedList list1 = new linkedList();
        list1.head = new linkedList.Node(1);
        list1.head.next = new linkedList.Node(2);
        list1.head.next.next = new linkedList.Node(3);
        list1.head.next.next.next = new linkedList.Node(5);
        list1.head.next.next.next.next = new linkedList.Node(6);
        list1.head.next.next.next.next.next = new linkedList.Node(8);

        //list two
        linkedList list2 = new linkedList();
        list2.head = new linkedList.Node(3);
        list2.head.next = new linkedList.Node(4);
        list2.head.next.next = new linkedList.Node(5);
        list2.head.next.next.next = new linkedList.Node(7);
        list2.head.next.next.next.next = new linkedList.Node(9);
        listfinal = merge(list1, list2);
        System.out.print("list1: ");
        linkedList.Node i = list1.head;
        while(i != null){
            System.out.print(i.data+" ");
            i = i.next;
        }
        System.out.print("\nlist2: ");
        linkedList.Node j = list2.head;
        while(j != null){
            System.out.print(j.data+" ");
            j = j.next;
        }
        System.out.print("\nmerged list: ");
        linkedList.Node l = listfinal.head;
        while(l != null){
            System.out.print(l.data+" ");
            l = l.next;
        }
    }
}
