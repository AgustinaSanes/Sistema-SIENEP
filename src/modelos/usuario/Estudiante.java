package modelos.usuario;
//Import
import modelos.archivo.InformeAdjunto;
import java.util.Date;
import java.util.List;

//Clase Estudiante hereda de Usuario
public class Estudiante extends Usuario {
    private String foto;
    private String sistemaSalud;
    private Date fechaNacimiento;
    private List<String> telefono;
    private String calle;
    private String nroPuerta;
    private boolean obsConfidenciales;
    private String motivo;
    private String obsComentarios;
    private String infoEstadoSalud;
    //Relaciones
    //Relacion a informe(1:N)
    private List<InformeAdjunto> informes;
    //hacer relacion a grupo

    //Constructor
    public Estudiante(String cedula, String nombre, String apellido, String email, String contrasena, boolean estado,Rol rol, String foto,String sistemaSalud,Date fechaNacimiento,List<String> telefono, String calle, String nroPuerta, boolean obsConfidenciales,String motivo,String obsComentarios,String infoEstadoSalud,List<InformeAdjunto> informes){
        super(cedula,nombre,apellido,email,contrasena,estado,rol);
        this.foto=foto;
        this.sistemaSalud=sistemaSalud;
        this.fechaNacimiento=fechaNacimiento;
        this.telefono=telefono;
        this.calle=calle;
        this.nroPuerta=nroPuerta;
        this.obsConfidenciales=obsConfidenciales;
        this.motivo=motivo;
        this.obsComentarios=obsComentarios;
        this.infoEstadoSalud=infoEstadoSalud;
        this.informes=informes;
    }
    //Getters
        public String getFoto(){return foto;}
        public String getSistemaSalud(){return sistemaSalud;}
        public Date getFechaNacimiento(){return fechaNacimiento;}
        public List<String> getTelefono(){return telefono;}
        public String getCalle(){return calle;}
        public String getNroPuerta(){return nroPuerta;}
        public boolean getObsConfidenciales(){return obsConfidenciales;}
        public String getMotivo(){return motivo;}
        public String getObsComentarios(){return obsComentarios;}
        public String getInfoEstadoSalud(){return infoEstadoSalud;}
        public List<InformeAdjunto> getInformes(){return informes;}
    //Setters
        public void setFoto(String foto){this.foto=foto;}
        public void setSistemaSalud(String sistemaSalud){this.sistemaSalud=sistemaSalud;}
        public void setFechaNacimiento(Date fechaNacimiento){this.fechaNacimiento=fechaNacimiento;}
        public void setTelefono(List<String> telefono){this.telefono=telefono;}
        public void setCalle(String calle){this.calle=calle;}
        public void setNroPuerta(String nroPuerta){this.nroPuerta=nroPuerta;}
        public void setObsConfidenciales(boolean obsConfidenciales){this.obsConfidenciales=obsConfidenciales;}
        public void setMotivo(String motivo){this.motivo=motivo;}
        public void setObsComentarios(String obsComentarios){this.obsComentarios=obsComentarios;}
        public void setInfoEstadoSalud(String infoEstadoSalud){this.infoEstadoSalud=infoEstadoSalud;}
        public void setInformes(List<InformeAdjunto> informes){this.informes=informes;}
}
