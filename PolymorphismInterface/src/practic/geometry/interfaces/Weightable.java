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

// Weightable memberi nilai untuk atribut g (percepatan grafitasi) dan sebuah method untuk mendapatkan berat. Bangun-bangun ruang yang mengimplementasi harus melakukan override thd seluruh method yang ada.
public interface Weightable {
    
    // atribut g, berisi nilai percepatan gravitasi. Pada interface, setiap atribut akan menjadi konstanta, yaitu public static final. Dapat dipanggil/diakses dengan menyebut nama interface + titik + nama atribut.
    double g = 9.8;
    
    // merupakan template untuk bangun ruang menghitung berat.
    double getWeight();
}
