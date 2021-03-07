/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Meh
 */
public class Topping extends Menu {
    
    public Topping(String nama_topping, double harga) { 
        setNama_menu(nama_topping);
        setHarga(harga);
        setKategori("topping");
    }
    
}
