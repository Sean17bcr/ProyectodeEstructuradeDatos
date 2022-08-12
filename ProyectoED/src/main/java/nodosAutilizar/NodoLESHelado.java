package nodosAutilizar;
import Informacion.DatoHelado;
public class NodoLESHelado {

    private DatoHelado elemento;
    private NodoLESHelado siguiente;

    public NodoLESHelado() {
        this.siguiente = null;
    }

    public DatoHelado getElemento() {
        return elemento;
    }

    public void setElemento(DatoHelado elemento) {
        this.elemento = elemento;
    }

    public NodoLESHelado getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLESHelado siguiente) {
        this.siguiente = siguiente;
    }


}
