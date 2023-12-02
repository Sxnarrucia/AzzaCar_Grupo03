package Modelo;

public class NodoVehiculos {

    private Vehiculo dato;
    private NodoVehiculos siguiente;

    public NodoVehiculos(Vehiculo dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public Vehiculo getDato() {
        return dato;
    }

    public void setDato(Vehiculo dato) {
        this.dato = dato;
    }

    public NodoVehiculos getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoVehiculos siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Vehiculos: {" + dato;
    }
}
