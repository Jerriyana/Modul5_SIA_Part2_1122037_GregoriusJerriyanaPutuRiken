package model;
import java.time.LocalDate;

public class PresensiStaff extends Presensi {
    private int jam;

    public PresensiStaff(LocalDate tanggal, Status status, int jam) {
        super(tanggal, status);
        this.jam = jam;
    }

        
    @Override
    public String toString() {
        return "tanggal= " + getTanggal() + 
        "\nstatus= " + getStatus() + 
        "\njumlah jam= " + jam;
    }

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }
}
