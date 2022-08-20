package BaseDatos;
import nodosAutilizar.NodoComentarios;
import Informacion.DatoComentarios;
import javax.swing.JOptionPane;
public class ColaComentarios {

    private NodoComentarios inicio;
    private NodoComentarios fin;

    public ColaComentarios() {
        this.inicio = null;
        this.fin = null;
    }

    public boolean esVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void encolar() {
        DatoComentarios d = new DatoComentarios();
        d.setFecha(JOptionPane.showInputDialog(null, "Ingrese la fecha de hoy"));
        d.setNombre(JOptionPane.showInputDialog(null, "Ingrese su nombre: "));
        d.setApellido(JOptionPane.showInputDialog(null, "Ingrese sus apellidos: "));
        d.setCalificacion(Integer.parseInt(JOptionPane.showInputDialog(null, "Del 1 al 10, "
                + "siendo 1 el más bajo y 10 el más alto, califique su experiencia en Healthy Shakes:  ")));
        d.setComentario(JOptionPane.showInputDialog(null, "Comentarios: "));
        NodoComentarios nuevo = new NodoComentarios();
        nuevo.setElemento(d);
        if (esVacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }

    public void mostrarElementos() {
        if (!esVacia()) {
            String s = "";
            NodoComentarios aux = inicio;
            while (aux != null) {
                s = s + "Fecha: " + aux.getElemento().getFecha() + "Nombre: " + "--" + aux.getElemento().getNombre()
                        + "Apellidos: " + "--" + "Calificación: " + aux.getElemento().getCalificacion()
                        + "Comentarios: " + aux.getElemento().getComentario() + "--->";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "Comentarios realizados por clientes de Healthy Shakes:\n" + s);
        } else {
            JOptionPane.showMessageDialog(null, "No existen elementos para mostrar, cola vacía!");
        }
    }

}
