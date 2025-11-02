package controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

import model.User;
import model.Doktor;
import model.DosenTetap;
import model.Honorer;
import model.Karyawan;
import model.Magister;
import model.MataKuliah;
import model.MatkulAjar;
import model.MatkulAmbil;
import model.MatkulPilihan;
import model.Presensi;
import model.PresensiStaff;
import model.Sarjana;
import model.Status;
import java.util.List;
import java.util.ArrayList;

public class MainController {
    List<User> userList = new ArrayList<>();
    List<MatkulAmbil> matkulAmbilList = new ArrayList<>();

    public void initDummyData() {
        // create MataKuliah
        MataKuliah mk1 = new MataKuliah("IF101", 3, "Algoritma");
        MataKuliah mk2 = new MataKuliah("IF102", 4, "Struktur Data");
        MataKuliah mk3 = new MataKuliah("IF103", 3, "Basis Data");
        MatkulPilihan mp1 = new MatkulPilihan("IF201", 2, "Pemrograman Fungsional", 5);

        // presensi
        Presensi p1 = new Presensi(LocalDate.of(2025, 10, 1), Status.HADIR);
        Presensi p2 = new Presensi(LocalDate.of(2025, 10, 2), Status.ALPHA);
        Presensi p3 = new Presensi(LocalDate.of(2025, 10, 1), Status.HADIR);
        Presensi p4 = new Presensi(LocalDate.of(2025, 10, 2), Status.HADIR);
        Presensi p5 = new Presensi(LocalDate.of(2025, 10, 1), Status.HADIR);
        Presensi p6 = new Presensi(LocalDate.of(2025, 10, 2), Status.HADIR);
        Presensi p7 = new Presensi(LocalDate.of(2025, 10, 1), Status.ALPHA);
        Presensi p8 = new Presensi(LocalDate.of(2025, 10, 2), Status.ALPHA);
        Presensi p9 = new Presensi(LocalDate.of(2025, 10, 1), Status.ALPHA);
        Presensi p10 = new Presensi(LocalDate.of(2025, 10, 2), Status.HADIR);
        Presensi p11 = new Presensi(LocalDate.of(2025, 10, 1), Status.HADIR);
        Presensi p12 = new Presensi(LocalDate.of(2025, 10, 2), Status.HADIR);
        Presensi p13 = new Presensi(LocalDate.of(2025, 10, 1), Status.ALPHA);
        Presensi p14 = new Presensi(LocalDate.of(2025, 10, 2), Status.HADIR);
        // Dr. Agus mengajar mk1 (Algoritma)
        PresensiStaff ps1 = new PresensiStaff(LocalDate.of(2025, 10, 1), Status.HADIR, 3); // 3 jam
        PresensiStaff ps2 = new PresensiStaff(LocalDate.of(2025, 10, 2), Status.ALPHA, 0); // Alpha, 0 jam
        PresensiStaff ps3 = new PresensiStaff(LocalDate.of(2025, 10, 8), Status.HADIR, 2); // 2 jam
        PresensiStaff ps4 = new PresensiStaff(LocalDate.of(2025, 10, 15), Status.HADIR, 4); // 4 jam

        // Dr. Agus mengajar mk2 (Struktur Data)
        PresensiStaff ps5 = new PresensiStaff(LocalDate.of(2025, 10, 3), Status.HADIR, 3); // 3 jam
        PresensiStaff ps6 = new PresensiStaff(LocalDate.of(2025, 10, 10), Status.HADIR, 3); // 3 jam

        // Ibu Lina mengajar mk3 (Basis Data)
        PresensiStaff ps7 = new PresensiStaff(LocalDate.of(2025, 10, 4), Status.HADIR, 2); // 2 jam
        PresensiStaff ps8 = new PresensiStaff(LocalDate.of(2025, 10, 11), Status.ALPHA, 0); // Alpha
        PresensiStaff ps9 = new PresensiStaff(LocalDate.of(2025, 10, 18), Status.HADIR, 2); // 2 jam

        // matkul ambil dan ajar
        MatkulAmbil ambil1 = new MatkulAmbil(mk1, Arrays.asList(p1, p2), 80.0, 85.0, 90.0);
        MatkulAmbil ambil2 = new MatkulAmbil(mp1, Arrays.asList(p3, p4), 75.0, 80.0, 70.0);
        MatkulAmbil ambil3 = new MatkulAmbil(mk1, Arrays.asList(p5, p6), 88.0, 85.0, 85.0);
        MatkulAmbil ambil4 = new MatkulAmbil(mk1, Arrays.asList(p7, p8), 30.0, 40.0, 50.0);
        MatkulAmbil ambil5 = new MatkulAmbil(mk1, Arrays.asList(p9, p10), 35.0, 45.0, 55.0);
        MatkulAmbil ambil6 = new MatkulAmbil(mk2, Arrays.asList(p11, p12), 90.0, 92.0, 94.0);
        MatkulAmbil ambil7 = new MatkulAmbil(mp1, Arrays.asList(p13, p14), 60.0, 65.0, 70.0);
        MatkulAmbil ambil8 = new MatkulAmbil(mk3, Arrays.asList(p1, p2), 85.0, 80.0, 75.0);
        MatkulAmbil ambil9 = new MatkulAmbil(mk2, Arrays.asList(p3, p4), 55.0, 50.0, 45.0);
        // ========== MATKUL AJAR (Dosen mengajar Matkul) ==========
        MatkulAjar ajar1 = new MatkulAjar(mk1, Arrays.asList(ps1, ps2, ps3, ps4)); // Dr. Agus: Algoritma
        MatkulAjar ajar2 = new MatkulAjar(mk2, Arrays.asList(ps5, ps6)); // Dr. Agus: Struktur Data
        MatkulAjar ajar3 = new MatkulAjar(mk3, Arrays.asList(ps7, ps8, ps9)); // Ibu Lina: Basis Data

        // Mahasiswa
        Sarjana s = new Sarjana("2001", "Budi", "Jakarta", LocalDate.of(2001, 5, 10), "081234", "IF",
                Arrays.asList(ambil1, ambil8));
        Sarjana s2 = new Sarjana("2002", "Ani", "Depok", LocalDate.of(2002, 6, 15), "081235", "IF",
                Arrays.asList(ambil4, ambil6));
        Sarjana s3 = new Sarjana("2003", "Cici", "Bogor", LocalDate.of(2000, 8, 20), "081236", "IF",
                Arrays.asList(ambil5, ambil7, ambil9));
        Magister m = new Magister("3001", "Siti", "Bandung", LocalDate.of(1995, 3, 3), "082345", "TI",
                Arrays.asList(ambil2, ambil3), "Optimasi Jaringan");
        Doktor d = new Doktor("4001", "Andi", "Surabaya", LocalDate.of(1990, 7, 7), "083456", "CS",
                "AI for Good", 88.0,
                90.0, 92.0);

        // set tempat lahir (TTL = Tempat, Tanggal Lahir)
        s.setTempatLahir("Jakarta");
        m.setTempatLahir("Bandung");
        d.setTempatLahir("Surabaya");

        // Staff
        Karyawan k = new Karyawan("9001", "Rini", "Yogyakarta", LocalDate.of(1985, 1, 1), "089999", 5000000.0,
                Arrays.asList(ps1));
        DosenTetap dt = new DosenTetap("8001", "Dr. Agus", "Malang", LocalDate.of(1975, 2, 2), "087777",
                "Computer Science", Arrays.asList(ajar1, ajar2), 10000000.0);
        Honorer h = new Honorer("8002", "Ibu Lina", "Semarang", LocalDate.of(1980, 4, 4), "086666",
                "Mathematics",
                Arrays.asList(ajar3), 200000.0);

        // set tempat lahir for staff
        k.setTempatLahir("Yogyakarta");
        dt.setTempatLahir("Malang");
        h.setTempatLahir("Semarang");

        // User Data List
        userList.add(s);
        userList.add(s2);
        userList.add(s3);
        userList.add(m);
        userList.add(d);
        userList.add(k);
        userList.add(dt);
        userList.add(h);

        // Matkul Ambil List
        matkulAmbilList.add(ambil1);
        matkulAmbilList.add(ambil2);
        matkulAmbilList.add(ambil3);
        matkulAmbilList.add(ambil4);
        matkulAmbilList.add(ambil5);

    }

