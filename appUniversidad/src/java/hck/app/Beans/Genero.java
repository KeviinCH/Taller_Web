package hck.app.Beans;

public class Genero {
    private int cod_genero;
    private String descripcion;

    public Genero() {
    }

    public Genero(int cod_genero, String descripcion) {
        this.cod_genero = cod_genero;
        this.descripcion = descripcion;
    }

    public Genero(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCod_genero() {
        return cod_genero;
    }

    public void setCod_genero(int cod_genero) {
        this.cod_genero = cod_genero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
