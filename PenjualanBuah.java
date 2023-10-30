import java.util.Scanner;

public class PenjualanBuah {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        int[] terjual = new int[10];
        int sum = 0;
        int avg;
        int temp = 0;


        System.out.println("===== Monitoring Penjualan Buah =====");
        System.out.println("Nama : Dzulfikar Muhammad Al Ghifari");
        System.out.println("NIM  : 2341760071");
        System.out.println();
        for(int i = 0; i<terjual.length; i++){
            System.out.print("Masukkan jumlah buah yang terjual di hari ke-"+(i+1)+" : ");
            terjual[i] = input08.nextInt();
            sum += terjual[i];
        }

        for(int i = 0; i<terjual.length; i++){
            System.out.println("Data penjualan hari ke-"+i+" adalah "+ terjual[i]);
        }

        for(int i=0; i<terjual.length; i++){
            for(int j=1; j<terjual.length; j++){
                // swap elemen
                if(terjual[j-1]> terjual[j]){
                    temp = terjual[j];
                    terjual[j] = terjual[j-1];
                    terjual[j-1] = temp;
                }
            }
        }

        avg = sum / terjual.length;
        System.out.println();
        System.out.println("Penjualan terbanyak sebanyak "+terjual[0]+" buah");
        System.out.println("Penjualan terkecil sebanyak "+terjual[terjual.length-1]+" buah");
        System.out.println("Dengan rata rata penjualan adalah "+avg+" buah perhari");
    }
}
