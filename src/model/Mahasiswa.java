package model;

import java.util.List;

public abstract class Mahasiswa extends User {
    private String jurusan;

    public Mahasiswa(String nim, String nama, String alamat, java.time.LocalDate ttl, String telepon, String jurusan) {
        super(nim, nama, alamat, ttl, telepon);
        this.jurusan = jurusan;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        return super.toString().replace("loginId", "nim") +
                "jurusan= " + jurusan;
    }
}
