
package nodosAutilizar;
import Informacion.DatoLibro;

public class NodoDCLibro4 {
    private DatoLibro elemento4;
    private NodoDCLibro4 siguiente4;
    private NodoDCLibro4 anterior4;

    public NodoDCLibro4() {
        this.siguiente4 = null;
        this.anterior4 = null;
    }

    public DatoLibro getElemento4() {
        return elemento4;
    }

    public void setElemento4(DatoLibro elemento4) {
        this.elemento4 = elemento4;
    }

    public NodoDCLibro4 getSiguiente4() {
        return siguiente4;
    }

    public void setSiguiente4(NodoDCLibro4 siguiente4) {
        this.siguiente4 = siguiente4;
    }

    public NodoDCLibro4 getAnterior4() {
        return anterior4;
    }

    public void setAnterior4(NodoDCLibro4 anterior4) {
        this.anterior4 = anterior4;
    }
    
}
