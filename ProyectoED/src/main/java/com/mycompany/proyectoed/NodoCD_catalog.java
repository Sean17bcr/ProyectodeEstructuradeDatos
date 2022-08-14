
package com.mycompany.proyectoed;

public class NodoCD_catalog {
    
    private catalog_item elemento;
    private NodoCD_catalog siguiente;
    private NodoCD_catalog anterior;

    public NodoCD_catalog() {
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public catalog_item getElemento() {
        return elemento;
    }

    public void setElemento(catalog_item elemento) {
        this.elemento = elemento;
    }

    public NodoCD_catalog getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCD_catalog siguiente) {
        this.siguiente = siguiente;
    }

    public NodoCD_catalog getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoCD_catalog anterior) {
        this.anterior = anterior;
    }
    
    

    
    
    
}
