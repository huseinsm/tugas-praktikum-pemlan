/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktic.geometry.shapes;

/**
 *
 * @author HUSEIN SIDHARTA
 */

// file saling import karena berbeda package
import praktic.geometry.mains.Main;

public class circle {
    // fields
    // sesuai dengan prinsip best practice, agar efektif, seluruh attribute dibuat dengan access modifier private.
    private int id;
    private double rad;
    // untuk attribute dengan nilai selalu tetap dan tidak boleh diubah lagi, mereka diinisiasi menggunakan tambahan final setelah access modifier.
    private final int pembilang = 22;
    private final int penyebut = 7;
    
    // constructor
    public circle() {
    }
    
    // methods
    // method setter bertipe void (tidak mengembalikan nilai), di dalamnya menginputkan nilai argumen ke suatu atribut yang dituju.
    public void setId(int id) {
        this.id = id;
    }
    
    public void setRad(double rad) {
        this.rad = rad;
    }
    
    // method getter diberikan tipe data sesuai dengan luaran yang akan dihasilkan oleh proses di dalam method (bisa atribut langsung atau operasi dari beberapa atribut).
    public int getId() {
        return id;
    }
    
    public double getRad() {
        return rad;
    }
    
    // urutan operasi adalah hal yang krusial, sehingga harus diperhatikan. pastikan menuliskan secara urut dan memberi tanda kurung untuk menandai bahwa operasi tersebut diprioritaskan untuk dikerjakan terlebih dahulu
    public double getKeliling() {
        return (pembilang/penyebut)*(2*rad);
    }
    
    // agar efektif, class Math method pow dimanfaatkan untuk melakukan operasi matematika, khususnya eksponensial.
    public double getLuas() {
        return (pembilang/penyebut)* Math.pow(rad, 2);
    }
    
    // atribut atau method dengan status static dapat dipanggil secara langsung tanpa instansiasi object. Tetapi pemanggilan di class lain mensyaratkan penulisan nama class kemudian . dan diikuti nama field atau method.
    public void printDeskripsi() {
        System.out.println(
                Main.YELLOW + "ID\t\t: " + id + "\n"  +
                Main.GREEN + "Radius\t\t: " + rad + "\n"  +
                Main.YELLOW + "Keliling\t: " + getKeliling() + "\n"  +
                Main.GREEN + "Luas\t\t: " + getLuas()
        );
    }
    
}
