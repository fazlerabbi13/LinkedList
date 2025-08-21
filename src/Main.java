//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*      SinglyLinkedList list = new SinglyLinkedList();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);
        list.insertFirst(8);
        list.insertFirst(9);

        list.insertLast(99);

        list.insertAtParticularIndex(100,3);

        System.out.println(list.deleteFirst());

        list.display();

        System.out.println(list.deleteLast());

       list.display();

        System.out.println(list.deleteAtParticularIndex(2));

        list.display();
  */


        DoublyLL list = new DoublyLL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertAtLast(99);

        list.display();

    }
}