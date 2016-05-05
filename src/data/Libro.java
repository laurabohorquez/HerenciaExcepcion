
package data;

public class Libro extends Soporte{
    private String isbn;
    
    public Libro(String isbn, String titulo) {
        super(titulo);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Libro{" + super.toString() +"isbn=" + isbn + '}';
    }
    
    
    
}
