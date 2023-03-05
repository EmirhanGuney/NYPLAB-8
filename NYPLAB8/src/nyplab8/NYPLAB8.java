/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nyplab8;

import java.util.ArrayList;

/**
 *
 * @author Emirhan Güney
 */
public class NYPLAB8 {

    public static void main(String[] args) {
        ArrayList<Ders> d = new ArrayList<>();
        
        Ders d1 = new Ders();
        d.add(d1);
        
        Ders d2 = new Ders("Veri Yapıları ve Algoritmaları");
        d.add(d2);
        
        Ders d3 = new Ders("Programlama Laboratuvarı - I",305,"Meltem Kurt Pehlivanoğlu");
        d.add(d3);
        
        
        Ogrenci o1 = new Ogrenci();
        o1.OgrenciBilgisiYaz();
        
        Ogrenci o2 = new Ogrenci("Mehmet Emin Çınar",d);
        o2.OgrenciBilgisiYaz();
        
        Ogrenci o3 = new Ogrenci("Fatih Çağlı", 3, d);
        o3.OgrenciBilgisiYaz();
        o2.OgrenciDersBilgiYaz();
    }
    
}
