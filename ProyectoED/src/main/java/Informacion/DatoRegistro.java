package Informacion;
public class DatoRegistro {

    private String nombre;
    private String apellidos;
    private String nickname;
    private String password;
    private String estado;

    public DatoRegistro() {
        this.nombre = "";
        this.apellidos = "";
        this.nickname = "";
        this.password = "";
        this.estado ="";

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }







}
