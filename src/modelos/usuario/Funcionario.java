package modelos.usuario;
//Clase Funcionario hereda de Usuario
public class Funcionario extends Usuario{
    //Constructor
    public Funcionario(String cedula,String nombre,String apellido,String email,String contrasena,boolean estado,Rol rol){
        super(cedula,nombre,apellido,email,contrasena,estado,rol);
    }
}
