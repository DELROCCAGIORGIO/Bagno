/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagniristorante;

/**
 *
 * @author Giorgio Del Rocca
 */
public class BagniRistorante {
    public static void main(String[] args) throws InterruptedException{
      Bagno BagnoMaschi=new Bagno();
      Bagno BagnoFemmine=new Bagno();
      
      Thread thr1= new Thread(new Persone("Maschio",BagnoMaschi));
    thr1.setName("Giorgio");
    Thread thr2= new Thread(new Persone("Femmina",BagnoFemmine));
    thr2.setName("Alessia");
    thr1.start();
    thr2.start();
    }
    
}
