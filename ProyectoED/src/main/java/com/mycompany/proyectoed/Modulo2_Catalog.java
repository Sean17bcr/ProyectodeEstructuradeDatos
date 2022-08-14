
package com.mycompany.proyectoed;

import javax.swing.JOptionPane;

public class Modulo2_Catalog {
    
    private NodoCD_catalog inicio1;
    private NodoCD_catalog fin1;
    private int ContNod1;
    
    private NodoCD_catalog inicio2;
    private NodoCD_catalog fin2;
    private int ContNod2;
    
    private NodoCD_catalog inicio3;
    private NodoCD_catalog fin3;
    private int ContNod3;
    
    private NodoCD_catalog inicio4;
    private NodoCD_catalog fin4;
    private int ContNod4;
    
    public Modulo2_Catalog(){
        this.inicio1 = null;
        this.fin1 = null;
        this.ContNod1 = 0;
        
        this.inicio2 = null;
        this.fin2 = null;
        this.ContNod2 = 0;
        
        this.inicio3 = null;
        this.fin3 = null;
        this.ContNod3 = 0;
        
        this.inicio4 = null;
        this.fin4 = null;
        this.ContNod4 = 0;
        
    }
    
    public boolean esVaciaDC1() {
        if (inicio1 == null) {
            return true;
        } else {
            return false;
        }
    }
    public boolean esVaciaDC2() {
        if (inicio2 == null) {
            return true;
        } else {
            return false;
        }
    }
    public boolean esVaciaDC3() {
        if (inicio3 == null) {
            return true;
        } else {
            return false;
        }
    }
    public boolean esVaciaDC4() {
        if (inicio4 == null) {
            return true;
        } else {
            return false;
        }
    }
    
 
    
