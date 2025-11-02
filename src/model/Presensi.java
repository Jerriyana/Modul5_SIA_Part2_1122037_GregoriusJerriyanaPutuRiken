package model;
import java.time.LocalDate;

public class Presensi {
    private LocalDate tanggal;
    private Status status;

    public Presensi(LocalDate tanggal, Status status) {
        this.tanggal = tanggal;
        this.status = status;
    }

    public LocalDate getTanggal() { return tanggal; }
    public void setTanggal(LocalDate tanggal) { this.tanggal = tanggal; }

    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }

    @Override
    public String toString() {
        return "tanggal= " + tanggal + 
        "\nstatus=" + status;
    }
}
