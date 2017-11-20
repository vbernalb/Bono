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
public class EContinuada extends Sede {

    private String CPopular;
    private ArrayList <Estudiante> estudiantes;
    private ArrayList <ProgramaF> programas; 

    public EContinuada(String Nombre, String Direccion, int Telefono, int Area, String cpopular) {
        super(Nombre, Direccion, Telefono, Area);
        this.CPopular = cpopular;
    }


    
    
    
    @Override
    public String darInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
