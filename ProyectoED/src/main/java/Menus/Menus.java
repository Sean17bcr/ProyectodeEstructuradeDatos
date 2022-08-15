package Menus;

import BaseDatos.ColaComentarios;
import BaseDatos.LDCingredientes;
import BaseDatos.LESCatalogoClientes;
import BaseDatos.LESHelados;
import BaseDatos.LSCclientes;
import BaseDatos.LDCcatalogolibros;
import com.mycompany.proyectoed.Lista;
import com.mycompany.proyectoed.Modulo2_Catalog;
import javax.swing.JOptionPane;

/**
 *
 * @author Sean
 */
public class Menus {

    byte op = 0;
    private int opcion;

    public void mostrarMenuLogin() {

        Lista L = new Lista();

        String menuPersona = "Opciones a mostrar\n"
                + "1.Agregar personas\n"
                + "2.Mostrar a las personas agregadas\n"
                + "3.Extraer primer persona ingresada\n"
                + "4.Extraer usuario especifico\n"
                + "5.Salir";

        do {
            op = Byte.parseByte(JOptionPane.showInputDialog(null, "Digite la opcion que desea ingresar: \n"
                    + menuPersona));

            switch (op) {
                case 1:
                    L.agregar();
                    break;
                case 2:
                    L.mostrarElementos();
                    break;
                case 3:
                    L.extraerDelInicio();
                    break;
                case 4:
                    L.extraerEspecifico();
                    break;
                case 5:
                    op = 5;
                default:
            }

        } while (op
                != 5);

    }

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

        LESHelados les = new LESHelados();
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
    public void mostarMenuCatalogosdeLibros(){
     LDCcatalogolibros MC2 = new LDCcatalogolibros();
     opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "***Menú Librería***\n\n"
                + "1. Agregar libro\n"
                + "2. Editar libros\n"
                + "3. Inactivar libros\n"
                + "4. Salir del sistema\n"
                + "Digite su opción:"));
      switch (opcion) {
            case 1: {
                MC2.agregar();
                mostrarMenuBatidos();
                break;
            }
            case 2: {
                MC2.Editar();
                mostrarMenuBatidos();
                break;
            }
            case 3: {
                MC2.Inactivar();
                mostrarMenuBatidos();
                break;
            }
            case 4: {
                break;
            }
            default: {
                JOptionPane.showMessageDialog(null,
                        "Opción incorrecta!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        
        
        
        
        
    }
}
