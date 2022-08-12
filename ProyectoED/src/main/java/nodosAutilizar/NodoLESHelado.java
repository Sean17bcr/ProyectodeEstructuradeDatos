package nodosAutilizar;
import Informacion.DatoBatido;
public class NodoLESHelado {

    private DatoBatido elemento;
    private NodoLESHelado siguiente;

    public NodoLESHelado() {
        this.siguiente = null;
    }

    public DatoBatido getElemento() {
        return elemento;
    }

    public void setElemento(DatoBatido elemento) {
        this.elemento = elemento;
    }

    public NodoLESHelado getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLESHelado siguiente) {
        this.siguiente = siguiente;
    }


}
