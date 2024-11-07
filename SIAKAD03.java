
import java.util.Scanner;

public class SIAKAD03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("masukkan jumlah mahasiswa: ");
        int p=sc.nextInt();
        System.out.print("masukkan jumlah mata kuliah: ");
        int h=sc.nextInt();

        int[][] nilai=new int [p][h];

        for(int i=0; i<nilai.length; i++){
            System.out.println("masukkan nilai mahasiswa ke-"+(i+1));
            double totalPerSiswa=0;

            for (int j=0; j<nilai[i].length; j++) {
                System.out.print("Mata kuliah ke"+(j+1)+" :");
                nilai[i][j]=sc.nextInt();
                totalPerSiswa+=nilai[i][j];
            }
            System.out.println("Nilai rat-rata: "+totalPerSiswa/nilai[i].length);
        }

        System.out.println("\n===============================");
        System.out.println("Rata-rata nilai setiap mata kuliah: ");

        for(int j=0; j<nilai[0].length; j++){
            double totalPermatkul=0;

            for(int i=0; i<nilai.length; i++){
                totalPermatkul+=nilai[i][j];
            }
            System.out.println("mata kuliah "+(j+1)+" : "+totalPermatkul/nilai.length);
        }
    }
    
}
