package bagniristorante;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Giorgio Del Rocca
 */
public class Bagno {
    long time=0; 
    public synchronized void Occupato() throws InterruptedException{
        System.out.println(Thread.currentThread().getName()+" è entrato in bagno");
        Thread.sleep((long)(Math.random()*8000));
        System.out.println(Thread.currentThread().getName()+" è uscito dal bagno");
    }
}