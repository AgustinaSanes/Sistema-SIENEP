package modelos.usuario;
import java.util.List;
import java.util.ArrayList;

//Clase Rol
public class Rol {
    private int id;
    private String nombre;

    //Relaciones(N:N)
    private List<Permiso> permisos;

    //Constructor
    public Rol(int id,String nombre){
        this.id=id;
        this.nombre=nombre;
        this.permisos=new ArrayList<>();
    }

    //Getters
    public int getId(){return id;}
    public String getNombre(){return nombre;}
    public List<Permiso> getPermisos(){return permisos;}
    //Setters
    public void setId(int id){this.id=id;}
    public void setNombre(String nombre){this.nombre=nombre;}

    //metodo
    public void agregarPermiso(Permiso permiso){
        this.permisos.add(permiso);
    }
}

