/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package challangeoraktikum2;

/**
 *
 * @author HUSEIN SIDHARTA
 */
public class Challangeoraktikum2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BankAccount akun1 = new BankAccount("14742", "Husein", 30000);
        BankAccount akun2 = new BankAccount("13962", "Sidharta");
        
        akun1.displayInfo();
        
        akun2.displayInfo();
        
        akun2.deposit(-2);
        
        akun1.withdraw(7000);
        akun2.deposit(32000);
        
        akun1.displayInfo();
        akun2.displayInfo();
        
        akun1.transfer(20000);
    }
    
}
