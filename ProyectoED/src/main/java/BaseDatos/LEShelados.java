package BaseDatos;
import nodosAutilizar.NodoLESHelado;
import Informacion.DatoHelado;
import javax.swing.JOptionPane;
public class LEShelados {

    private NodoLESHelado inicio;

    public LEShelados() {
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
        DatoHelado b = new DatoHelado();
        boolean encontrado = false;
        batido = (JOptionPane.showInputDialog(null, "Ingrese el ID del batido: "));
            NodoLESHelado aux = inicio;
            while (!encontrado && aux != null) {
                if (batido.equals(aux.getElemento().getHelado())) {
                    encontrado = true;
                }
                aux = aux.getSiguiente();
            }
            if (encontrado == false) {
                b.setHelado(batido);
                b.setDescripcion(JOptionPane.showInputDialog(null, "Ingrese la descripción del helado: "));
                b.setIngredientes(JOptionPane.showInputDialog(null, "Ingrese los ingredientes del helado: "));
                b.setEstado(JOptionPane.showInputDialog(null, "Ingrese el estado del helado: "));
                NodoLESHelado nuevo = new NodoLESHelado();
                nuevo.setElemento(b);
                if (esVaciaLES()) {
                    inicio = nuevo;
                } else if (b.getHelado().compareTo(inicio.getElemento().getHelado()) < 0) {
                    nuevo.setSiguiente(inicio);
                    inicio = nuevo;
                } else if (inicio.getSiguiente() == null) {
                    inicio.setSiguiente(nuevo);
                } else {
                    NodoLESHelado aux2 = inicio;
                    while ((aux2.getSiguiente() != null) && (b.getHelado().compareTo(aux2.getElemento().getHelado()) >= 0)) {
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
        String helado = "";
        helado = JOptionPane.showInputDialog(null, "Ingrese el helado que desea editar: ");
        NodoLESHelado aux = inicio;
        boolean encontrado = false;
        if (!esVaciaLES()) {

            while (!encontrado && aux != null) {
                if (helado.equals(aux.getElemento().getHelado())) {
                    encontrado = true;
                    aux.getElemento().setDescripcion(JOptionPane.showInputDialog("Ingrese la nueva descripción para el helado ID: " 
                            + aux.getElemento().getHelado()));
                    aux.getElemento().setIngredientes(JOptionPane.showInputDialog("Ingrese los nuevos ingredientes para el helado ID: " 
                            + aux.getElemento().getHelado()));
                }
                aux = aux.getSiguiente();
            }
            if (encontrado == false) {
                JOptionPane.showMessageDialog(null, "El helado no se encuentra registrado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay helados registrados");
        }
    }

    public void inactivar() {
        String helado = "";
        helado = JOptionPane.showInputDialog(null, "Ingrese el ID del helado que desea inactivar: ");
        NodoLESHelado aux = inicio;
        boolean encontrado = false;
        if (!esVaciaLES()) {
            while (!encontrado && aux != null) {
                if (helado.equals(aux.getElemento().getHelado())) {
                    encontrado = true;
                    aux.getElemento().setEstado("Inactivo");
                    JOptionPane.showMessageDialog(null, "Sea ha inactivado el helado");
                }
                aux = aux.getSiguiente();
            }
            if (encontrado == false) {
                JOptionPane.showMessageDialog(null, "El helado no se encuentra registrado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay helados registrados");
        }
    }

    public void mostrarElementos() {
        if (!esVaciaLES()) {
            String s = "";
            NodoLESHelado aux = inicio;
            while (aux != null) {
                s = s+"ID: " + aux.getElemento().getHelado()+ "\n" + "Descripción: "
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
