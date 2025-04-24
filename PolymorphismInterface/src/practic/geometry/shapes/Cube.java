/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// bagian dari package berisi class-class bangun 2D dan 3D
package practic.geometry.shapes;

// Mewarisi Shape dan mengimplementasikan interface ThreeDimensional dan Weightable.
import practic.geometry.baneteses.Shape;
import practic.geometry.interfaces.ThreeDimensional;
import practic.geometry.interfaces.Weightable;

/**
 *
 * @author HUSEIN SIDHARTA
 */

// Cube akan mewarisi method dan atribut non-private Shape dan method-method di interface ThreeDimensional dan Weightable.
public class Cube extends Shape implements ThreeDimensional, Weightable {

    // Penerapan enkapsulasi, atribut akan diberi nilai melalui setter.
    private double edge;
    private double mass;
    
    // Constructor kosong, dimana wajib dibuat karena dilakukan overloading di bawahnya.
    public Cube() {
        
    }
    
    // Constructor yang memungkinkan pemberian input atribut edge dan mass saat instansiasi.
    public Cube(double edge, double mass) {
        this.edge = edge;
        this.mass = mass;
    }
    
    // mekanisme pemberian nilai pada edge bangun kubus. Penerapan enkapsulasi
    public void setEdge(double edge) {
        this.edge = edge;
    }
    
    // setter untuk mengisi nilai massa.
    public void setMass(double mass) {
        this.mass = mass;
    }
    
    // Tipe data untuk method getter selalu menyesuaikan atribut yang dioperasikan/ terlibat di dalamnya.
    
    // Merupakan override dari interface ThreeDimensional untuk mencari luas. Di dalamnya disesuaikan dengan bangun kubus, rumusnya: 6 * sisi * sisi.
    @Override
    public double getSurfaceArea() {
        double hasil = 6 * Math.pow(edge, 2);
        return hasil;
    }

    // Juga override ThreeDimensional, untuk mencari volume. Rumus untuk kubus adalah sisi * sisi * sisi.
    @Override
    public double getVolume() {
        double hasil = Math.pow(edge, 3);
        return hasil;
    }

    // Override, tapi thd interface Weightable untuk mencari berat. Rumus berat selalu sama yaitu mass * g.
    @Override
    public double getWeight() {
        return g * mass;
    }
    
    // Override ke abstract class paling mendasar, yaitu Shape. Isinya disesuaikan dengan permintaan tugas, dimana untuk bangun ruang diisikan SurfaceArea, Volume, dan Weight.
    @Override
    public void printInfo() {
        System.out.println("Name\t\t: " + getName());
        System.out.println("Surface Area\t: " + getSurfaceArea());
        System.out.println("Volume\t\t: " + getVolume());
        System.out.println("Weight\t\t: " + getWeight());
    }
    
}
