
import java.util.Scanner;

public class SIAKAD03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[][] nilai=new int [4][3];

        for(int i=0; i<nilai.length; i++){
            System.out.println("masukkan nilai mahasiswa ke-"+(i+1));
            double totalPerSiswa=0;
            
            for (int j=0; j<nilai[i].length; j++) {
                System.out.print("Mata kuliah ke"+(j+1)+" :");
                nilai[i][j]=sc.nextInt();
                totalPerSiswa+=nilai[i][j];
            }
            System.out.println("Nilai rat-rata: "+totalPerSiswa/3);
        }

        System.out.println("\n===============================");
        System.out.println("Rata-rata nilai setiap mata kuliah: ");

        for(int j=0; j<3; j++){
            double totalPermatkul=0;

            for(int i=0; i<4; i++){
                totalPermatkul+=nilai[i][j];
            }
            System.out.println("mata kuliah "+(j+1)+" : "+totalPermatkul/4);
        }
    }
    
}
