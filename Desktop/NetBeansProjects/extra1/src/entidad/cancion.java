/*
 D
además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y
otro que reciba como parámetros el titulo y el autor de la canción. 
 */
package entidad;

/**
 *
 * @author Admin
 */
public class cancion {
    private String titulo;
    private String autor;

    public cancion() {
    }

    public cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    //GET
    
    public String getTitulo() {
       return titulo;
    }

    public String getAutor() {
        return autor;
    }
    
    //SET

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
}
