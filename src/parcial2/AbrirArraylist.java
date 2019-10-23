package parcial2;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class AbrirArraylist{
    public static String NOMBRE_ARCHIVO;
    private Scanner ArchivoLectura;
    private String lectura;
    private ArrayList <Contacto> ContactosGuardados;

public ArrayList<Contacto> leerArrayList(){
    ContactosGuardados=new ArrayList<>();
    
    String[] lecturacortado= new String[8];
    
 try{
     ArchivoLectura=new Scanner(new FileReader("Agenda.txt"));
     while (ArchivoLectura.hasNextLine()) {
     lectura=ArchivoLectura.nextLine();
     lecturacortado=lectura.split(",", 8);
     
            if(lecturacortado.length == 8){
                
                String Categoria = lecturacortado[0];
                String Nombre = lecturacortado[1];
                String Apellidos = lecturacortado[2];
                String Direccion = lecturacortado[3];
                String zipCode = lecturacortado[4];
                String ciudad = lecturacortado[5];
                String NumeroTelefono = lecturacortado[6];
                String Email = lecturacortado[7];
                ContactosGuardados.add(new Contacto(Categoria, Nombre, Apellidos, Direccion, zipCode, ciudad, NumeroTelefono, Email));
                
                }
            }
        }
 
        catch(IOException e){
            System.out.println("Error "+e.getMessage());
        }
 
 return ContactosGuardados;
}
}
