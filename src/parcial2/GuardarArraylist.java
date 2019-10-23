package parcial2;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class GuardarArraylist {
    
    static String NOMBRE_ARCHIVO_CONTACTOS = ("Agenda.txt");
    private PrintWriter objArEscritura;
    
    public void guardarArrayList(ArrayList<Contacto> ListaContactos){
    
        try{
        objArEscritura = new PrintWriter(new FileWriter(NOMBRE_ARCHIVO_CONTACTOS,false));
        for(int i=0; i<ListaContactos.size(); i++){
        objArEscritura.print(ListaContactos.get(i));
        }
        
        System.out.println("Agenda Guardada");
        
        }catch (IOException e){
        System.out.println("Error " + e.getMessage());
        } finally {
           objArEscritura.close();
        }
    
    }
    
    public void agregarElemento(Contacto contacto){
    
    try{
    objArEscritura = new PrintWriter(new FileWriter(NOMBRE_ARCHIVO_CONTACTOS,true));
    objArEscritura.print(contacto);
    System.out.println("Contacto Guardado");
    }catch (IOException e){
    System.out.println("Error: " + e.getMessage());
    }finally{
    objArEscritura.close();
    }
    }
    
}
