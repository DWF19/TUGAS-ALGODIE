package DaftarKegiatasn;

public class Node {
    private Kegiatan data;
    private Node prev;
    private Node next;

    public Node(Kegiatan data) {
        this.data = data;
    }

    public Kegiatan getData() {
        return data;
    }

    public void setData(Kegiatan data) {
        this.data = data;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
