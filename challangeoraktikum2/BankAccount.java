/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package challangeoraktikum2;
/**
 *
 * @author HUSEIN SIDHARTA
 */
public class BankAccount {
    public String noRek, namaPemilik;
    public double saldo;
    
    public BankAccount(String noRek, String namaPemilik, double saldo) {
        this.noRek = noRek;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }
    
    public BankAccount(String noRek, String namaPemilik) {
        this.noRek = noRek;
        this.namaPemilik = namaPemilik;
        saldo = 0.0;
    }
    
    public void displayInfo() {
        System.out.println("Berikut adalah detail informasi akun anda: \nNomor Rekening:\t" + noRek + "\nNama Pemilik:\t" + namaPemilik + "\nsaldo:\t" + saldo);
        System.out.println();
    }
    
    public void deposit(double nominal) {
        if(nominal <= 0) {
            System.out.println("nominal harus lebih dari 0!\n");
        } else {
            saldo += nominal;
            System.out.println("nominal sebesar " + nominal + " berhasil ditambahkan\n");
        }
        
    }
    
    public void withdraw(double nominal) {
        if(nominal <= 0) {
            System.out.println("nominal penarikan minimal 1\n");
        } else if(saldo < nominal) {
            System.out.println("saldo anda tidak mencukupi jumlah penarikan\n");
        } else {
            saldo -= nominal;
            System.out.println("penarikan berhasil. Saat ini saldo Anda adalah " + saldo + "\n");
        }
    }
    
    public void transfer(BankAccount receiver, double nominal) {
        if(nominal < 0) {
            System.out.println("nominal harus lebih dari 0\n");
        } else if (nominal > saldo) {
            System.out.println("saldo anda tidak mencukupi\n");
        } else {
            receiver.saldo += nominal;
            saldo -= nominal;
            
            System.out.println("Transaksi transfer berhasil. saldo Anda saat ini " + saldo + "\n");
        }
    }
    
    
    
}
