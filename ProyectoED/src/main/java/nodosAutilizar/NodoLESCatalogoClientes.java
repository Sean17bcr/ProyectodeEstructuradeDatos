package nodosAutilizar;
import Informacion.Empleados;
public class NodoLESCatalogoClientes {
    
    private Empleados elemento;
    private NodoLESCatalogoClientes siguiente;

    public NodoLESCatalogoClientes() {
        this.siguiente = null;
    }

    public Empleados getElemento() {
        return elemento;
    }

    public void setElemento(Empleados elemento) {
        this.elemento = elemento;
    }

    public NodoLESCatalogoClientes getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLESCatalogoClientes siguiente) {
        this.siguiente = siguiente;
    }

 

    
    
}
