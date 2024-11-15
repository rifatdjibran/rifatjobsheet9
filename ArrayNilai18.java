import java.util.Scanner;

public class ArrayNilai18 {

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai akhir untuk mahasiswa ke-" + (i + 1) + " : ");
            nilaiAkhir[i] = sc.nextInt();
        }

        System.out.println(" "); // spasi untuk jarak
        
        System.out.println("Status Kelulusan Mahasiswa:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i]);
        }

        sc.close();
    }
}
