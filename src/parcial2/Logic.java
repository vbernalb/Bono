/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import parcial2.Sede;

/**
 *
 * @author ESTUDIANTE
 */
public class Logic {
    
    private Universidad un;

    public Logic() {
        this.un = new Universidad();
    }
    
    
    public int cambiar(String a){ // PASA DE STRING A ENTERO
        Integer b = 0;
        int nuevo = b.parseInt(a);
        return nuevo;
    }
    
  
    
    public void loadFile(String path) throws FileNotFoundException, IOException{ 
      File read = new File(path);
      Scanner flow = new Scanner(read);
      flow.useDelimiter(",");
      String type = null;
      String Nombre = null;
      String Direccion = null;
      String Telefono = null;
      String Area = null;
      
      String PAC = null; //PARA PROFESIONAL
      String NE = null; //PARA TECOLOGICA
      String CP = null; //PARA ECONTINUADA
      
      while (flow.hasNextLine()) {
         type = flow.next();
          System.out.println(type + " ESTA ES LA LETRA DE LA SEDE");
          
          if(type.equals("P") || type.equals("T") || type.equals("E")){

             if(type.equals("P")){
            System.out.println("entrooo1");
            Nombre = flow.next();
            Direccion = flow.next();
            Telefono = flow.next();
            int tel = cambiar(Telefono);
            Area = flow.next();
            int area = cambiar(Area);
            PAC = flow.next();
            int pac = cambiar(PAC);
            Profesional p = new Profesional(Nombre, Direccion, tel, area, pac);
            
            flow.nextLine();
            while(flow.hasNext()){
                String prog = flow.next();
                if(prog.equals("#")){
                    break;
                }else{
                    p.APrograma(prog);
                    System.out.println(prog);
                }
            }
            flow.nextLine();
            un.addSede(p);


             
            } if(type.equals("T")){
                System.out.println("entrooo2");
               Nombre = flow.next();
               Direccion = flow.next();
               Telefono = flow.next();
               int tel = cambiar(Telefono);
               Area = flow.next();
               int area = cambiar(Area);
               NE = flow.next();
               int ne = cambiar(NE);
                Tecnologica t = new Tecnologica(Nombre, Direccion, tel, area, ne);

                
                flow.nextLine();
                while(flow.hasNext()){
                    String prog = flow.next();
                    if(prog.equals("#")){
                        break;
                    }else{
                        t.APrograma(prog);
                        System.out.println(prog);
                    }
                }
                flow.nextLine();
                un.addSede(t);

            }if(type.equals("E")){
                System.out.println("entrooo3");
               Nombre = flow.next();
               Direccion = flow.next();
               Telefono = flow.next();
               int tel = cambiar(Telefono);
               Area = flow.next();
               int area = cambiar(Area);
               CP = flow.next();
                EContinuada e = new EContinuada(Nombre, Direccion, tel, area, CP);
                
                flow.nextLine();
                while(flow.hasNext()){
                    String prog = flow.next();
                    if(prog.equals("#")){
                        break;
                    }else{
                        e.APrograma(prog);
                        System.out.println(prog);
                    }
                }
                flow.nextLine();
                un.addSede(e);
         }
            

            
            
          }else{
              if(flow.hasNextLine()){
              flow.nextLine();
              }else{
                  break;
              }
          }
       }
    }
    
    
    public String darInformacion(String path) throws FileNotFoundException{ //PERMITE LISTAR TODOS LOS ELEMENTOS DEL ARCHIVO, Y POR TANTO, DE TODAS LAS SEDES
        File file = new File(path);
        Scanner leer = new Scanner(file);
        String dato = "";
        while(leer.hasNextLine()){
            dato += leer.nextLine() + "\n";
        }
        return dato;
    }
    
}
