/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1praktikum;

/**
 *
 * @author HUSEIN SIDHARTA
 */


public class Tugas1Praktikum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // deklarasi atau pembuatan objek. disebut juga instansiasi.
        BoBoiBoy kuasa1 = new BoBoiBoy();
        // dua constructor di bawah ini merepresentasikan constructor berparameter elemen. Oleh karena itu, di dalamnya diinputkan atribut elemen.
        BoBoiBoy kuasa2 = new BoBoiBoy("Gempa");
        BoBoiBoy kuasa3 = new BoBoiBoy("Halilintar");
        
        // deklarasi atribut-atribut class pada objek kuasa1, kuasa2, dan kuasa3.
        // input pada teman favorit dilakukan dengan method setter karena atribut yang dituju bervisibilitas private
        
        kuasa1.elemen = "Beliung";
        kuasa1.skill = "Badai Topan";
        kuasa1.setTemanFavorit("Ying");
        kuasa1.HP = 400;
        kuasa1.kekuatanSkill = 100;
        
        kuasa2.skill = "Tumbukan Tanah";
        kuasa2.setTemanFavorit("Yaya");
        kuasa2.HP = 600;
        kuasa2.kekuatanSkill = 70;
        
        kuasa3.skill = "Pedang Halilintar";
        kuasa3.setTemanFavorit("Gopal");
        kuasa3.HP = 350;
        kuasa3.kekuatanSkill = 150;
        
        //pemanggilan setiap method pada class BoBoiBoy untuk setiap entitas yang dibuat. Atribut-atribut yang dipanggil pada method disesuaikan dengan atribut yang diinputkan khusus untuk masing-masing objek.
        kuasa1.PerkenalanHero();
        kuasa1.siapaTemanFavorit();
        kuasa1.keluarkanSkill();
        kuasa1.nyawaMaksimal();
        System.out.println();
        
        kuasa2.PerkenalanHero();
        kuasa2.siapaTemanFavorit();
        kuasa2.keluarkanSkill();
        kuasa2.nyawaMaksimal();
        System.out.println();
        
        kuasa3.PerkenalanHero();
        kuasa3.siapaTemanFavorit();
        kuasa3.keluarkanSkill();
        kuasa3.nyawaMaksimal();
        
    }
    
}
