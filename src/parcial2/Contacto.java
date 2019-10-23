package parcial2;
/**
 *
 * @author Usuario
 */
public class Contacto {
    
    private String Categoria;
    private String Nombre;
    private String Apellidos;
    private String Direccion;
    private String zipCode;
    private String ciudad;
    private String NumeroTelefono;
    private String Email;
    
    public Contacto(String Categoria,String Nombre,String Apellidos,String Direccion,String zipCode,String ciudad,String NumeroTelefono,String Email){
    this.Categoria = Categoria;
    this.Nombre = Nombre;
    this.Apellidos= Apellidos;
    this.Direccion = Direccion;
    this.zipCode = zipCode;
    this.ciudad=ciudad;
    this.NumeroTelefono=NumeroTelefono;
    this.Email=Email;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNumeroTelefono() {
        return NumeroTelefono;
    }

    public void setNumeroTelefono(String NumeroTelefono) {
        this.NumeroTelefono = NumeroTelefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return Categoria + "," + Nombre + "," + Apellidos + "," + Direccion + "," + zipCode + "," + ciudad + "," + NumeroTelefono + "," + Email + "\n";
    }
    
}