    public String getUserDataByName(String name) {
        for (User user : userList) {
            if (user.getNama().equalsIgnoreCase(name)) {
                return user.toString() + "\nRole= " + user.getRole();
            }
        }
        return "User with name " + name + " not found.";
    }

    public String getAllNilaiAkhir(String nim, String kodeMk) {
        for (User user : userList) {
            if (user instanceof Sarjana || user instanceof Magister || user instanceof Doktor) {
                if (user.getLoginId().equals(nim)) {
                    if (user instanceof Sarjana) {
                        Sarjana s = (Sarjana) user;
                        return "Nilai Akhir Sarjana: " + s.getNilaiAkhir(kodeMk);
                    } else if (user instanceof Magister) {
                        Magister m = (Magister) user;
                        return "Nilai Akhir Magister: " + m.getNilaiAkhir(kodeMk);
                    } else if (user instanceof Doktor) {
                        Doktor d = (Doktor) user;
                        return "Nilai Akhir Doktor: " + d.getNilaiAkhir();
                    }
                }
            }
        }
        return "Data not found for NIM: " + nim + " and Kode Mata Kuliah: " + kodeMk;
    }

    public String getUserRoleByNim(String nim) {
        for (User user : userList) {
            if (user.getLoginId().equals(nim)) {
                return user.getRole();
            }
        }
        return "User with NIM " + nim + " not found.";
    }

