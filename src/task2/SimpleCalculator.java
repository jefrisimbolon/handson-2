package task2;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== KALKULATOR SEDERHANA ===");

        // Input dua angka
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        // Hitung hasil operasi matematika
        double penjumlahan = angka1 + angka2;
        double pengurangan = angka1 - angka2;
        double perkalian = angka1 * angka2;

        // Pembagian dengan pengecekan nol
        String pembagian;
        if (angka2 != 0) {
            pembagian = String.valueOf(angka1 / angka2);
        } else {
            pembagian = "Error (pembagian dengan nol)";
        }

        // Modulus dengan pengecekan nol
        String modulus;
        if (angka2 != 0) {
            modulus = String.valueOf(angka1 % angka2);
        } else {
            modulus = "Error (modulus dengan nol)";
        }

        // Tampilkan hasil dengan format rapi
        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println(angka1 + " + " + angka2 + " = " + penjumlahan);
        System.out.println(angka1 + " - " + angka2 + " = " + pengurangan);
        System.out.println(angka1 + " * " + angka2 + " = " + perkalian);
        System.out.println(angka1 + " / " + angka2 + " = " + pembagian);
        System.out.println(angka1 + " % " + angka2 + " = " + modulus);

        scanner.close();
    }
}