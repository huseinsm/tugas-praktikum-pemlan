/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

// bagian dari package yang berisi interface
package practic.geometry.interfaces;

/**
 *
 * @author HUSEIN SIDHARTA
 */

// interface ini akan menjadi template untuk bangun ruang. Karena interface, maka bangun-bangun ruang yang mengimplementasi harus melakukan override thd seluruh method yang ada.
public interface ThreeDimensional {
    // method di interface akan secara otomatis merupakan public abstract. Sehingga dapat hanya ditulis tipe data dan nama method, juga tanpa implementasi.
    
    // method sebagai template untuk menghitung luas permukaan dan memberikan hasilnya. Nantinya akan disesuikan oleh turunan-turunannya.
    double getSurfaceArea();
    
    // method sebagai template untuk menghitung volume bangun dan memberikan hasilnya.
    double getVolume();
}
