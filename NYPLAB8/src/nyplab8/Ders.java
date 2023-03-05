/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nyplab8;

/**
 *
 * @author Emirhan Güney
 */
class Ders extends Ogrenci{
    String ad;
    int sinif;
    String hoca;
    static int dersSayisi = 0;

    public Ders() {
        ad = "Nesneye Yönelik Programlama";
        sinif = 301;
        hoca = "Hikmetcan Özcan";
        dersSayisi++;
    }
    
    public Ders(String a){
        ad = a;
        sinif = 303;
        hoca = "Suhap Şahin";
        dersSayisi++;
    }
    
    public Ders(String a, int s, String h){
        ad = a;
        sinif = s;
        hoca = h;
        dersSayisi++;
    }
    
    public void DersBilgisiYaz(){
        derslistesi.add(this);
    }
    
    public void DersSayiBilgisiYaz(){
        System.out.println("Üretilen Toplam Ders Sayısı: " + dersSayisi);
    }
}