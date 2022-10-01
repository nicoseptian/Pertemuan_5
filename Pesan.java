/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo2;

/**
 *
 * @author Nico Septian
 */
public class Pesan {
        String Nama, Customer ;
        int Qty, Bayar, Harga, Tambah_Harga, Kembalian;
        
        public Pesan( String Nama, String Customer, int Qty, int Bayar, int Harga, int Tambah_Harga, int Kembalian) {
            
            this.Nama = Nama ;
            this.Customer = Customer ;
            this.Qty = Qty ;
            this.Bayar = Bayar ;
            this.Tambah_Harga = Tambah_Harga ;
            this.Kembalian = Kembalian ;
            
            
            
        }

    public String getNama() {
        return Nama;
    }

    public String getCustomer() {
        return Customer;
    }

    public int getQty() {
        return Qty;
    }

    public int getBayar() {
        return Bayar;
    }

    public int getHarga() {
        return Harga;
    }

    public int getTambah_Harga() {
        return Tambah_Harga;
    }

    public int getKembalian() {
        return Kembalian;
    }
        

    /**
     * @param args the command line arguments
     */

}
