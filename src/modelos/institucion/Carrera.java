package modelos.institucion;
import java.util.List;
import java.util.ArrayList;

//Clase Carrera
public class Carrera {
    private int id;
    private String nombre;
    private List<ITR> itrs;
    private List<Grupo> grupos;

    //Constructor
    public Carrera(int id,String nombre){
        this.id=id;
        this.nombre=nombre;
        this.itrs=new ArrayList<>();
        this.grupos=new ArrayList<>();
    }
    //Getters
    public int getId(){return id;}
    public String getNombre(){return nombre;}
    public List<ITR> getItrs(){return itrs;}
    public List<Grupo> getGrupos(){return grupos;}
    //Setters
    public void setId(int id){this.id=id;}
    public void setNombre(String nombre){this.nombre=nombre;}
    public void agregarGrupo(Grupo grupo){this.grupos.add(grupo);}
    public void agregarITR(ITR itr){this.itrs.add(itr);}
}
