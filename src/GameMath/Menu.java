/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameMath;

import java.util.Scanner;

/**
 *
 * @author Tiara
 */
public class Menu{
    //atribut
    public int skor, level, lives, xbig, ybig, x, y, z;
    public boolean run = true;
    public String nama;
    private int pilih;
    
    //Method
    //setter nama pemain
    public void setNama(String nama){
        this.nama = nama;
    }
    
    //getter nama pemain
    public String getNama(){
        return this.nama;
    }
    
    //untuk menampilkan tampilan awal game (judul dan input nama pemain)
    //OVERRIDING
    public void mulaiGame(Menu m){
        System.out.println("**********************");
        System.out.println("Game Math");
        System.out.println("**********************");
        System.out.print("Masukkan Nama Anda: ");
        //proses inputan nama pemain
        Scanner sc = new Scanner(System.in);
        String nama = sc.nextLine();
        this.setNama(nama);
    }
    
    //Menampilkan pilihan menu game
    public void menu(Menu m){
        this.pilih = pilih;
        //membuat objek baru dari class penjumlahan dan pengurangan untuk memproses method mulaiGame & getPenjumlahan, getPengurangan
        Penjumlahan pj = new Penjumlahan(nama);
        Pengurangan pr = new Pengurangan(nama);
        //Perulangan untuk pilih menu
        while(run){
            System.out.println("Pilih Menu: ");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Keluar");
            System.out.print("Pilih No Menu: ");
            //proses inputan pilih menu
            Scanner sp = new Scanner(System.in);
            pilih = sp.nextInt();
            //kondisi 1 dalam pilih menu, apabila pilih 1
            if (pilih == 1){
                //perulangan pilih berhenti karena boolean run dirubah menjadi false
                run = false;
                //memproses method dari Penjumlahan
                pj.mulaiGame();
                pj.getPenjumlahan(m);
            //kondisi 2 dalam pilih menu, apabila pilih 2
            } else if (pilih == 2){
                //perulangan pilih berhenti karena boolean run dirubah menjadi false
                run = false;
                //memproses method dari pengurangan
                pr.mulaiGame();
                pr.getPengurangan(m);
            //kondisi 3 dalam pilih menu, apabila pilih 3, program perulangan berhenti karena boolean run dirubah menjadi false
            } else if (pilih == 3){
                run = false;
            }
        }
    }
}
