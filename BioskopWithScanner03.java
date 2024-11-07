
import java.util.Scanner;

public class BioskopWithScanner03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int baris, kolom, menu;
        String nama, next;
        String[][] penonton=new String[4][2];


        while (true) { 
            System.out.println("================================");
            System.out.println("-----------PILIH MENU-----------");
            System.out.println("1.input data penonton");
            System.out.println("2.Tampilkan daftar penonton");
            System.out.println("3.Exit");
            System.out.print("pilih menu: ");
            menu=sc.nextInt();
            sc.nextLine();

            if(menu==1){
                System.out.println("------Input Data Penonton-------");
                while(true){
                    System.out.print("Masukkan nama: ");
                    nama=sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris=sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom=sc.nextInt();
                    sc.nextLine();
                    if(baris>4||kolom>2){
                        System.out.println("kursi tidak tersedia");
                        continue;
                    }
                    if(penonton[baris-1][kolom-1]!=null){
                        System.out.println("kursi sudah dipilih");
                        continue;
                    }

                    penonton[baris-1][kolom-1]=nama;
        
                    System.out.print("input penonton isinya? (y/n):");
                    next=sc.nextLine();
        
                    if(next.equalsIgnoreCase("n")){
                        break;
                    }
                }
            }
            else if(menu==2){
                for(int i=0; i<penonton.length;i++){
                    for(int j=0; j<penonton[i].length; j++){
                        if(penonton[i][j]==null){
                            System.out.print("***"+" ");
                        }
                        else{
                            System.out.print(penonton[i][j]+" ");
                        }
                    }
                    System.out.println("");
                }       
            }
            else if(menu==3){
                System.out.println("================================");
                break;
            }
        }
        
    }
}
