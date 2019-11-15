/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameMath;



/**
 *
 * @author Affifah
 */
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

//subclass dari menu
//INHERITANCE
public class Penjumlahan extends Menu{
    //Membuat objek baru dari class Menu
    Menu m2 = new Menu();
    public int jawabpj;
    
    //ENCAPSULATION
    public void setJawabpj(int jawab){
    this.jawabpj = jawab;
    }
    
    //getter nama pemain
    public int getJawabpj(){
    return this.jawabpj;
    }
        
    //Method
    //constructor untuk memanggil nama pemain yang tersimpan di class Menu
    public Penjumlahan(String nama){
        this.nama = nama;
    }
    
    //meng overriding method mulaiGame dari class Menu untuk menampilkan judul game
    public void mulaiGame(){
        System.out.println("**********************");
        System.out.println("Game Math - Penjumlahan");
        System.out.println("**********************");
    }
    
    //method untuk melakukan proses penjumlahan, dengan tambahan Menu m, supaya nama inputan masih bisa terbaca.
    public void getPenjumlahan(Menu m){
        //status
        lives = 3;
        skor = 0;
        //proses perulangan dalam memenuhi persyaratan yang berlaku
        while(run){
            //kondisi 1, skor lebih besar 300
            if (skor > 300){
                //perulangan berhenti karena boolean run diubah menjadi false
                run = false;
                //output Status penjumlah pemain
                System.out.println("[Selamat "+m.getNama()+", Anda telah menyelesaikan soal penjumlahan dengan baik. Silakan dicoba soal pengurangan ya]");
                System.out.println("Menjalankan method pilih menu lagi");
                //menjalankan method menu untuk pilih menu.
                m2.menu(m);
            //kondisi 2, apabila lives kurang dari 0
            } else if (lives <= 0) {
                //perulangan berhenti karena boolean run diubah menjadi false
                run = false;
                //output Status penjumlah pemain
                System.out.println("[Hai "+m.getNama()+", Jangan menyerah ya untuk mencoba lagi. ]");
                System.out.println("Menjalankan method pilih menu lagi");
                //menjalankan method menu untuk pilih menu.
                m2.menu(m);
            //kondisi 3, apabila skor kurang 0
            } else if (skor < 0){
                //x adalah bilangan pertama yang di random antara angka 0 - 10
                x = ThreadLocalRandom.current().nextInt(0, 10);
                //y adalah bilangan pertama yang di random antara angka 0 - 10
                y = ThreadLocalRandom.current().nextInt(0, 10);
                //hitung jumlah, hasil z
                z = x+ y;
                //output soal
                System.out.println("Berapakah hasil dari " +x+ "+"+y+"?");
                //proses inputan jawab dari pemain
                System.out.print("Jawab: ");
                Scanner ss = new Scanner(System.in);
                setJawabpj(ss.nextInt());
                this.level = 1;
                //kondisi bercabang, untuk memberi kondisi dalam jawab apabila jawab sama dengan z
                if (getJawabpj() == z){
                    //skor bertambah 4
                    skor += 4;
                    //output Status penjumlah pemain
                    System.out.println("[Selamat "+m.getNama()+", Anda benar”][Skor: "+skor+"][Lives: "+lives+"][Level: " + level+"]");
                //kondisi bercabang 1 else, apabila jawab tidak sama dengan z
                } else {
                    // skor berkurang 1, dan lives berkurang 1
                    skor -= 1;
                    lives -= 1;
                    //output Status penjumlah pemain
                    System.out.println("Selamat "+m.getNama()+", Wah, salah deh”][Skor: "+skor+"][Lives: "+lives+"][Level: " + level+"]");
                }
            //kondisi 4, apabila skor kurang dari 0 dan skor kurang dari 100
            } else if (skor >=0 && skor <=99) {
                //x adalah bilangan pertama yang di random antara angka 0 - 10
                x = ThreadLocalRandom.current().nextInt(0, 10);
                //y adalah bilangan pertama yang di random antara angka 0 - 10
                y = ThreadLocalRandom.current().nextInt(0, 10);
                //hitung jumlah, hasil z
                z = x+y;
                //output soal
                System.out.println("Berapakah hasil dari " +x+ "+"+y+"?");
                //proses inputan jawab pemain
                System.out.print("Jawab: ");
                Scanner sss = new Scanner(System.in);
                setJawabpj(sss.nextInt());
                this.level = 1;
                //kondisi bercabang, untuk memberi kondisi dalam jawab apabila jawab sama dengan z
                if (getJawabpj() == z){
                    //skor bertambah 4
                    skor += 4;
                    //output Status penjumlah pemain
                    System.out.println("[Selamat "+m.getNama()+", Anda benar”][Skor: "+skor+"][Lives: "+lives+"][Level: " + level+"]");
                //kondisi bercabang 2 else, apabila jawab tidak sama dengan z
                } else {
                    // skor berkurang 1, dan lives berkurang 1
                    skor -= 1;
                    lives -= 1;
                    //output Status penjumlah pemain
                    System.out.println("Selamat "+m.getNama()+", Wah, salah deh”][Skor: "+skor+"][Lives: "+lives+"][Level: " + level+"]");
                }
            //kondisi 5, apabila skor lebih dari 100 dan skor kurang dari 200
            } else if (skor >= 100 && skor <= 200){
                //x adalah bilangan pertama yang di random antara angka -10 - -1
                x = ThreadLocalRandom.current().nextInt(-10, 0);
                //y adalah bilangan pertama yang di random antara angka -10 - -1
                y = ThreadLocalRandom.current().nextInt(-10, 0);
                //hitung jumlah , hasil z
                z= x+y;
                //kondisi bercabang, apabila x & y kurang 0
                if (x < 0 && y < 0){
                    //mengubah nilai x & y menjadi String untuk menampilkan di output soal
                    String  negax = "("+x+")";
                    String negay = "("+y+")";
                    System.out.println("Berapakah hasil dari " +negax+ "+"+negay+"?");
                }
                //proses inputan jawab pemain
                System.out.print("Jawab: ");
                Scanner sssss = new Scanner(System.in);
                setJawabpj(sssss.nextInt());
                this.level = 2;
                //kondisi bercabang, untuk memberi kondisi dalam jawab apabila jawab sama dengan z
                if (getJawabpj() == z){
                    //skor bertambah 4
                    skor += 4;
                    //output Status penjumlah pemain
                    System.out.println("[Selamat "+m.getNama()+", Anda benar”][Skor: "+skor+"][Lives: "+lives+"][Level: " + level+"]");
                //kondisi bercabang 2 else, apabila jawab tidak sama dengan z
                } else {
                    // skor berkurang 1, dan lives berkurang 1
                    skor -= 1;
                    lives -= 1;
                    //output Status penjumlah pemain
                    System.out.println("Selamat "+m.getNama()+", Wah, salah deh”][Skor: "+skor+"][Lives: "+lives+"][Level: " + level+"]");
                }  
            } else if (skor >= 200 && skor <= 300){
                //x adalah bilangan pertama yang di random antara angka -10 - 10
                x = ThreadLocalRandom.current().nextInt(-10, 10);
                //y adalah bilangan pertama yang di random antara angka -10 - 10
                y = ThreadLocalRandom.current().nextInt(-10, 10);
                //hitung jumlah z hasil
                z = x+y;
                //kondisi bercabang 1, ketentuan x & y kurang 0
                if (x < 0 && y < 0){
                    //mengubah nilai x & y menjadi String untuk menampilkan di output soal
                    String  negax = "("+x+")";
                    String negay = "("+y+")";
                    System.out.println("Berapakah hasil dari " +negax+ "+"+negay+"?");
                //kondisi bercabang 2, ketentuan x kurang 0, dan y lebih besar 0
                } else if(x < 0 && y > 0){
                    //mengubah nilai x menjadi String untuk menampilkan di output soal
                    String negax = "("+x+")";
                    System.out.println("Berapakah hasil dari " +negax+ "+"+y+"?");
                //kondisi bercabang 3, ketentuan y kurang 0, dan x lebih besar 0
                } else if(x > 0 && y < 0){
                    //mengubah nilai y menjadi String untuk menampilkan di output soal
                    String negay = "("+y+")";
                    System.out.println("Berapakah hasil dari " +x+ "+"+negay+"?");
                //kondisi bercabang 4, ketentuan y & x lebih besar 0
                } else if (x > 0 && y > 0){
                    //output soal x & y lebih 0
                    System.out.println("Berapakah hasil dari " +x+ "+"+y+"?");
                }
                //proses inputan jawab pemain
                System.out.print("Jawab: ");
                Scanner s1 = new Scanner(System.in);
                setJawabpj(s1.nextInt());
                this.level = 3;
                //kondisi bercabang, untuk memberi kondisi dalam jawab apabila jawab sama dengan z
                if (getJawabpj()== z){
                    //skor bertambah 4
                    skor += 4;
                    //output Status penjumlah pemain
                    System.out.println("[Selamat "+m.getNama()+", Anda benar”][Skor: "+skor+"][Lives: "+lives+"][Level: " + level+"]");
                } else {
                    // skor berkurang 1, dan lives berkurang 1
                    skor -= 1;
                    lives -= 1;
                    //output Status penjumlah pemain
                    System.out.println("Selamat "+m.getNama()+", Wah, salah deh”][Skor: "+skor+"][Lives: "+lives+"][Level: " + level+"]");  
            } 
            }
        }
    }
}
