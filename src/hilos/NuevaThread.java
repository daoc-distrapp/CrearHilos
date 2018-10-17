
package hilos;

/**
 *
 * @author dordonez@ute.edu.ec
 */
public class NuevaThread extends Thread {
    
    @Override
    public void run() {
        String nombre = Thread.currentThread().getName();
        for(int i = 0; i < 5; i++) {
            System.out.println("Thread : " + nombre + " : iteración : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }   
}
