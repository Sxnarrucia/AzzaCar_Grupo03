package Modelo;

public class NodoUsuario {

    private Usuario dato;
    private NodoUsuario siguiente;

    public NodoUsuario(Usuario dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public Usuario getDato() {
        return dato;
    }

    public void setDato(Usuario dato) {
        this.dato = dato;
    }

    public NodoUsuario getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoUsuario siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Usuario: {" + dato;
    }
}
