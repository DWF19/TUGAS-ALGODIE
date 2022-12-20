package DaftarKegiatasn;
import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList daftar = new DoubleLinkedList();

        while (true) {
            System.out.println("Pilih menu: ");
            System.out.println("1. Tambah kegiatan");
            System.out.println("2. Hapus kegiatan");
            System.out.println("3. Tampilkan daftar kegiatan");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan: ");

            int pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                System.out.print("Masukkan nama kegiatan: ");
                String nama = sc.nextLine();
                System.out.print("Masukkan deskripsi kegiatan: ");
                String deskripsi = sc.nextLine();
                Kegiatan kegiatan = new Kegiatan(nama, deskripsi);
                daftar.addLast(kegiatan);
            } else if (pilihan == 2) {
                System.out.print("Masukkan nama kegiatan yang ingin dihapus: ");
                String nama = sc.nextLine();
                Kegiatan kegiatan = new Kegiatan(nama, "");
                daftar.remove(kegiatan);
            } else if (pilihan == 3) {
                for (Node node = daftar.head; node != null; node = node.getNext()) {
                    System.out.println(node.getData());
                }
            } else if (pilihan == 4) {
                break;
            } else {
                System.out.println("Pilihan tidak valid");
            }
        }
    }
}
