package LinkedLists;

public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        myList.insertFirst(1);
        myList.insertFirst(2);
        myList.insertFirst(3);
        myList.insertFirst(4);
        myList.insertFirst(5);

        myList.traverseList();
//        myList.deleteFirst();

//        myList.traverseList();

//        myList.findItem(4);
//        myList.findItem(3);

        myList.deleteItem(3);
        myList.deleteItem(5);
        myList.deleteItem(7);
//        myList.deleteItem(5);
//        myList.deleteItem(1);
        System.out.println("break");

        myList.traverseList();
    }
}
