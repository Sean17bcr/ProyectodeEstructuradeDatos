package Informacion;

public class Empleados {

    private String nombreEmpleado;
    private String idEmpleado;
    private String salario;

    public Empleados() {
        this.nombreEmpleado = "";
        this.idEmpleado = "";
        this.salario = "";

    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

}
