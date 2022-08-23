package BaseDatos;
import javax.swing.JOptionPane;
import nodosAutilizar.NodoArbol;
import nodosAutilizar.Nodo2Arbol;
import Informacion.DatoArbol;

/*
Nombre del helado, fecha, Nombre del cliente
cliente es frecuente se le aplicará un 5% de descuento en el total de la compra.
Mostrar factura por cada compra
*/
public class ArbolVentas {

    private NodoArbol raiz;
    private Nodo2Arbol raiz2;
    double descuento;
    int eleccion;
    double chocolate;
    double vainilla;
    double fresa;
    double descontado;
    double total;

    public ArbolVentas() {
        this.raiz = null;
        this.raiz2 = null;
        this.descuento = 0.05;

    }

    public boolean esVacio() {
        return this.raiz == null;
    }

    // vacio arbol 2
    public boolean esVacio2() {
        return this.raiz2 == null;
    }

    public void crearRaiz() {
        DatoArbol d = new DatoArbol();
        d.setNombre(JOptionPane.showInputDialog("Ingrese su nombre"));
        d.setFecha(JOptionPane.showInputDialog("Ingrese la fecha"));
        d.setHelado(JOptionPane.showInputDialog("Ingrese el nombre del Helado"));
        NodoArbol nuevo = new NodoArbol();
        nuevo.setElemento(d);
        if (esVacio()) {
            raiz = nuevo;
        } else {
            crearNodo(raiz, nuevo);
        }
    }

    public void crearNodo(NodoArbol raiz, NodoArbol nuevo) {
        if (nuevo.getElemento().getNombre().compareTo(raiz.getElemento().getNombre()) < 0) {
            if (raiz.getEnlaceIzq() == null) {
                raiz.setEnlaceIzq(nuevo);
            } else {
                crearNodo(raiz.getEnlaceIzq(), nuevo);
            }
        } else if (raiz.getEnlaceDer() == null) {
            raiz.setEnlaceDer(nuevo);
        } else {
            crearNodo(raiz.getEnlaceDer(), nuevo);
        }
    }

    // modificar

    public void modificar() {
        if (!esVacio()) {
            DatoArbol d = new DatoArbol();
            d.setNombre(JOptionPane.showInputDialog("Ingrese su nombre"));
            d.setFecha(JOptionPane.showInputDialog("Ingrese la fecha"));
            d.setHelado(JOptionPane.showInputDialog("Ingrese el Helado"));
            d.setCliente(JOptionPane.showInputDialog("Ingrese el cliente"));
            modificarNodo(raiz, d);
        } else {
            System.out.println("La base de datos se encuentra vacia");
        }
    }
    // modificar los datos del arbol

    public void modificarNodo(NodoArbol raiz, DatoArbol d) {
        if (raiz.getElemento().getNombre().equals(d.getNombre())) {
            raiz.getElemento().setFecha(d.getFecha());
            raiz.getElemento().setHelado(d.getHelado());
            raiz.getElemento().setCliente(d.getCliente());
        } else {
            if (raiz.getEnlaceIzq() != null) {
                modificarNodo(raiz.getEnlaceIzq(), d);
            }
            if (raiz.getEnlaceDer() != null) {
                modificarNodo(raiz.getEnlaceDer(), d);
            }
        }
    }

    // mostrar datos del arbol
    public void mostrar() {
        if (!esVacio()) {
            mostrarNodo(raiz);
        } else {
            System.out.println("La base de datos se encuentra vacia");
        }
    }

    public void mostrarNodo(NodoArbol raiz) {
        if (raiz != null) {
            mostrarNodo(raiz.getEnlaceIzq());
            JOptionPane.showMessageDialog(null, raiz.getElemento().getNombre() + "\n" + raiz.getElemento().getFecha() + "\n" 
                    + raiz.getElemento().getHelado() + "\n" + raiz.getElemento().getCliente() + "\n");
            
            /*System.out.println(raiz.getElemento().getNombre());
            System.out.println(raiz.getElemento().getFecha());
            System.out.println(raiz.getElemento().getHelado());
            System.out.println(raiz.getElemento().getCliente());*/
            
            mostrarNodo(raiz.getEnlaceDer());
        }
    }

    // aqui el metodo lo que hacer es pedir los datos del cliente y luego crear un
    // nodo, luego realiza la operacion matematica por ser un cliente frecuente
    public void crearRaiz2() {
        DatoArbol d = new DatoArbol();
        d.setNombre(JOptionPane.showInputDialog("Ingrese su Nombre"));
        d.setFecha(JOptionPane.showInputDialog("Ingrese la Fecha"));
        d.setCantidad(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Cantidad")));
        d.setValor(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Valor")));
        d.setTotal(d.getValor() * d.getCantidad() / 0.05);
        // mostrar el total de la compra realizada 
        JOptionPane.showMessageDialog(null,"El total de la Compra es de: " + d.getTotal());
        Nodo2Arbol nuevo = new Nodo2Arbol();
        nuevo.setElemento(d);
        if (esVacio2()) {
            raiz2 = nuevo;
        } else {
            crearNodo2(raiz2, nuevo);
        }
    }

    // aqui el metodo acomoda los datos de los clientes en el arbol por el nombre
    public void crearNodo2(Nodo2Arbol raiz, Nodo2Arbol nuevo) {
        if (nuevo.getElemento().getNombre().compareTo(raiz.getElemento().getNombre()) < 0) {
            if (raiz.getEnlaceIzq() == null) {
                raiz.setEnlaceIzq(nuevo);
            } else {
                crearNodo2(raiz.getEnlaceIzq(), nuevo);
            }
        } else if (raiz.getEnlaceDer() == null) {
            raiz.setEnlaceDer(nuevo);
        } else {
            crearNodo2(raiz.getEnlaceDer(), nuevo);
        }
    }

    // aqui muestra los datos de los clientes
    public void mostrarRaiz2() {
        if (!esVacio2()) {
            mostrarNodo2(raiz2);
        } else {
            JOptionPane.showMessageDialog(null,"No se puede mostrar, la base de datos se encuentra vacia!");
        }
    }

    public void mostrarNodo2(Nodo2Arbol actual) {
        if (actual != null) {
            mostrarNodo2(actual.getEnlaceIzq());
            JOptionPane.showMessageDialog(null,actual.getElemento().getNombre() + " " + actual.getElemento().getFecha() + " "
                    + actual.getElemento().getCantidad() + " " + actual.getElemento().getValor() + " "
                    + actual.getElemento().getTotal() + "\n");
            mostrarNodo2(actual.getEnlaceDer());
        }
    }

 
}
