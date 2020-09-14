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
public class ProjectKegalauanPakBejo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       
       BeliKeramik bkA = new BeliKeramik();
       System.out.println("Jenis Keramik A");
       bkA.luasLantai = 100;
       bkA.panjangKeramik = 30;
       bkA.lebarKeramik = 30;
       bkA.banyakKeramikPerBox = 10;
       bkA.hargaKeramikPerBox = 54000;
       bkA.hitungHargaTotalKebutuhan();
       
       BeliKeramik bkB = new BeliKeramik();
       System.out.println("Jenis Keramik B");
       bkB.luasLantai = 100;
       bkB.panjangKeramik = 40;
       bkB.lebarKeramik = 40;
       bkB.banyakKeramikPerBox = 5;
       bkB.hargaKeramikPerBox = 65000;
       bkB.hitungHargaTotalKebutuhan();
       
       BeliKeramik bkC = new BeliKeramik();
       System.out.println("Jenis Keramik C");
       bkC.luasLantai = 100;
       bkC.panjangKeramik = 30;
       bkC.lebarKeramik = 40;
       bkC.banyakKeramikPerBox = 8;
       bkC.hargaKeramikPerBox = 60000;
       bkC.hitungHargaTotalKebutuhan();
    }
}