    public void agregar(){
        int VID = Integer.parseInt(JOptionPane.showInputDialog(null,"Coloque el codigo del libro que desea agregar"));
        int OpS = Integer.parseInt(JOptionPane.showInputDialog(null,"Indique a que lista desea agregar el libro"+"\n"+""));
        
        if(OpS == 1){
            //Buscar en la lista 2 si hay un elemento similar
            int CT2 =0;
            catalog_item ci2 = new catalog_item();
            boolean encontrado2 = false;
            NodoCD_catalog aux2 = inicio2;
            while(!encontrado2 && CT2 != ContNod2){
                if(VID == aux2.getElemento().getLibroID()){
                    encontrado2 = true;
                }
                aux2 = aux2.getSiguiente();
                CT2++;
            }
            if(encontrado2 == false){
                //Buscar en la lista 3 si hay un elemnto similar
                int CT3 =0;
                catalog_item ci3 = new catalog_item();
                boolean encontrado3 = false;
                NodoCD_catalog aux3 = inicio3;
                while(!encontrado3 && CT3 != ContNod3){
                    if(VID == aux3.getElemento().getLibroID()){
                        encontrado3 = true;
                    }
                    aux3 = aux3.getSiguiente();
                    CT3++;
                }
                if(encontrado3 == false){
                    // la funcion a agregar
                    catalog_item c = new catalog_item();
                    c.setLibroID(VID);
                    c.setNombre(JOptionPane.showInputDialog(null,"Ingese el nombre del libro"));
                    c.setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de paginas que tiene el libro")));
                    c.setFecha_pub(JOptionPane.showInputDialog(null,"Ingrese la fecha de publicaccion del libro"));
                    c.setEstado(JOptionPane.showInputDialog(null,"Ingrese el estado del libro dentro de la biblioteca"));
                    NodoCD_catalog nuevo = new NodoCD_catalog();
                    nuevo.setElemento(c);
                    if(esVaciaDC1()){
                        inicio1 = nuevo;
                        fin1 = nuevo;
                        fin1.setSiguiente(inicio1);
                        inicio1.setAnterior(fin1);
                    }else if(c.getLibroID()<inicio1.getElemento().getLibroID()){
                        nuevo.setSiguiente(inicio1);
                        inicio1 = nuevo;
                        fin1.setSiguiente(inicio1);
                        inicio1.setSiguiente(inicio1);
                    }else if(c.getLibroID() >= fin1.getElemento().getLibroID()){
                        fin1.setSiguiente(nuevo);
                        fin1 = nuevo;
                        fin1.setSiguiente(inicio1);
                        inicio1.setSiguiente(fin1);
                    }else{
                        NodoCD_catalog auxt = inicio1;
                        while(auxt.getSiguiente().getElemento().getLibroID() < c.getLibroID()){
                            auxt = auxt.getSiguiente();
                        }
                        nuevo.setSiguiente(auxt.getSiguiente());
                        nuevo.setAnterior(auxt);
                        auxt.setSiguiente(nuevo);
                        nuevo.getSiguiente().setAnterior(nuevo);
                        ContNod1++;
                    }
                    ContNod1++;
                }else{
                   JOptionPane.showMessageDialog(null, "El Libro a ingresar ya se encuentra en la lista 3"); 
                }
                ContNod1++;
            }else{
                JOptionPane.showMessageDialog(null, "El Libro a ingresar ya se encuentra en la lista 2");
            }
        }else if(OpS == 2){
            // Buscar en la lista 1 si hay un elmento similar
            int CT1 =0;
            catalog_item ci1 = new catalog_item();
            boolean encontrado1 = false;
            NodoCD_catalog aux1 = inicio2;
            while(!encontrado1 && CT1 != ContNod2){
                if(VID == aux1.getElemento().getLibroID()){
                    encontrado1 = true;
                }
                aux1 = aux1.getSiguiente();
                CT1++;
            }
            if(encontrado1 ==false){
                //Buscar en la lista 3 si hay un elemnto similar
                int CT3 =0;
                catalog_item ci3 = new catalog_item();
                boolean encontrado3 = false;
                NodoCD_catalog aux3 = inicio3;
                while(!encontrado3 && CT3 != ContNod3){
                    if(VID == aux3.getElemento().getLibroID()){
                        encontrado3 = true;
                    }
                    aux3 = aux3.getSiguiente();
                    CT3++;
                }
                if(encontrado3 == false){
                    // la funcion a agregar
                    catalog_item c = new catalog_item();
                    c.setLibroID(VID);
                    c.setNombre(JOptionPane.showInputDialog(null,"Ingese el nombre del libro"));
                    c.setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de paginas que tiene el libro")));
                    c.setFecha_pub(JOptionPane.showInputDialog(null,"Ingrese la fecha de publicaccion del libro"));
                    c.setEstado(JOptionPane.showInputDialog(null,"Ingrese el estado del libro dentro de la biblioteca"));
                    NodoCD_catalog nuevo = new NodoCD_catalog();
                    nuevo.setElemento(c);
                    if(esVaciaDC2()){
                        inicio2 = nuevo;
                        fin2 = nuevo;
                        fin2.setSiguiente(inicio2);
                        inicio2.setAnterior(fin2);
                    }else if(c.getLibroID()<inicio2.getElemento().getLibroID()){
                        nuevo.setSiguiente(inicio2);
                        inicio2 = nuevo;
                        fin2.setSiguiente(inicio2);
                        inicio2.setSiguiente(inicio2);
                    }else if(c.getLibroID() >= fin2.getElemento().getLibroID()){
                        fin2.setSiguiente(nuevo);
                        fin2 = nuevo;
                        fin2.setSiguiente(inicio2);
                        inicio2.setSiguiente(fin2);
                    }else{
                        NodoCD_catalog aux2 = inicio2;
                        while(aux2.getSiguiente().getElemento().getLibroID() < c.getLibroID()){
                            aux2 = aux2.getSiguiente();
                        }
                        nuevo.setSiguiente(aux2.getSiguiente());
                        nuevo.setAnterior(aux2);
                        aux2.setSiguiente(nuevo);
                        nuevo.getSiguiente().setAnterior(nuevo);
                        ContNod2++;
                    }
                    ContNod2++;
                }else{
                    JOptionPane.showMessageDialog(null, "El Libro a ingresar ya se encuentra en la lista 3"); 
                }
            }else{
                JOptionPane.showMessageDialog(null, "El Libro a ingresar ya se encuentra en la lista 1"); 
            }
        }else if(OpS == 3){
            //Buscaren la lista 1 si hay elemntos similares
            int CT1 =0;
            catalog_item ci1 = new catalog_item();
            boolean encontrado1 = false;
            NodoCD_catalog aux1 = inicio2;
            while(!encontrado1 && CT1 != ContNod2){
                if(VID == aux1.getElemento().getLibroID()){
                    encontrado1 = true;
                }
                aux1 = aux1.getSiguiente();
                CT1++;
            }if(encontrado1 ==false){
            
                //Buscaren la lista 2 si hay elemntos similares
                int CT2 =0;
                catalog_item ci2 = new catalog_item();
                boolean encontrado2 = false;
                NodoCD_catalog aux2 = inicio2;
                while(!encontrado2 && CT2 != ContNod2){
                    if(VID == aux2.getElemento().getLibroID()){
                        encontrado2 = true;
                    }
                    aux2 = aux2.getSiguiente();
                    CT2++;
                }
                if(encontrado2 == false){
                    // la funcion a agregar
                    catalog_item c = new catalog_item();
                    c.setLibroID(VID);
                    c.setNombre(JOptionPane.showInputDialog(null,"Ingese el nombre del libro"));
                    c.setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de paginas que tiene el libro")));
                    c.setFecha_pub(JOptionPane.showInputDialog(null,"Ingrese la fecha de publicaccion del libro"));
                    c.setEstado(JOptionPane.showInputDialog(null,"Ingrese el estado del libro dentro de la biblioteca"));
                    NodoCD_catalog nuevo = new NodoCD_catalog();
                    nuevo.setElemento(c);
                    if(esVaciaDC3()){
                        inicio3 = nuevo;
                        fin3 = nuevo;
                        fin3.setSiguiente(inicio3);
                        inicio3.setAnterior(fin3);
                    }else if(c.getLibroID()<inicio3.getElemento().getLibroID()){
                        nuevo.setSiguiente(inicio3);
                        inicio3 = nuevo;
                        fin3.setSiguiente(inicio3);
                        inicio3.setSiguiente(inicio3);
                    }else if(c.getLibroID() >= fin3.getElemento().getLibroID()){
                        fin3.setSiguiente(nuevo);
                        fin3 = nuevo;
                        fin3.setSiguiente(inicio3);
                        inicio3.setSiguiente(fin3);
                    }else{
                        NodoCD_catalog aux3 = inicio3;
                        while(aux3.getSiguiente().getElemento().getLibroID() < c.getLibroID()){
                            aux3 = aux3.getSiguiente();
                        }
                        nuevo.setSiguiente(aux3.getSiguiente());
                        nuevo.setAnterior(aux3);
                        aux3.setSiguiente(nuevo);
                        nuevo.getSiguiente().setAnterior(nuevo);
                        ContNod3++;
                    }
                    ContNod3++;
                }else{
                    JOptionPane.showMessageDialog(null, "El Libro a ingresar ya se encuentra en la lista 2");
                }
            }else{
                JOptionPane.showMessageDialog(null, "El Libro a ingresar ya se encuentra en la lista 3");
            }
            
        
           
        }else if(OpS == 4){
            // la funcion a agregar
            catalog_item c = new catalog_item();
            c.setLibroID(VID);
            c.setNombre(JOptionPane.showInputDialog(null,"Ingese el nombre del libro"));
            c.setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de paginas que tiene el libro")));
            c.setFecha_pub(JOptionPane.showInputDialog(null,"Ingrese la fecha de publicaccion del libro"));
            c.setEstado(JOptionPane.showInputDialog(null,"Ingrese el estado del libro dentro de la biblioteca"));
            NodoCD_catalog nuevo = new NodoCD_catalog();
            nuevo.setElemento(c);
            if (esVaciaDC4()){
                inicio4 = nuevo;
                fin4 = nuevo;
                fin4.setSiguiente(inicio4);
                inicio4.setAnterior(fin4);
            }else if(c.getLibroID() < inicio4.getElemento().getLibroID()){
                nuevo.setSiguiente(inicio4);
                inicio4 = nuevo;
                fin4.setSiguiente(inicio4);
                inicio4.setAnterior(fin4);
            }else if(c.getLibroID() >= fin4.getElemento().getLibroID()){
                fin4.setSiguiente(nuevo);
                fin4 = nuevo;      
                fin4.setSiguiente(inicio4);
                inicio4.setAnterior(fin4);
            }else{
                NodoCD_catalog aux4 = inicio4;
                while (aux4.getSiguiente().getElemento().getLibroID() < c.getLibroID()) {
                    aux4 = aux4.getSiguiente();
                }
                nuevo.setSiguiente(aux4.getSiguiente());
                nuevo.setAnterior(aux4);
                aux4.setSiguiente(nuevo);
                nuevo.getSiguiente().setAnterior(nuevo);
                ContNod4++;
            } 
            ContNod4++;
        }
    }
    
