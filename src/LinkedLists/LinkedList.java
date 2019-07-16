package LinkedLists;

class LinkedList {
    private Link first;

    private boolean isEmpty() {
        return first == null;
    }

    void addLink(int data) {
        Link newLink = new Link(data);
        if (isEmpty()) {
            first = newLink;
        } else {
            newLink.next = first;
            first = newLink;
        }
    }

    void traverseList() {
        if (isEmpty()) {
            System.out.println("Linked list is empty");
        } else {
            Link link = first;
            int i = 0;
            while (link != null) {
                System.out.println("link " + i +  ". Data: " +link.data);
                link = link.next;
                i++;
            }
        }
    }

    void deleteFirst() {
        if (isEmpty()) {
            System.out.println("List is already empty");
        } else {
            first = first.next;
        }
    }

    void findItem(int data) {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            Link link = first;
            int i = 0;
            boolean found = false;
            while (link != null) {
                if (link.data == data) {
                    System.out.println(data + " found at link " +i);
                    found = true;
                }
                link = link.next;
                i++;
            }
            if (!found) {
                System.out.println(data + " not found in list ");
            }
        }
    }

    void deleteItem(int data) {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            Link link = first;
            Link previous = first;
            while (link != null) {
                if (link.data == data) {
                    if (link == first) {
                        first = link.next;
                    } else {
                        previous.next = link.next;
                    }
                    return;
                }
                previous = link;
                link = link.next;
            }
        }
    }

}
