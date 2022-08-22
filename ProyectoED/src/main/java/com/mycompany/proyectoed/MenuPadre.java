
package com.mycompany.proyectoed;
import Menus.Menus;
import javax.swing.JOptionPane;

public class MenuPadre {
    private Menus MUP = new Menus();
    private int opcion;
    public void mostrarMenu(){
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"***Menú principal***\n\n"
                +"1.Registro de Usuario\n"
                +"2.Catalogo de clientes\n"
                +"3.Ingredientes\n"
                +"4.Comentarios\n"
                +"5.Clientes\n"
                +"6.Batidos\n"
                +"7.salir\n\n"
                +"Digite su opcíon:"));
        
        switch (opcion) {
            case 1:{
                MUP.mostrarMenuLogin();
                mostrarMenu();
                break;
            }
            case 2:{
                MUP.mostrarMenuCatalogoEmpleado();
                mostrarMenu();
                break;
            }
            case 3:{
                MUP.mostrarMenuIngredientes();
                mostrarMenu();
                break;
            }
            case 4:{
                //MUP.mostrarMenuComentarios();
                mostrarMenu();
                break;
            }
            case 5:{
                MUP.mostrarMenuClientes();
                mostrarMenu();
                break;
            }
            case 6:{
                MUP.mostrarMenuHelados();
                break;
            }
            case 7:{
                System.exit(0);
                break;
            }
            default:{
                    JOptionPane.showMessageDialog(null,"Opción incorrecta","Error",JOptionPane.ERROR_MESSAGE);
                    }
        }
        
        
    }
    
    
}
