package Informacion;
public class DatoBatido {

    private String batido;
    private String descripcion;
    private String ingredientes;
    private String estado;

    public DatoBatido() {
        this.batido = "";
        this.descripcion = "";
        this.ingredientes = "";
        this.estado = "";
    }

    public String getBatido() {
        return batido;
    }

    public void setBatido(String batido) {
        this.batido = batido;
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
