/*
 * Matrice: una classe wrapper
 * per una matrice bidimensionale di interi.
 */

package matrici;

import java.io.FileWriter;

/**
 *
 * @author Pollachini Silvia
 */
public class Matrice {
     FileWriter file;
    int[][] theMatrix;
    
    
    
    
    // costruttore uno
    public Matrice(int x, int y) {
        theMatrix = new int[x][y];
    }
    
    // costruttore due
    public Matrice(int[][] m) {
        theMatrix = m;
    }
    
    public void fillRandom() {
        for(int i= 0; i < theMatrix.length; i++){
            for(int j = 0; j< theMatrix[i].length; j++){
                theMatrix[i][j] = (int)(Math.random()*10);
                
            }
       
        }
    }

    @Override
    public String toString() {
        String ordinazione = "";
        for(int i= 0; i < theMatrix.length; i++){
            for(int j = 0; j< theMatrix[i].length; j++){
                ordinazione += "\n";
                    ordinazione = ordinazione + "["+i+"]"+"["+j+"] =" + theMatrix[i][j] + "\t";
                }
                
            }
       
        
        return ordinazione;
    }

    public void toFile( String filename ) {
        try{
            file = new FileWriter(filename);
            for(int i= 0; i < theMatrix.length; i++){
                for(int j = 0; j< theMatrix[i].length; j++){
                      file.write("["+i+"]"+"["+j+"] =" + theMatrix[i][j] + "\t");                   
                
                }
                file.write("\n");
            }
            file.close();
        }
        catch(Exception ex){
            System.out.println("Errore: " + ex.getMessage());
        }
    }

    public void fromFile( String filename ) {
        
    }
    
}

