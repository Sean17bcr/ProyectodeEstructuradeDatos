package com.mycompany.proyectoed;

import javax.swing.JOptionPane;

public class Lista {
    NodoUsuario inicio;

    public boolean esVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void agregar() {
        Persona persona = new Persona();
        //se le piden los datos a la persona
        persona.setNombre(JOptionPane.showInputDialog(null, "Digite el nombre: "));
        persona.setApellido1(JOptionPane.showInputDialog(null, "Digite el primer apellido del usuario: "));
        persona.setApellido2(JOptionPane.showInputDialog(null, "Digite el segundo apellido del usuario: "));
        persona.setNickname(JOptionPane.showInputDialog(null, "Digite el nickname del usuario: "));
        persona.setContraseña(JOptionPane.showInputDialog(null, "Digite la contraseña del usuario: "));
        persona.setEstado(Byte.parseByte(JOptionPane.showInputDialog(null, "Digite el estado del usuario: ")));

        NodoUsuario nuevoNodo = new NodoUsuario();
        nuevoNodo.setDatos(persona);

        if (esVacia()) {
            inicio = nuevoNodo;
        } else if (persona.getNombre().compareTo(inicio.getDatos().getNombre()) < 0) {
            nuevoNodo.setSiguiente(inicio);
            inicio = nuevoNodo;
        } else if (inicio.getSiguiente() == null) {
            inicio.setSiguiente(nuevoNodo);
        } else {
            NodoUsuario auxiliar = inicio;
            while ((auxiliar.getSiguiente() != null)&& (auxiliar.getSiguiente().getDatos().getEstado() < persona.getEstado())) {
                auxiliar = auxiliar.getSiguiente();
            }
            nuevoNodo.setSiguiente(auxiliar.getSiguiente());
            auxiliar.setSiguiente(nuevoNodo);
        }
    }

    public void extraerDelInicio() {
        if (!esVacia()) {
            inicio = inicio.getSiguiente();
            JOptionPane.showMessageDialog(null,
                    "¡El elemento fue extraído!");
        } else {
            JOptionPane.showMessageDialog(null,
                    "¡No se puede extraer, lista vacía!");
        }
    }

    public void extraerEspecifico() {
        if (!esVacia()) {
            String nomUsu = JOptionPane.showInputDialog(null,"Digite el nickname del usuario que desea extraer:");
            
            if (inicio.getDatos().getNickname() != nomUsu) {
                inicio = inicio.getSiguiente();
                JOptionPane.showMessageDialog(null,"¡El elemento fue extraído!");
            } else {
                NodoUsuario anterior;
                NodoUsuario auxiliar;
                anterior = inicio;
                auxiliar = inicio.getSiguiente();
                while ((auxiliar != null)&& (auxiliar.getDatos().getNickname() == nomUsu)) {
                    anterior = anterior.getSiguiente();
                    auxiliar = auxiliar.getSiguiente();
                }
                if (auxiliar != null) {
                    anterior.setSiguiente(auxiliar.getSiguiente());
                }
                JOptionPane.showMessageDialog(null,"¡El elemento fue extraído!");
            }
        }
    }

    public void mostrarElementos() {
        if (!esVacia()) {
            String s = "";
            NodoUsuario aux = inicio;
            while (aux != null) {
                s = s + "El nombre del usuario es: " + aux.getDatos().getNombre()+"\n"
                        + "El primer apellido del usuario es: "+aux.getDatos().getApellido1()+"\n"
                        + "El segundo apellido del usuario es:"+aux.getDatos().getApellido2()+"\n"
                        + "El nickname del usuario es: "+aux.getDatos().getNickname()+"\n"
                        + "La contrasena del usuario es: "+aux.getDatos().getContraseña()+"\n"
                        + "El estado de la persona es(indicando un 0 es por inactiva y un 1 es por activa)"+aux.getDatos().getEstado()+"\n";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null,"La lista contiene:\n" + s);
        } else {
            JOptionPane.showMessageDialog(null,"No existen elementos para mostrar, lista vacía!");
        }
    }

}
