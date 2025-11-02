package model;
import java.util.List;

public class MatkulAmbil {
    private MataKuliah matkul;
    private List<Presensi> presensiList;
    private Double n1, n2, n3;

    public MatkulAmbil(MataKuliah matkul, List<Presensi> presensiList, Double n1, Double n2, Double n3) {
        this.matkul = matkul;
        this.presensiList = presensiList;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public MataKuliah getMatkul() { return matkul; }
    public void setMatkul(MataKuliah matkul) { this.matkul = matkul; }

    public List<Presensi> getPresensiList() { return presensiList; }
    public void setPresensiList(List<Presensi> presensiList) { this.presensiList = presensiList; }

    public Double getN1() { return n1; }
    public void setN1(Double n1) { this.n1 = n1; }

    public Double getN2() { return n2; }
    public void setN2(Double n2) { this.n2 = n2; }

    public Double getN3() { return n3; }
    public void setN3(Double n3) { this.n3 = n3; }

    @Override
    public String toString() {
        String presensiStr = "Presensi :\n";
        for (Presensi p : presensiList) {
            presensiStr += p.toString() + "\n";
        }
        return "matkul= " + matkul + 
        "\n" + presensiStr + 
        "n1= " + n1 + 
        "\nn2= " + n2 + 
        "\nn3= " + n3;
    }

    public double hitungNilaiAkhir() {
        return (n1+ n2 + n3) / 3;
    }
}
