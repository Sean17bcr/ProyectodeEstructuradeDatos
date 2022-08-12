package nodosAutilizar;
import Informacion.DatoArbol;
public class NodoArbol {

    private DatoArbol elemento;
    private NodoArbol enlaceIzq;
    private NodoArbol enlaceDer;

    public NodoArbol() {
        this.enlaceIzq = null;
        this.enlaceDer = null;
    }

    public DatoArbol getElemento() {
        return elemento;
    }

    public void setElemento(DatoArbol elemento) {
        this.elemento = elemento;
    }

    public NodoArbol getEnlaceIzq() {
        return enlaceIzq;
    }

    public void setEnlaceIzq(NodoArbol enlaceIzq) {
        this.enlaceIzq = enlaceIzq;
    }

    public NodoArbol getEnlaceDer() {
        return enlaceDer;
    }

    public void setEnlaceDer(NodoArbol enlaceDer) {
        this.enlaceDer = enlaceDer;
    }

}
