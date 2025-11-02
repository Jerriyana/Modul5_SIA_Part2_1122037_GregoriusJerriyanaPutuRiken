package model;
import java.util.List;

public class Karyawan extends Staff {
    private double salary;
    private List<PresensiStaff> presensiStaffList;

    public Karyawan(String nik, String nama, String alamat, java.time.LocalDate ttl, String telepon, double salary, List<PresensiStaff> presensiStaffList) {
        super(nik, nama, alamat, ttl, telepon);
        this.salary = salary;
        this.presensiStaffList = presensiStaffList;
    }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public List<PresensiStaff> getPresensiStaffList() { return presensiStaffList; }
    public void setPresensiStaffList(List<PresensiStaff> presensiStaffList) { this.presensiStaffList = presensiStaffList; }

    @Override
    public String getRole() {
        return "Karyawan";
    }

    @Override
    public String toString() {
        return super.toString() + 
        "salary= " + salary + 
        "\npresensiStaffList= " + presensiStaffList;
    }
}
