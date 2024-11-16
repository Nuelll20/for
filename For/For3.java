import java.util.Scanner;
public class For3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.print("Masukkan deret Fibonacci: ");
        int n = scn.nextInt(); //baca memori n bertipe int

        //jika n kurang dari 1 maka tidak melanjutkan perhitungan
        if (n < 1) {
            System.out.println("Nilai deret harus lebih dari 0");
            return;
        }
        int a = 1, b = 1; //inisialisasi memori a dan b sama dengan 1
        System.out.print("Deret Fibonacci: ");

        //ketika input n sesuai kondiri maka akan melanjutkan proses perhitungan
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.print(a);
            }else if (i == 2) {
                System.out.print(", "+b);
            }else {
                int tambah = a + b;
                System.out.print(", "+tambah);
                a = b;
                b = tambah;
            }
        }
    }
}
