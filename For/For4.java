import java.util.Scanner;
public class For4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.print("Masukkan koefisien a: ");
        int a = scn.nextInt();
        System.out.print("Masukkan koefisien b: ");
        int b = scn.nextInt();
        System.out.print("Masukkan koefisien c: ");
        int c = scn.nextInt();

        double d = Math.pow(b, 2) - 4 * a *c;
        if (d > 0) {
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);

            System.out.println("Dari persamaan y = "+a+ " x^2 + "+b+ " x + "+c);
            System.out.println("Akar-akarnya adalah "+x1+ " dan "+x2);
            System.out.println("Nilai y untuk beberapa x antara akar pertama dan kedua adalah");
            System.out.println("-----------------------------------------------------------------");
            System.out.println("x                           y = "+a+ " x^2 + "+b+ "x + "+c);
            System.out.println("-----------------------------------------------------------------");

            for (double x = x1; x <= x2; x+= 0.25) {
                double y = a * Math.pow(x, 2) + b * x + c;
                System.out.println(x+ "        "+y);
            }
            System.out.println("---------------------------------------------");
        }else {
            System.out.println("Tidak memiliki dua akar");
        }
        
    }
}
