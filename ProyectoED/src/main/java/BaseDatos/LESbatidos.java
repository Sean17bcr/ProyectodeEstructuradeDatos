package BaseDatos;
import nodosAutilizar.NodoLESHelado;
import Informacion.DatoBatido;
import javax.swing.JOptionPane;
public class LESbatidos {

    private NodoLESHelado inicio;

    public LESbatidos() {
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
        String batido = "";
        DatoBatido b = new DatoBatido();
        boolean encontrado = false;
        batido = (JOptionPane.showInputDialog(null, "Ingrese el ID del batido: "));
            NodoLESHelado aux = inicio;
            while (!encontrado && aux != null) {
                if (batido.equals(aux.getElemento().getBatido())) {
                    encontrado = true;
                }
                aux = aux.getSiguiente();
            }
            if (encontrado == false) {
                b.setBatido(batido);
                b.setDescripcion(JOptionPane.showInputDialog(null, "Ingrese la descripción del batido: "));
                b.setIngredientes(JOptionPane.showInputDialog(null, "Ingrese los ingredientes del batido: "));
                b.setEstado(JOptionPane.showInputDialog(null, "Ingrese el estado del batido: "));
                NodoLESHelado nuevo = new NodoLESHelado();
                nuevo.setElemento(b);
                if (esVaciaLES()) {
                    inicio = nuevo;
                } else if (b.getBatido().compareTo(inicio.getElemento().getBatido()) < 0) {
                    nuevo.setSiguiente(inicio);
                    inicio = nuevo;
                } else if (inicio.getSiguiente() == null) {
                    inicio.setSiguiente(nuevo);
                } else {
                    NodoLESHelado aux2 = inicio;
                    while ((aux2.getSiguiente() != null) && (b.getBatido().compareTo(aux2.getElemento().getBatido()) >= 0)) {
                        aux2 = aux2.getSiguiente();
                    }
                    nuevo.setSiguiente(aux2.getSiguiente());
                    aux2.setSiguiente(nuevo);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Este batido ya se encuentra registrado, por favor ingrese otro ID");
            }
        }
    

    public void editar() {
        String batido = "";
        batido = JOptionPane.showInputDialog(null, "Ingrese el batido que desea editar: ");
        NodoLESHelado aux = inicio;
        boolean encontrado = false;
        if (!esVaciaLES()) {

            while (!encontrado && aux != null) {
                if (batido.equals(aux.getElemento().getBatido())) {
                    encontrado = true;
                    aux.getElemento().setDescripcion(JOptionPane.showInputDialog("Ingrese la nueva descripción para el batido ID: " 
                            + aux.getElemento().getBatido()));
                    aux.getElemento().setIngredientes(JOptionPane.showInputDialog("Ingrese los nuevos ingredientes para el batido ID: " 
                            + aux.getElemento().getBatido()));
                }
                aux = aux.getSiguiente();
            }
            if (encontrado == false) {
                JOptionPane.showMessageDialog(null, "El batido no se encuentra registrado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay batidos registrados");
        }
    }

    public void inactivar() {
        String batido = "";
        batido = JOptionPane.showInputDialog(null, "Ingrese el ID del batido que desea inactivar: ");
        NodoLESHelado aux = inicio;
        boolean encontrado = false;
        if (!esVaciaLES()) {
            while (!encontrado && aux != null) {
                if (batido.equals(aux.getElemento().getBatido())) {
                    encontrado = true;
                    aux.getElemento().setEstado("Inactivo");
                    JOptionPane.showMessageDialog(null, "Sea ha inactivado el batido");
                }
                aux = aux.getSiguiente();
            }
            if (encontrado == false) {
                JOptionPane.showMessageDialog(null, "El batido no se encuentra registrado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay batidos registrados");
        }
    }

    public void mostrarElementos() {
        if (!esVaciaLES()) {
            String s = "";
            NodoLESHelado aux = inicio;
            while (aux != null) {
                s = s+"ID: " + aux.getElemento().getBatido() + "\n" + "Descripción: "
                        +aux.getElemento().getDescripcion() + "\n"+"Ingredientes: " + aux.getElemento().getIngredientes()
                        + "\n"+"Estado: " + aux.getElemento().getEstado();
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La lista contiene:\n" + s);
        } else {
            JOptionPane.showMessageDialog(null, "La está vacía!");
        }
    }

}
