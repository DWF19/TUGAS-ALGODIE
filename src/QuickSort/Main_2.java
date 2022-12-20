package QuickSort;

public class Main_2 {
    public static void main(String[] args) {
        SortedLinkedList list = new SortedLinkedList();
        list.add(51);
        list.add(2);
        list.add(42);
        list.add(322);
        list.add(11);
        list.add(13);
        list.add(1);
        list.add(33);
        list.add(98);
        list.add(76);
        list.add(19);
        list.add(122);

        System.out.println("DATA SEBELUM DI SORTING:");
        list.printList();
        System.out.println();

        list.sort();

        System.out.println("DATA SETELAH DI SORTING:");
        list.printList();
    }
}
