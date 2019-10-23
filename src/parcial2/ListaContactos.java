package parcial2;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ListaContactos {
    
    private GuardarArraylist guardarArchivoTxt;
    private AbrirArraylist abrirArchivoTxt;
    private ArrayList<Contacto> ListaContactos;
    
    public ListaContactos(){
    ListaContactos = new ArrayList<>();
    guardarArchivoTxt = new GuardarArraylist();
    abrirArchivoTxt = new AbrirArraylist();
    }
    
    public ArrayList<Contacto> getListaContactos(){
    return ListaContactos;
    }
    
    public void setListaContactos(ArrayList<Contacto> ListaContactos){
    this.ListaContactos = ListaContactos;
    }
    
    public void agregarContacto(String Categoria, String Nombre, String Apellidos, String Direccion, String zipCode, String ciudad,String NumeroTelefono,String Email){
    
    ListaContactos.add(new Contacto(Categoria, Nombre, Apellidos, Direccion, zipCode, ciudad, NumeroTelefono, Email));
    adicionarContactoAlTxt(new Contacto(Categoria, Nombre, Apellidos, Direccion, zipCode, ciudad, NumeroTelefono, Email));
    
    }
    
     public void removerContacto(int contactoNumero) {
        ListaContactos.remove(contactoNumero);
        guardarAgenda();
    }

    public ArrayList<String> obtenerListaTelefonos(int categoria) {
       ArrayList<String> telefonos = new ArrayList<>();
        for (int i = 0; i < ListaContactos.size(); i++) {
            telefonos.add(ListaContactos.get(i).getNumeroTelefono());
        }
        return telefonos;
    }

    public void guardarAgenda() {
        guardarArchivoTxt.guardarArrayList(ListaContactos);
    }

    public ArrayList<Contacto> abrirAgenda() {
        setListaContactos(abrirArchivoTxt.leerArrayList());
        return getListaContactos();
    }

    public void adicionarContactoAlTxt(Contacto contacto) {
        guardarArchivoTxt.agregarElemento(contacto);
    }
    
    @Override
    public String toString(){
    return "Lista \n" + ListaContactos;
    }
}
