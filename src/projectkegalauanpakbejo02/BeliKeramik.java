/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectkegalauanpakbejo02;

/**
 *
 * @author User
 */
public class BeliKeramik {
    //Atribut
    int luasLantai;
    int panjangKeramik;
    int lebarKeramik;
    int banyakKeramikPerBox;
    int hargaKeramikPerBox;
    
    //Constructor
    BeliKeramik(int L, int p, int l, int b, int h){
        this.luasLantai = L;
        this.panjangKeramik = p;
        this.lebarKeramik = l;
        this.banyakKeramikPerBox = b;
        this.hargaKeramikPerBox = h;
    }
    
    //Methods
    int hitungLuasTiapKeramik(){
        int luasKeramik;
        luasKeramik = this.panjangKeramik * this.lebarKeramik;
        return luasKeramik;
    }
    int hitungLuasTiapBox(){
        int luasBox;
        luasBox = this.banyakKeramikPerBox * this.hitungLuasTiapKeramik();
        return luasBox;
    }
    int hitungKebutuhanBox(){
        double kebutuhan;
        kebutuhan = Math.ceil((double) this.luasLantai / this.hitungLuasTiapBox());
        return (int) kebutuhan;
    }
    void hitungTotalHargaKebutuhan(){
        int totalHarga;
        totalHarga = this.hitungKebutuhanBox() * this.hargaKeramikPerBox;
        System.out.println("Harga total : " + totalHarga + " rupiah");
    }
}
