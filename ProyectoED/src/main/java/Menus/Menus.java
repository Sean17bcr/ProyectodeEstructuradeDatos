package Menus;

import BaseDatos.LDCingredientes;
import BaseDatos.LDEatalogoEmpleado;
import BaseDatos.LEShelados;
import BaseDatos.LSCclientes;
import com.mycompany.proyectoed.Lista;
import com.mycompany.proyectoed.frm_Inicio;
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
                + "5.Ver menu principal";

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
                    L.inactivarEspecifico();
                    break;
                case 5:
                    frm_Inicio inicio = new frm_Inicio();
                    inicio.setVisible(true);
                    inicio.setLocationRelativeTo(null);
                case 6:
                    op = 6;
                    
                default:
            }

        } while (op != 6);

    }

    public void mostrarMenuCatalogoEmpleado() {
        LDEatalogoEmpleado les = new LDEatalogoEmpleado();
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
                mostrarMenuCatalogoEmpleado();
                break;
            }
            case 2: {
                les.editarID();
                mostrarMenuCatalogoEmpleado();
                break;
            }
            case 3: {
                //les.inactivar();
                mostrarMenuCatalogoEmpleado();
                break;
            }
            case 4: {
                les.mostrarElementos();
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

    public void mostrarMenuIngredientes() {
        LDCingredientes les = new LDCingredientes();
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "***Menú Clientes***\n\n"
                + "1. Agregar Ingrediente\n"
                + "2. Editar Ingrediente\n"
                //+ "3. Inactivar ingrediente\n"
                + "3. Mostrar Ingredientes\n"
                + "4. Salir del sistema\n\n"
                + "Digite su opción:"));
        switch (opcion) {
            case 1: {
                les.agregarDC();
                mostrarMenuIngredientes();
                break;
            }
            case 2: {
                les.editar();
                mostrarMenuIngredientes();
                break;
            }
            case 3: {
                les.mostrarElementos();
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
        LSCclientes les = new LSCclientes();
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "***Menú Clientes***\n\n"
                + "1. Agregar Cliente\n"
                + "2. Editar\n"
                + "3. Inactivar Cuenta del Cliente\n"
                + "4. Mostrar todos los Clientes\n"
                + "5. Salir del sistema\n\n"
                + "Digite su opción:"));
        switch (opcion) {
            case 1: {
                les.agregar();
                mostrarMenuClientes();
                break;
            }
            case 2: {
                les.editar();
                mostrarMenuClientes();
                break;
            }
            case 3: {
                les.inactivar();
                mostrarMenuClientes();
                break;
            }
            case 4: {
                les.mostrarElementos();
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

        LEShelados les = new LEShelados();
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "***Menú Batidos***\n\n"
                + "1. Agregar helado\n"
                + "2. Editar helado\n"
                + "3. Mostrar batidos\n"
                + "4. Salir del sistema\n\n"
                + "Digite su opción:"));
        switch (opcion) {
            case 1: {
                les.agregar();
                mostrarMenuHelados();
                break;
            }
            case 2: {
                les.editar();
                mostrarMenuHelados();
                break;
            }
            case 3: {
                les.mostrarElementos();
                mostrarMenuHelados();
                //les.inactivar();
                //mostrarMenuHelados();
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
