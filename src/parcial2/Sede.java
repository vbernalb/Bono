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
public class Sede {

    protected String Nombre;
    protected String Direccion;
    protected int Telefono;
    protected int Area;
    protected ArrayList <Estudiante> estudiantes;
    protected ArrayList <ProgramaF> programas; 

    public Sede(String Nombre, String Direccion, int Telefono, int Area) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Area = Area;
        this.estudiantes = new ArrayList();
        this.programas = new ArrayList();
    }
    
    public void APrograma(String prog){
        ProgramaF p = new ProgramaF(prog);
        programas.add(p);
    }

    @Override
    public String toString() {
        return "Sede{" + "Nombre=" + Nombre + ", Direccion=" + Direccion + ", Telefono=" + Telefono + ", Area=" + Area + '}';
    }
 
    
    public String darInformacion(){
        return null;
    };
    
    public void prog(){
        for (ProgramaF prog: programas) {
            System.out.println(prog.toString());
        }
    }
            
}
