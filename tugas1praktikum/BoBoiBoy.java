/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1praktikum;

/**
 *
 * @author HUSEIN SIDHARTA
 */

// file ini dibuat sebagai class (class BoBoiBoy akan diinstansiasi, untuk diisi detail karakter BoBoiBoy secara spesifik)
public class BoBoiBoy {
    // Pembuatan atribut-atribut yang akan dimiliki oleh setiap entitas (tipe data perlu diperhatikan dan disesuaikan)
    public String elemen, skill;
    // atribut bervisibilitas private dapat merupakan variabel yang dilindungi. Set dan get value dapat dilakukan dengan pembuatan method getter dan setter
    private String temanFavorit;
    public int HP, kekuatanSkill;

    // Constructor (dalam kasus ini overloading constructor, dimana constructor tanpa parameter perlu dibuat karena Constructor berparameter dibuat)
    // Berikut adalah Constructor yang memungkinkan user membuat object tanpa input
    public BoBoiBoy () {
    }
    // Berikut adalah Constructor yang mewajibkan user menginputkan atribut elemen dalam proses instansiasi
    public BoBoiBoy (String elemen) {
        this.elemen = elemen;
    }

    // getter & setter sebagai akibat dari visibilitas atribut temanFavorit yang private
    // tipe data getter adalah String karena perlu menyesuaikan tipe data dari atribut yang dituju
    public String getTemanFavorit() {
        return temanFavorit;
    }

    // tipe data setter adalah void karena tidak mengembalikan nilai apapun dan didalamnya hanya berupa deklarasi variabel berdasarkan argumen yang diberikan
    public void setTemanFavorit(String temanFavorit) {
        this.temanFavorit = temanFavorit;
    }

    // method aksi
    // method-method aksi menampilkan print yang dikombinasikan dengan atribut yang relevan. Oleh karena itu, tipe data yang dimiliki adalah void.
    
    // method ini akan memperkenalkan hero, disertai elemen dan skill yang dimiliki
    public void PerkenalanHero() {
        System.out.println("Halo, Aku " + elemen + ". Jangan macam-macam dengan " + skill + " ku!");
    }
    
    // adapun method ini akan memperkenalkan teman favorit, disertai atribut teman favorit
    public void siapaTemanFavorit() {
        System.out.println("Hmmm, dia adalahhh" + temanFavorit);
    }

    // Pada method ini akan memperkenalkan skill, disertai skill dan kekuatan skill yang dimiliki
    public void keluarkanSkill() {
        System.out.println(skill + "ku akan mengurangi " + kekuatanSkill + " nyawamu!");
    }

    // method akan memperkenalkan nyawa, disertai nilai nyawa maksimal
    public void nyawaMaksimal() {
        System.out.println("Kau takkan mudah membunuhku. Nyawaku sebesar " + HP);
    }
    
}
