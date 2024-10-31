import java.util.Scanner;
public class ArrayRataNilai11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();

        int [] nilaiMhs= new int [jumlahMhs];
        double total= 0;
        double rata2,lulus=0,tidaklulus=0,ratalulu=0,ratatidaklulus=0,jmlLulus=0,jmlTidakLulus=0;

        for (int i= 0; i<nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i]= sc.nextInt();
        }
        for (int i= 0; i<nilaiMhs.length; i++){
            total += nilaiMhs[i];
            if (nilaiMhs[i]>70){
                lulus += nilaiMhs[i];
                jmlLulus++;
            }else {
                tidaklulus += nilaiMhs[i];
                jmlTidakLulus++;
            }
        }
        rata2 = total/nilaiMhs.length;
        ratalulu = lulus/jmlLulus;
        ratatidaklulus = tidaklulus/jmlTidakLulus;

        System.out.println("Rata-rata mahasiswa lulus = "+ ratalulu);
        System.out.println("Rata-rata nilai tidak lulus = "+ ratatidaklulus);

    }
}