    public double getNilaiAkhirSatuMatkul(String kodeMk) {
        double totalNilai = 0;
        int count = 0;
        for (MatkulAmbil ma : matkulAmbilList) {
            if (ma.getMatkul().getKode().equalsIgnoreCase(kodeMk)) {
                totalNilai += ma.hitungNilaiAkhir();
                count++;
            }
        }
        if (count > 0) {
            return totalNilai / count;
        } else {
            return -1;
        }

    }

    public String getJumlahMahasiswaTidakLulus(String kodeMk) {
        int countTidakLulus = 0;
        String namaMk = "";
        int countTotalMahasiswa = 0;
        for (MatkulAmbil ma : matkulAmbilList) {
            if (ma.getMatkul().getKode().equalsIgnoreCase(kodeMk)) {
                namaMk = ma.getMatkul().getNama();
                double nilaiAkhir = ma.hitungNilaiAkhir();
                countTotalMahasiswa++;
                if (nilaiAkhir < 56.0) {
                    countTidakLulus++;
                }
            }
        }
        if (countTotalMahasiswa == 0) {
            return "Mata Kuliah dengan kode " + kodeMk
                    + " tidak ditemukan atau tidak ada mahasiswa yang mengambil mata kuliah ini.";
        } else {
            return "Jumlah mahasiswa yang tidak lulus Mata Kuliah " + namaMk + " (" + kodeMk + ") adalah: "
                    + countTidakLulus + " dari total " + countTotalMahasiswa + " mahasiswa.";
        }
    }

    public String getMatkulAmbilByNim(String nim) {
        for (User user : userList) {
            if (user.getLoginId().equals(nim) && (user instanceof Sarjana || user instanceof Magister)) {
                if (user instanceof Sarjana) {
                    Sarjana s = (Sarjana) user;
                    return s.getMatkulDiambil().toString() + "\ntotal presensi : " + s.getMatkulDiambil().size();
                } else if (user instanceof Magister) {
                    Magister m = (Magister) user;
                    return m.getMatkulDiambil().toString() + "\ntotal presensi : " + m.getMatkulDiambil().size();
                } else {
                    return "User with NIM " + nim + " is not a Sarjana or Magister.";
                }
            }
        }
        return "User with NIM " + nim + " not found.";
    }

    public String getTotalJamNgajarDosen(String nik){
        for (User user : userList) {
            if (user.getLoginId().equals(nik) && (user instanceof DosenTetap || user instanceof Honorer)) {
                double totalJam = 0;
                if (user instanceof DosenTetap) {
                    DosenTetap dt = (DosenTetap) user;
                    for (MatkulAjar ma : dt.getMatkulAjarList()) {
                        for (PresensiStaff ps : ma.getPresensiStaffList()) {
                            totalJam += ps.getJam();                            
                        }                        
                    }
                    return "Total jam mengajar Dosen Tetap " + dt.getNama() + " adalah: " + totalJam + " jam.";
                } else if (user instanceof Honorer) {
                    Honorer h = (Honorer) user;
                    for (MatkulAjar ma : h.getMatkulAjarList()) {
                        for (PresensiStaff ps : ma.getPresensiStaffList()) {
                            totalJam += ps.getJam();
                        }
                    }
                    return "Total jam mengajar Honorer " + h.getNama() + " adalah: " + totalJam + " jam.";
                } else {
                    return "User with NIK " + nik + " is not a DosenTetap or Honorer.";
                }
            }
        }
        return "User with NIK " + nik + " not found.";
    }

    public double getGajiStaffByNik(String nik){
        double gaji = -1;
        int unit = 0;
        for (User user : userList) {
            if (user.getLoginId().equals(nik) && (user instanceof Karyawan || user instanceof DosenTetap || user instanceof Honorer)) {
                if (user instanceof Karyawan) {
                    Karyawan k = (Karyawan) user;
                    for (PresensiStaff ps : k.getPresensiStaffList()) {
                        if (ps.getStatus() == Status.HADIR) {
                            unit++;                            
                        }                                                
                    }           
                    gaji = (unit / 22.0) * k.getSalary();         
                } else if (user instanceof DosenTetap) {
                    DosenTetap dt = (DosenTetap) user;      
                    for (MatkulAjar ma : dt.getMatkulAjarList()) {
                        for (PresensiStaff ps : ma.getPresensiStaffList()) {
                            if (ps.getStatus() == Status.HADIR) {
                                unit++;                            
                            }                                                
                        }                        
                    }
                    gaji = dt.getSalary() + (unit * 25000);              
                } else if (user instanceof Honorer) {
                    Honorer h = (Honorer) user;      
                    for (MatkulAjar ma : h.getMatkulAjarList()) {
                        for (PresensiStaff ps : ma.getPresensiStaffList()) {
                            if (ps.getStatus() == Status.HADIR) {
                                unit++;                            
                            }                                                
                        }                        
                    }
                    gaji = unit * h.getHonorPerSKS();              
                } else {
                    return -1;
                }
            }
        }
        return gaji;
    }
}