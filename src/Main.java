public class Main {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.createLinkedList(1);
        ll.insertNode(2);
        ll.insertNode(1);
        ll.insertNode(3);
        ll.traversalLinkedList();
        Questions.deleteDups(ll);
        ll.traversalLinkedList();


    }
}
