/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recipt_dot_matrix;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Immelman
 */
public class nota {
    private String penerima;
    private String alamat;
    private String tanggal;
    private int total;
    private List<barang> listbarang = new ArrayList<barang>();

    public nota(String penerima, String alamat, String tanggal, int total) {
        this.penerima = penerima;
        this.alamat = alamat;
        this.tanggal = tanggal;
        this.total = total;
    }
    
    public void addTotal(int num){
        this.total = num;
    }

    public String getPenerima() {
        return penerima;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTanggal() {
        return tanggal;
    }

    public List<barang> getListbarang() {
        return listbarang;
    }

    public int getTotal() {
        return total;
    }
    
    public void tambahbarang(barang item){
        this.listbarang.add(item);
    }
}
