package com.mycompany.proyectoed;
public class NodoUsuario {
    private Persona datos;
    private NodoUsuario siguiente;

    public NodoUsuario() {
    }
    
    public NodoUsuario(Persona datos, NodoUsuario siguiente) {
        this.datos = datos;
        this.siguiente = siguiente;
    }
    
    public Persona getDatos() {
        return datos;
    }

    public void setDatos(Persona datos) {
        this.datos = datos;
    }

    public NodoUsuario getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoUsuario siguiente) {
        this.siguiente = siguiente;
    }
}
