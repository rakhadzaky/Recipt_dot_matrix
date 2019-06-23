/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recipt_dot_matrix;


/**
 *
 * @author Immelman
 */
public class barang {
    private String kode_barang;
    private String nama_barang;
    private int qty;
    private int harga;
    private int total;

    public barang(String kode_barang, String nama_barang, int qty, int harga, int total) {
        this.kode_barang = kode_barang;
        this.nama_barang = nama_barang;
        this.qty = qty;
        this.harga = harga;
        this.total = total;
    }

    public String getKode_barang() {
        return kode_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public int getQty() {
        return qty;
    }

    public int getHarga() {
        return harga;
    }

    public int getTotal() {
        return total;
    }

    
    
    
    
}
