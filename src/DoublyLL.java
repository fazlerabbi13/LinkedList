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
