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

// merupakan abstract class yang mendasar/ menjadi parent bagi bangun-bangun yang bersifat lingkaran. Abstract class ini juga merupakan turunan dari abstract class shape yang berarti akan mewarisi atribut dan method (yang tidak private) dari class tsb.
public abstract class CircularShape extends Shape {
    
    // diset privae untuk memastikan proteksi program (enkapsulasi).
    private double radius;
    
    // deklarasi pembilang dan penyebut dari phi. diset final karena nilainya telah menjadi kesepakatan yang ilmiah (tidaj akan berubah). Bertipa protected.
    final protected int PI_NUMERATOR = 22;
    final protected int PI_DENOMINATOR = 7;
    
    // Constructor kosong dari absract class, yang berarti sama dengan constructor default.
    public CircularShape() {
    
    }
    
    // setter dari atribut private radius. Menjadi langkah untuk mengisikan nilai dari atribut radius (tidak secara langsung).
    public void setRadius(double inputRadius) {
        this.radius = inputRadius;
    }
    
    // getter dari radius. Bertipe double, menyesuaikan tipe data dari atribut radius.
    public double getRadius() {
        return radius;
    }
    
}
