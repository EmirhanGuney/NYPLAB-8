/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nyplab8;

import java.util.ArrayList;

/**
 *
 * @author Emirhan Güney
 */
class Ogrenci {
    String ad;
    int sinif;
    ArrayList<Ders> derslistesi = new ArrayList<>();
    static int ogrenciSayisi = 0;
    
    public Ogrenci(){
        ad = "Seher Duran";
        sinif = 1;
        ogrenciSayisi++;
    }
    
    public Ogrenci(String a,ArrayList<Ders> d){
        ad = a;
        sinif = 2;
        derslistesi = d;
        ogrenciSayisi++;
    }
    
    public Ogrenci(String a,int s,ArrayList<Ders> d){
        ad = a;
        sinif = s;
        derslistesi = d;
        ogrenciSayisi++;
    }
    
    public void OgrenciBilgisiYaz(){
        System.out.println("Ad: " + ad);
        System.out.println("Sınıf: " + sinif);
        System.out.println("Öğrenci sayısı: " + ogrenciSayisi);
        System.out.println("Aldığı ders sayısı: " + derslistesi.size());
        System.out.println();
    }
    
    public void OgrenciDersBilgiYaz(){
        for (int i = 0; i < derslistesi.size(); i++) {
            System.out.println(derslistesi.get(i).ad);
            System.out.println(derslistesi.get(i).sinif);
            System.out.println(derslistesi.get(i).hoca);
            System.out.println();
        }
 }
}
