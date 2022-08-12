package Informacion;
public class DatoCatalogoClientes {
    
    private String idCategoría;
    private String tipo;
    private boolean estado;
    
    public DatoCatalogoClientes(){
        this.idCategoría="";
        this.tipo="";
        this.estado=true;
    
    } 

    public String getIdCategoría() {
        return idCategoría;
    }

    public void setIdCategoría(String idCategoría) {
        this.idCategoría = idCategoría;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
