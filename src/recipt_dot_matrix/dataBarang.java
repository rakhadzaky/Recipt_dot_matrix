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
public class dataBarang {
    private String kode_barang;
    private String nama_barang;
    private int harga;

    public void setKode_barang(String kode_barang) {
        this.kode_barang = kode_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getKode_barang() {
        return kode_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public int getHarga() {
        return harga;
    }
    
    
}
