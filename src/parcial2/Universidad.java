/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author ESTUDIANTE
 */
public class Universidad {
    
    private ArrayList <Sede> sedes;

    public Universidad() {
        this.sedes = new ArrayList();
    }
    
    public boolean addSede(Sede sede){
        return sedes.add(sede);
    }
    
    public void verprog(){
        for (Sede sede : sedes) {
            sede.prog();
        }
    }
    
    public void verinfo(){
        for (Sede sede : sedes) {
            System.out.println(sede.toString());
            
        }
    }
    
}
