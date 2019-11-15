/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameMath;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Didit
 */

//subclass dari menu
public class Pengurangan extends Menu{
    //membuat objek baru m2 untuk mengakses method dari menu
    Menu m2 = new Menu();
    private int jawabpr;
    
    //Method
    //constructor untuk memanggil nama pemain yang tersimpan di class Menu
    public Pengurangan(String nama){
        this.nama = nama;
    }
    
    
    public void setJawabpr(int jawab){
        this.jawabpr = jawab;
    }
    
    //getter nama pemain
    public int getJawabpr(){
        return this.jawabpr;
    }

    //meng overriding method mulaiGame dari class Menu untuk menampilkan judul game
    public void mulaiGame(){
        System.out.println("**********************");
        System.out.println("Game Math - Pengurangan");
        System.out.println("**********************");
    }
    
    //Syarat-syarat serta operasi hitungan dari game pengurangan
    public void getPengurangan(Menu m){
        //status lives dan skor awal
        lives = 3;
        skor = 0;
        //melakukan perulangan
        while(run){
            //ketika skor lebih dari 300
            if (skor > 300) {
                run = false;
                System.out.println("[Selamat "+m.getNama()+", Anda telah menyelesaikan soal penjumlahan dengan baik. Silakan dicoba soal pengurangan ya]");
                System.out.println("Menjalankan method pilih menu lagi");
                m2.menu(m);
            //ketika lives kurang dari sama dengan 0
            } else if (lives <= 0) {
                run = false;
                System.out.println("[Hai "+m.getNama()+", Jangan menyerah ya untuk mencoba lagi. ]");
                System.out.println("Menjalankan method pilih menu lagi");
                m2.menu(m);
            //ketika skor kurang dari 0
            } else if(skor < 0) {
                //x adalah bilangan pertama yang di random antara angka 0 - 10
                x = ThreadLocalRandom.current().nextInt(0, 10);
                xbig = x;
                //y adalah bilangan kedua yang di random antara angka 0 - 10
                y = ThreadLocalRandom.current().nextInt(0, 10);
                ybig = y;
                //jika y lebih besar dari x maka akan dilakukan pertukaran dengan bantuan variabel xbig dan ybig
                if (x < y){
                    x = ybig;
                    y = xbig;
                    //melakukan operasi hitung pengurangan dan hasilnya disimpan di z untuk pengecekan jawaban pemain
                    z = x - y;
                    //menampilkan soal dan input jawaban pemain
                    System.out.println("Berapakah hasil dari " +x+ "-"+y+"?");
                    System.out.print("Jawab: ");
                    Scanner s3 = new Scanner(System.in);
                    setJawabpr(s3.nextInt());
                    this.level=1;
                    //untuk menghitung serta menampilkan lives, skor dan level
                    if (getJawabpr() == z){
                        skor += 4;
                        System.out.println("[Selamat "+m.getNama()+", Anda benar”][Skor: "+skor+"][Lives: "+lives+"][Level: " + level+"]");
                    } else {
                        skor -= 1;
                        lives -= 1;
                        System.out.println("Selamat "+m.getNama()+", Wah, salah deh”][Skor: "+skor+"][Lives: "+lives+"][Level: " + level+"]");
                    }       
                //jika x lebih besar dari y
                } else if (x > y){
                    //melakukan operasi hitung dan hasilnya disimpan di z untuk pengecekan jawaban pemain
                    z = x - y;
                    //menampilkan soal dan input jawaban pemain
                    System.out.println("Berapakah hasil dari " +x+ "-"+y+"?");
                    System.out.print("Jawab: ");
                    Scanner s5 = new Scanner(System.in);
                    jawabpr = s5.nextInt();
                    this.level=1;
                    //untuk menghitung serta menampilkan lives, skor dan level
                    if (jawabpr == z){
                        skor += 4;
                        System.out.println("[Selamat "+m.getNama()+", Anda benar”][Skor: "+skor+"][Lives: "+lives+"][Level: " + level+"]");
                    } else {
                        skor -= 1;
                        lives -= 1;
                        System.out.println("Selamat "+m.getNama()+", Wah, salah deh”][Skor: "+skor+"][Lives: "+lives+"][Level: " + level+"]");
                    }  
                }
            //jika skor 0 - 100
            } else if (skor >=0 && skor <=100) {
                //x adalah bilangan pertama yang di random antara angka 0 - 10
                x = ThreadLocalRandom.current().nextInt(0, 10);
                xbig = x;
                //y adalah bilangan kedua yang di random antara angka 0 - 10
                y = ThreadLocalRandom.current().nextInt(0, 10);
                ybig = y;
                //jika y lebih besar dari x maka akan dilakukan pertukaran dengan bantuan variabel xbig dan ybig
                if (x < y){
                    x = ybig;
                    y = xbig;
                    //melakukan operasi hitung pengurangan dan hasilnya disimpan di z untuk pengecekan jawaban pemain
                    z = x - y;
                    //menampilkan soal dan input jawaban pemain
                    System.out.println("Berapakah hasil dari " +x+ "-"+y+"?");
                    System.out.print("Jawab: ");
                    Scanner s6 = new Scanner(System.in);
                    setJawabpr(s6.nextInt());
                    this.level=1;
                    //untuk menghitung serta menampilkan lives, skor dan level
                    if (getJawabpr() == z){
                        skor += 4;
                        System.out.println("[Selamat "+m.getNama()+", Anda benar”][Skor: "+skor+"][Lives: "+lives+"][Level: " + level+"]");
                    } else {
                        skor -= 1;
                        lives -= 1;
                        System.out.println("Selamat "+m.getNama()+", Wah, salah deh”][Skor: "+skor+"][Lives: "+lives+"][Level: " + level+"]");                  }  
                //jika x lebih besar dari y
                } else if (x > y){
                    //melakukan operasi hitung pengurangan dan hasilnya disimpan di z untuk pengecekan jawaban pemain
                    z = x - y;
                    //menampilkan soal dan input jawaban pemain
                    System.out.println("Berapakah hasil dari " +x+ "-"+y+"?");
                    System.out.print("Jawab: ");
                    Scanner s7 = new Scanner(System.in);
                    setJawabpr(s7.nextInt());
                    this.level = 1;
                    //untuk menghitung serta menampilkan lives, skor dan level
                    if (getJawabpr() == z){
                        skor += 4;
                        System.out.println("[Selamat "+m.getNama()+", Anda benar”][Skor: "+skor+"][Lives: "+lives+"][Level: " + level+"]");
                    } else {
                        skor -= 1;
                        lives -= 1;
                        System.out.println("Selamat "+m.getNama()+", Wah, salah deh”][Skor: "+skor+"][Lives: "+lives+"][Level: " + level+"]");
                    }  
                }
            //jika skor 100-200
            } else if (skor > 100 && skor <= 200){
                //x adalah bilangan pertama yang di random antara angka -10 - -1
                x = ThreadLocalRandom.current().nextInt(-10, 0);
                //y adalah bilangan kedua yang di random antara angka -10 - -1
                y = ThreadLocalRandom.current().nextInt(-10, 0);
                //melakukan operasi hitung pengurangan dan hasilnya disimpan di z untuk pengecekan
                z = x - y;
                //kondisi percabangan untuk mengubah nilai x & y menjadi string dengan tambahan kurung
                if (x < 0 || y < 0){
                    String  negax = "("+x+")";
                    String negay = "("+y+")";
                    System.out.println("Berapakah hasil dari " +negax+ "+"+negay+"?");
                }
                System.out.print("Jawab: ");
                Scanner s8 = new Scanner(System.in);
                setJawabpr(s8.nextInt());
                this.level=2;
                //untuk menghitung serta menampilkan lives, skor dan level
                if (getJawabpr() == z){
                        skor += 4;
                        System.out.println("[Selamat "+m.getNama()+", Anda benar”][Skor: "+skor+"][Lives: "+lives+"][Level: " + level+"]");
                    } else {
                        skor -= 1;
                        lives -= 1;
                        System.out.println("Selamat "+m.getNama()+", Wah, salah deh”][Skor: "+skor+"][Lives: "+lives+"][Level: " + level+"]");
                    }      
            } else if (skor >= 200 && skor <= 300){
                //x adalah bilangan pertama yang di random antara angka -10 - 10
                x = ThreadLocalRandom.current().nextInt(-10, 10);
                //y adalah bilangan kedua yang di random antara -10 - 10
                y = ThreadLocalRandom.current().nextInt(-10, 10);
                //melakukan operasi hitung pengurangan dan hasilnya disimpan di z untuk pengecekan
                z = x - y;
                //kondisi percabangan apabila x & y kurang 0, maka x & y diubah menjadi string dengan tambahan kurung untuk output soal
                if (x < 0 && y < 0){
                    String  negax = "("+x+")";
                    String negay = "("+y+")";
                    System.out.println("Berapakah hasil dari " +negax+ "+"+negay+"?");
                //kondisi percabangan 2 apabila x kurang 0, dan y lebih 0. x di ubah menjadi string untuk menambah kurung
                } else if(x < 0 && y > 0){
                    String negax = "("+x+")";
                    System.out.println("Berapakah hasil dari " +negax+ "+"+y+"?");
                //kondisi percabangan 3 apabila x lebih besar dari 0, dan y lebih kecil dari 0. y diubah menjadi string untuk menambah kurung
                } else if(x > 0 && y < 0){
                    String negay = "("+y+")";
                    System.out.println("Berapakah hasil dari " +x+ "+"+negay+"?");
                //kondisi x & y nilai lebih besar dari 0
                } else if (x > 0 && y > 0){
                    System.out.println("Berapakah hasil dari " +x+ "+"+y+"?");
                }
                System.out.print("Jawab: ");
                Scanner s9 = new Scanner(System.in);
                setJawabpr(s9.nextInt());
                this.level=3;
                //untuk menghitung serta menampilkan lives, skor dan level
                if (getJawabpr() == z){
                        skor += 4;
                        System.out.println("[Selamat "+m.getNama()+", Anda benar”][Skor: "+skor+"][Lives: "+lives+"][Level: " + level+"]");
                    } else {
                        skor -= 1;
                        lives -= 1;
                        System.out.println("Selamat "+m.getNama()+", Wah, salah deh”][Skor: "+skor+"][Lives: "+lives+"][Level: " + level+"]");
                    }  
            }
        }
    }
}

