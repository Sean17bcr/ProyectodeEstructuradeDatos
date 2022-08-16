
package BaseDatos;
import javax.swing.JOptionPane;
import Informacion.DatoLibro;
import nodosAutilizar.NodoDCLibro1;
import nodosAutilizar.NodoDCLibro2;
import nodosAutilizar.NodoDCLibro3;
import nodosAutilizar.NodoDCLibro4;

public class LDCcatalogolibros {
    
    
    private NodoDCLibro1 inicio1;
    private NodoDCLibro1 fin1;
    private int ContNod1;
    
    private NodoDCLibro2 inicio2;
    private NodoDCLibro2 fin2;
    private int ContNod2;
    
    private NodoDCLibro3 inicio3;
    private NodoDCLibro3 fin3;
    private int ContNod3;
    
    private NodoDCLibro4 inicio4;
    private NodoDCLibro4 fin4;
    private int ContNod4;
    
    public LDCcatalogolibros(){
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
            boolean encontrado2 = false;
            NodoDCLibro2 aux2 = inicio2;
            while(!encontrado2 && CT2 != ContNod2){
                if(VID == aux2.getElemento2().getLibroID()){
                    encontrado2 = true;
                }
                aux2 = aux2.getSiguiente2();
                CT2++;
            }
            if(encontrado2 == false){
                //Buscar en la lista 3 si hay un elemnto similar
                int CT3 =0;
                boolean encontrado3 = false;
                NodoDCLibro3 aux3 = inicio3;
                while(!encontrado3 && CT3 != ContNod3){
                    if(VID == aux3.getElemento3().getLibroID()){
                        encontrado3 = true;
                    }
                    aux3 = aux3.getSiguiente3();
                    CT3++;
                }
                if(encontrado3 == false){
                    // la funcion a agregar
                    DatoLibro c = new DatoLibro();
                    c.setLibroID(VID);
                    c.setNombre(JOptionPane.showInputDialog(null,"Ingese el nombre del libro"));
                    c.setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de paginas que tiene el libro")));
                    c.setFecha_pub(JOptionPane.showInputDialog(null,"Ingrese la fecha de publicaccion del libro"));
                    c.setEstado(JOptionPane.showInputDialog(null,"Ingrese el estado del libro dentro de la biblioteca"));
                    NodoDCLibro1 nuevo = new NodoDCLibro1();
                    nuevo.setElemento1(c);
                    if(esVaciaDC1()){
                        inicio1 = nuevo;
                        fin1 = nuevo;
                        fin1.setSiguiente1(inicio1);
                        inicio1.setAnterior1(fin1);
                    }else if(c.getLibroID()<inicio1.getElemento1().getLibroID()){
                        nuevo.setSiguiente1(inicio1);
                        inicio1 = nuevo;
                        fin1.setSiguiente1(inicio1);
                        inicio1.setSiguiente1(inicio1);
                    }else if(c.getLibroID() >= fin1.getElemento1().getLibroID()){
                        fin1.setSiguiente1(nuevo);
                        fin1 = nuevo;
                        fin1.setSiguiente1(inicio1);
                        inicio1.setSiguiente1(fin1);
                    }else{
                        NodoDCLibro1 auxt = inicio1;
                        while(auxt.getSiguiente1().getElemento1().getLibroID() < c.getLibroID()){
                            auxt = auxt.getSiguiente1();
                        }
                        nuevo.setSiguiente1(auxt.getSiguiente1());
                        nuevo.setAnterior1(auxt);
                        auxt.setSiguiente1(nuevo);
                        nuevo.getSiguiente1().setAnterior1(nuevo);
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
            boolean encontrado1 = false;
            NodoDCLibro1 aux1 = inicio1;
            while(!encontrado1 && CT1 != ContNod1){
                if(VID == aux1.getElemento1().getLibroID()){
                    encontrado1 = true;
                }
                aux1 = aux1.getSiguiente1();
                CT1++;
            }
            if(encontrado1 ==false){
                //Buscar en la lista 3 si hay un elemnto similar
                int CT3 =0;
                boolean encontrado3 = false;
                NodoDCLibro3 aux3 = inicio3;
                while(!encontrado3 && CT3 != ContNod3){
                    if(VID == aux3.getElemento3().getLibroID()){
                        encontrado3 = true;
                    }
                    aux3 = aux3.getSiguiente3();
                    CT3++;
                }
                if(encontrado3 == false){
                    // la funcion a agregar
                    DatoLibro c = new DatoLibro();
                    c.setLibroID(VID);
                    c.setNombre(JOptionPane.showInputDialog(null,"Ingese el nombre del libro"));
                    c.setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de paginas que tiene el libro")));
                    c.setFecha_pub(JOptionPane.showInputDialog(null,"Ingrese la fecha de publicaccion del libro"));
                    c.setEstado(JOptionPane.showInputDialog(null,"Ingrese el estado del libro dentro de la biblioteca"));
                    NodoDCLibro2 nuevo = new NodoDCLibro2();
                    nuevo.setElemento2(c);
                    if(esVaciaDC2()){
                        inicio2 = nuevo;
                        fin2 = nuevo;
                        fin2.setSiguiente2(inicio2);
                        inicio2.setAnterior2(fin2);
                    }else if(c.getLibroID()<inicio2.getElemento2().getLibroID()){
                        nuevo.setSiguiente2(inicio2);
                        inicio2 = nuevo;
                        fin2.setSiguiente2(inicio2);
                        inicio2.setSiguiente2(inicio2);
                    }else if(c.getLibroID() >= fin2.getElemento2().getLibroID()){
                        fin2.setSiguiente2(nuevo);
                        fin2 = nuevo;
                        fin2.setSiguiente2(inicio2);
                        inicio2.setSiguiente2(fin2);
                    }else{
                        NodoDCLibro2 aux2 = inicio2;
                        while(aux2.getSiguiente2().getElemento2().getLibroID() < c.getLibroID()){
                            aux2 = aux2.getSiguiente2();
                        }
                        nuevo.setSiguiente2(aux2.getSiguiente2());
                        nuevo.setAnterior2(aux2);
                        aux2.setSiguiente2(nuevo);
                        nuevo.getSiguiente2().setAnterior2(nuevo);
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
            boolean encontrado1 = false;
            NodoDCLibro1 aux1 = inicio1;
            while(!encontrado1 && CT1 != ContNod1){
                if(VID == aux1.getElemento1().getLibroID()){
                    encontrado1 = true;
                }
                aux1 = aux1.getSiguiente1();
                CT1++;
            }if(encontrado1 ==false){
            
                //Buscaren la lista 2 si hay elemntos similares
                int CT2 =0;
                boolean encontrado2 = false;
                NodoDCLibro2 aux2 = inicio2;
                while(!encontrado2 && CT2 != ContNod2){
                    if(VID == aux2.getElemento2().getLibroID()){
                        encontrado2 = true;
                    }
                    aux2 = aux2.getSiguiente2();
                    CT2++;
                }
                if(encontrado2 == false){
                    // la funcion a agregar
                    DatoLibro c = new DatoLibro();
                    c.setLibroID(VID);
                    c.setNombre(JOptionPane.showInputDialog(null,"Ingese el nombre del libro"));
                    c.setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de paginas que tiene el libro")));
                    c.setFecha_pub(JOptionPane.showInputDialog(null,"Ingrese la fecha de publicaccion del libro"));
                    c.setEstado(JOptionPane.showInputDialog(null,"Ingrese el estado del libro dentro de la biblioteca"));
                    NodoDCLibro3 nuevo = new NodoDCLibro3();
                    nuevo.setElemento3(c);
                    if(esVaciaDC3()){
                        inicio3 = nuevo;
                        fin3 = nuevo;
                        fin3.setSiguiente3(inicio3);
                        inicio3.setAnterior3(fin3);
                    }else if(c.getLibroID()<inicio3.getElemento3().getLibroID()){
                        nuevo.setSiguiente3(inicio3);
                        inicio3 = nuevo;
                        fin3.setSiguiente3(inicio3);
                        inicio3.setSiguiente3(inicio3);
                    }else if(c.getLibroID() >= fin3.getElemento3().getLibroID()){
                        fin3.setSiguiente3(nuevo);
                        fin3 = nuevo;
                        fin3.setSiguiente3(inicio3);
                        inicio3.setSiguiente3(fin3);
                    }else{
                        NodoDCLibro3 aux3 = inicio3;
                        while(aux3.getSiguiente3().getElemento3().getLibroID() < c.getLibroID()){
                            aux3 = aux3.getSiguiente3();
                        }
                        nuevo.setSiguiente3(aux3.getSiguiente3());
                        nuevo.setAnterior3(aux3);
                        aux3.setSiguiente3(nuevo);
                        nuevo.getSiguiente3().setAnterior3(nuevo);
                        ContNod3++;
                    }
                    ContNod3++;
                }else{
                    JOptionPane.showMessageDialog(null, "El Libro a ingresar ya se encuentra en la lista 2");
                }
            }else{
                JOptionPane.showMessageDialog(null, "El Libro a ingresar ya se encuentra en la lista 1");
            }
            
        
           
        }else if(OpS == 4){
            // la funcion a agregar
            DatoLibro c = new DatoLibro();
            c.setLibroID(VID);
            c.setNombre(JOptionPane.showInputDialog(null,"Ingese el nombre del libro"));
            c.setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de paginas que tiene el libro")));
            c.setFecha_pub(JOptionPane.showInputDialog(null,"Ingrese la fecha de publicaccion del libro"));
            c.setEstado(JOptionPane.showInputDialog(null,"Ingrese el estado del libro dentro de la biblioteca"));
            NodoDCLibro4 nuevo = new NodoDCLibro4();
            nuevo.setElemento4(c);
            if (esVaciaDC4()){
                inicio4 = nuevo;
                fin4 = nuevo;
                fin4.setSiguiente4(inicio4);
                inicio4.setAnterior4(fin4);
            }else if(c.getLibroID() < inicio4.getElemento4().getLibroID()){
                nuevo.setSiguiente4(inicio4);
                inicio4 = nuevo;
                fin4.setSiguiente4(inicio4);
                inicio4.setAnterior4(fin4);
            }else if(c.getLibroID() >= fin4.getElemento4().getLibroID()){
                fin4.setSiguiente4(nuevo);
                fin4 = nuevo;      
                fin4.setSiguiente4(inicio4);
                inicio4.setAnterior4(fin4);
            }else{
                NodoDCLibro4 aux4 = inicio4;
                while (aux4.getSiguiente4().getElemento4().getLibroID() < c.getLibroID()) {
                    aux4 = aux4.getSiguiente4();
                }
                nuevo.setSiguiente4(aux4.getSiguiente4());
                nuevo.setAnterior4(aux4);
                aux4.setSiguiente4(nuevo);
                nuevo.getSiguiente4().setAnterior4(nuevo);
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
            NodoDCLibro2 aux2 = inicio2;
            boolean encontrar = false;
            if(!esVaciaDC2()){
                while(!encontrar && CN2 != ContNod2){
                    if (VID == aux2.getElemento2().getLibroID()){
                        encontrar = true;
                    }
                    aux2 = aux2.getSiguiente2();
                    CN2++;
                }
                if(encontrar == false){
                    //Si no se encontro ningun elemnto con el mismo ID en la lista 2, siguie con la 3
                    int CN3 = 0;
                    NodoDCLibro3 aux3 = inicio3;
                    boolean encontrar3 = false;
                    if(esVaciaDC3()){
                        while(!encontrar3 && CN3 != ContNod3){
                            if(VID == aux3.getElemento3().getLibroID()){
                                encontrar3 = true;
                            }
                            aux3 = aux3.getSiguiente3();
                            CN3++;
                        }
                        if(encontrar3 == false){
                            //Si no se encontro ningun elemnto con el mismo ID en la lista 3, buscara en la lista 1 
                            int CN1 = 0;
                            NodoDCLibro1 aux1 = inicio1;
                            boolean encontrar1 = false;
                            if(esVaciaDC1()){
                                while(!encontrar1 && CN1 != ContNod1){
                                    if(VID == aux1.getElemento1().getLibroID()){
                                        encontrar1 = true;
                                        aux1.getElemento1().setFecha_pub(JOptionPane.showInputDialog(null,"Ingese la nueva fecha de publicaccion del libro" + aux1.getElemento1().getNombre()));
                                        aux1.getElemento1().setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingese la nueva cantidad de paginas del libro" +aux1.getElemento1().getNombre())));
                                    }
                                    aux1 = aux1.getSiguiente1();
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
                        NodoDCLibro1 aux1 = inicio1;
                        boolean encontrar1 = false;
                        if(esVaciaDC1()){
                            while(!encontrar1 && CN1 != ContNod1){
                                if(VID == aux1.getElemento1().getLibroID()){
                                    encontrar1 = true;
                                    aux1.getElemento1().setFecha_pub(JOptionPane.showInputDialog(null,"Ingese la nueva fecha de publicaccion del libro" + aux1.getElemento1().getNombre()));
                                    aux1.getElemento1().setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingese la nueva cantidad de paginas del libro" +aux1.getElemento1().getNombre())));
                                }
                                aux1 = aux1.getSiguiente1();
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
                    NodoDCLibro3 aux3 = inicio3;
                    boolean encontrar3 = false;
                    if(esVaciaDC3()){
                        while(!encontrar3 && CN3 != ContNod3){
                            if(VID == aux3.getElemento3().getLibroID()){
                                encontrar3 = true;
                            }
                            aux3 = aux3.getSiguiente3();
                            CN3++;
                        }
                        if(encontrar3 == false){
                            //Si no se encontro ningun elemnto con el mismo ID en la lista 3, buscara en la lista 1 
                            int CN1 = 0;
                            NodoDCLibro1 aux1 = inicio1;
                            boolean encontrar1 = false;
                            if(esVaciaDC1()){
                                while(!encontrar1 && CN1 != ContNod1){
                                    if(VID == aux1.getElemento1().getLibroID()){
                                        encontrar1 = true;
                                        aux1.getElemento1().setFecha_pub(JOptionPane.showInputDialog(null,"Ingese la nueva fecha de publicaccion del libro" + aux1.getElemento1().getNombre()));
                                        aux1.getElemento1().setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingese la nueva cantidad de paginas del libro" +aux1.getElemento1().getNombre())));
                                    }
                                    aux1 = aux1.getSiguiente1();
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
                        NodoDCLibro1 aux1 = inicio1;
                        boolean encontrar1 = false;
                        if(esVaciaDC1()){
                            while(!encontrar1 && CN1 != ContNod1){
                                if(VID == aux1.getElemento1().getLibroID()){
                                    encontrar1 = true;
                                    aux1.getElemento1().setFecha_pub(JOptionPane.showInputDialog(null,"Ingese la nueva fecha de publicaccion del libro" + aux1.getElemento1().getNombre()));
                                    aux1.getElemento1().setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingese la nueva cantidad de paginas del libro" +aux1.getElemento1().getNombre())));
                                }
                                aux1 = aux1.getSiguiente1();
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
            NodoDCLibro1 aux1 = inicio1;
            boolean encontrar = false;
            if(!esVaciaDC1()){
                while(!encontrar && CN1 != ContNod1){
                    if (VID == aux1.getElemento1().getLibroID()){
                        encontrar = true;
                    }
                    aux1 = aux1.getSiguiente1();
                    CN1++;
                }
                if(encontrar == false){
                    //Si no se encontro ningun elemento con el mismo ID en la lista 1, siguie con la 3
                    int CN3 = 0;
                    NodoDCLibro3 aux3 = inicio3;
                    boolean encontrar3 = false;
                    if(esVaciaDC3()){
                        while(!encontrar3 && CN3 != ContNod3){
                            if(VID == aux3.getElemento3().getLibroID()){
                                encontrar3 = true;
                            }
                            aux3 = aux3.getSiguiente3();
                            CN3++;
                        }
                        if(encontrar3 == false){
                            //Si no se encontro ningun elemnto con el mismo ID en la lista 3, buscara en la lista 1 
                            int CN2 = 0;
                            NodoDCLibro2 aux2 = inicio2;
                            boolean encontrar2 = false;
                            if(esVaciaDC2()){
                                while(!encontrar2 && CN2 != ContNod2){
                                    if(VID == aux2.getElemento2().getLibroID()){
                                        encontrar2 = true;
                                        aux2.getElemento2().setFecha_pub(JOptionPane.showInputDialog(null,"Ingese la nueva fecha de publicaccion del libro" + aux2.getElemento2().getNombre()));
                                        aux2.getElemento2().setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingese la nueva cantidad de paginas del libro" +aux2.getElemento2().getNombre())));
                                    }
                                    aux2 = aux2.getSiguiente2();
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
                        NodoDCLibro2 aux2 = inicio2;
                        boolean encontrar2 = false;
                        if(esVaciaDC2()){
                            while(!encontrar2 && CN2 != ContNod2){
                                if(VID == aux2.getElemento2().getLibroID()){
                                    encontrar2 = true;
                                    aux2.getElemento2().setFecha_pub(JOptionPane.showInputDialog(null,"Ingese la nueva fecha de publicaccion del libro" + aux2.getElemento2().getNombre()));
                                    aux2.getElemento2().setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingese la nueva cantidad de paginas del libro" +aux2.getElemento2().getNombre())));
                                }
                                aux2 = aux2.getSiguiente2();
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
                    NodoDCLibro3 aux3 = inicio3;
                    boolean encontrar3 = false;
                    if(esVaciaDC3()){
                        while(!encontrar3 && CN3 != ContNod3){
                            if(VID == aux3.getElemento3().getLibroID()){
                                encontrar3 = true;
                            }
                            aux3 = aux3.getSiguiente3();
                            CN3++;
                        }
                        if(encontrar3 == false){
                            //Si no se encontro ningun elemnto con el mismo ID en la lista 3, buscara en la lista 1 
                            int CN2 = 0;
                            NodoDCLibro2 aux2 = inicio2;
                            boolean encontrar2 = false;
                            if(esVaciaDC2()){
                                while(!encontrar2 && CN2 != ContNod2){
                                    if(VID == aux2.getElemento2().getLibroID()){
                                        encontrar2 = true;
                                        aux2.getElemento2().setFecha_pub(JOptionPane.showInputDialog(null,"Ingese la nueva fecha de publicaccion del libro" + aux2.getElemento2().getNombre()));
                                        aux2.getElemento2().setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingese la nueva cantidad de paginas del libro" +aux2.getElemento2().getNombre())));
                                    }
                                    aux2 = aux2.getSiguiente2();
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
                        NodoDCLibro2 aux2 = inicio2;
                        boolean encontrar2 = false;
                        if(esVaciaDC2()){
                            while(!encontrar2 && CN2 != ContNod2){
                                if(VID == aux2.getElemento2().getLibroID()){
                                    encontrar2 = true;
                                    aux2.getElemento2().setFecha_pub(JOptionPane.showInputDialog(null,"Ingese la nueva fecha de publicaccion del libro" + aux2.getElemento2().getNombre()));
                                    aux2.getElemento2().setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingese la nueva cantidad de paginas del libro" +aux2.getElemento2().getNombre())));
                                }
                                aux2 = aux2.getSiguiente2();
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
            NodoDCLibro1 aux1 = inicio1;
            boolean contrar1 = false;
            if(!esVaciaDC1()){
                while(!contrar1 && CN1 != ContNod1){
                    if(VID == aux1.getElemento1().getLibroID()){
                        contrar1 = true;
                    }
                    aux1 = aux1.getSiguiente1();
                    CN1++;
                }
                if(contrar1 == false){
                    //Buscar el ID del libro en la lista 2
                    int CN2 = 0;
                    NodoDCLibro2 aux2 = inicio2;
                    boolean contar2 = false;
                    if(!esVaciaDC2()){
                        while(!contar2 && CN2 != ContNod2){
                            if(VID == aux2.getElemento2().getLibroID()){
                                contar2 = true;
                            }
                            aux2 = aux2.getSiguiente2();
                            CN2++;
                        }
                        if(contar2 == false){
                            //Buscar el ID del libro en la lista 3
                            int CN3 = 0;
                            NodoDCLibro3 aux3 = inicio3;
                            boolean contar3 = false;
                            if(!esVaciaDC3()){
                                while(!contar3 && CN3 != ContNod3){
                                    if(VID == aux3.getElemento3().getLibroID()){
                                        contar3 = true;
                                        aux3.getElemento3().setFecha_pub(JOptionPane.showInputDialog(null,"Ingese la nueva fecha de publicaccion del libro" + aux3.getElemento3().getNombre()));
                                        aux3.getElemento3().setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingese la nueva cantidad de paginas del libro" +aux3.getElemento3().getNombre())));
                                    }
                                    aux3 = aux3.getSiguiente3();
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
                            NodoDCLibro3 aux3 = inicio3;
                            boolean contar3 = false;
                            if(!esVaciaDC3()){
                                while(!contar3 && CN3 != ContNod3){
                                    if(VID == aux3.getElemento3().getLibroID()){
                                        contar3 = true;
                                        aux3.getElemento3().setFecha_pub(JOptionPane.showInputDialog(null,"Ingese la nueva fecha de publicaccion del libro" + aux3.getElemento3().getNombre()));
                                        aux3.getElemento3().setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingese la nueva cantidad de paginas del libro" +aux3.getElemento3().getNombre())));
                                    }
                                    aux3 = aux3.getSiguiente3();
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
                NodoDCLibro2 aux2 = inicio2;
                boolean contar2 = false;
                if(!esVaciaDC2()){
                    while(!contar2 && CN2 != ContNod2){
                        if(VID == aux2.getElemento2().getLibroID()){
                            contar2 = true;
                        }
                        aux2 = aux2.getSiguiente2();
                        CN2++;
                    }
                    if(contar2 == false){
                        int CN3 = 0;
                        NodoDCLibro3 aux3 = inicio3;
                        boolean contar3 = false;
                        if(!esVaciaDC3()){
                            while(!contar3 && CN3 != ContNod3){
                                if(VID == aux3.getElemento3().getLibroID()){
                                    contar3 = true;
                                    aux3.getElemento3().setFecha_pub(JOptionPane.showInputDialog(null,"Ingese la nueva fecha de publicaccion del libro" + aux3.getElemento3().getNombre()));
                                    aux3.getElemento3().setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingese la nueva cantidad de paginas del libro" +aux3.getElemento3().getNombre())));
                                }
                                aux3 = aux3.getSiguiente3();
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
                    NodoDCLibro3 aux3 = inicio3;
                    boolean contar3 = false;
                    if(!esVaciaDC3()){
                        while(!contar3 && CN3 != ContNod3){
                            if(VID == aux3.getElemento3().getLibroID()){
                                contar3 = true;
                                aux3.getElemento3().setFecha_pub(JOptionPane.showInputDialog(null,"Ingese la nueva fecha de publicaccion del libro" + aux3.getElemento3().getNombre()));
                                aux3.getElemento3().setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingese la nueva cantidad de paginas del libro" +aux3.getElemento3().getNombre())));
                            }
                            aux3 = aux3.getSiguiente3();
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
            NodoDCLibro4 aux4 = inicio4;
            boolean encontrado4 = false;
            if(!esVaciaDC4()){
                while(!encontrado4 && CN4 != ContNod4){
                    if(VID == aux4.getElemento4().getLibroID()){
                        encontrado4 = true;
                        aux4.getElemento4().setFecha_pub(JOptionPane.showInputDialog(null,"Ingese la nueva fecha de publicaccion del libro" + aux4.getElemento4().getNombre()));
                        aux4.getElemento4().setNum_pag(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingese la nueva cantidad de paginas del libro" +aux4.getElemento4().getNombre())));
                    }
                    aux4 = aux4.getSiguiente4();
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
            NodoDCLibro1 aux1 = inicio1;
            boolean encontrado1 = false;
            if(!esVaciaDC1()){
                while(!encontrado1 && NM1 != ContNod1){
                    if(VID == aux1.getElemento1().getLibroID()){
                        encontrado1 = true;
                        aux1.getElemento1().setEstado("Inactivo");
                        JOptionPane.showMessageDialog(null, "Sea ha inactivado el Libro");
                    }
                    aux1 = aux1.getSiguiente1();
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
            NodoDCLibro2 aux2 = inicio2;
            boolean encontrado2 = false;
            if(!esVaciaDC2()){
                while(!encontrado2 && NM2 != ContNod2){
                    if(VID == aux2.getElemento2().getLibroID()){
                        encontrado2 = true;
                        aux2.getElemento2().setEstado("Inactivo");
                        JOptionPane.showMessageDialog(null, "Sea ha inactivado el Libro");
                    }
                    aux2 = aux2.getSiguiente2();
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
            NodoDCLibro3 aux3 = inicio3;
            boolean encontrado3 = false;
            if(!esVaciaDC3()){
                while(!encontrado3 && NM3 != ContNod3){
                    if(VID == aux3.getElemento3().getLibroID()){
                        encontrado3 = true;
                        aux3.getElemento3().setEstado("Inactivo");
                        JOptionPane.showMessageDialog(null, "Sea ha inactivado el Libro");
                    }
                    aux3 = aux3.getSiguiente3();
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
            NodoDCLibro4 aux4 = inicio4;
            boolean encontrado4 = false;
            if(!esVaciaDC4()){
                while(!encontrado4 && NM4 != ContNod4){
                    if(VID == aux4.getElemento4().getLibroID()){
                        encontrado4 = true;
                        aux4.getElemento4().setEstado("Inactivo");
                        JOptionPane.showMessageDialog(null, "Sea ha inactivado el Libro");
                    }
                    aux4 = aux4.getSiguiente4();
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
    
    public void Mostrar(){
        int OpS = Integer.parseInt(JOptionPane.showInputDialog(null,"Indique a que lista desea editar un libro"));
        
        if(OpS == 1){
           if (!esVaciaDC1()) {
               String s = "";
               NodoDCLibro1 aux = inicio1;
               s = s + "El libro con el codigo:" + aux.getElemento1().getLibroID()+ ", Tiene de nombre: " 
                       + aux.getElemento1().getNombre()
                       + ", Su fecha de publicación fue:" + aux.getElemento1().getFecha_pub()+ 
                       ", Tiene un numero de paginas de "+aux.getElemento1().getNum_pag()+"<===>";
               aux = aux.getSiguiente1();
               while (aux != inicio1) {
                   s = s + "El libro con el codigo:" +aux.getElemento1().getLibroID()+ ", Tiene de nombre:" 
                           + aux.getElemento1().getNombre()
                           + ", Su fecha de publicación fue:" + aux.getElemento1().getFecha_pub()+ 
                           ", Tiene un numero de paginas de "+ aux.getElemento1().getNum_pag()+"<===>";
                   aux = aux.getSiguiente1();
               }
               JOptionPane.showMessageDialog(null, "La lista de libros 1 contiene:\n"+ s);
           } else {
               JOptionPane.showMessageDialog(null, "La lista 1 de libros está vacía!");
           } 
        }else if(OpS ==2){
            if (!esVaciaDC2()) {
                String s = "";
                NodoDCLibro2 aux = inicio2;
                s = s + "El libro con el codigo:" + aux.getElemento2().getLibroID()+ ", Tiene de nombre: " 
                        + aux.getElemento2().getNombre()
                        + ", Su fecha de publicación fue:" + aux.getElemento2().getFecha_pub()+ 
                        ", Tiene un numero de paginas de "+aux.getElemento2().getNum_pag()+"<===>";
                aux = aux.getSiguiente2();
                while (aux != inicio2) {
                    s = s + "El libro con el codigo:" +aux.getElemento2().getLibroID()+ ", Tiene de nombre:" 
                            + aux.getElemento2().getNombre()
                            + ", Su fecha de publicación fue:" + aux.getElemento2().getFecha_pub()+ 
                            ", Tiene un numero de paginas de "+ aux.getElemento2().getNum_pag()+"<===>";
                    aux = aux.getSiguiente2();
                }
                JOptionPane.showMessageDialog(null, "La lista de libros 2 contiene:\n"+ s);
            } else {
                JOptionPane.showMessageDialog(null, "La lista 2 de libros está vacía!");
            } 
        }else if(OpS == 3){
            if (!esVaciaDC3()) {
                String s = "";
                NodoDCLibro3 aux = inicio3;
                s = s + "El libro con el codigo:" + aux.getElemento3().getLibroID()+ ", Tiene de nombre: " 
                        + aux.getElemento3().getNombre()
                        + ", Su fecha de publicación fue:" + aux.getElemento3().getFecha_pub()+ 
                        ", Tiene un numero de paginas de "+aux.getElemento3().getNum_pag()+"<===>";
                aux = aux.getSiguiente3();
                while (aux != inicio3) {
                    s = s + "El libro con el codigo:" +aux.getElemento3().getLibroID()+ ", Tiene de nombre:" 
                            + aux.getElemento3().getNombre()
                            + ", Su fecha de publicación fue:" + aux.getElemento3().getFecha_pub()+ 
                            ", Tiene un numero de paginas de "+ aux.getElemento3().getNum_pag()+"<===>";
                    aux = aux.getSiguiente3();
                }
                JOptionPane.showMessageDialog(null, "La lista de libros 3 contiene:\n"+ s);
            } else {
                JOptionPane.showMessageDialog(null, "La lista 3 de libros está vacía!");
            } 
            
        }else if(OpS == 4){
            if (!esVaciaDC4()) {
                String s = "";
                NodoDCLibro4 aux = inicio4;
                s = s + "El libro con el codigo:" + aux.getElemento4().getLibroID()+ ", Tiene de nombre: " 
                        + aux.getElemento4().getNombre()
                        + ", Su fecha de publicación fue:" + aux.getElemento4().getFecha_pub()+ 
                        ", Tiene un numero de paginas de "+aux.getElemento4().getNum_pag()+"<===>";
                aux = aux.getSiguiente4();
                while (aux != inicio4) {
                    s = s + "El libro con el codigo:" +aux.getElemento4().getLibroID()+ ", Tiene de nombre:" 
                            + aux.getElemento4().getNombre()
                            + ", Su fecha de publicación fue:" + aux.getElemento4().getFecha_pub()+ 
                            ", Tiene un numero de paginas de "+ aux.getElemento4().getNum_pag()+"<===>";
                    aux = aux.getSiguiente4();
                }
                JOptionPane.showMessageDialog(null, "La lista de libros 3 contiene:\n"+ s);
            } else {
                JOptionPane.showMessageDialog(null, "La lista 3 de libros está vacía!");
            } 
        }
    }
}
        
        
        
    
    
    
    

