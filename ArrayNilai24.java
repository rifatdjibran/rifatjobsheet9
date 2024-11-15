import java.util.Scanner;

public class ArrayNilai24 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir untuk mahasiswa ke-" + (i + 1) + " : ");
            nilaiAkhir[i] = input.nextInt();
        }

        System.out.println(" "); // untuk jarak
        System.out.println("Status Kelulusan Mahasiswa:");
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + " : " + nilaiAkhir[i] + " (Lulus)");
            } else {
                System.out.println("Mahasiswa ke-" + (i + 1) + " : " + nilaiAkhir[i] + " (Tidak Lulus)");
            }
        }
    }
}