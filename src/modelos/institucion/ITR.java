package modelos.institucion;

//Clase ITR
public class ITR {
    private String nombre;
    private String calle;
    private String nroPuerta;
    private String ciudad;
    private String departamento;
    private String telefono;

    //Constructor
    public ITR(String nombre,String calle,String nroPuerta,String ciudad,String departamento,String telefono){
        this.nombre=nombre;
        this.calle=calle;
        this.nroPuerta=nroPuerta;
        this.ciudad=ciudad;
        this.departamento=departamento;
        this.telefono=telefono;
    }

    //Getters
    public String getNombre(){return nombre;}
    public String getCalle(){return calle;}
    public String getNroPuerta(){return nroPuerta;}
    public String getCiudad(){return ciudad;}
    public String getDepartamento(){return departamento;}
    public String telefono(){return telefono;}
    //Setters
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setCalle(String calle){this.calle=calle;}
    public void setNroPuerta(String nroPuerta){this.nroPuerta=nroPuerta;}
    public void setCiudad(String ciudad){this.ciudad=ciudad;}
    public void setDepartamento(String departamento){this.departamento=departamento;}
    public void setTelefono(String telefono){this.telefono=telefono;}
}
