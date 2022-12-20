package PriorityQueue;
import java.util.NoSuchElementException;
public class Queue {
    public class Node{
        String Nama;
        boolean Priority;
        Node Next;
        Node Previous;
        Node(String Nama, boolean Priority){
            this.Nama=Nama;
            this.Priority=Priority;
        }
    }
    Node Head;
    Node Tail;

    public boolean isEmpty(){
        return (Head == null||Tail==null);
    }
    public void addPriority(String nama){
        add(nama, true);
    }
    public void enqueue(String nama){
        add(nama, false);
    }
    public void add(String Nama, boolean Priority) {
        Node newNode = new Node(Nama, Priority);
        if (isEmpty()) {
            Head = Tail = newNode;
            Head.Previous = null;
            Tail.Next = null;
        } else if (isAvailable(Nama)){
            Node current = Head;
            while(current!=null){
                if (current.Nama.equals(Nama)){
                    current.Priority=Priority;
                    break;
                }else{
                    current=current.Next;
                }
            }
        }else{
            newNode.Next=Head;
            Head.Previous=newNode;
            Head=newNode;

        }
    }
    public void merge(Queue Priority, Queue NonPriority){
        Node current = Priority.Head;
        for (int i=0;i<Priority.getDataSize();i++){
            add(current.Nama, current.Priority);
            current=current.Next;
        }
        current = NonPriority.Head;
        for (int i=0;i< NonPriority.getDataSize();i++){
            add(current.Nama, current.Priority);
            current=current.Next;
        }
    }

    public void priority(){
        Queue NonPriority= new Queue();
        Queue Priority = new Queue();
        Node current= Head;
        for (int i=0;i<getDataSize();i++){
            if (current.Priority==true){
                Priority.add(current.Nama, current.Priority);
                dequeue();
            }else{
                NonPriority.add(current.Nama, current.Priority);
                dequeue();
            }
            current=current.Next;
        }
        merge(Priority,NonPriority);
    }
    public Node dequeue(){
        if (isEmpty()){
            System.out.println("Queue Kosong ");
            return null;
        }else{
            Node temp = Tail;
            Tail=Tail.Previous;
            return temp;
        }
    }
    public int getDataSize(){
        int count=0;
        Node current = Head;
        while(current!=null){
            count++;
            current=current.Next;
        }
        return count;
    }
    public boolean isAvailable(String ParamName){
        Node current = Head;
        boolean available =false;
        for (int i=0;i<getDataSize();i++){
            if (current.Nama==ParamName){
                return true;
            }
            current=current.Next;
        }
        return available;
    }
    public void printAll(){
        Node current = Tail;
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else {
            while (current!=null){
                System.out.println(current.Nama);
                current=current.Previous;
            }

        }

    }
}

