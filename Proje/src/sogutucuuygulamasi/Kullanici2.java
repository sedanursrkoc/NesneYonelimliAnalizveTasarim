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
public class Kullanici2 implements IObserver  {
    @Override
    public void update(String mesaj){
        
        System.out.println("2 nolu kullanicimiz " + mesaj);
        
    }
}
