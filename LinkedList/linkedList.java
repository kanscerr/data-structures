package LinkedList;

class linkedList{
    public Node head;
    public static class Node{
        Node next;
        Object data;
        Node(Object data){
            this.data = data;
            this.next = null;
        }
    }
}
