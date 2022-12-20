package PriorityQueue;

public class Main_4 {
    public static void main(String[] args) {
        Queue data = new Queue();
        System.out.println("Semua antrian :) <3");
        data.enqueue("wahyu");
        data.enqueue("febirian");
        data.enqueue("dhira");
        data.enqueue("eky");
        data.enqueue("rama");
        data.printAll();
        System.out.println("\n antrian prioritas :(");
        data.addPriority("rama");
        data.addPriority("dhira");
        data.priority();
        data.printAll();
    }
}
