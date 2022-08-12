package nodosAutilizar;
import Informacion.DatoIngredientes;
public class NodoDCingredientes {
    
    private DatoIngredientes elemento;
    private NodoDCingredientes siguiente;
    private NodoDCingredientes anterior;

    public NodoDCingredientes() {
        this.siguiente = null;
        this.anterior = null;
    }

    public DatoIngredientes getElemento() {
        return elemento;
    }

    public void setElemento(DatoIngredientes elemento) {
        this.elemento = elemento;
    }

    public NodoDCingredientes getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDCingredientes siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDCingredientes getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDCingredientes anterior) {
        this.anterior = anterior;
    }


    
    
}
