public class DoublyLL {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLL() {
        this.size = 0;
    }
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

//    insert at anywhere

    public void insertAtAnywhere(int after,int value){
        Node p = find(after);

        if (p == null){
            System.out.println("dose not exist");
            return;
        }
        Node node = new Node(value);
        node.next = p.next;
        p.next = node;
        node.previous=p;
        if (node.next!=null){
            node.next.previous=node;
        }


    }


//    insert at last
    public void insertAtLast(int value){
        Node node = new Node(value);
        Node last = head;
        node.next = null;

        if(head== null){
            node.previous=null;
            head=node;
            return;
        }

        while (last.next != null){
            last=last.next;
        }
        last.next=node;
        node.previous=last;

    }

    public int deleteFirst() {
        if (head == null) {
            throw new RuntimeException("List is empty, cannot delete.");
        }

        int value = head.value;

        if (head == tail) { // only one element
            head = tail = null;
        } else {
            head = head.next;
            head.previous = null;
        }

        size--;
        return value;
    }
//finding node
public Node find(int value){
    Node node = head;
    while (node != null){
        if(node.value == value){
            return node;
        }
        node = node.next;
    }
    return node;
}
// display
    public void display(){
        Node node = head;
        Node last = null;
        while (node != null){
            System.out.print(node.value + "->");
            last=node;
            node=node.next;
        }
        System.out.println("End");

        System.out.println("Print in reverse");
        while (last!=null){
            System.out.print(last.value + "->");
            last= last.previous;
        }
        System.out.println("START");
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
