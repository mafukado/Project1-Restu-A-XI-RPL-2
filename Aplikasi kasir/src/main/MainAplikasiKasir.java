/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import classes.DaftarMenu;
import classes.Kuah;
import classes.Minuman;
import classes.Ramen;
import classes.Topping;
import java.util.Scanner;

public class MainAplikasiKasir {
    
    public DaftarMenu daftarMenu;
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        
        MainAplikasiKasir app = new MainAplikasiKasir();
        app.generateDaftarMenu();
    }
    public void generateDaftarMenu() { 
        daftarMenu = new DaftarMenu();
        daftarMenu.tambahMenu(new Ramen("Ramen Seafood", 25000));
        daftarMenu.tambahMenu(new Ramen("Ramen Original", 18000));
        daftarMenu.tambahMenu(new Ramen("Ramen Vegetarian", 22000));
        daftarMenu.tambahMenu(new Ramen("Ramen Karnivor", 28000));
        
        daftarMenu.tambahMenu(new Kuah("Kuah Orisinil"));
        daftarMenu.tambahMenu(new Kuah("Kuah Internasional"));
        daftarMenu.tambahMenu(new Kuah("Kuah Spicy"));
        daftarMenu.tambahMenu(new Kuah("Kuah Soto Padang"));
        
        daftarMenu.tambahMenu(new Topping("Crab Stick Bakar", 6000));
        daftarMenu.tambahMenu(new Topping("Chicken Katsu", 8000));
        daftarMenu.tambahMenu(new Topping("Gyoza Goreng", 4000));
        daftarMenu.tambahMenu(new Topping("Bakso Goreng", 7000));
        daftarMenu.tambahMenu(new Topping("Enoki Goreng", 5000));
        
        daftarMenu.tambahMenu(new Minuman("Jus Alpukat SCP", 10000));
        daftarMenu.tambahMenu(new Minuman("Jus Stroberi", 11000));
        daftarMenu.tambahMenu(new Minuman("Capucino Cingcau", 15000));
        daftarMenu.tambahMenu(new Minuman("Goku Drip", 14000));
        
        daftarMenu.tampilDaftarMenu();
    }
}
