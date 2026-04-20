package modelos.institucion;
//Clase Grupo
public class Grupo {
    private int id;
    private String nombre;
    private Carrera carrera;

    //Constructor
    public Grupo(int id,String nombre,Carrera carrera){
        this.id=id;
        this.nombre=nombre;
        this.carrera=carrera;
    }
    //Getters
    public int getId(){return id;}
    public String getNombre(){return nombre;}
    public Carrera getCarrera(){return carrera;}
    //Setters
    public void setId(int id){this.id=id;}
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setCarrera(Carrera carrera){this.carrera=carrera;}
}
