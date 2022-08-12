package BaseDatos;
import nodosAutilizar.NodoCregistro;
import Informacion.DatoRegistro;
import javax.swing.JOptionPane;
public class ColaRegistro {

    private NodoCregistro inicio;
    private NodoCregistro fin;
   
    public ColaRegistro() {

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

    public void agregar() {
        DatoRegistro d = new DatoRegistro();
        d.setNombre(JOptionPane.showInputDialog(null, "Ingrese su Nombre:"));
        d.setApellidos(JOptionPane.showInputDialog(null, "Ingrese sus Apellidos:"));
        d.setNickname(JOptionPane.showInputDialog(null, "Cree un nombre de Usuario:"));
        d.setPassword(JOptionPane.showInputDialog(null, "Cree una Contraseña:"));
        d.setEstado("Activo");
        NodoCregistro nuevo = new NodoCregistro();
        nuevo.setElemento(d);
        if (esVacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        } 
        JOptionPane.showMessageDialog(null, "Su usuario se ha creado correctamente, por favor inicie sesión");
    }

    public boolean verificarUsuario(String user, String pass) {
        Boolean encontrado = false;
        Boolean usuarioCorrecto = false;
        if (!esVacia()) {
            NodoCregistro aux = inicio;
            while (aux != null && !encontrado) {
                if (aux.getElemento().getNickname().equals(user)) {
                    if (aux.getElemento().getPassword().equals(pass)) {
                        usuarioCorrecto = true;
                        encontrado = true;
                    } else {
                        encontrado = true;
                    }
                }
                aux = aux.getSiguiente();
            }
        }

        return usuarioCorrecto;

    }

    public void inactivarUsuario() {
        String usuario = "";
        usuario = JOptionPane.showInputDialog(null, "Ingrese el nickname del usuario que desea inactivar: ");
        boolean encontrado = false;
        if (!esVacia()) {
            NodoCregistro aux = inicio;
            while (!encontrado && aux != null) {
                if (usuario.equals(aux.getElemento().getNickname())) {
                    encontrado = true;
                    aux.getElemento().setEstado("Inactivo");
                    JOptionPane.showMessageDialog(null, "Sea ha inactivado el usuario");
                }
                aux = aux.getSiguiente();
            }     
            if (encontrado == false) {
                JOptionPane.showMessageDialog(null, "El usuario no se encuentra registrado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay usuarios registrados");
        }
    }

}
