
package data;

import java.util.Arrays;

public class CD extends Soporte{
    private int duracion;
    private Genero genero;
    private Autor [] musicos;

    public CD(int duracion, Genero genero, Autor[] musicos, String titulo) {
        super(titulo);
        this.duracion = duracion;
        this.genero = genero;
        this.musicos = musicos;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Autor[] getMusicos() {
        return musicos;
    }

    public void setMusicos(Autor[] musicos) {
        this.musicos = musicos;
    }

    @Override
    public String toString() {
        return "CD{" +super.toString()+ "duracion=" + duracion + ", genero=" + genero + ", musicos=" + musicos[0].toString() + musicos[1].toString()+ '}';
    }

    

   
    
    
}
