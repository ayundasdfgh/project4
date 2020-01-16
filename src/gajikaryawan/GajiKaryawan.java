
package gajikaryawan;
import java.util.Scanner;

public class GajiKaryawan {

    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    String nama,nik,bagian;
    byte gol,hari;
    int potongan,gapok,transport,total,gaji;
   
    System.out.println ("    INPUT GAJI KARYAWAN  NEW");
    System.out.println ("==============================");
   
    System.out.print ("Masukkan Nama : ");
    nama = input.nextLine();
   
    System.out.print ("Masukkan NIK : ");
    nik = input.nextLine();
   
    System.out.print ("Masukkan Bagian : ");
    bagian = input.nextLine();
   
    System.out.println ("Golongan Karyawan : \n 1.A \n 2.B \n 3.C" );
    System.out.print ("Masukkan Pilihan : ");  
    gol = input.nextByte();
   
    System.out.print ("Masukkan Jumlah Hari Masuk : ");
    hari = input.nextByte();
    transport = hari*25000;
   
    System.out.println ("\n==========================");
    System.out.println ("Nama : "+nama);
    System.out.println ("NIK : "+nik);
    System.out.println ("Bagian : "+bagian);
    System.out.println ("Golongan : "+gol);
   
    switch (gol) {
            case 1:
                gapok = 4000000;
                potongan = gapok*5/100;
                gaji = gapok-potongan;
                total = gaji+transport;
                System.out.println ("Tunjangan Transport : "+transport);
                System.out.println ("Gaji Pokok : "+gapok);
                System.out.println ("Potongan Asuransi : "+potongan);
                System.out.println ("Gaji Bersih : "+total);
                break;
            case 2:
                gapok = 3500000;
                potongan = gapok*3/100;
                gaji = gapok-potongan;
                total = gaji+transport;
                System.out.println ("Tunjangan Transport : "+transport);
                System.out.println ("Gaji Pokok : "+gapok);
                System.out.println ("Potongan Asuransi : "+potongan);
                System.out.println ("Gaji Bersih : "+total);
                break;
            case 3:
                gapok = 2000000;
                total = gapok+transport;
                System.out.println ("Tunjangan Transport : "+transport);
                System.out.println ("Gaji Pokok : "+gapok);
                System.out.println ("Gaji Bersih : "+total);
                break;
            default:
                System.out.println ("pilihan golongan tidak sesuai, silahkan input ulang!!");
                break;
        } 
    }  
}
    
