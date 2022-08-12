package Informacion;
public class DatoClientes {
    private String codCliente;
    private String Nombre;
    private String Apellidos;
    private String direccion;
    private String email;
    private int Telefono;
    private String estado;

    public DatoClientes() {
        this.codCliente = "";
        this.Nombre = "";
        this.Apellidos = "";
        this.email= "";
        this.direccion = "";
        this.Telefono = 0;
        this.estado= "";
    
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
    