    public void Editar(){
        int VID = Integer.parseInt(JOptionPane.showInputDialog(null,"Coloque el codigo del libro que desea agregar"));
        int OpS = Integer.parseInt(JOptionPane.showInputDialog(null,"Indique a que lista desea editar un libro"));
        
        if(OpS == 1){
            //Buscar en la lista 2 si ya se encuentra existente en el sistema
            int CN2 =0;
            NodoCD_catalog aux2 = inicio2;
            boolean encontrar = false;
            if(!esVaciaDC2()){
                while(!encontrar && CN2 != ContNod2){
                    if (VID == aux2.getElemento().getLibroID()){
                        encontrar = true;
                    }
                    aux2 = aux2.getSiguiente();
                    CN2++;
                }
                if(encontrar == false){
                    //Si no se encontro ningun elemnto con el mismo ID en la lista 2, siguie con la 3
                    int CN3 = 0;
                    NodoCD_catalog aux3 = inicio3;
                    boolean encontrar3 = false;
                    if(esVaciaDC3()){
                        while(!encontrar3 && CN3 != ContNod3){
                            if(VID == aux3.getElemento().getLibroID()){
                                encontrar3 = true;
                            }
                            aux3 = aux3.getSiguiente();
                            CN3++;
                        }
                        if(encontrar3 == false){
                            //Si no se encontro ningun elemnto con el mismo ID en la lista 3, buscara en la lista 1 
                            int CN1 = 0;
                            NodoCD_catalog aux1 = inicio1;
                            boolean encontrar1 = false;
                            if(esVaciaDC1()){
                                while(!encontrar1 && CN1 != ContNod1){
                                    if(VID == aux1.getElemento().getLibroID()){
                                        encontrar1 = true;
                                        aux1.getElemento().setFecha_pub(JOptionPane.showInputDialog(null,"Ingese la nueva fecha de publicaccion del libro" + aux1.getElemento().getNombre()));
                                        aux1.getElemento().setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingese la nueva cantidad de paginas del libro" +aux1.getElemento().getNombre())));
                                    }
                                    aux1 = aux1.getSiguiente();
                                    CN1++;
                                }
                                if(encontrar1 == false){
                                    // no hay ningun elemento en la lista con ese
                                    JOptionPane.showMessageDialog(null,"No hay ningun lbro con el ID de : "+ VID);
                                }
                            }else{
                                // si no hay ningun elemento en la lista 
                                JOptionPane.showMessageDialog(null,"No hay ningun libro en la lista 1");
                            }
                        }else{
                            // ya hay un libro con el mismo ID en la lista 3
                            JOptionPane.showMessageDialog(null,"El libro ya se encuentra en la lista 3");
                        }
                        
                    }else{
                        int CN1 = 0;
                        NodoCD_catalog aux1 = inicio1;
                        boolean encontrar1 = false;
                        if(esVaciaDC1()){
                            while(!encontrar1 && CN1 != ContNod1){
                                if(VID == aux1.getElemento().getLibroID()){
                                    encontrar1 = true;
                                    aux1.getElemento().setFecha_pub(JOptionPane.showInputDialog(null,"Ingese la nueva fecha de publicaccion del libro" + aux1.getElemento().getNombre()));
                                    aux1.getElemento().setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingese la nueva cantidad de paginas del libro" +aux1.getElemento().getNombre())));
                                }
                                aux1 = aux1.getSiguiente();
                                CN1++;
                            }
                            if(encontrar1 == false){
                                // no hay un libro con el ID que se busca 
                                JOptionPane.showMessageDialog(null,"No hay ningun lbro con el ID de : "+ VID);
                            }
                            
                        }else{
                            // no hay libros en la lista 1
                            JOptionPane.showMessageDialog(null,"No hay ningun libro en la lista 1");
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"El libro ya se encuentra agregado en la lista 2");
                }
            }else{
                 int CN3 = 0;
                    NodoCD_catalog aux3 = inicio3;
                    boolean encontrar3 = false;
                    if(esVaciaDC3()){
                        while(!encontrar3 && CN3 != ContNod3){
                            if(VID == aux3.getElemento().getLibroID()){
                                encontrar3 = true;
                            }
                            aux3 = aux3.getSiguiente();
                            CN3++;
                        }
                        if(encontrar3 == false){
                            //Si no se encontro ningun elemnto con el mismo ID en la lista 3, buscara en la lista 1 
                            int CN1 = 0;
                            NodoCD_catalog aux1 = inicio1;
                            boolean encontrar1 = false;
                            if(esVaciaDC1()){
                                while(!encontrar1 && CN1 != ContNod1){
                                    if(VID == aux1.getElemento().getLibroID()){
                                        encontrar1 = true;
                                        aux1.getElemento().setFecha_pub(JOptionPane.showInputDialog(null,"Ingese la nueva fecha de publicaccion del libro" + aux1.getElemento().getNombre()));
                                        aux1.getElemento().setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingese la nueva cantidad de paginas del libro" +aux1.getElemento().getNombre())));
                                    }
                                    aux1 = aux1.getSiguiente();
                                    CN1++;
                                }
                                if(encontrar1 == false){
                                    // no hay ningun elemento en la lista con ese
                                    JOptionPane.showMessageDialog(null,"No hay ningun lbro con el ID de : "+ VID);
                                }
                            }else{
                                // si no hay ningun elemento en la lista 
                                JOptionPane.showMessageDialog(null,"No hay ningun libro en la lista 1");
                            }
                        }else{
                            // ya hay un libro con el mismo ID en la lista 3
                            JOptionPane.showMessageDialog(null,"El libro ya se encuentra en la lista 3");
                        }
                        
                    }else{
                        int CN1 = 0;
                        NodoCD_catalog aux1 = inicio1;
                        boolean encontrar1 = false;
                        if(esVaciaDC1()){
                            while(!encontrar1 && CN1 != ContNod1){
                                if(VID == aux1.getElemento().getLibroID()){
                                    encontrar1 = true;
                                    aux1.getElemento().setFecha_pub(JOptionPane.showInputDialog(null,"Ingese la nueva fecha de publicaccion del libro" + aux1.getElemento().getNombre()));
                                    aux1.getElemento().setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingese la nueva cantidad de paginas del libro" +aux1.getElemento().getNombre())));
                                }
                                aux1 = aux1.getSiguiente();
                                CN1++;
                            }
                            if(encontrar1 == false){
                                // no hay un libro con el ID que se busca 
                                JOptionPane.showMessageDialog(null,"No hay ningun lbro con el ID de : "+ VID);
                            }
                            
                        }else{
                            // no hay libros en la lista 1
                            JOptionPane.showMessageDialog(null,"No hay ningun libro en la lista 1");
                        }
                    }
            }
            
            
            
            
            
            
            
            
            
            
            
        }else if(OpS == 2){
            //Buscar en la lista 2 si ya se encuentra existente en el sistema
            int CN1 =0;
            NodoCD_catalog aux1 = inicio1;
            boolean encontrar = false;
            if(!esVaciaDC1()){
                while(!encontrar && CN1 != ContNod1){
                    if (VID == aux1.getElemento().getLibroID()){
                        encontrar = true;
                    }
                    aux1 = aux1.getSiguiente();
                    CN1++;
                }
                if(encontrar == false){
                    //Si no se encontro ningun elemento con el mismo ID en la lista 1, siguie con la 3
                    int CN3 = 0;
                    NodoCD_catalog aux3 = inicio3;
                    boolean encontrar3 = false;
                    if(esVaciaDC3()){
                        while(!encontrar3 && CN3 != ContNod3){
                            if(VID == aux3.getElemento().getLibroID()){
                                encontrar3 = true;
                            }
                            aux3 = aux3.getSiguiente();
                            CN3++;
                        }
                        if(encontrar3 == false){
                            //Si no se encontro ningun elemnto con el mismo ID en la lista 3, buscara en la lista 1 
                            int CN2 = 0;
                            NodoCD_catalog aux2 = inicio2;
                            boolean encontrar2 = false;
                            if(esVaciaDC2()){
                                while(!encontrar2 && CN2 != ContNod2){
                                    if(VID == aux1.getElemento().getLibroID()){
                                        encontrar2 = true;
                                        aux2.getElemento().setFecha_pub(JOptionPane.showInputDialog(null,"Ingese la nueva fecha de publicaccion del libro" + aux2.getElemento().getNombre()));
                                        aux2.getElemento().setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingese la nueva cantidad de paginas del libro" +aux2.getElemento().getNombre())));
                                    }
                                    aux2 = aux2.getSiguiente();
                                    CN2++;
                                }
                                if(encontrar2 == false){
                                    // no hay ningun elemento en la lista con ese
                                    JOptionPane.showMessageDialog(null,"No hay ningun lbro con el ID de : "+ VID);
                                }
                            }else{
                                // si no hay ningun elemento en la lista 
                                JOptionPane.showMessageDialog(null,"No hay ningun libro en la lista 2");
                            }
                        }else{
                            // ya hay un libro con el mismo ID en la lista 3
                            JOptionPane.showMessageDialog(null,"El libro ya se encuentra en la lista 3");
                        }
                        
                    }else{
                        int CN2 = 0;
                        NodoCD_catalog aux2 = inicio2;
                        boolean encontrar2 = false;
                        if(esVaciaDC2()){
                            while(!encontrar2 && CN2 != ContNod2){
                                if(VID == aux2.getElemento().getLibroID()){
                                    encontrar2 = true;
                                    aux2.getElemento().setFecha_pub(JOptionPane.showInputDialog(null,"Ingese la nueva fecha de publicaccion del libro" + aux2.getElemento().getNombre()));
                                    aux2.getElemento().setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingese la nueva cantidad de paginas del libro" +aux2.getElemento().getNombre())));
                                }
                                aux2 = aux2.getSiguiente();
                                CN2++;
                            }
                            if(encontrar2 == false){
                                // no hay un libro con el ID que se busca 
                                JOptionPane.showMessageDialog(null,"No hay ningun lbro con el ID de : "+ VID);
                            }
                            
                        }else{
                            // no hay libros en la lista 1
                            JOptionPane.showMessageDialog(null,"No hay ningun libro en la lista 1");
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"El libro ya se encuentra agregado en la lista 2");
                }
            }else{
               //Si no se encontro ningun elemento con el mismo ID en la lista 1, siguie con la 3
                    int CN3 = 0;
                    NodoCD_catalog aux3 = inicio3;
                    boolean encontrar3 = false;
                    if(esVaciaDC3()){
                        while(!encontrar3 && CN3 != ContNod3){
                            if(VID == aux3.getElemento().getLibroID()){
                                encontrar3 = true;
                            }
                            aux3 = aux3.getSiguiente();
                            CN3++;
                        }
                        if(encontrar3 == false){
                            //Si no se encontro ningun elemnto con el mismo ID en la lista 3, buscara en la lista 1 
                            int CN2 = 0;
                            NodoCD_catalog aux2 = inicio2;
                            boolean encontrar2 = false;
                            if(esVaciaDC2()){
                                while(!encontrar2 && CN2 != ContNod2){
                                    if(VID == aux1.getElemento().getLibroID()){
                                        encontrar2 = true;
                                        aux2.getElemento().setFecha_pub(JOptionPane.showInputDialog(null,"Ingese la nueva fecha de publicaccion del libro" + aux2.getElemento().getNombre()));
                                        aux2.getElemento().setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingese la nueva cantidad de paginas del libro" +aux2.getElemento().getNombre())));
                                    }
                                    aux2 = aux2.getSiguiente();
                                    CN2++;
                                }
                                if(encontrar2 == false){
                                    // no hay ningun elemento en la lista con ese
                                    JOptionPane.showMessageDialog(null,"No hay ningun lbro con el ID de : "+ VID);
                                }
                            }else{
                                // si no hay ningun elemento en la lista 
                                JOptionPane.showMessageDialog(null,"No hay ningun libro en la lista 2");
                            }
                        }else{
                            // ya hay un libro con el mismo ID en la lista 3
                            JOptionPane.showMessageDialog(null,"El libro ya se encuentra en la lista 3");
                        }
                        
                    }else{
                        int CN2 = 0;
                        NodoCD_catalog aux2 = inicio2;
                        boolean encontrar2 = false;
                        if(esVaciaDC2()){
                            while(!encontrar2 && CN2 != ContNod2){
                                if(VID == aux2.getElemento().getLibroID()){
                                    encontrar2 = true;
                                    aux2.getElemento().setFecha_pub(JOptionPane.showInputDialog(null,"Ingese la nueva fecha de publicaccion del libro" + aux2.getElemento().getNombre()));
                                    aux2.getElemento().setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingese la nueva cantidad de paginas del libro" +aux2.getElemento().getNombre())));
                                }
                                aux2 = aux2.getSiguiente();
                                CN2++;
                            }
                            if(encontrar2 == false){
                                // no hay un libro con el ID que se busca 
                                JOptionPane.showMessageDialog(null,"No hay ningun lbro con el ID de : "+ VID);
                            }
                            
                        }else{
                            // no hay libros en la lista 1
                            JOptionPane.showMessageDialog(null,"No hay ningun libro en la lista 1");
                        }
                    } 
            }
            
            
            
            
            
            
            
        }else if(OpS == 3){
            //Buscar el ID del libro en la lista 1
            int CN1 =0;
            NodoCD_catalog aux1 = inicio1;
            boolean contrar1 = false;
            if(!esVaciaDC1()){
                while(!contrar1 && CN1 != ContNod1){
                    if(VID == aux1.getElemento().getLibroID()){
                        contrar1 = true;
                    }
                    aux1 = aux1.getSiguiente();
                    CN1++;
                }
                if(contrar1 == false){
                    //Buscar el ID del libro en la lista 2
                    int CN2 = 0;
                    NodoCD_catalog aux2 = inicio2;
                    boolean contar2 = false;
                    if(!esVaciaDC2()){
                        while(!contar2 && CN2 != ContNod2){
                            if(VID == aux2.getElemento().getLibroID()){
                                contar2 = true;
                            }
                            aux2 = aux2.getSiguiente();
                            CN2++;
                        }
                        if(contar2 == false){
                            //Buscar el ID del libro en la lista 3
                            int CN3 = 0;
                            NodoCD_catalog aux3 = inicio3;
                            boolean contar3 = false;
                            if(!esVaciaDC3()){
                                while(!contar3 && CN3 != ContNod3){
                                    if(VID == aux2.getElemento().getLibroID()){
                                        contar3 = true;
                                        aux3.getElemento().setFecha_pub(JOptionPane.showInputDialog(null,"Ingese la nueva fecha de publicaccion del libro" + aux3.getElemento().getNombre()));
                                        aux3.getElemento().setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingese la nueva cantidad de paginas del libro" +aux3.getElemento().getNombre())));
                                    }
                                    aux3 = aux3.getSiguiente();
                                    CN3++;
                                }
                                if(contar3 == false){
                                    JOptionPane.showMessageDialog(null,"El ID del libro no se encuentra en la lista 3" + VID);
                                }
                            }else{
                                JOptionPane.showMessageDialog(null,"No hay ningun elemento en la lista 3");
                            }
                        }else{
                            JOptionPane.showMessageDialog(null,"Ya se encuentra el elmento en la Lista 2");
                        }
                        
                       
                    }else{
                       //Buscar el ID del libro en la lista 3
                            int CN3 = 0;
                            NodoCD_catalog aux3 = inicio3;
                            boolean contar3 = false;
                            if(!esVaciaDC3()){
                                while(!contar3 && CN3 != ContNod3){
                                    if(VID == aux2.getElemento().getLibroID()){
                                        contar3 = true;
                                        aux3.getElemento().setFecha_pub(JOptionPane.showInputDialog(null,"Ingese la nueva fecha de publicaccion del libro" + aux3.getElemento().getNombre()));
                                        aux3.getElemento().setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingese la nueva cantidad de paginas del libro" +aux3.getElemento().getNombre())));
                                    }
                                    aux3 = aux3.getSiguiente();
                                    CN3++;
                                }
                                if(contar3 == false){
                                    JOptionPane.showMessageDialog(null,"El ID del libro no se encuentra en la lista 3" + VID);
                                }
                            }else{
                                JOptionPane.showMessageDialog(null,"No hay ningun elemento en la lista 3");
                            } 
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Ya hay un elmento en la lista 1");
                }
                
                // Empezar a buscar los elemnto de la lista 2 a 3 si la 1 esta vacia
            }else{
                int CN2 = 0;
                NodoCD_catalog aux2 = inicio2;
                boolean contar2 = false;
                if(!esVaciaDC2()){
                    while(!contar2 && CN2 != ContNod2){
                        if(VID == aux2.getElemento().getLibroID()){
                            contar2 = true;
                        }
                        aux2 = aux2.getSiguiente();
                        CN2++;
                    }
                    if(contar2 == false){
                        int CN3 = 0;
                        NodoCD_catalog aux3 = inicio3;
                        boolean contar3 = false;
                        if(!esVaciaDC3()){
                            while(!contar3 && CN3 != ContNod3){
                                if(VID == aux2.getElemento().getLibroID()){
                                    contar3 = true;
                                    aux3.getElemento().setFecha_pub(JOptionPane.showInputDialog(null,"Ingese la nueva fecha de publicaccion del libro" + aux3.getElemento().getNombre()));
                                    aux3.getElemento().setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingese la nueva cantidad de paginas del libro" +aux3.getElemento().getNombre())));
                                }
                                aux3 = aux3.getSiguiente();
                                CN3++;
                            }
                            if(contar3 == false){
                                JOptionPane.showMessageDialog(null,"El ID del libro no se encuentra en la lista 3" + VID);
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "No hay libro en la lista 3");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Ya hay un elemento con el mismo ID en la lista 2");
                    }
                }else{
                    int CN3 = 0;
                    NodoCD_catalog aux3 = inicio3;
                    boolean contar3 = false;
                    if(!esVaciaDC3()){
                        while(!contar3 && CN3 != ContNod3){
                            if(VID == aux2.getElemento().getLibroID()){
                                contar3 = true;
                                aux3.getElemento().setFecha_pub(JOptionPane.showInputDialog(null,"Ingese la nueva fecha de publicaccion del libro" + aux3.getElemento().getNombre()));
                                aux3.getElemento().setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingese la nueva cantidad de paginas del libro" +aux3.getElemento().getNombre())));
                            }
                            aux3 = aux3.getSiguiente();
                            CN3++;
                            }
                        if(contar3 == false){
                            JOptionPane.showMessageDialog(null,"El ID del libro no se encuentra en la lista 3" + VID);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "No hay libro en la lista 3");
                    }
                }
            }
            
        }else if(OpS == 4){
            int CN4 = 0;
            NodoCD_catalog aux4 = inicio4;
            boolean encontrado4 = false;
            if(!esVaciaDC4()){
                while(!encontrado4 && CN4 != ContNod4){
                    if(VID == aux4.getElemento().getLibroID()){
                        encontrado4 = true;
                        aux4.getElemento().setFecha_pub(JOptionPane.showInputDialog(null,"Ingese la nueva fecha de publicaccion del libro" + aux4.getElemento().getNombre()));
                        aux4.getElemento().setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingese la nueva cantidad de paginas del libro" +aux4.getElemento().getNombre())));
                    }
                    aux4 = aux4.getSiguiente();
                    CN4++;
                }
                if(encontrado4 == false){
                    JOptionPane.showMessageDialog(null, "No se encuentra el libro en la lisa 4 "+ VID);
                }
            }else{
                JOptionPane.showMessageDialog(null, "No hay libros en la lista 4");
            }
        }
    }

    public void Inactivar(){
        int VID = Integer.parseInt(JOptionPane.showInputDialog(null,"Coloque el codigo del libro que desea agregar"));
        int OpS = Integer.parseInt(JOptionPane.showInputDialog(null,"Indique a que lista desea editar un libro"));
        
        if(OpS == 1){
            int NM1 = 0;
            NodoCD_catalog aux1 = inicio1;
            boolean encontrado1 = false;
            if(!esVaciaDC1()){
                while(!encontrado1 && NM1 != ContNod1){
                    if(VID == aux1.getElemento().getLibroID()){
                        encontrado1 = true;
                        aux1.getElemento().setEstado("Inactivo");
                        JOptionPane.showMessageDialog(null, "Sea ha inactivado el Libro");
                    }
                    aux1 = aux1.getSiguiente();
                    NM1++;
                }
                if(encontrado1 == false){
                    JOptionPane.showMessageDialog(null,"El libro no se a podido encontrar para inactivar");
                }
            }else{
                JOptionPane.showMessageDialog(null, "No hay ningun libro en la lista 1");
            }        
        }else if(OpS == 2){
            int NM2 = 0;
            NodoCD_catalog aux2 = inicio2;
            boolean encontrado2 = false;
            if(!esVaciaDC2()){
                while(!encontrado2 && NM2 != ContNod2){
                    if(VID == aux2.getElemento().getLibroID()){
                        encontrado2 = true;
                        aux2.getElemento().setEstado("Inactivo");
                        JOptionPane.showMessageDialog(null, "Sea ha inactivado el Libro");
                    }
                    aux2 = aux2.getSiguiente();
                    NM2++;
                }
                if(encontrado2 == false){
                    JOptionPane.showMessageDialog(null,"El libro no se a podido encontrar para inactivar");
                }
            }else{
                JOptionPane.showMessageDialog(null, "No hay ningun libro en la lista 2");
            } 
            
        }else if(OpS == 3){
            int NM3 = 0;
            NodoCD_catalog aux3 = inicio3;
            boolean encontrado3 = false;
            if(!esVaciaDC3()){
                while(!encontrado3 && NM3 != ContNod3){
                    if(VID == aux3.getElemento().getLibroID()){
                        encontrado3 = true;
                        aux3.getElemento().setEstado("Inactivo");
                        JOptionPane.showMessageDialog(null, "Sea ha inactivado el Libro");
                    }
                    aux3 = aux3.getSiguiente();
                    NM3++;
                }
                if(encontrado3 == false){
                    JOptionPane.showMessageDialog(null,"El libro no se a podido encontrar para inactivar");
                }
            }else{
                JOptionPane.showMessageDialog(null, "No hay ningun libro en la lista 3");
            } 
            
        }else if(OpS == 4){
            int NM4 = 0;
            NodoCD_catalog aux4 = inicio4;
            boolean encontrado4 = false;
            if(!esVaciaDC4()){
                while(!encontrado4 && NM4 != ContNod4){
                    if(VID == aux4.getElemento().getLibroID()){
                        encontrado4 = true;
                        aux4.getElemento().setEstado("Inactivo");
                        JOptionPane.showMessageDialog(null, "Sea ha inactivado el Libro");
                    }
                    aux4 = aux4.getSiguiente();
                    NM4++;
                }
                if(encontrado4 == false){
                    JOptionPane.showMessageDialog(null,"El libro no se a podido encontrar para inactivar");
                }
            }else{
                JOptionPane.showMessageDialog(null, "No hay ningun libro en la lista 4");
            } 
        } 
    }
}

