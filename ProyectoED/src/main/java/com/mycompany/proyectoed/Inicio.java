package com.mycompany.proyectoed;

import javax.swing.JOptionPane;

public class Inicio {
    public static void main(String[] args) {
    
        Lista L = new Lista();
        /*L.agregar();
        L.mostrarElementos();
        L.extraerDelInicio();
        L.extraerEspecifico();*/
//comentario
// com2  com 3
//tengo hambre
        
        byte op = 0;
   
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

        } while (op != 5);

    }

}
