package DaftarKegiatasn;

public class DoubleLinkedList {
         Node head;
         Node tail;
         int size;

        public DoubleLinkedList() {
            head = null;
            tail = null;
            size = 0;
        }

        public void addFirst(Kegiatan data) {
            Node node = new Node(data);
            node.setNext(head);
            if (head != null) {
                head.setPrev(node);
            }
            head = node;
            if (tail == null) {
                tail = head;
            }
            size++;
        }

        public void addLast(Kegiatan data) {
            Node node = new Node(data);
            node.setPrev(tail);
            if (tail != null) {
                tail.setNext(node);
            }
            tail = node;
            if (head == null) {
                head = tail;
            }
            size++;
        }

        public Kegiatan removeFirst() {
            if (head == null) {
                return null;
            }
            Kegiatan data = head.getData();
            head = head.getNext();
            if (head != null) {
                head.setPrev(null);
            }
            size--;
            if (head == null) {
                tail = null;
            }
            return data;
        }

        public Kegiatan removeLast() {
            if (tail == null) {
                return null;
            }
            Kegiatan data = tail.getData();
            tail = tail.getPrev();
            if (tail != null) {
                tail.setNext(null);
            }
            size--;
            if (tail == null) {
                head = null;
            }
            return data;
        }

        public Kegiatan remove(Kegiatan kegiatan) {
            for (Node node = head; node != null; node = node.getNext()) {
                if (node.getData().getNama().equals(kegiatan.getNama())) {
                    if (node.getPrev() != null) {
                        node.getPrev().setNext(node.getNext());
                    }
                    if (node.getNext() != null) {
                        node.getNext().setPrev(node.getPrev());
                    }
                    if (node == head) {
                        head = node.getNext();
                    }
                    if (node == tail) {
                        tail = node.getPrev();
                    }
                    size--;
                    return node.getData();
                }
            }
            return null;
        }

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void clear() {
            head = null;
            tail = null;
            size = 0;
        }
}
