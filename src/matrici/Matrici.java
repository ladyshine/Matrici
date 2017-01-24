/*
 * Esempi di gestione delle matrici di interi.
 */

package matrici;

/**
 *
 * @author Pollachini Silvia
 */
public class Matrici {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Matrice m = new Matrice(3, 7);
        
        m.fillRandom();
        System.out.println(m);
      
        m.toFile("data/matrice.txt");
      
    }
    
}
