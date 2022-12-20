package DaftarKegiatasn;

public class Kegiatan {
    private String nama;
    private String deskripsi;

    public Kegiatan(String nama, String deskripsi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
    }

    public String getNama() {
        return nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    @Override
    public String toString() {
        return nama + ": " + deskripsi;
    }
}
