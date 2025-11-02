package model;
import java.util.List;

public class Honorer extends Dosen {
    private double honorPerSKS;

    public Honorer(String nik, String nama, String alamat, java.time.LocalDate ttl, String telepon, String departemen, List<MatkulAjar> matkulAjarList, double honorPerSKS) {
        super(nik, nama, alamat, ttl, telepon, departemen, matkulAjarList);
        this.honorPerSKS = honorPerSKS;
    }

    public double getHonorPerSKS() { return honorPerSKS; }
    public void setHonorPerSKS(double honorPerSKS) { this.honorPerSKS = honorPerSKS; }

    @Override
    public String getRole() {
        return "Honorer";
    }

    @Override
    public String toString() {
        return super.toString() + 
        "\nhonorPerSKS= " + honorPerSKS;
    }
}
