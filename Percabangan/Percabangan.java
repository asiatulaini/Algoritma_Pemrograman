import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, keterangan;
        int nilai;
        System.out.print("Input Nama : ");
        nama = input.next();
        System.out.print("Input Nilai : ");
        nilai = input.nextInt();

        if(nilai >= 60) {
            keterangan = "Lulus";
        } else {
            keterangan = "Tidak Lulus";
        }
        System.out.println(nama + " " + keterangan);
    }
}
