package model;
import java.util.List;

public abstract class Dosen extends Staff {
    private String departemen;
    private List<MatkulAjar> matkulAjarList;

    public Dosen(String nik, String nama, String alamat, java.time.LocalDate ttl, String telepon, String departemen, List<MatkulAjar> matkulAjarList) {
        super(nik, nama, alamat, ttl, telepon);
        this.departemen = departemen;
        this.matkulAjarList = matkulAjarList;
    }

    public String getDepartemen() { return departemen; }
    public void setDepartemen(String departemen) { this.departemen = departemen; }

    public List<MatkulAjar> getMatkulAjarList() { return matkulAjarList; }
    public void setMatkulAjarList(List<MatkulAjar> matkulAjarList) { this.matkulAjarList = matkulAjarList; }

    @Override
    public String toString() {
        return "Dosen{" + super.toString() + ", departemen='" + departemen + '\'' + ", matkulAjarList=" + matkulAjarList + '}';
    }
}
