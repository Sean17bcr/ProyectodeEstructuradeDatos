package Informacion;
public class DatoArbol {

    private String nombre;
    private String fecha;
    private String helado;
    private Double valor;
    private Double cantidad;
    private Double total;
    private String Cliente;

    public DatoArbol() {
        this.nombre = "";
        this.fecha = "";
        this.helado = "";
        this.valor = 300.0;
        this.cantidad = 0.0;
        this.total = 0.0;
        this.Cliente = "";

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String gethelado() {
        return helado;
    }

    public void sethelado(String helado) {
        this.helado = helado;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String cliente) {
        Cliente = cliente;
    }

    public void setHelado(String showInputDialog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getHelado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
