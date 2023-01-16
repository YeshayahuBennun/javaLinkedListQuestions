import java.util.HashSet;

public class Questions {
    public  static void deleteDups(MyLinkedList ll){
        HashSet<Integer> hs = new HashSet<>();
        Node current = ll.getHead();
        Node prev = null;

        while (current!=null){
            int currentValue = current.getValue();
            if(hs.contains(currentValue)){
                prev.setNext(current.getNext());
                ll.setSize(ll.getSize()-1);
            }else {
                hs.add(currentValue);
                prev = current;
            }
            current = current.getNext();
        }
    }
}
