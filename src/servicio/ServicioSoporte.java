
package servicio;

import Exception.LibroException;
import dao.Dao;
import data.Soporte;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ServicioSoporte {
    private Dao dao;
    private ArrayList<Soporte> soportes = null; //Debe ser mejorado notablemente.
    public ServicioSoporte(){
      this.dao = new Dao();
     }
    
    public void cargarSoportes(String archivo) throws FileNotFoundException, LibroException{
       this.soportes = this.dao.cargarSoportes(archivo);
    }
    
    public ArrayList<Soporte> getSoportes(){
      return this.soportes;
    }
    
    public Soporte buscar(String titulo){
        for(Soporte soporte:this.soportes){
            if (soporte.getTitulo().equalsIgnoreCase(titulo)) 
                return soporte;
        }
        return null;
    }
   
    
}
