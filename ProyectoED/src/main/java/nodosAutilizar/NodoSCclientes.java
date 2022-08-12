package nodosAutilizar;
import Informacion.DatoClientes;
public class NodoSCclientes {
    
    private DatoClientes elemento;
    private NodoSCclientes siguiente;

    public NodoSCclientes() {
        this.siguiente = null;
    }

    public DatoClientes getElemento() {
        return elemento;
    }

    public void setElemento(DatoClientes elemento) {
        this.elemento = elemento;
    }

    public NodoSCclientes getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSCclientes siguiente) {
        this.siguiente = siguiente;
    }


    
}
