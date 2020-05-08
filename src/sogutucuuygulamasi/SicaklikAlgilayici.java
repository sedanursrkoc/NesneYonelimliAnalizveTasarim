/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sogutucuuygulamasi;

import java.util.Random; 

/**
 *
 * @author Hp
 */
public class SicaklikAlgilayici implements ISicaklikAlgilayici{
    
    private int sicaklik;
     
    public SicaklikAlgilayici(){
        Random rand = new Random();
        sicaklik = rand.nextInt(50); 
    }
    
    public int SicaklikDondur(){
        return sicaklik;
    }
}
