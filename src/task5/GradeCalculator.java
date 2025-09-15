package task5;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEM PERHITUNGAN NILAI ===");

        // Input data mahasiswa
        System.out.print("Nama Mahasiswa: ");
        String nama = scanner.nextLine();

        System.out.print("Mata Kuliah: ");
        String mataKuliah = scanner.nextLine();

        // Input nilai dengan validasi
        double nilaiTugas = inputNilai(scanner, "Nilai Tugas (0-100): ");
        double nilaiUTS = inputNilai(scanner, "Nilai UTS (0-100): ");
        double nilaiUAS = inputNilai(scanner, "Nilai UAS (0-100): ");

        // Hitung nilai akhir (bobot: Tugas 30%, UTS 30%, UAS 40%)
        double nilaiAkhir = (nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);

        // Tentukan grade huruf
        char gradeHuruf;
        String keterangan;

        if (nilaiAkhir >= 85) {
            gradeHuruf = 'A';
            keterangan = "Sangat Baik";
        } else if (nilaiAkhir >= 70) {
            gradeHuruf = 'B';
            keterangan = "Baik";
        } else if (nilaiAkhir >= 60) {
            gradeHuruf = 'C';
            keterangan = "Cukup";
        } else if (nilaiAkhir >= 50) {
            gradeHuruf = 'D';
            keterangan = "Kurang";
        } else {
            gradeHuruf = 'E';
            keterangan = "Gagal";
        }

        // Konversi ke skala 4.0
        double skala4 = konversiKeSkala4(gradeHuruf);

        // Status kelulusan
        String status = (nilaiAkhir >= 60) ? "Lulus" : "Tidak Lulus";

        // Output hasil
        System.out.println("\n=== HASIL PERHITUNGAN NILAI ===");
        System.out.println("Mahasiswa     : " + nama);
        System.out.println("Mata Kuliah   : " + mataKuliah);
        System.out.println("Nilai Tugas   : " + nilaiTugas);
        System.out.println("Nilai UTS     : " + nilaiUTS);
        System.out.println("Nilai UAS     : " + nilaiUAS);
        System.out.println("Nilai Akhir   : " + String.format("%.2f", nilaiAkhir));
        System.out.println("Grade         : " + gradeHuruf);
        System.out.println("Skala 4.0     : " + skala4);
        System.out.println("Keterangan    : " + keterangan);
        System.out.println("Status        : " + status);

        scanner.close();
    }

    // method untuk validasi input
    private static double inputNilai(Scanner scanner, String pesan) {
        double nilai;
        while (true) {
            System.out.print(pesan);
            nilai = scanner.nextDouble();
            if (nilai >= 0 && nilai <= 100) {
                break;
            } else {
                System.out.println("Nilai harus antara 0 - 100. Coba lagi.");
            }
        }
        return nilai;
    }

    // Method konversi ke skala 4.0
    private static double konversiKeSkala4(char grade) {
        switch (grade) {
            case 'A': return 4.0;
            case 'B': return 3.0;
            case 'C': return 2.0;
            case 'D': return 1.0;
            default: return 0.0;
        }
    }
}
