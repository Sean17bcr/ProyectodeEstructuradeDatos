package BaseDatos;
import nodosAutilizar.NodoLESCatalogoClientes;
import Informacion.DatoCatalogoClientes;
import javax.swing.JOptionPane;
public class LESCatalogoClientes {

    private NodoLESCatalogoClientes inicio;

    public LESCatalogoClientes() {
        this.inicio = null;
    }

    public boolean esVaciaLES() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void agregar() {
        String categoria = "";
        DatoCatalogoClientes catalogo = new DatoCatalogoClientes();
        boolean encontrado = false;
        categoria = (JOptionPane.showInputDialog(null, "Ingrese el ID de la categoría: "));
        NodoLESCatalogoClientes aux = inicio;
        while (!encontrado && aux != null) {
            if (categoria.equals(aux.getElemento().getIdCategoría())) {
                encontrado = true;
            }
            aux = aux.getSiguiente();
        }
        if (encontrado == false) {
            catalogo.setIdCategoría(categoria);
            catalogo.setTipo(JOptionPane.showInputDialog(null, "Ingrese el tipo de cliente: "));
            NodoLESCatalogoClientes nuevo = new NodoLESCatalogoClientes();
            nuevo.setElemento(catalogo);
            if (esVaciaLES()) {
                inicio = nuevo;
            } else if (catalogo.getIdCategoría().compareTo(inicio.getElemento().getIdCategoría()) < 0) {
                nuevo.setSiguiente(inicio);
                inicio = nuevo;
            } else if (inicio.getSiguiente() == null) {
                inicio.setSiguiente(nuevo);
            } else {
                NodoLESCatalogoClientes aux2 = inicio;
                while ((aux2.getSiguiente() != null) && (catalogo.getIdCategoría().compareTo(aux2.getElemento().getIdCategoría()) >= 0)) {
                    aux2 = aux2.getSiguiente();
                }
                nuevo.setSiguiente(aux2.getSiguiente());
                aux2.setSiguiente(nuevo);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Esta categoría de cliente ya se encuentra registrado, por favor ingrese otro ID");
        }
    }

    public void editar() {
        String categoria = "";
        categoria = JOptionPane.showInputDialog(null, "Ingrese el ID de categría de cliente que desea editar: ");
        NodoLESCatalogoClientes aux = inicio;
        boolean encontrado = false;
        if (!esVaciaLES()) {

            while (!encontrado && aux != null) {
                if (categoria.equals(aux.getElemento().getIdCategoría())) {
                    encontrado = true;
                    aux.getElemento().setTipo(JOptionPane.showInputDialog("Ingrese el nuevo tipo de cliente para la categoría ID: " + aux.getElemento().getIdCategoría() + ": "));
                }
                aux = aux.getSiguiente();
            }
            if (encontrado == false) {
                JOptionPane.showMessageDialog(null, "la categoría de cliente no se encuentra registrado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay categorías de clientes registrados");
        }
    }

    public void inactivar() {
        String catalogo = "";
        String estado="";
        catalogo = JOptionPane.showInputDialog(null, "Ingrese el ID de la categoría que desea inactivar: ");
        NodoLESCatalogoClientes aux = inicio;
        boolean encontrado = false;
        if (!esVaciaLES()) {
            while (!encontrado && aux != null) {
                if (catalogo.equals(aux.getElemento().getIdCategoría())) {
                    encontrado = true;
                    aux.getElemento().setEstado(false);
                    JOptionPane.showMessageDialog(null, "Sea ha inactivado el batido");
                }
                aux = aux.getSiguiente();
            }
            if (encontrado == false) {
                JOptionPane.showMessageDialog(null, "La categoría no se encuentra registrado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay categorías registradas");
        }
    }

    public void mostrarElementos() {
        if (!esVaciaLES()) {
            String s = "";
            NodoLESCatalogoClientes aux = inicio;
            while (aux != null) {
                s = s + "ID: "+aux.getElemento().getIdCategoría() + "\n" + "Tipo cliente: "+aux.getElemento().getTipo()+"\n"+
                        "Activo: "+aux.getElemento().isEstado();
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La lista contiene:\n" + s);
        } else {
            JOptionPane.showMessageDialog(null, "La está vacía!");
        }
    }

}
