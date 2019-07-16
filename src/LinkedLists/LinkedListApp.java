package LinkedLists;

public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        myList.addLink(1);
        myList.addLink(2);
        myList.addLink(3);
        myList.addLink(4);
        myList.addLink(5);

        myList.traverseList();
//        myList.deleteFirst();

//        myList.traverseList();

//        myList.findItem(6);
//        myList.findItem(3);

        myList.deleteItem(3);
        myList.deleteItem(5);
//        myList.deleteItem(5);
//        myList.deleteItem(1);
        System.out.println("break");

        myList.traverseList();
    }
}
