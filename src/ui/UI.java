
package ui;

import Exception.LibroException;
import data.Soporte;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import servicio.ServicioSoporte;

public class UI {
    private Scanner sc ;
    private ServicioSoporte servicio;
    
    
    public UI(){
      this.sc = new Scanner(System.in);
      this.servicio = new ServicioSoporte();
    }
         
    public void imprimirSoportes(ArrayList<Soporte> soportes){
        if(soportes != null){
          for(Soporte soporte: soportes){
              System.out.println(soporte);
          }
        }else{
            System.out.println("No existen soportes actualmente");
        }
   }
    
    public void menu(){
        int opcion = 0;     
        System.out.println("Bienvenido a la mediateca");
        System.out.println("Opciones. 1. Cargar datos 2. Imprimir. 3.Buscar titulo");
        opcion = this.sc.nextInt();
        if(opcion == 1){
           System.out.println("Nombre del archivo: ");
           String rutaArchivo =   sc.next();
            try {
                this.servicio.cargarSoportes(rutaArchivo);
            } catch (FileNotFoundException ex) {
                System.out.println("El archivo especificado no existe");
            } catch (LibroException ex) {
                System.out.println(ex.getMessage());
            }
        }
        else if(opcion == 2){
           ArrayList<Soporte> soportes = this.servicio.getSoportes();
           this.imprimirSoportes(soportes);
        } else if(opcion==3){
                Scanner lectura= new Scanner(System.in);
                System.out.println("Ingrese el Titulo");
                String titulo=lectura.next();
                Soporte soporte=this.servicio.buscar(titulo);
                if(soporte!=null)
                    System.out.println(soporte);
                else{
                    System.out.println("No existe");
                }
          }else{
            System.out.println("Opción inválida");
        }
    }
}
    
   
