package Informacion;
public class DatoArbol {

    private String nombre;
    private String fecha;
    private String batido;
    private Double valor;
    private Double cantidad;
    private Double total;
    private String Cliente;

    public DatoArbol() {
        this.nombre = "";
        this.fecha = "";
        this.batido = "";
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

    public String getBatido() {
        return batido;
    }

    public void setBatido(String batido) {
        this.batido = batido;
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

}
