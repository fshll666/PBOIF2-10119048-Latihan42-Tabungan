/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119048.latihan42.tabungan;

/**
 *
 * @author SystemOs
 * Nama      : Mochammad Faishal
 * NIM       : 10119048
 * Kelas     : IF2
 * Deskripsi : Berisi program penarikan saldo tabungan.
 */
public class Tabungan {
    private int saldo;
    
    public void Tabungan(int saldo){
        this.saldo = saldo;
    }
    
    public int tarik(int jumlah){
        return this.saldo - jumlah;
    }
}
