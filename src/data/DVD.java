
package data;

public class DVD extends Soporte {
    
    private int duracion;
    private Autor [] actores;

    public DVD(int duracion, Autor[] actores, String titulo, Autor autor) {
        super(titulo);
        this.duracion = duracion;
        this.actores = actores;
        super.setAutor(autor);
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Autor[] getActores() {
        return actores;
    }

    public void setActores(Autor[] actores) {
        this.actores = actores;
    }

    @Override
    public String toString() {
        return "DVD{"+super.toString() + "duracion=" + duracion + ", actores=" + actores[0].toString() + actores[1].toString()+'}';
    }
    
    
    
    
}
