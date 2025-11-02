package model;
import java.util.List;

public class MatkulAjar {
    private MataKuliah matkul;
    private List<PresensiStaff> presensiStaffList;

    public MatkulAjar(MataKuliah matkul, List<PresensiStaff> presensiStaffList) {
        this.matkul = matkul;
        this.presensiStaffList = presensiStaffList;
    }

    public MataKuliah getMatkul() { return matkul; }
    public void setMatkul(MataKuliah matkul) { this.matkul = matkul; }

    public List<PresensiStaff> getPresensiStaffList() { return presensiStaffList; }
    public void setPresensiStaffList(List<PresensiStaff> presensiStaffList) { this.presensiStaffList = presensiStaffList; }

    @Override
    public String toString() {
        return "MatkulAjar{" + "matkul=" + matkul + ", presensiStaffList=" + presensiStaffList + '}';
    }
}
