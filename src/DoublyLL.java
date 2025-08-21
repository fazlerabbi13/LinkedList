public class DoublyLL {
    private Node head;

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

// display
    public void display(){
        Node node = head;
        while (node != null){
            System.out.println(node.value + "->");
            node=node.next;
        }
        System.out.println("End");
    }
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
