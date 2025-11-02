package model;
public class Doktor extends Mahasiswa {
    private String judulDisertasi;
    private Double nilaiSidang1;
    private Double nilaiSidang2;
    private Double nilaiSidang3;

    public Doktor(String nim, String nama, String alamat, java.time.LocalDate ttl, String telepon, String jurusan, String judulDisertasi, Double nilaiSidang1, Double nilaiSidang2, Double nilaiSidang3) {
        super(nim, nama, alamat, ttl, telepon, jurusan);
        this.judulDisertasi = judulDisertasi;
        this.nilaiSidang1 = nilaiSidang1;
        this.nilaiSidang2 = nilaiSidang2;
        this.nilaiSidang3 = nilaiSidang3;
    }

    public String getJudulDisertasi() { return judulDisertasi; }
    public void setJudulDisertasi(String judulDisertasi) { this.judulDisertasi = judulDisertasi; }

    public Double getNilaiSidang1() { return nilaiSidang1; }
    public void setNilaiSidang1(Double nilaiSidang1) { this.nilaiSidang1 = nilaiSidang1; }

    public Double getNilaiSidang2() { return nilaiSidang2; }
    public void setNilaiSidang2(Double nilaiSidang2) { this.nilaiSidang2 = nilaiSidang2; }

    public Double getNilaiSidang3() { return nilaiSidang3; }
    public void setNilaiSidang3(Double nilaiSidang3) { this.nilaiSidang3 = nilaiSidang3; }

    @Override
    public String getRole() {
        return "Doktor";
    }

    @Override
    public String toString() {
        return super.toString() + 
        "\njudulDisertasi= " + judulDisertasi  + 
        "\nnilaiSidang1= " + nilaiSidang1 + 
        "\nnilaiSidang2= " + nilaiSidang2 + 
        "\nnilaiSidang3=" + nilaiSidang3;
    }

    public double getNilaiAkhir() {
        return (nilaiSidang1 + nilaiSidang2 + nilaiSidang3) / 3;
    }
}
