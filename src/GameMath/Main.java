/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameMath;

/**
 *
 * @author Rizal
 */
public class Main {
    public static void main(String[] args) {
        //membuat objek baru m dari class Menu
        Menu m = new Menu();
        //menjalankan method mulaiGame, dengan paramater m untuk data defaultnya
        m.mulaiGame(m);
        //lalu menjalankan method menu, untuk pilih menu
        m.menu(m);
    }
}
