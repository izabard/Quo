package quo.quo;

/**
 * Created by Joel D. Jesus on 17/01/2017.
 */

public class Header {
    private String titulo;
    private String descripcion;

    public Header(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;

    }

    public String getTitulo() {

        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {

        this.descripcion = descripcion;
    }

}
