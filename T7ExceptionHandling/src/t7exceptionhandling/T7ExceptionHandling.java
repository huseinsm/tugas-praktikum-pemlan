/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7exceptionhandling;

/**
 *
 * @author HUSEIN SIDHARTA
 */

import java.util.Scanner;

public class T7ExceptionHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Cek apakah nomor teleponmu merupakan kelipatan 5 atau bukan!");
        
        // variabel boolean sebagai acuan lanjut/ tidaknya program karena adanya exception.
        boolean isValid = false;
        
        // akan terus dijalankan sampai isValid bernilai true, karena telah mencapai isValid = true. Hal tsb berarti tidak ada exception.
        while(!isValid) {
            try {
                System.out.print("Masukkan no telp: ");
                // Tidak menggunakan scan.next() karena tidak bisa kosong sama sekali. scan.nextLine() akan menangkap enter sebagai input kosong.
                String input = scan.nextLine();
                if (input.isEmpty()) {
                    // akan dilempar ke exception IllegalArgumentException yang nantinya akan ditangkap di catch.
                    throw new IllegalArgumentException("No telp belum diisi!");
                }
                
                // mengubah no telp ke Long untuk dapat dioperasikan. Menggunakan Long agar dapat menampung angka dengan ukuran no telp (Integer tidak cukup).
                long noTelp = Long.parseLong(input);
                
                // logika pengecekan.
                if(noTelp % 5 == 0) {
                    System.out.println("No Telp mu merupakan kelipatan 5");
                } else {
                    System.out.println("No Telp mu tidak kelipatan 5");
                }
                
                // Menandakan tidak ada exception. While loop berhenti.
                isValid = true;
        
            }
            // Exception untuk input yang diberikan bukan angka.
            catch(NumberFormatException e) {
                System.out.println("\nError: Input harus berupa angka. Silakan coba lagi!\n");
            }
            // Exception untuk input kosong, dimana merupakan throw dari baris sebelumnya yang dilakukan di dalam pengkondisian.
            catch(IllegalArgumentException e) {
                System.out.println("\nError: " + e.getMessage() + "\n");
            }
            
        }
        
    }
    
}
