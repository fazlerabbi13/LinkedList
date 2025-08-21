public class DoublyLL {
    Node head;

//    insert at first
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next=head;
        node.previous=null;
        if(head != null){
            head.previous=node;
        }
        head=node;
    }

//
    private class Node{
        int value;
        Node next;
        Node previous;

        public Node(int value){
            this.value=value;
        }

        public Node(int value,Node next,Node previous){
            this.value=value;
            this.next=next;
            this.previous=previous;
        }
    }
}
