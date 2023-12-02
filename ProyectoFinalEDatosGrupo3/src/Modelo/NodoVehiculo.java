package Modelo;

public class NodoVehiculo {

    private Vehiculo dato;
    private NodoVehiculo siguiente;

    public NodoVehiculo(Vehiculo dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public Vehiculo getDato() {
        return dato;
    }

    public void setDato(Vehiculo dato) {
        this.dato = dato;
    }

    public NodoVehiculo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoVehiculo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Vehiculos: {" + dato;
    }
}
