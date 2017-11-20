/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author ESTUDIANTE
 */
public class Parcial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        Universidad u = new Universidad();
        Logic logica = new Logic();
        File file = new File("Sedes.txt");
         System.out.println(logica.darInformacion("Sedes.txt"));
         logica.loadFile("Sedes.txt");
         
         //En logica están las funciones, la que permite cargar la informacion del archivo, y la que imprime toda 
         //la informacion de las sedes
    }
    
}
