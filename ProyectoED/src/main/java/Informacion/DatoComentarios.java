package Informacion;
public class DatoComentarios {
    
    private String fecha;
    private String nombre;
    private String apellido;
    private int calificacion;
    private String comentario;
    
    public DatoComentarios(){
        this.fecha="";
        this.nombre="";
        this.apellido="";
        this.calificacion=0;
        this.comentario="";
    
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    
    
}
