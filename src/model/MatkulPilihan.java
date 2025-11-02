package model;
public class MatkulPilihan extends MataKuliah {
    private int minMahasiswa;

    public MatkulPilihan(String kode, int sks, String nama, int minMahasiswa) {
        super(kode, sks, nama);
        this.minMahasiswa = minMahasiswa;
    }

    public int getMinMahasiswa() { return minMahasiswa; }
    public void setMinMahasiswa(int minMahasiswa) { this.minMahasiswa = minMahasiswa; }

    @Override
    public String toString() {
        return "MatkulPilihan{" + "kode='" + getKode() + '\'' + ", sks=" + getSks() + ", nama='" + getNama() + '\'' + ", minMahasiswa=" + minMahasiswa + '}';
    }
}
