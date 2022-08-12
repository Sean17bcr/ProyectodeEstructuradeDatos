package Menus;

import BaseDatos.ColaComentarios;
import BaseDatos.LDCingredientes;
import BaseDatos.LESCatalogoClientes;
import BaseDatos.LESbatidos;
import BaseDatos.LSCclientes;
import javax.swing.JOptionPane;

/**
 *
 * @author Sean
 */
public class Menus {

    private int opcion;

    public void mostrarMenuCatalogoClientes() {
        LESCatalogoClientes les = new LESCatalogoClientes();
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "***Menú Catalogo de Clientes***\n\n"
                + "1. Agregar categoría de clientes\n"
                + "2. Editar categoría de clientes\n"
                + "3. Inactivar categoría de clientes\n"
                + "4. Mostrar categorías de clientes\n"
                + "5. Salir del sistema\n\n"
                + "Digite su opción:"));
        switch (opcion) {
            case 1: {
                les.agregar();
                mostrarMenuCatalogoClientes();
                break;
            }
            case 2: {
                les.editar();
                mostrarMenuCatalogoClientes();
                break;
            }
            case 3: {
                les.inactivar();
                mostrarMenuCatalogoClientes();
                break;
            }
            case 4: {
                les.mostrarElementos();
                mostrarMenuCatalogoClientes();
                break;
            }
            case 5: {
                break;
            }
            default: {
                JOptionPane.showMessageDialog(null,
                        "Opción incorrecta!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void mostrarMenu() {
        LDCingredientes les = new LDCingredientes();
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "***Menú Clientes***\n\n"
                + "1. Agregar Ingrediente\n"
                + "2. Editar Ingrediente\n"
                + "3. Inactivar ingrediente\n"
                + "4. Mostrar Ingredientes\n"
                + "5. Salir del sistema\n\n"
                + "Digite su opción:"));
        switch (opcion) {
            case 1: {
                les.agregarDC();
                mostrarMenu();
                break;
            }
            case 2: {
                les.editar();
                mostrarMenu();
                break;
            }
            case 3: {
                les.inactivar();
                mostrarMenu();
                break;
            }
            case 4: {
                les.mostrarElementos();
                mostrarMenu();
                break;
            }
            case 5: {
                break;
            }
            default: {
                JOptionPane.showMessageDialog(null,
                        "Opción incorrecta!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void mostrarMenuComentarios() {
        ColaComentarios les = new ColaComentarios();
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "***Menú Comentarios***\n\n"
                + "1. Registrar comentario\n"
                + "2. Mostrar Comentarios\n"
                + "3. Salir del sistema\n\n"
                + "Digite su opción:"));
        switch (opcion) {
            case 1: {
                les.encolar();
                mostrarMenuComentarios();
                break;
            }
            case 2: {
                les.mostrarElementos();
                mostrarMenuComentarios();
                break;
            }
            case 3: {
                break;
            }
            default: {
                JOptionPane.showMessageDialog(null,
                        "Opción incorrecta!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void mostrarMenuClientes() {
        LSCclientes les = new LSCclientes();
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "***Menú Clientes***\n\n"
                + "1. Agregar Cliente\n"
                + "2. Editar\n"
                + "3. Inactivar cliente\n"
                + "4. Mostrar Clientes\n"
                + "5. Salir del sistema\n\n"
                + "Digite su opción:"));
        switch (opcion) {
            case 1: {
                les.agregar();
                mostrarMenu();
                break;
            }
            case 2: {
                les.editar();
                mostrarMenu();
                break;
            }
            case 3: {
                les.inactivar();
                mostrarMenu();
                break;
            }
            case 4: {
                les.mostrarElementos();
                mostrarMenu();
                break;
            }
            case 5: {
                break;
            }
            default: {
                JOptionPane.showMessageDialog(null,
                        "Opción incorrecta!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void mostrarMenuBatidos() {

        LESbatidos les = new LESbatidos();
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "***Menú Batidos***\n\n"
                + "1. Agregar batido\n"
                + "2. Editar batido\n"
                + "3. Inactivar batido\n"
                + "4. Mostrar batidos\n"
                + "5. Salir del sistema\n\n"
                + "Digite su opción:"));
        switch (opcion) {
            case 1: {
                les.agregar();
                mostrarMenuBatidos();
                break;
            }
            case 2: {
                les.editar();
                mostrarMenuBatidos();
                break;
            }
            case 3: {
                les.inactivar();
                mostrarMenuBatidos();
                break;
            }
            case 4: {
                les.mostrarElementos();
                mostrarMenuBatidos();
                break;
            }
            case 5: {
                break;
            }
            default: {
                JOptionPane.showMessageDialog(null,
                        "Opción incorrecta!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
