package modelos.institucion;

//Clase Carrera
public class Carrera {
    private String nombre;
    private ITR itr;

    //Constructor
    public Carrera(String nombre,ITR itr){
        this.nombre=nombre;
        this.itr=itr;
    }

    //Getters
    public String getNombre(){return nombre;}
    public ITR getItr(){return itr;}

    //Setters
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setItr(ITR itr){this.itr=itr;}
}
