package Modelo;

public class Usuario {

    String nombreUsuario;
    String apellidoUsuario;
    String idUsuario;
    String correoEUsuario;
    String telUsuario;
    String contraseñaUsuario;

    public Usuario(String nombreUsuario, String apellidoUsuario, String idUsuario, String correoEUsuario, String telUsuario, String contraseñaUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.idUsuario = idUsuario;
        this.correoEUsuario = correoEUsuario;
        this.telUsuario = telUsuario;
        this.contraseñaUsuario = contraseñaUsuario;
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

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
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
        return "Usuario{" + "nombreUsuario=" + nombreUsuario + ", apellidoUsuario=" + apellidoUsuario + ", idUsuario=" + idUsuario + ", correoEUsuario=" + correoEUsuario + ", telUsuario=" + telUsuario + ", contrase\u00f1aUsuario=" + contraseñaUsuario + '}';
    }

}
