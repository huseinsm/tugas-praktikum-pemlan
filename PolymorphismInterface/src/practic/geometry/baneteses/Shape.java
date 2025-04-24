/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// masuk ke package yang berisi abstract class
package practic.geometry.baneteses;

/**
 *
 * @author HUSEIN SIDHARTA
 */

// anstract class Shape menjadi salah satu parent class tertinggi pada proyek ini, menjadi template paling fundamental kepada bangun-bangun yang menjadi turunannya.
public abstract class Shape {
    // untuk inisiasi nama, menerapkan enkapsulasi. Dapat diakses melalui setternya, yaitu setName(), bertujuan untuk memproteksi kode program.
    private String name;
    
    // constructor yang memiliki struktur yang sama dengan defaultnya.
    public Shape() {
        
    }
    
    // setter untuk mengakses atribut nama.
    public void setName(String inputName) {
        this.name = inputName;
    }
    
    // getter, untuk mendapatkan value dari aribut nama bertipe data String. Oleh karena itu, tipe data dari method juga String (menyesuaikan).
    public String getName() {
        return name;
    }
    
    // memberi template untuk print informasi pada tiap-tiap bangun (menyesuaikan jenis bangunnya apakah 2D atau 3D). Abstract method pada non-interface dituliskan public abstract tetapi tanpa implementasi.
    public abstract void printInfo();
    
}
