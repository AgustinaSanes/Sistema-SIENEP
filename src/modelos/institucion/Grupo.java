package modelos.institucion;

//Clase Grupo
public class Grupo {
    private String nombre;
    private Carrera carrera;

    //Constructor
    public Grupo(String nombre,Carrera carrera){
        this.nombre=nombre;
        this.carrera=carrera;
    }

    //Getters
    public String getNombre(){return nombre;}
    public Carrera getCarrera(){return carrera;}
    //Setters
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setCarrera(Carrera carrera){this.carrera=carrera;}
}
