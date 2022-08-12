package nodosAutilizar;
import Informacion.DatoRegistro;
public class NodoCregistro {

    private DatoRegistro elemento;
    private NodoCregistro siguiente;

    public NodoCregistro() {
        this.siguiente = null;
    }

    public DatoRegistro getElemento() {
        return elemento;
    }

    public void setElemento(DatoRegistro elemento) {
        this.elemento = elemento;
    }

    public NodoCregistro getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCregistro siguiente) {
        this.siguiente = siguiente;
    }

}
