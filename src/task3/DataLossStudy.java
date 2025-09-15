package task3;

public class DataLossStudy {
    public static void main(String[] args) {
        System.out.println("=== STUDI KASUS DATA LOSS ===");

        // Kasus 1: Sistem Penilaian
        System.out.println("1. Sistem Penilaian:");
        double nilaiAsli = 87.65;
        int nilaiHuruf = (int) nilaiAsli; // Data loss!

        System.out.println("Nilai asli: " + nilaiAsli);
        System.out.println("Nilai setelah casting ke int: " + nilaiHuruf);
        System.out.println("Data yang hilang: " + (nilaiAsli - nilaiHuruf));

        // Kasus 2: Populasi Negara
        System.out.println("\n2. Data Populasi:");
        long populasiIndonesia = 273_523_615L; // 273 juta+
        int populasiInt = (int) populasiIndonesia; // Overflow!

        System.out.println("Populasi asli (long): " + populasiIndonesia);
        System.out.println("Populasi setelah casting ke int: " + populasiInt);

        // Kasus 3: Konversi Mata Uang
        System.out.println("\n3. Konversi Mata Uang:");
        double rupiah = 15_750.75;
        int dollar = (int)(rupiah / 15_000); // presisi hilang (dibulatkan kebawah)
        System.out.println("Rupiah: " + rupiah);
        System.out.println("Dollar hasil konversi (dibulatkan): " + dollar);

        // Kasus 4: Pengukuran Jarak GPS
        System.out.println("\n4. Pengukuran Jarak GPS:");
        double jarakAsli = 12345.6789; // km dengan desimal presisi tinggi
        float jarakFloat = (float) jarakAsli; // presisi hilang karena float terbatas
        System.out.println("Jarak asli (double): " + jarakAsli);
        System.out.println("Jarak setelah casting ke float: " + jarakFloat);

        // Kasus 5: Perhitungan Waktu (milidetik)
        System.out.println("\n5. Perhitungan Waktu:");
        long waktuMillis = 3_600_000L; // 1 jam dalam milidetik
        int waktuDetik = (int)(waktuMillis / 1000); // masih aman
        byte waktuByte = (byte) waktuDetik; // overflow parah
        System.out.println("Waktu asli (ms): " + waktuMillis);
        System.out.println("Waktu dalam detik (int): " + waktuDetik);
        System.out.println("Waktu dalam detik (byte): " + waktuByte);
    }
}

