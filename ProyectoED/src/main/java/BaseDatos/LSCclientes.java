package BaseDatos;
import nodosAutilizar.NodoSCclientes;
import Informacion.DatoClientes;
import javax.swing.JOptionPane;
public class LSCclientes {

    private NodoSCclientes inicio;
    private NodoSCclientes fin;
    private int cantidadNodos;

    public void ListaSC() {
        this.inicio = null;
        this.fin = null;
    }

    public boolean esVaciaLSC() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void agregar() {
        int contador = 0;
        String cliente = "";
        DatoClientes catalogo = new DatoClientes();
        boolean encontrado = false;
        cliente = (JOptionPane.showInputDialog(null, "Ingrese el ID del cliente: "));
        NodoSCclientes aux = inicio;
        while (!encontrado && contador != cantidadNodos) {
            if (cliente.equals(aux.getElemento().getCodCliente())) {
                encontrado = true;
            }
            aux = aux.getSiguiente();
            contador++;
        }
        if (encontrado == false) {
            catalogo.setCodCliente(cliente);
            catalogo.setNombre(JOptionPane.showInputDialog(null,
                    "Digite el Nombre del Cliente: "));
            catalogo.setApellidos(JOptionPane.showInputDialog(null,
                    "Digite los Apellidos del cliente: "));
            catalogo.setDireccion(JOptionPane.
                    showInputDialog(null, "Digite la dirección: "));
            catalogo.setEmail(JOptionPane.showInputDialog(null,
                    "Digite el e-mail del Cliente:"));
            catalogo.setTelefono(Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite el telefono del Cliente: ")));
            catalogo.setEstado(JOptionPane.showInputDialog(null,
                    "Digite el estado del Cliente: "));
            NodoSCclientes nuevo = new NodoSCclientes();
            nuevo.setElemento(catalogo);
            if (esVaciaLSC()) {
                inicio = nuevo;
                fin = nuevo;
                fin.setSiguiente(inicio);
                cantidadNodos++;
            } else if (catalogo.getCodCliente().compareTo(inicio.getElemento().getCodCliente()) < 0) {
                nuevo.setSiguiente(inicio);
                inicio = nuevo;
                fin.setSiguiente(inicio);
            } else if (catalogo.getCodCliente().compareTo(inicio.getElemento().getCodCliente()) >= 0) {
                fin.setSiguiente(nuevo);
                fin = nuevo;
                fin.setSiguiente(inicio);
            } else {
                NodoSCclientes aux2 = inicio;
                while ((aux2.getSiguiente() != null) && (catalogo.getCodCliente().compareTo(aux2.getElemento().getCodCliente()) >= 0)) {
                    aux2 = aux2.getSiguiente();
                }
                nuevo.setSiguiente(aux2.getSiguiente());
                aux2.setSiguiente(nuevo);
                cantidadNodos++;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Este cliente ya se encuentra registrado, por favor ingrese otro ID");
        }
    }

    public void editar() {
        int numNodo = 0;
        String cliente = "";
        cliente = JOptionPane.showInputDialog(null, "Ingrese el ID del "
                + "ingrediente que desea editar: ");
        NodoSCclientes aux = inicio;
        boolean encontrado = false;
        if (!esVaciaLSC()) {
            while (!encontrado && numNodo != cantidadNodos) {
                if (cliente.equals(aux.getElemento().getCodCliente())) {
                    encontrado = true;
                    aux.getElemento().setNombre(JOptionPane.showInputDialog("Ingrese el nuevo nombre para el cliente ID: "
                            + aux.getElemento().getCodCliente()));
                    aux.getElemento().setApellidos(JOptionPane.showInputDialog("Ingrese el nuevo apellido para el cliente ID: "
                            + aux.getElemento().getCodCliente()));
                    aux.getElemento().setDireccion(JOptionPane.showInputDialog("Ingrese la nueva dirección para el cliente ID: "
                            + aux.getElemento().getCodCliente()));
                    aux.getElemento().setEmail(JOptionPane.showInputDialog("Ingrese el nuevo email para el cliente ID: "
                            + aux.getElemento().getCodCliente()));
                    aux.getElemento().setDireccion(JOptionPane.showInputDialog("Ingrese la nueva dirección para el cliente ID: "
                            + aux.getElemento().getCodCliente()));
                    aux.getElemento().setTelefono(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número telefonico para el cliente ID: "
                            + aux.getElemento().getCodCliente())));

                }
                aux = aux.getSiguiente();
                numNodo++;
            }
            if (encontrado == false) {
                JOptionPane.showMessageDialog(null, "El cliente no se encuentra registrado");
            }

        } else {
            JOptionPane.showMessageDialog(null, "No hay clientes registrados");
        }
    }

    public void inactivar() {
        int numNodo = 0;
        String ingrediente = "";
        ingrediente = JOptionPane.showInputDialog(null, "Ingrese el ID del cliente que desea inactivar: ");
        NodoSCclientes aux = inicio;
        boolean encontrado = false;
        if (!esVaciaLSC()) {
            while (!encontrado && numNodo != cantidadNodos) {
                if (ingrediente.equals(aux.getElemento().getCodCliente())) {
                    encontrado = true;
                    aux.getElemento().setEstado("Inactivo");
                    JOptionPane.showMessageDialog(null, "Sea ha inactivado el cliente");
                }
                aux = aux.getSiguiente();
                numNodo++;
            }
            if (encontrado == false) {
                JOptionPane.showMessageDialog(null, "El cliente no se encuentra registrado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay cliente registrados");
        }
    }

    public void mostrarElementos() {
        if (!esVaciaLSC()) {
            String s = "";
            NodoSCclientes aux = inicio;
            s = s + "ID Cliente: " + aux.getElemento().getCodCliente() + " == "
                    + "Nombre: " + aux.getElemento().getNombre() + "== " + "Apellidos: "
                    + aux.getElemento().getApellidos() + " == " + "Email: " + aux.getElemento().getEmail()
                    + " Dirección: " + aux.getElemento().getDireccion() + " == " + "Telefono: "
                    + aux.getElemento().getTelefono() + " == " + "Estado" + aux.getElemento().getEstado()
                    + "<==>";
            aux = aux.getSiguiente();
            while (aux != inicio) {
                s = s + "ID Cliente: " + aux.getElemento().getCodCliente() + " == "
                        + "Nombre: " + aux.getElemento().getNombre() + "== " + "Apellidos: "
                        + aux.getElemento().getApellidos() + " == " + "Email: " + aux.getElemento().getEmail()
                        + " Dirección: " + aux.getElemento().getDireccion() + " == " + "Telefono: "
                        + aux.getElemento().getTelefono() + " == " + "Estado" + aux.getElemento().getEstado()
                        + "<==>";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La lista contiene:\n" + s);
        } else {
            JOptionPane.showMessageDialog(null, "¡No se puede mostrar, lista vacía!");
        }
    }

}
