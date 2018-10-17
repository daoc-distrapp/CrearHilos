/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author dordonez@ute.edu.ec
 * @throws java.lang.InterruptedException
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        String nombre = Thread.currentThread().getName();
        
        NuevaThread nt = new NuevaThread();
        nt.start();
        //Thread nr = new Thread(new NuevaRunnable());
        //nr.start();
        
        for(int i = 0; i < 5; i++) {
            System.out.println("Thread : " + nombre + " : iteración : " + i);
            Thread.sleep(500);
        }
        
    }    
}
