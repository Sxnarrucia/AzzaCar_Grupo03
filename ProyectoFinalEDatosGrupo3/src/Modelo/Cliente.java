package Modelo;

public class Cliente {

    private int idCliente;
    private String nombreCliente;
    private String apellidosCliente;
    private int cedulaCliente;
    private String correoCliente;
    private int numCliente;
    private int totalComprados;

    private static int nuevoIdCliente;

    public static void setNuevoId() {
        nuevoIdCliente++;
    }

    public Cliente() {
    }

    public Cliente(String nombreCliente, String apellidosCliente, int cedulaCliente, String correoCliente, int numCliente) {
        setNuevoId();
        this.idCliente = nuevoIdCliente;
        this.nombreCliente = nombreCliente;
        this.apellidosCliente = apellidosCliente;
        this.cedulaCliente = cedulaCliente;
        this.correoCliente = correoCliente;
        this.numCliente = numCliente;
        this.totalComprados = 0;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    public int getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public int getTotalComprados() {
        return totalComprados;
    }

    public void setTotalComprados(int totalComprados) {
        this.totalComprados = totalComprados;
    }

    @Override
    public String toString() {
        return "ID: " + idCliente + ", Nombre: " + nombreCliente + ", Apellidos: "
                + apellidosCliente + ", Cedula: " + cedulaCliente + ", Correo: "
                + correoCliente + ", Numero: " + numCliente + ", Total de Autos Comprados: "
                + totalComprados + '}';
    }

}
