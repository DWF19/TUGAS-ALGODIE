package QuickSort;

public class SortedLinkedList {
    private class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    void sort() {
        head = mergeSort(head);
    }
    //
    private Node mergeSort(Node h) {
        if (h == null || h.next == null) {
            return h;
        }
        Node middle = getMiddle(h);
        Node nextToMiddle = middle.next;
        middle.next = null;

        Node left = mergeSort(h);
        Node right = mergeSort(nextToMiddle);

        Node sorted = merge(left, right);
        return sorted;
    }
    private Node getMiddle(Node h) {
        if (h == null) {
            return h;
        }

        Node fast = h.next;
        Node slow = h;

        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }
        }

        return slow;
    }
    private Node merge(Node a, Node b) {
        Node dummy = new Node(0);
        Node tail = dummy;
        while (true) {
            if (a == null) {
                tail.next = b;
                break;
            }
            if (b == null) {
                tail.next = a;
                break;
            }
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        return dummy.next;
    }
}
