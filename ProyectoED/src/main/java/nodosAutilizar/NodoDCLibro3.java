
package nodosAutilizar;
import Informacion.DatoLibro;

public class NodoDCLibro3 {
    private DatoLibro elemento3;
    private NodoDCLibro3 siguiente3;
    private NodoDCLibro3 anterior3;

    public NodoDCLibro3() {
        this.siguiente3 = null;
        this.anterior3 = null;
    }

    public DatoLibro getElemento3() {
        return elemento3;
    }

    public void setElemento3(DatoLibro elemento3) {
        this.elemento3 = elemento3;
    }

    public NodoDCLibro3 getSiguiente3() {
        return siguiente3;
    }

    public void setSiguiente3(NodoDCLibro3 siguiente3) {
        this.siguiente3 = siguiente3;
    }

    public NodoDCLibro3 getAnterior3() {
        return anterior3;
    }

    public void setAnterior3(NodoDCLibro3 anterior3) {
        this.anterior3 = anterior3;
    }
    
}
