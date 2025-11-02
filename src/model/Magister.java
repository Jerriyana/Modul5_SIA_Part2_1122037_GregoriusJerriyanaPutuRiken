package model;
import java.util.List;

public class Magister extends Mahasiswa {
    private List<MatkulAmbil> matkulDiambil;
    private String judulTesis;

    public Magister(String nim, String nama, String alamat, java.time.LocalDate ttl, String telepon, String jurusan, List<MatkulAmbil> matkulDiambil, String judulTesis) {
        super(nim, nama, alamat, ttl, telepon, jurusan);
        this.matkulDiambil = matkulDiambil;
        this.judulTesis = judulTesis;
    }

    public List<MatkulAmbil> getMatkulDiambil() { return matkulDiambil; }
    public void setMatkulDiambil(List<MatkulAmbil> matkulDiambil) { this.matkulDiambil = matkulDiambil; }

    public String getJudulTesis() { return judulTesis; }
    public void setJudulTesis(String judulTesis) { this.judulTesis = judulTesis; }

    @Override
    public String getRole() {
        return "Magister";
    }

    @Override
    public String toString() {
        return super.toString() + 
        "\nmatkulDiambil= \n" + matkulDiambil + 
        "\njudulTesis= " + judulTesis;
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
