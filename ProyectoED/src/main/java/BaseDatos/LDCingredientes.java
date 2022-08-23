package BaseDatos;
import nodosAutilizar.NodoDCingredientes;
import Informacion.DatoIngredientes;
import javax.swing.JOptionPane;
public class LDCingredientes {

    private NodoDCingredientes inicio;
    private NodoDCingredientes fin;
    private int cantidadNodos;
    public LDCingredientes() {
        this.inicio = null;
        this.fin = null;
        this.cantidadNodos = 0;
    }

    public boolean esVaciaDC() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void agregarDC() {
        int contador=0;
        String ingrediente = "";
        DatoIngredientes dc = new DatoIngredientes();
        boolean encontrado = false;
        ingrediente = (JOptionPane.showInputDialog(null, "Ingrese el ID del ingrediente: "));
        NodoDCingredientes aux = inicio;

        while (!encontrado && contador != cantidadNodos) {
            if (ingrediente.equals(aux.getElemento().getIdIngrediente())) {
                encontrado = true;
            }
            aux = aux.getSiguiente();
            contador++;
        }
        if (encontrado == false) {
            dc.setIdIngrediente(ingrediente);
            dc.setDescripcion(JOptionPane.showInputDialog(null,
                    "Escriba la descripción del ingrediente: "));
            dc.setCantidad(Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Escriba la cantidad: ")));
            dc.setEstado(JOptionPane.showInputDialog(null, "Ingrese el estado del Helado: "));
            NodoDCingredientes nuevo = new NodoDCingredientes();
            nuevo.setElemento(dc);
            if (esVaciaDC()) {
                inicio = nuevo;
                fin = nuevo;
                fin.setSiguiente(inicio);
                inicio.setAnterior(fin);
            } else if (dc.getDescripcion().compareTo(inicio.getElemento().getDescripcion()) < 0) {
                nuevo.setSiguiente(inicio);
                inicio = nuevo;
                fin.setSiguiente(inicio);
                inicio.setAnterior(fin);
            } else if (dc.getDescripcion().compareTo(fin.getElemento().getDescripcion()) < 0) {
                fin.setSiguiente(nuevo);
                fin = nuevo;
                fin.setSiguiente(inicio);
                inicio.setAnterior(fin);
            } else {
                NodoDCingredientes aux2 = inicio;
                while (aux2.getSiguiente().getElemento().getDescripcion().compareTo(dc.getDescripcion()) < 0) {
                    aux2 = aux2.getSiguiente();
                }
                nuevo.setSiguiente(aux2.getSiguiente());
                nuevo.setAnterior(aux2);
                aux2.setSiguiente(nuevo);
                nuevo.getSiguiente().setAnterior(nuevo);
                cantidadNodos++;
            }
            cantidadNodos++;
        } else {
            JOptionPane.showMessageDialog(null, "Este ingrediente ya se encuentra registrado, por favor ingrese otro ID");
        }
    }

    public void editar() {
        int numNodo = 0;
        String ingrediente = "";
        ingrediente = JOptionPane.showInputDialog(null, "Ingrese el ID del ingrediente que desea editar: ");
        NodoDCingredientes aux = inicio;
        boolean encontrado = false;
        if (!esVaciaDC()) {
            while (!encontrado && numNodo != cantidadNodos) {
                if (ingrediente.equals(aux.getElemento().getIdIngrediente())) {
                    encontrado = true;
                    aux.getElemento().setDescripcion(JOptionPane.showInputDialog
                    ("Ingrese la nueva descripción para " + aux.getElemento().getIdIngrediente() + ": "));
                    aux.getElemento().setCantidad(Integer.parseInt(JOptionPane.showInputDialog
                    ("Ingrese la nueva cantidad de ingredientes " + aux.getElemento().getIdIngrediente() + ": ")));
                }
                aux = aux.getSiguiente();
                numNodo++;
            }
            if (encontrado == false) {
                JOptionPane.showMessageDialog(null, "El ingrediente no se encuentra registrado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay ingrediente registrados");
        }
    }

    public void inactivar() {
        int numNodo = 0;
        String ingrediente = "";
        ingrediente = JOptionPane.showInputDialog(null, "Ingrese el ID del batido que desea inactivar: ");
        NodoDCingredientes aux = inicio;
        boolean encontrado = false;
        if (!esVaciaDC()) {
            while (!encontrado && numNodo != cantidadNodos) {
                if (ingrediente.equals(aux.getElemento().getIdIngrediente())) {
                    encontrado = true;
                    aux.getElemento().setEstado("Inactivo");
                    JOptionPane.showMessageDialog(null, "Sea ha inactivado el ingrediente");
                }
                aux = aux.getSiguiente();
                numNodo++;
            }
            if (encontrado == false) {
                JOptionPane.showMessageDialog(null, "El ingrediente no se encuentra registrado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay ingredientes registrados");
        }
    }

    public void mostrarElementos() {
        if (!esVaciaDC()) {
            String s = "";
            NodoDCingredientes aux = inicio;
            s = s +"ID: "+ aux.getElemento().getIdIngrediente() + "=="+"Descipción: " 
                    + aux.getElemento().getDescripcion() + "=="+"Cantidad: " + aux.getElemento().getCantidad()
                    + "<==>";
            aux = aux.getSiguiente();
            while (aux != inicio) {
                s = s +"ID: "+ aux.getElemento().getIdIngrediente() + "=="+"Descipción: " 
                    + aux.getElemento().getDescripcion() + "=="+"Cantidad: " + aux.getElemento().getCantidad()
                    + "<==>";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La lista contiene:\n" + s);
        } else {
            JOptionPane.showMessageDialog(null, "¡No se puede mostrar, lista vacía!");
        }
    }
}
