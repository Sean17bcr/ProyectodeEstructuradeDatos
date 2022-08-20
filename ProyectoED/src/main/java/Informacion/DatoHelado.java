package Informacion;
public class DatoHelado {

    private String helado;
    private String descripcion;
    private String ingredientes;
    private String estado;

    public DatoHelado() {
        this.helado = "";
        this.descripcion = "";
        this.ingredientes = "";
        this.estado = "";
    }

    public String getHelado() {
        return helado;
    }

    public void setHelado(String helado) {
        this.helado = helado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
