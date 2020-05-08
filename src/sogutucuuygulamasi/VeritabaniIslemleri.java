/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sogutucuuygulamasi;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;


/**
 *
 * @author Hp
 */
public class VeritabaniIslemleri {
    
    private static VeritabaniIslemleri instance;
    ArrayList<String> kullaniciadlari = new ArrayList<String>();
    ArrayList<String> kullanicisifreleri = new ArrayList<String>();
    ArrayList<String> kullanicinolari = new ArrayList<String>();

    private VeritabaniIslemleri()
    {
        try
        {   /***** Bağlantı kurulumu *****/ // Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Sogutucu",
                    "postgres", "admin");
            if (conn != null)
                System.out.println("Veritabanına bağlandı!");
            else
                System.out.println("Bağlantı girişimi başarısız!");


            String sql= "SELECT \"kullaniciNo\", \"kullaniciAdi\", \"sifre\"  FROM \"Internet_Kullanicisi\"";

            /***** Sorgu çalıştırma *****/
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            /***** Bağlantı sonlandırma *****/
            conn.close();

            String kullaniciNo= null;
            String kullaniciAdi=null;
            String sifre;

            while(rs.next())
            {
                /***** Kayda ait alan değerlerini değişkene ata *****/
                kullaniciNo  = rs.getString("kullaniciNo");
                kullaniciAdi = rs.getString("kullaniciAdi");
                sifre = rs.getString("sifre");
                
                kullanicinolari.add(kullaniciNo);
                kullaniciadlari.add(kullaniciAdi);
                kullanicisifreleri.add(sifre);
            }
            
            /***** Kaynakları serbest bırak *****/
            rs.close();
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
            
    }
    
    public static synchronized VeritabaniIslemleri getInstance(){

        if(instance==null) instance = new VeritabaniIslemleri();

        return instance;

    }
    
    public ArrayList<String> KullaniciNoDondur(){
        return kullanicinolari;
    }
    

    public boolean KullaniciDogrula(String kullaniciAdi, String sifre) {
        System.out.println("Kullanıcı doğrulanıyor...");
        try {
            Thread.sleep(1500);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Veritabanına bağlandı ve kullanıcı hesap bilgilerini aldı...");
        try {
            Thread.sleep(1500);
        } catch (Exception e) {
            System.out.println(e);
        }
        //Veritabanındaki veriler ile kullanıcıdan alınan veriler karşılaştırılarak kullanıcı doğrulama işlemi yapılıyor
        for (int i = 0; i < kullaniciadlari.size(); i++) {
            if ((kullaniciadlari.get(i).equals(kullaniciAdi) && kullanicisifreleri.get(i).equals(sifre)) ) {
                System.out.println("Kullanici dogrulandi...\n");
                return true;
            }
        }
        System.out.println("Kullanici dogrulanamadi...\n");
        return false;
    }
    
}

