import java.util.Scanner;
public class KategoriUsia15 {
    
public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        int umur;

        System.out.print("Masukkan umur: ");
        umur = input.nextInt();

        if (umur < 0) {
            System.out.println("Input tidak valid");
        } else if (umur <= 12) {
            System.out.println("Kategori anak");
        } else if (12 < umur && umur <= 19) {
            System.out.println("Kategori remaja");
        } else if (19 < umur && umur <= 64) {
            System.out.println("Kategori dewasa");
        } else {
            System.out.println("Kategori lansia");
        }
    }
}