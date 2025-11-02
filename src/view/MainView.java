package view;

import javax.swing.JOptionPane;

import controller.MainController;

public class MainView {
    private MainController controller;

    public MainView(MainController controller) {
        this.controller = controller;
    }

    public void showMainMenu() {
        String menu = "1. Print by Name\n2. Print Nilai Akhir\n3. Print NA satu Matkul\n4. Print jumlah mahasiswa tidak lulus suatu matkul\n5. Print Matkul Ambil untuk Mahasiswa tertentu\n6. Total Jam Dosen Ngajar Semua Matkul\n7. Print Gaji Staff Tertentu\n0. Exit";
        String input = JOptionPane.showInputDialog(null,
                menu,
                "Main Menu",
                JOptionPane.INFORMATION_MESSAGE);
        if (input == null) {
            System.exit(0);
        }
        int choice = Integer.parseInt(input);

        String kodeMk = "";
        switch (choice) {
            case 1:
                String name = JOptionPane.showInputDialog(null,
                        "Enter name:",
                        "Input Name",
                        JOptionPane.INFORMATION_MESSAGE);
                String result = controller.getUserDataByName(name);
                JOptionPane.showMessageDialog(null,
                        result,
                        "User Data",
                        JOptionPane.INFORMATION_MESSAGE);
                showMainMenu();
                break;
            case 2:    
                String nim = JOptionPane.showInputDialog(null,
                        "Enter NIM:",
                        "Input NIM",
                        JOptionPane.INFORMATION_MESSAGE);
                // cek tipe mahasiswa
                String role = controller.getUserRoleByNim(nim);
                if (role.equals("Doktor")) {
                    kodeMk = null;
                } else {
                    kodeMk = JOptionPane.showInputDialog(null,
                            "Enter Kode Mata Kuliah:",
                            "Input Kode Mata Kuliah",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                String nilaiAkhir = controller.getAllNilaiAkhir(nim, kodeMk);
                JOptionPane.showMessageDialog(null,
                        nilaiAkhir,
                        "Nilai Akhir",
                        JOptionPane.INFORMATION_MESSAGE);
                showMainMenu();
                break;
            case 3:                
                kodeMk = JOptionPane.showInputDialog(null,
                        "Enter Kode Mata Kuliah:",
                        "Input Kode Mata Kuliah",
                        JOptionPane.INFORMATION_MESSAGE);
                double naSatuMatkul = controller.getNilaiAkhirSatuMatkul(kodeMk);
                JOptionPane.showMessageDialog(null,
                        "Nilai Akhir untuk Mata Kuliah " + kodeMk + " adalah: " + naSatuMatkul,
                        "Nilai Akhir Satu Mata Kuliah",
                        JOptionPane.INFORMATION_MESSAGE);
                showMainMenu();
                break;
            case 4:
                kodeMk = JOptionPane.showInputDialog(null,
                        "Enter Kode Mata Kuliah:",
                        "Input Kode Mata Kuliah",
                        JOptionPane.INFORMATION_MESSAGE);            
                String mahasiswaTidakLulus = controller.getJumlahMahasiswaTidakLulus(kodeMk);
                JOptionPane.showMessageDialog(null,
                        mahasiswaTidakLulus, 
                        "Jumlah Mahasiswa Tidak Lulus",
                        JOptionPane.INFORMATION_MESSAGE);
                showMainMenu();
                break;
            case 5:                
                String nimMahasiswa = JOptionPane.showInputDialog(null,
                        "Enter NIM:",
                        "Input NIM",
                        JOptionPane.INFORMATION_MESSAGE);
                String matkulAmbil = controller.getMatkulAmbilByNim(nimMahasiswa);
                JOptionPane.showMessageDialog(null,
                        matkulAmbil,
                        "Mata Kuliah Diambil",
                        JOptionPane.INFORMATION_MESSAGE);
                showMainMenu();
                break;
            case 6:
                String nikDosen = JOptionPane.showInputDialog(null,
                        "Enter NIK Dosen:",
                        "Input NIK Dosen",
                        JOptionPane.INFORMATION_MESSAGE);
                String totalJamNgajar = controller.getTotalJamNgajarDosen(nikDosen);
                JOptionPane.showMessageDialog(null,
                        totalJamNgajar,
                        "Total Jam Ngajar Dosen",
                        JOptionPane.INFORMATION_MESSAGE);
                showMainMenu();
                break;
            case 7: 
                // Print gaji staff tertentu
                // Gaji Karyawan = unit / 22 hari * salary 
                // Gaji Dosen Tetap = salary + (unit * 25000)
                // Gaji Dosen Honorer = unit (unit * honorPerSKS)
                // Unit = jumlah absen hadir 
                String nikStaff = JOptionPane.showInputDialog(null,
                        "Enter NIK Staff:",
                        "Input NIK Staff",
                        JOptionPane.INFORMATION_MESSAGE);
                double gajiStaff = controller.getGajiStaffByNik(nikStaff);
                JOptionPane.showMessageDialog(null,
                        "Gaji Staff dengan NIK " + nikStaff + " adalah: " + String.format("%,.2f", gajiStaff),
                        "Gaji Staff",
                        JOptionPane.INFORMATION_MESSAGE);
                showMainMenu();
            case 0:
                JOptionPane.showMessageDialog(null,
                        "Exiting the program.",
                        "Exit",
                        JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null,
                        "Invalid choice. Exiting.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                System.exit(0);
        }
    }
}
