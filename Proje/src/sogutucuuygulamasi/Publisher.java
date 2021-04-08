/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sogutucuuygulamasi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hp
 */
public class Publisher implements ISubject {
     
    private List<IObserver> kullanicilar = new ArrayList<>();

        @Override
        public void attach(IObserver subscriber) {
            kullanicilar.add(subscriber);
        }

        @Override
        public void detach(IObserver subscriber) {
            kullanicilar.remove(subscriber);
        }

        @Override
        public void notify(String mesaj) {
            for(IObserver subscriber: kullanicilar) {
                subscriber.update(mesaj);
            }
        }
}
