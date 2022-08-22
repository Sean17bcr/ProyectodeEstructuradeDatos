package BaseDatos;
import nodosAutilizar.NodoLESCatalogoClientes;
import Informacion.Empleados;
import javax.swing.JOptionPane;
public class LDEatalogoEmpleado {

    private NodoLESCatalogoClientes inicio;

    public LDEatalogoEmpleado() {
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
        String idempleado = "";
        
        Empleados catalogo = new Empleados();
        boolean encontrado = false;
        idempleado = (JOptionPane.showInputDialog(null, "Ingrese el ID del empleado: "));
        NodoLESCatalogoClientes aux = inicio;
        while (!encontrado && aux != null) {
            if (idempleado.equals(aux.getElemento().getIdEmpleado())) {
                encontrado = true;
            }
            aux = aux.getSiguiente();
        }
        if (encontrado == false) {
            catalogo.setIdEmpleado(idempleado);
            catalogo.setNombreEmpleado(JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado: "));
            catalogo.setSalario(JOptionPane.showInputDialog(null,"Digite el salario del empleado: "));
            NodoLESCatalogoClientes nuevo = new NodoLESCatalogoClientes();
            nuevo.setElemento(catalogo);
            if (esVaciaLES()) {
                inicio = nuevo;
            } else if (catalogo.getIdEmpleado().compareTo(inicio.getElemento().getIdEmpleado()) < 0) {
                nuevo.setSiguiente(inicio);
                inicio = nuevo;
            } else if (inicio.getSiguiente() == null) {
                inicio.setSiguiente(nuevo);
            } else {
                NodoLESCatalogoClientes aux2 = inicio;
                while ((aux2.getSiguiente() != null) && (catalogo.getIdEmpleado().compareTo(aux2.getElemento().getIdEmpleado()) >= 0)) {
                    aux2 = aux2.getSiguiente();
                }
                nuevo.setSiguiente(aux2.getSiguiente());
                aux2.setSiguiente(nuevo);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Este empleado ya se encuentra registrado ingrese otro ID");
        }
    }

    public void editarID() {
        String idempleado = "";
        
        Empleados catalogo = new Empleados();
        boolean encontrado = false;
        idempleado = (JOptionPane.showInputDialog(null, "Ingrese el ID del empleado a editar: "));
        NodoLESCatalogoClientes aux = inicio;
        if (!esVaciaLES()) {

            while (!encontrado && aux != null) {
                if (idempleado.equals(aux.getElemento().getIdEmpleado())) {
                    encontrado = true;
                    aux.getElemento().setIdEmpleado(JOptionPane.showInputDialog("Ingrese el nuevo id del empleado: " + aux.getElemento().getIdEmpleado()+ ": "));
                }
                aux = aux.getSiguiente();
            }
            if (encontrado == false) {
                JOptionPane.showMessageDialog(null, "El ID del empleado no se encuentra");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay ningun empleado registrado ");
        }
    }

    
    public void mostrarElementos() {
        if (!esVaciaLES()) {
            String s = "";
            NodoLESCatalogoClientes aux = inicio;
            while (aux != null) {
                s = s + "ID del empleado: "+aux.getElemento().getIdEmpleado()+ "\n" + "Nombre completo del cliente: "+aux.getElemento().getNombreEmpleado()+"\n"+
                        "El salario del empleado es: "+aux.getElemento().getSalario();
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La lista contiene:\n" + s);
        } else {
            JOptionPane.showMessageDialog(null, "La está vacía!");
        }
    }

}
