package SelectionSort;

public class Doubly {
    private class Node{
        int angka;
        Node(int angka){
            this.angka=angka;
        }
        Node next=null;
        Node previous=null;
    }
    Node head = null;
    Node tail = null;
    public void addLast(int angka){
        if (head==null){
            head = tail = new Node(angka);
            head.previous=null;
            tail.next=null;
        }else{
            Node temp = new Node(angka);
            tail.next=temp;
            temp.previous=tail;
            tail=temp;
            tail.next=null;
        }
    }
    public void selectionSort(){
        Node current=head;
        Node first=null;
        int small;
        while(current!=null){
            first=current;
            small = first.angka;
            while(first!=null){
                if (first.angka<small){
                    small = first.angka;
                }
                first=first.next;
            }
            System.out.println("Tukar "+current.angka+" dengan "+small);
            swap(small,current.angka);
            printAll();
            current=current.next;
        }
    }
    public void swap(int angka1, int angka2){
        Node node1 = getNode(angka1);
        Node node2 = getNode(angka2);
        node1.angka = node2.angka;
        node2.angka = angka1;
    }
    public Node getNode(int angka){
        Node current2=head;
        while(current2!=null){
            if (current2.angka==angka) return current2;
            current2=current2.next;
        }
        return null;
    }
    public void printAll(){
        Node current = head;
        while (current!=null){
            System.out.print("["+current.angka+"] ");
            current=current.next;
        }
        System.out.println();
    }
}
