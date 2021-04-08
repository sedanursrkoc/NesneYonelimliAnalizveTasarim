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
public class AgArayuzu {
    public AgArayuzu() {
        
        int secim = 1;
        MerkeziIslemBirimi merkeziIslemBirimi = new MerkeziIslemBirimi();
        do{ //Çıkış işlemi seçilene kadar programın devam etmesi için koşullu döngü
                Scanner reader = new Scanner(System.in);

        System.out.println("[1] Sogutucuyu ac");
        System.out.println("[2] Sogutucuyu kapat");
        System.out.println("[3] Sıcaklik goruntule");
        System.out.println("[4] Cikis yap");
        System.out.print("Secim:");
        secim = reader.nextInt();
        
       
        switch(secim){ //Menüden seçilen işleme göre gerekli işlemlerin gerçekleştirilmesi  
            case 1:
                if(merkeziIslemBirimi.SogutucuAcikMi()){ //Soğutucu zaten açık mi diye kontrol ediliyor
                    System.out.println("Sogutucu zaten acik...\n");
                }
                else merkeziIslemBirimi.EyleyiciCalistir("Ac");
            break;
            case 2:
                if(merkeziIslemBirimi.SogutucuKapaliMi()){ //Soğutucu zaten kapalı mı diye kontrol ediliyor
                    System.out.println("Sogutucu zaten kapali...\n");
                }
                else merkeziIslemBirimi.EyleyiciCalistir("Kapat");         
            break;
            case 3:
                SicaklikAlgilayici sicaklik = new SicaklikAlgilayici();
                 System.out.println("Sicaklik algilaniyor...");
                try {
                    // thread to sleep for 1000 milliseconds
                    Thread.sleep(1500);
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.print("Sicaklik: ");
                System.out.print(sicaklik.SicaklikDondur());
                System.out.println("°C\n");
                
            break;
            case 4:
                break;
            default:
                System.out.println("Yanlis tercih!\n");
            break;
        }

        }while(secim != 4);
    }
}
