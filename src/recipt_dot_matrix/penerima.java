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
public class penerima {
    private String id_pelanggan;
    private String nama;
    private String alamat;

    public penerima(String id_pelanggan, String nama, String alamat) {
        this.id_pelanggan = id_pelanggan;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getId_pelanggan() {
        return id_pelanggan;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
    
    
}
