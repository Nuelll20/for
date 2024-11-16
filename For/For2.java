import java.util.Scanner;
public class For2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.print("Masukkan data yang akan dihitung: ");
        int n = scn.nextInt(); //baca memori n tipe data int
        
        //insialisasi memori untuk jumlah akar di setiap inputan user
        double jumlahKuadrat = 0;
        double jumlahAkar = 0;
        double jumlahTidaknol = 0;

        //melalukan looping dan menghitung inputan data dari user
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan data ke "+(i + 1) + " : ");
            double xi = scn.nextDouble();

            jumlahKuadrat += xi * xi;
            jumlahAkar += Math.sqrt(xi);
            
            //jika data dari memori n tidak sama dengan nol
            if (xi != 0) {
                jumlahTidaknol += 1 / xi;
            }
        }
        System.out.println("Jumlah kuadrat data: "+jumlahKuadrat);
        System.out.println("Jumlah akar data: "+jumlahAkar);
        System.out.println("Jumlah 1/data yang tidak sama dengan nol: "+jumlahTidaknol);
    }
}