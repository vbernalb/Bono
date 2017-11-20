/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

import java.util.ArrayList;

/**
 *
 * @author ESTUDIANTE
 */
public class Profesional extends Sede {

    private int NPACalidad;


    public Profesional(String Nombre, String Direccion, int Telefono, int Area , int npacalidad) {
        super(Nombre, Direccion, Telefono, Area);
        this.NPACalidad = npacalidad;

    }  
    
    @Override
    public String darInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String ProgTyEC(){
        return null;
    }
    
    
}
