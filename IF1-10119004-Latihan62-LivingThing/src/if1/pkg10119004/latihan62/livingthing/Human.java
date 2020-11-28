/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119004.latihan62.livingthing;

/**
 *
 * @author ENDOG
 * Nama         : Muhamad Ramadan
 * Nim          : 10119004
 * Kelas        : IF1
 * Deskripsi    : Program ini berisi tentang Living Thing
 */
public class Human extends LivingThing{
    private String nama;

    @Override
    public void walk(String nama) {
        System.out.println(nama.concat(" sedang berjalan."));
    }
        
    
}
