/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sogutucuuygulamasi;

import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Hp
 */
public class Sogutucu {

    /**
     * @param args the command line arguments
     */

    public Sogutucu() {    
        String kullaniciAdi;
        String sifre;
        boolean giris = false;
        do{
            Scanner reader = new Scanner(System.in);
            System.out.print("Kullanici Adi: ");
            kullaniciAdi = reader.next();
            System.out.print("Sifre: ");
            sifre = reader.next();
            if (VeritabaniIslemleri.getInstance().KullaniciDogrula(kullaniciAdi, sifre)) {
                AgArayuzu arayuz = new AgArayuzu();
                giris = true;
            }
        }while(!giris);
         
    }
    
}
