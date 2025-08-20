public class SinglyLinkedList{
    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList(){
        this.size=0;
    }

    // display Linked List
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }
    // insert at first

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head=node;

        if(tail==null){
            tail=head;
        }

        size++;
    }

//    insert anywhere in Linked list

    public void insertAtParticularIndex(int value,int index){
        if(index==0){
            insertLast(value);
            return;
        }
        if(index==size){
            insertLast(value);
            return;
        }

        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }

        Node node = new Node(value,temp.next);
        temp.next=node;
        size++;
    }

//    insert at last

    public void insertLast(int value){
        if ((tail == null)) {
            insertFirst(head.value);
            return;
        }
        Node node = new Node(value);
        tail.next=node;
        tail=node;
        size++;
    }

//    delete first Node
//    public int deleteFirst(){
//        int value= head.value;
//        head=head.next;
//        if(head==null){
//            tail=null;
//        }
//        size--;
//        return value;
//    }

//    delete at particular index element

//    public int deleteAtParticularIndex(int index){
//        if(index==0){
//            return deleteFirst();
//        }
//        if(index==size-1){
//            return deleteLast();
//        }
//
//        Node previous = get(index-1);
//        int value = previous.next.value;
//
//        previous.next=previous.next.next;
//
//        return value;
//
//    }

//    delete last element from linked list
//    public int deleteLast(){
//        if(size<=1){
//            return deleteFirst();
//        }
//        Node secondLast = get(size-2);
//        int value = tail.value;
//        tail=secondLast;
//        tail.next=null;
//        return  value;
//    }
//
//    public Node get(int index){
//        Node node = head;
//        for(int i =0;i<index; i++){
//            node = node.next;
//        }
//        return node;
//    }

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

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }

}
