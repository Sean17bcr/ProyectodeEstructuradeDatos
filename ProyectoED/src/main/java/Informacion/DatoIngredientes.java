package Informacion;
public class DatoIngredientes {
    
    private String idIngrediente;
    private String descripcion;
    private int cantidad;
    private String estado;
    
    public DatoIngredientes(){
    
        this.idIngrediente="";
        this.descripcion="";
        this.cantidad=0;
    
    }

    public String getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(String idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
