package Modelo;

public class Usuario {

    private String nombreUsuario;
    private String apellidoUsuario;
    private int idUsuario;
    private String correoEUsuario;
    private String telUsuario;
    private String contraseñaUsuario;

    public Usuario() {
    }
    
    public Usuario(int idUsuario,String nombreUsuario, String apellidoUsuario, String correoEUsuario, String telUsuario, String contraseñaUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.idUsuario = idUsuario;
        this.correoEUsuario = correoEUsuario;
        this.telUsuario = telUsuario;
        this.contraseñaUsuario = contraseñaUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getCorreoEUsuario() {
        return correoEUsuario;
    }

    public void setCorreoEUsuario(String correoEUsuario) {
        this.correoEUsuario = correoEUsuario;
    }

    public String getTelUsuario() {
        return telUsuario;
    }

    public void setTelUsuario(String telUsuario) {
        this.telUsuario = telUsuario;
    }

    public String getContraseñaUsuario() {
        return contraseñaUsuario;
    }

    public void setContraseñaUsuario(String contraseñaUsuario) {
        this.contraseñaUsuario = contraseñaUsuario;
    }
    
  
    @Override
    public String toString() {
        return "Usuario{" + nombreUsuario + ", Apellido Usuario=" + apellidoUsuario 
                + ", ID Usuario=" + idUsuario + ", Correo Usuario=" + correoEUsuario 
                + ", Telefono Usuario=" + telUsuario +'}';
    }

}
