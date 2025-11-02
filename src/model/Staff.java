package model;
public abstract class Staff extends User {
    public Staff(String nik, String nama, String alamat, java.time.LocalDate ttl, String telepon) {
        super(nik, nama, alamat, ttl, telepon);
    }

    @Override
    public String toString() {
        return super.toString().replace("loginId", "nik");
    }    
}

