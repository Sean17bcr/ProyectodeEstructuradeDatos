package nodosAutilizar;
import Informacion.DatoArbol;
public class Nodo2Arbol {

    private DatoArbol elemento;
    private Nodo2Arbol enlaceIzq;
    private Nodo2Arbol enlaceDer;

    public Nodo2Arbol() {
        this.enlaceIzq = null;
        this.enlaceDer = null;
    }

    public DatoArbol getElemento() {
        return elemento;
    }

    public void setElemento(DatoArbol elemento) {
        this.elemento = elemento;
    }

    public Nodo2Arbol getEnlaceIzq() {
        return enlaceIzq;
    }

    public void setEnlaceIzq(Nodo2Arbol enlaceIzq) {
        this.enlaceIzq = enlaceIzq;
    }

    public Nodo2Arbol getEnlaceDer() {
        return enlaceDer;
    }

    public void setEnlaceDer(Nodo2Arbol enlaceDer) {
        this.enlaceDer = enlaceDer;
    }

}
