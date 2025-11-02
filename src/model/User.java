package model;

import java.time.LocalDate;

public abstract class User implements Auth {
    private String loginId; // NIM for Mahasiswa or NIK for Staff
    private String nama;
    private String alamat;
    private LocalDate ttl; // tanggal lahir
    private String tempatLahir; // tempat lahir
    private String telepon;

    // existing constructor kept for backward compatibility; tempatLahir default "-"
    public User(String loginId, String nama, String alamat, LocalDate ttl, String telepon) {
        this.loginId = loginId;
        this.nama = nama;
        this.alamat = alamat;
        this.ttl = ttl;
        this.telepon = telepon;
        this.tempatLahir = "-";
    }

    // overloaded constructor accepting tempat lahir explicitly
    public User(String loginId, String nama, String alamat, String tempatLahir, LocalDate ttl, String telepon) {
        this.loginId = loginId;
        this.nama = nama;
        this.alamat = alamat;
        this.ttl = ttl;
        this.telepon = telepon;
        this.tempatLahir = tempatLahir;
    }

    @Override
    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public LocalDate getTtl() {
        return ttl;
    }

    public void setTtl(LocalDate ttl) {
        this.ttl = ttl;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public abstract String getRole();

    @Override
    public String toString() {
        String ttlStr = (tempatLahir == null || tempatLahir.equals("-")) ? String.valueOf(ttl)
                : (tempatLahir + ", " + ttl);
        return "loginId= " + loginId + "\n" +
                "nama= " + nama + "\n" +
                "alamat= " + alamat + "\n" +
                "ttl= " + ttlStr + "\n" +
                "telepon= " + telepon + "\n";
    }
}
