import java.util.Scanner;
public class ArrayRataNilai08 {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int[] nilaiMhs  = new int[sc08.nextInt()];
        double totalLolos = 0, totalTidakLolos=0, rataL, rataT;
        int countLolos = 0, countTidakLolos=0;

        for(int i = 0; i<nilaiMhs.length; i++){
            System.out.print("Masukkan nilai akhir ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc08.nextInt();
            if(nilaiMhs[i] > 70){
                totalLolos += nilaiMhs[i];
                countLolos += 1;
            }else{
                totalTidakLolos += nilaiMhs[i];
                countTidakLolos += 1;
            }
        }

        rataL = totalLolos / countLolos;
        rataT = totalTidakLolos / countTidakLolos;
        System.out.println("Rata - rata nilai lulus= " + rataL);
        System.out.println("Rata - rata nilai tidak lulus= " + rataT);
        System.out.println("Jumlah mahasiswa yang lulus berjumlah "+countLolos);
        System.out.println("Jumlah mahasiswa yang tidak lulus berjumlah "+countTidakLolos);
    }
}
