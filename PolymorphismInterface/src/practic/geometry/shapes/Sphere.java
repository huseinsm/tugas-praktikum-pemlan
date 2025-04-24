/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// bagian dari package berisi class-class bangun 2D dan 3D
package practic.geometry.shapes;

// mewarisi CircularShape dan mengimplementasikan interface ThreeDimensional dan Weightable.
import practic.geometry.baneteses.CircularShape;
import practic.geometry.interfaces.ThreeDimensional;
import practic.geometry.interfaces.Weightable;

/**
 *
 * @author HUSEIN SIDHARTA
 */

// Sphere akan mewarisi method dan atribut non-private CircularShape (yang mewarisi Shape) dan method-method di interface ThreeDimensional dan Weightable.
public class Sphere extends CircularShape implements ThreeDimensional, Weightable {
    // penerapan enkapsulasi. Nilai diisi melalui setter.
    private double mass;
    
    // Constructor kosong, wajib dibuat karena dilakukan overloading di bawahnya.
    public Sphere() {
        
    }

    // overloading constructor, memungkinkan pemberian input atribut radius dan mass saat instansiasi.
    public Sphere(double radius, double mass) {
        setRadius(radius);
        this.mass = mass;
    }
    
    // langkah untuk mengisi nilai mass. Penerapan enkapsulasi.
    public void setMass(double mass) {
        this.mass = mass;
    }

    // Merupakan override dari interface ThreeDimensional untuk mencari luas. Di dalamnya disesuaikan dengan bangun bola, rumusnya: 4 * 22/7 * r^2.
    @Override
    public double getSurfaceArea() {
        double phi = (double) PI_NUMERATOR/ PI_DENOMINATOR;
        return 4 * phi * Math.pow(getRadius(), 2);
    }

    // Juga override ThreeDimensional, untuk mencari volume. Rumus untuk bola adalah 4/3 * 22/7 * r^3.
    @Override
    public double getVolume() {
        double phi = (double) PI_NUMERATOR/ PI_DENOMINATOR;
        return 4.0 / 3 * phi * Math.pow(getRadius(), 3);
    }
    
    // override interface weightable. Rumusnya tetap g * mass.
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
