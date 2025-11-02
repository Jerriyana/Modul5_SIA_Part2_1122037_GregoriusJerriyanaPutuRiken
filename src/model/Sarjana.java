package model;

import java.util.List;

public class Sarjana extends Mahasiswa {
    private List<MatkulAmbil> matkulDiambil;

    public Sarjana(String nim, String nama, String alamat, java.time.LocalDate ttl, String telepon, String jurusan,
            List<MatkulAmbil> matkulDiambil) {
        super(nim, nama, alamat, ttl, telepon, jurusan);
        this.matkulDiambil = matkulDiambil;
    }

    public List<MatkulAmbil> getMatkulDiambil() {
        return matkulDiambil;
    }

    public void setMatkulDiambil(List<MatkulAmbil> matkulDiambil) {
        this.matkulDiambil = matkulDiambil;
    }

    @Override
    public String getRole() {
        return "Sarjana";
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nmatkulDiambil= \n" + matkulDiambil;
    }

    public double getNilaiAkhir(String kodeMk) {
        for (MatkulAmbil ma : matkulDiambil) {
            if (ma.getMatkul().getKode().equalsIgnoreCase(kodeMk)) {
                return ma.hitungNilaiAkhir();
            }
        }
        return -1; 
    }
}
