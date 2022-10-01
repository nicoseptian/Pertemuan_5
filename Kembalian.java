/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nico Septian
 */
public class Main {
    
    public static void main(String[] args) {
        ArrayList<TugasPBO2> pesan = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int pilih = 0 ;
     
            do {
            System.out.println("=========================================");
            System.out.println("           Kopiantik         ");
            System.out.println("=========================================");
            System.out.println("  1. Order ");
            System.out.println("  2. Close ");
            System.out.println("=========================================");
            System.out.print(" Type [ 1, 2, or 3 ]: ");
            pilih = sc.nextInt();

            if (pilih == 1) {
                pesan = addTugasPBO2(pesan);
            } else {
                sc.close();
            }
        } while (pilih != 2);
    }

    private static ArrayList<TugasPBO2> addTugasPBO2(ArrayList<TugasPBO2> pesan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
                
            
    private final Object nama;
    private int Tambah_Harga;
{
            System.out.println("Daftar Menu");
            System.out.println("--------------------------------------------------------------------");
            System.out.printf("%-10s | %-10s | %-10s",
                    "No",
                    "Nama",
                    "Harga");
            System.out.println();
            System.out.println("--------------------------------------------------------------------");
            System.out.printf("%-10s | %-10s | %-10s",
                    "1",
                    "Americano",
                    "10000");
            System.out.println();
            System.out.println("--------------------------------------------------------------------");
            System.out.printf("%-10s | %-10s | %-10s",
                    "2",
                    "Latte",
                    "15000");
            System.out.println();
            System.out.println("--------------------------------------------------------------------");
            System.out.printf("%-10s | %-10s | %-10s",
                    "3",
                    "Arabika",
                    "20000");
            System.out.println();
            System.out.println("--------------------------------------------------------------------");
            System.out.print("Masukkan Nama Pesanan: ");
            nama = sc.nextLine (); 
            
            
                if (nama.equals("Americano")) {
                Tambah_Harga = 15000;
                boolean ok = true;
            } else if (nama.equals("Latte")) {
                Tambah_Harga = 20000;
                boolean ok = true;
            } else if (nama.equals("Arabika")) {
                Tambah_Harga = 20000;
                boolean ok = true;
            } else {
                System.out.println(" Mohon ulangi kembali pesanan anda  ");
                System.out.println("");
                boolean ok = false;
            }
        } 
        
       
        do {
            System.out.print("Beli berapa banyak?: ");
            Qty = sc.nextInt();

            if (Qty >= 1) {
                ok = true;
            } else {
                System.out.println("Jumlah tidak boleh kurang dari 0");
                ok = false;
            }
        } while (ok == false);
        
        // Harga yang harus dibayar
        Harga = (Qty * Tambah_Harga);
        System.out.println("Yang harus dibayar: " + Harga);

        boolean correct = false;
        do {
            System.out.print("Masukkan jumlah uang: ");
            Bayar = sc.nextInt();
            if (Bayar < price) {
                System.out.println("[ Uang yang Anda berikan kurang nih ! Rugi nanti kita kak hehe ]");
                correct = false;
            } else {
                correct = true;
            }
        } while (correct == false);

        Kembalian = abs(Bayar - Harga);
        System.out.println("Kembalian: " + Kembalian);
        System.out.println(
                "[ Pesanan berhasil masuk ! Mohon ditunggu pesanannya jadi yah kak ! ]. Press enter to continue..");
        sc.nextLine();
        m.clear();
        sc.nextLine();
        return m;
        
}

        
        
    


        

