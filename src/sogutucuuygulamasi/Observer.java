/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sogutucuuygulamasi;

import java.util.*;

/**
 *
 * @author Hp
 */
public class Observer implements IObserver  {
    @Override
    public void update(String mesaj){
        ArrayList<String> gecici =  new ArrayList<String>();
        gecici = VeritabaniIslemleri.getInstance().KullaniciNoDondur();
        
        for (int i = 0; i < gecici.size(); i++) {
            System.out.println(gecici.get(i) + " nolu kullanicimiz " + mesaj);
        }
    }
}
