package Menus;

import BaseDatos.ArbolVentas;
import BaseDatos.LDCingredientes;
import BaseDatos.LDEatalogoEmpleado;
import BaseDatos.LEShelados;
import BaseDatos.LSCclientes;
import com.mycompany.proyectoed.Lista;
import com.mycompany.proyectoed.frm_Inicio;
import javax.swing.JOptionPane;

/**
 *
 * @author Sean, Valeria y Sebastian
 */
public class Menus {

    //menu login
    Lista L = new Lista();
    //Menu catalogo empleado
    LDEatalogoEmpleado listaEmpleado = new LDEatalogoEmpleado();
    //Menu ventas ocajas
    ArbolVentas arbolVentas = new ArbolVentas();
    //Menu ingredientes
    LDCingredientes LCDingredientes = new LDCingredientes();
    //Menu Clientes
    LSCclientes listaClientes = new LSCclientes();
    //menu Helados
    LEShelados listaHelados = new LEShelados();

    byte op = 0;
    private int opcion;

    public void mostrarMenuLogin() {

        String menuPersona = "Opciones a mostrar\n"
                + "1.Agregar personas\n"
                + "2.Mostrar a las personas agregadas\n"
                + "3.Extraer primer persona ingresada\n"
                + "4.Extraer usuario especifico\n"
                + "5.Ir al menu principal\n"
                + "6.Salir del programa";

        op = Byte.parseByte(JOptionPane.showInputDialog(null, "Digite la opcion que desea ingresar: \n"
                + menuPersona));

        switch (op) {
            case 1:{
                L.agregar();
                mostrarMenuLogin();
                break;
            }
            case 2:{
                L.mostrarElementos();
                mostrarMenuLogin();
                break;
            }
            case 3:{
                L.extraerDelInicio();
                mostrarMenuLogin();
                break;
            }
            case 4:{
                L.inactivarEspecifico();
                mostrarMenuLogin();
                break;
            }
            case 5:{
                frm_Inicio inicio = new frm_Inicio();
                inicio.setVisible(true);
                inicio.setLocationRelativeTo(null);
            }
            case 6:{
                break;
            }
            default: {
                JOptionPane.showMessageDialog(null,
                        "Opción incorrecta!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    public void mostrarMenuCatalogoEmpleado() {

        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "***Menú Catalogo de Clientes***\n\n"
                + "1. Agregar categoría de clientes\n"
                + "2. Editar categoría de clientes\n"
                + "3. Inactivar categoría de clientes\n"
                + "4. Mostrar categorías de clientes\n"
                + "5. Salir del sistema\n\n"
                + "Digite su opción:"));
        switch (opcion) {
            case 1: {
                listaEmpleado.agregar();
                mostrarMenuCatalogoEmpleado();
                break;
            }
            case 2: {
                listaEmpleado.editarID();
                mostrarMenuCatalogoEmpleado();
                break;
            }
            case 3: {
                //les.inactivar();
                mostrarMenuCatalogoEmpleado();
                break;
            }
            case 4: {
                listaEmpleado.mostrarElementos();
                mostrarMenuCatalogoEmpleado();
                break;
            }
            case 5: {
                frm_Inicio inicio = new frm_Inicio();
                inicio.setVisible(true);
                inicio.setLocationRelativeTo(null);

                break;
            }
            default: {
                JOptionPane.showMessageDialog(null,
                        "Opción incorrecta!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void mostrarMenuVentas() {

        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "***Menú Clientes***\n\n"
                + "1. Agregar Venta\n"
                + "2. Editar venta\n"
                + "3. Mostrar Ventas\n"
                + "4. Salir al menu principal\n\n"
                + "Digite su opción:"));
        switch (opcion) {
            case 1: {
                arbolVentas.crearRaiz();
                mostrarMenuVentas();
                break;
            }
            case 2: {
                arbolVentas.crearRaiz();
                arbolVentas.modificar();
                mostrarMenuVentas();
                break;
            }
            case 3: {
                arbolVentas.mostrar();
                mostrarMenuVentas();
                break;
            }
            case 4: {
                frm_Inicio inicio = new frm_Inicio();
                inicio.setVisible(true);
                inicio.setLocationRelativeTo(null);
                break;
            }

            default:
                throw new AssertionError();
        }

    }

    public void mostrarMenuIngredientes() {

        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "***Menú Clientes***\n\n"
                + "1. Agregar Ingrediente\n"
                + "2. Editar Ingrediente\n"
                + "3. Mostrar Ingredientes\n"
                + "4. Salir al menu principal\n\n"
                + "Digite su opción:"));
        switch (opcion) {
            case 1: {
                LCDingredientes.agregarDC();
                mostrarMenuIngredientes();
                break;
            }
            case 2: {
                LCDingredientes.editar();
                mostrarMenuIngredientes();
                break;
            }
            case 3: {
                LCDingredientes.mostrarElementos();
                mostrarMenuIngredientes();
                break;
            }
            case 4: {
                frm_Inicio inicio = new frm_Inicio();
                inicio.setVisible(true);
                inicio.setLocationRelativeTo(null);
                break;
            }
            default: {
                JOptionPane.showMessageDialog(null,
                        "Opción incorrecta!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void mostrarMenuClientes() {

        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "***Menú Clientes***\n\n"
                + "1. Agregar Cliente\n"
                + "2. Editar\n"
                + "3. Inactivar Cuenta del Cliente\n"
                + "4. Mostrar todos los Clientes\n"
                + "5. Salir al menu principal\n\n"
                + "Digite su opción:"));
        switch (opcion) {
            case 1: {
                listaClientes.agregar();
                mostrarMenuClientes();
                break;
            }
            case 2: {
                listaClientes.editar();
                mostrarMenuClientes();
                break;
            }
            case 3: {
                listaClientes.inactivar();
                mostrarMenuClientes();
                break;
            }
            case 4: {
                listaClientes.mostrarElementos();
                mostrarMenuClientes();
                break;
            }
            case 5: {
                frm_Inicio inicio = new frm_Inicio();
                inicio.setVisible(true);
                inicio.setLocationRelativeTo(null);
                break;
            }
            default: {
                JOptionPane.showMessageDialog(null,
                        "Opción incorrecta!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void mostrarMenuHelados() {

        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "***Menú Batidos***\n\n"
                + "1. Agregar helado\n"
                + "2. Editar helado\n"
                + "3. Mostrar batidos\n"
                + "4. Salir al menu principal\n\n"
                + "Digite su opción:"));
        switch (opcion) {
            case 1: {
                listaHelados.agregar();
                mostrarMenuHelados();
                break;
            }
            case 2: {
                listaHelados.editar();
                mostrarMenuHelados();
                break;
            }
            case 3: {
                listaHelados.mostrarElementos();
                mostrarMenuHelados();
                break;
            }
            case 4: {
                frm_Inicio inicio = new frm_Inicio();
                inicio.setVisible(true);
                inicio.setLocationRelativeTo(null);
                break;
            }

            default: {
                JOptionPane.showMessageDialog(null,
                        "Opción incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
