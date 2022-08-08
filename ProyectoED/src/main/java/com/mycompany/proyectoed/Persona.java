package com.mycompany.proyectoed;
public class Persona {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String nickname;
    private String contraseña;
    private byte estado;//INACTIVO O ACTIVO
    
    public Persona(String nombre, String apellido1, String apellido2, String nickname, String contraseña, byte estado) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nickname = nickname;
        this.contraseña = contraseña;
        this.estado = estado;
    }

    public Persona() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido2) {
        this.apellido1= apellido2;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String spellido2) {
        this.apellido2 = spellido2;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public byte getEstado() {
        return estado;
    }

    public void setEstado(byte estado) {
        this.estado = estado;
    }
    
}
