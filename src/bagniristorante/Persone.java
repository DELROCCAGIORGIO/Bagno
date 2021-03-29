package bagniristorante;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Giorgio Del Rocca
 */
public class Persone implements Runnable {
    public String sesso;
    private Bagno bagno;
    
    public Persone(String sesso, Bagno bagno) {
        this.sesso=sesso;
        this.bagno = bagno;
    }
    
    @Override
    public void run() {
        try {
            bagno.Occupato();
        } catch (InterruptedException ex) {
            Logger.getLogger(Persone.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}