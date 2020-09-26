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
public class ProjectKegalauanPakBejo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instansiasi
        System.out.println("================= Keramik A =================");
        BeliKeramik bkA = new BeliKeramik(1000000, 30, 30, 10, 54000);
        System.out.println("Luas Satu Buah Keramik A : " + bkA.hitungLuasTiapKeramik()+ " satuan luas");
        System.out.println("Luas Satu Box Keramik A : " + bkA.hitungLuasTiapBox() + " satuan luas");
        System.out.println("Kebutuhan Keramik A : " + bkA.hitungKebutuhanBox() + " Box");
        bkA.hitungTotalHargaKebutuhan();
        
        System.out.println("================= Keramik B =================");
        BeliKeramik bkB = new BeliKeramik(1000000, 40, 40, 5, 65000);
        System.out.println("Luas Satu Buah Keramik B : " + bkB.hitungLuasTiapKeramik()+ " satuan luas");
        System.out.println("Luas Satu Box Keramik B : " + bkB.hitungLuasTiapBox() + " satuan luas");
        System.out.println("Kebutuhan Keramik B : " + bkB.hitungKebutuhanBox() + " Box");
        bkB.hitungTotalHargaKebutuhan();
        
        System.out.println("================= Keramik C =================");
        BeliKeramik bkC = new BeliKeramik(1000000, 30, 40, 8, 60000);
        System.out.println("Luas Satu Buah Keramik C : " + bkC.hitungLuasTiapKeramik()+ " satuan luas");
        System.out.println("Luas Satu Box Keramik C : " + bkC.hitungLuasTiapBox() + " satuan luas");
        System.out.println("Kebutuhan Keramik C : " + bkC.hitungKebutuhanBox() + " Box");
        bkC.hitungTotalHargaKebutuhan();
    }   
}
