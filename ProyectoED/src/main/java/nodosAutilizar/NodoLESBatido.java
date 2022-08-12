package nodosAutilizar;
import Informacion.DatoBatido;
public class NodoLESBatido {

    private DatoBatido elemento;
    private NodoLESBatido siguiente;

    public NodoLESBatido() {
        this.siguiente = null;
    }

    public DatoBatido getElemento() {
        return elemento;
    }

    public void setElemento(DatoBatido elemento) {
        this.elemento = elemento;
    }

    public NodoLESBatido getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLESBatido siguiente) {
        this.siguiente = siguiente;
    }


}
