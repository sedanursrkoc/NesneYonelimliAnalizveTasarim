/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sogutucuuygulamasi;

/**
 *
 * @author Hp
 */
public class SogutucuUygulamasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kullanici1 k1 = new Kullanici1();
        Kullanici2 k2 = new Kullanici2();

        Publisher p = new Publisher();

        p.attach(k1);
        p.attach(k2);
       // p.notify("uygulamamiz güncellendi...");
        
       Sogutucu basla = new Sogutucu();
    }
    
}
