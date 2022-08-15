
package nodosAutilizar;
import Informacion.DatoLibro;

public class NodoDCLibro2 {
    private DatoLibro elemento2;
    private NodoDCLibro2 siguiente2;
    private NodoDCLibro2 anterior2;

    public NodoDCLibro2() {
        this.siguiente2 = null;
        this.anterior2 = null;
    }

    public DatoLibro getElemento2() {
        return elemento2;
    }

    public void setElemento2(DatoLibro elemento2) {
        this.elemento2 = elemento2;
    }

    public NodoDCLibro2 getSiguiente2() {
        return siguiente2;
    }

    public void setSiguiente2(NodoDCLibro2 siguiente2) {
        this.siguiente2 = siguiente2;
    }

    public NodoDCLibro2 getAnterior2() {
        return anterior2;
    }

    public void setAnterior2(NodoDCLibro2 anterior2) {
        this.anterior2 = anterior2;
    }
    
}
