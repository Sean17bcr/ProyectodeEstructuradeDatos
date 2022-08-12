package nodosAutilizar;
import Informacion.DatoCatalogoClientes;
public class NodoLESCatalogoClientes {
    
    private DatoCatalogoClientes elemento;
    private NodoLESCatalogoClientes siguiente;

    public NodoLESCatalogoClientes() {
        this.siguiente = null;
    }

    public DatoCatalogoClientes getElemento() {
        return elemento;
    }

    public void setElemento(DatoCatalogoClientes elemento) {
        this.elemento = elemento;
    }

    public NodoLESCatalogoClientes getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLESCatalogoClientes siguiente) {
        this.siguiente = siguiente;
    }

 

    
    
}
