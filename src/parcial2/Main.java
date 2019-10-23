/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

/**
 *
 * @author Estudiante
 */
public class Main {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
      ListaContactos teclado = new ListaContactos(); 
      String Categoria = "1";
      String Nombre = "Pedro";
      String Apellidos = "calderon";
      String Direccion = "5689";
      String zipCode = "021548";
      String ciudad = "cajica";
      String NumeroTelefono = "3025648789";
      String Email = "pedrocaldo@gmail.com";
      
      teclado.agregarContacto(Categoria, Nombre, Apellidos, Direccion, zipCode, ciudad, NumeroTelefono, Email);
      teclado.guardarAgenda();
    }
    
}
