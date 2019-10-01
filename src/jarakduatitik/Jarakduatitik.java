
package jarakduatitik;
import java.util.Scanner;
public class Jarakduatitik {
    public static double jarak(double []a, double[]b){
        double z= (a[0]-b[0])*(a[0]-b[0])+(a[1]-b[1])*(a[1]-b[1]);
        double r = Math.sqrt(z);
        return r;}
    public static void main(String[] args) {
        // memamsukkan titik a dan titik b
        Scanner aan = new Scanner(System.in);
        System.out.println("Program ini menampilkan jarak antara kedua titik ");
        System.out.println("Masukkan titik A ");
        double a []= new double [2];
        System.out.print("Elemen x = ");
        a[0]= aan.nextDouble();
        System.out.print("Elemen y = ");
        a[1]= aan.nextDouble();
        System.out.println("=====================================");
        System.out.println("Masukkan titik B ");
        double b []= new double [2];
        System.out.print("Elemen x = ");
        b[0]= aan.nextDouble();
        System.out.print("Elemen y = ");
        b[1]= aan.nextDouble();
        System.out.println("======================================");
        System.out.println("Jarak titk A ke titk B adalah "+jarak(a,b)+ " Satuan panjang");
         
        
    }
    
}
