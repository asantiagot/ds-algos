package LinkedLists;

public class LinkedList {
    Link first;

    void addLink(int data) {
        Link newLink = new Link(data);
        if (isEmpty()) {
            first = newLink;
        } else {
            newLink.next = first;
            first = newLink;
        }
    }

    private boolean isEmpty() {
        return first == null;
    }

}
