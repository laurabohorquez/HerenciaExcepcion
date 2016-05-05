
package data;

public class Genero {
    private String tipo;

    public Genero(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Genero{" + "tipo=" + tipo + '}';
    }
    
    
}
