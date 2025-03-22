/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktic.geometry.shapes;

// file saling import karena berbeda package
import praktic.geometry.mains.Main;

/**
 *
 * @author HUSEIN SIDHARTA
 */
public class Rectangle {
    // fields
    // sesuai dengan prinsip best practice, agar efektif, seluruh attribute dibuat dengan access modifier private.
    private int id;
    private double panjang;
    private double lebar;
    
    // constructor. this merujuk atribut di dalam class internal
    public Rectangle(int id, double panjang, double lebar) {
        this.id = id;
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    // tipe data untuk setter adalah void, berisi pendeklarasian nilai atribut sesuai input
    public void setId(int id) {
        this.id = id;
    }
    
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
    // tipe data untuk getter disesuaikan atribut yang direturn
    public int getId() {
        return id;
    }
    
    public double getPanjang() {
        return panjang;
    }
    
    public double getLebar() {
        return lebar;
    }
    
    public double getKeliling() {
        return (2*panjang) + (2*lebar);
    }
    
    public double getLuas() {
        return panjang * lebar;
    }
    
    // atribut atau method dengan status static dapat dipanggil secara langsung tanpa instansiasi object. Tetapi pemanggilan di class lain mensyaratkan penulisan nama class kemudian . dan diikuti nama field atau method.
    public void printDeskripsi() {
        System.out.println(
                Main.YELLOW + "ID\t\t: " + id + "\n"  +
                Main.GREEN + "Panjang\t\t: " + panjang + "\n"  +
                Main.YELLOW + "Lebar\t\t: " + lebar + "\n" +
                Main.GREEN + "Keliling\t: " + getKeliling() + "\n" +
                Main.YELLOW + "Luas\t\t: " + getLuas()
        );
    }
    
    
    
}
