package model;
import java.util.List;

public class DosenTetap extends Dosen {
    private double salary;

    public DosenTetap(String nik, String nama, String alamat, java.time.LocalDate ttl, String telepon, String departemen, List<MatkulAjar> matkulAjarList, double salary) {
        super(nik, nama, alamat, ttl, telepon, departemen, matkulAjarList);
        this.salary = salary;
    }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public String getRole() {
        return "DosenTetap";
    }

    @Override
    public String toString() {
        return super.toString() + 
        "\nsalary= " + salary;
    }
}
