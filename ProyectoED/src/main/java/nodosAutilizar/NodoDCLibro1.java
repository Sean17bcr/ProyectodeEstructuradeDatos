
package nodosAutilizar;
import Informacion.DatoLibro;

public class NodoDCLibro1 {
    
    private DatoLibro elemento1;
    private NodoDCLibro1 siguiente1;
    private NodoDCLibro1 anterior1;

    public NodoDCLibro1() {
        this.siguiente1 = null;
        this.anterior1 = null;
    }

    public DatoLibro getElemento1() {
        return elemento1;
    }

    public void setElemento1(DatoLibro elemento1) {
        this.elemento1 = elemento1;
    }

    public NodoDCLibro1 getSiguiente1() {
        return siguiente1;
    }

    public void setSiguiente1(NodoDCLibro1 siguiente1) {
        this.siguiente1 = siguiente1;
    }

    public NodoDCLibro1 getAnterior1() {
        return anterior1;
    }

    public void setAnterior1(NodoDCLibro1 anterior1) {
        this.anterior1 = anterior1;
    }
    
}
