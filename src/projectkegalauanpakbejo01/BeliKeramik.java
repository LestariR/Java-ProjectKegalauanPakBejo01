/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectkegalauanpakbejo01;

/**
 *
 * @author LestariR
 */
public class BeliKeramik {
    /*Membuat atribut*/
    int luasLantai;
    int panjangKeramik;
    int lebarKeramik;
    int banyakKeramikPerBox;
    int hargaKeramikPerBox;
    
    /*Membuat Methods*/
    int konversiLuasLantai(){
        int luasDalamCm;
        luasDalamCm = this.luasLantai * 10000;
        return luasDalamCm;
    }
    int hitungLuasKeramik(){
        int luasSatuKeramik;
        luasSatuKeramik = this.panjangKeramik * this.lebarKeramik;
        return luasSatuKeramik;
    } 
    
    int hitungLuasBox(){
        int luasSatuBox;
        luasSatuBox = this.banyakKeramikPerBox * this.hitungLuasKeramik();
        return luasSatuBox;
    }
    
    int hitungKebutuhanBox(){
        double kebutuhanBox;
        kebutuhanBox = Math.ceil((double)this.konversiLuasLantai() / this.hitungLuasBox());
        return (int) kebutuhanBox;
    }
    
    void hitungHargaTotalKebutuhan(){
        int totalHarga;
        totalHarga = this.hargaKeramikPerBox * this.hitungKebutuhanBox();
        System.out.println("Harga Total Kebutuhan : " + totalHarga + " rupiah");
    }
}
