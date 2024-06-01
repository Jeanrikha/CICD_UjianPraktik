import src.main.java.Kalkulator;

public class Driver {

    public static void main(String[] args) {
        // Membuat objek kalkulator
        Kalkulator kalkulator = new Kalkulator();
        
        // Menampilkan hasil awal perhitungan
        tampilkanHasil("Hasil awal:", kalkulator.getHasil());
        
        // Melakukan operasi penambahan
        kalkulator.tambah();
        
        // Menampilkan hasil setelah operasi penambahan
        tampilkanHasil("Hasil setelah penambahan:", kalkulator.getHasil());
        
        // Melakukan operasi perkalian dengan angka 2
        kalkulator.kalikanDengan(2);
        
        // Menampilkan hasil setelah operasi perkalian
        tampilkanHasil("Hasil setelah perkalian dengan 2:", kalkulator.getHasil());
    }
    
    // Metode untuk menampilkan hasil perhitungan
    private static void tampilkanHasil(String pesan, int hasil) {
        System.out.println(pesan + " " + hasil);
    }
}
