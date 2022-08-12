package BaseDatos;
import nodosAutilizar.NodoLESHelado;
import Informacion.DatoHelado;
import javax.swing.JOptionPane;
public class LESHelados {

    private NodoLESHelado inicio;

    public LESHelados() {
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
        String helado;
        helado = "";
        DatoHelado h = new DatoHelado();
        boolean encontrado = false;
        helado = (JOptionPane.showInputDialog(null, "Ingrese el ID del Helado: "));
            NodoLESHelado aux = inicio;
            while (!encontrado && aux != null) {
                if (helado.equals(aux.getElemento().getHelado())) {
                    encontrado = true;
                }
                aux = aux.getSiguiente();
            }
            if (encontrado == false) {
                h.setHelado(helado);
                h.setDescripcion(JOptionPane.showInputDialog(null, "Ingrese la descripción del Helado: "));
                h.setIngredientes(JOptionPane.showInputDialog(null, "Ingrese los ingredientes del Helado: "));
                h.setEstado(JOptionPane.showInputDialog(null, "Ingrese el estado del Helado: "));
                NodoLESHelado nuevo = new NodoLESHelado();
                nuevo.setElemento(h);
                if (esVaciaLES()) {
                    inicio = nuevo;
                } else if (h.getHelado().compareTo(inicio.getElemento().getHelado()) < 0) {
                    nuevo.setSiguiente(inicio);
                    inicio = nuevo;
                } else if (inicio.getSiguiente() == null) {
                    inicio.setSiguiente(nuevo);
                } else {
                    NodoLESHelado aux2 = inicio;
                    while ((aux2.getSiguiente() != null) && (h.getHelado().compareTo(aux2.getElemento().getHelado()) >= 0)) {
                        aux2 = aux2.getSiguiente();
                    }
                    nuevo.setSiguiente(aux2.getSiguiente());
                    aux2.setSiguiente(nuevo);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Este Helado ya se encuentra registrado, por favor ingrese otro ID");
            }
        }
    

    public void editar() {
        String helado = "";
        helado = JOptionPane.showInputDialog(null, "Ingrese el Helado que desea editar: ");
        NodoLESHelado aux = inicio;
        boolean encontrado = false;
        if (!esVaciaLES()) {

            while (!encontrado && aux != null) {
                if (helado.equals(aux.getElemento().getHelado())) {
                    encontrado = true;
                    aux.getElemento().setDescripcion(JOptionPane.showInputDialog("Ingrese la nueva descripción para el Helado: " 
                            + aux.getElemento().getHelado()));
                    aux.getElemento().setIngredientes(JOptionPane.showInputDialog("Ingrese los nuevos ingredientes para el Helado ID: " 
                            + aux.getElemento().getHelado()));
                }
                aux = aux.getSiguiente();
            }
            if (encontrado == false) {
                JOptionPane.showMessageDialog(null, "El Helado no se encuentra registrado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay Helados registrados");
        }
    }

    public void inactivar() {
        String helado = "";
        helado = JOptionPane.showInputDialog(null, "Ingrese el ID del Helado que desea inactivar: ");
        NodoLESHelado aux = inicio;
        boolean encontrado = false;
        if (!esVaciaLES()) {
            while (!encontrado && aux != null) {
                if (helado.equals(aux.getElemento().getHelado())) {
                    encontrado = true;
                    aux.getElemento().setEstado("Inactivo");
                    JOptionPane.showMessageDialog(null, "Sea ha inactivado el Helado");
                }
                aux = aux.getSiguiente();
            }
            if (encontrado == false) {
                JOptionPane.showMessageDialog(null, "El Helado no se encuentra registrado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay Helados registrados");
        }
    }

    public void mostrarElementos() {
        if (!esVaciaLES()) {
            String s = "";
            NodoLESHelado aux = inicio;
            while (aux != null) {
                s = s+"ID: " + aux.getElemento().getHelado() + "\n" + "Descripción: "
                        +aux.getElemento().getDescripcion() + "\n"+"Ingredientes: " + aux.getElemento().getIngredientes()
                        + "\n"+"Estado: " + aux.getElemento().getEstado();
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La lista contiene:\n" + s);
        } else {
            JOptionPane.showMessageDialog(null, "La lista esta vacía!");
        }
    }

}
