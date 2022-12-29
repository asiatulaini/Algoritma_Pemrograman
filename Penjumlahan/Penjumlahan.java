import java.util.Scanner;

public class Penjumlahan {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Nilai x = ");
        x = scan.nextInt();
        System.out.print("Masukan Nilai y = ");
        y = scan.nextInt();
        int hasil = x + y;
        System.out.println("Hasil Penjumalahn x + y = "+hasil);
    }
}
