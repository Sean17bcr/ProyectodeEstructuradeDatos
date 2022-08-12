package nodosAutilizar;
import Informacion.DatoRegistro;
public class NodoES {

    private DatoRegistro elemento;
    private NodoES siguiente;

    public NodoES() {
        this.siguiente = null;
    }

    public DatoRegistro getElemento() {
        return elemento;
    }

    public void setElemento(DatoRegistro elemento) {
        this.elemento = elemento;
    }

    public NodoES getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoES siguiente) {
        this.siguiente = siguiente;
    }
    
    

}
