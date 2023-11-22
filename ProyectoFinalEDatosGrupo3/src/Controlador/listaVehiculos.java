/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Modelo.nodoVehiculos;
import Modelo.Vehiculos;

/**
 *
 * @author jefer
 */
public class listaVehiculos {

    private nodoVehiculos cabeza, ultimo;

    public listaVehiculos() {
        this.ultimo = this.cabeza = null;
    }

    public void inserta(Vehiculos pDato) {

        nodoVehiculos nodoV = new nodoVehiculos(pDato);

        if (cabeza == null) {
            cabeza = nodoV;
            ultimo = nodoV;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);

        } else if (pDato.getId() <= cabeza.getDato().getId()) {
            nodoV.setNext(cabeza);
            cabeza.setBack(nodoV);
            cabeza = nodoV;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
        } else if (pDato.getId() >= ultimo.getDato().getId()) {
            ultimo.setNext(nodoV);
            nodoV.setBack(ultimo);
            ultimo = nodoV;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);

        } else {
            nodoVehiculos aux = this.cabeza;
            while (aux.getNext() != ultimo
                    && aux.getNext().getDato().getId() < pDato.getId()) {
                aux = aux.getNext();
            }
            nodoV.setNext(aux.getNext());
            aux.getNext().setBack(nodoV);
            aux.setNext(nodoV);
            nodoV.setBack(aux);

        }
    }

    public boolean busquedaId(int pId) {
        boolean bandera = false;
        if (cabeza != null) {
            nodoVehiculos aux = cabeza;
            while (aux != ultimo) {
                if (aux.getDato().getId() == pId) {
                    bandera = true;
                    break;
                }
                aux = aux.getNext();
            }
            if (aux.getDato().getId() == pId) {
                bandera = true;
            }
        }
        return bandera;
    }

    public Vehiculos extrae(int Id) {
        Vehiculos vehiculos = null;
        if (cabeza == null) {
            System.out.println("Lista vacía");
        } else if (cabeza.getDato().getId() == Id) {
            vehiculos = cabeza.getDato();
            cabeza = cabeza.getNext();
            ultimo.setNext(cabeza);
        } else {
            nodoVehiculos aux = cabeza;
            while (aux.getNext() != ultimo
                    && aux.getNext().getDato().getId() < Id) {
                aux = aux.getNext();
            }
            if (aux.getNext().getDato().getId() == Id) {
                vehiculos = aux.getNext().getDato();
                if (aux.getNext() == ultimo) {
                    aux.setNext(cabeza);
                    ultimo = aux;
                } else {
                    nodoVehiculos siguiente = aux.getNext();
                    aux.setNext(siguiente.getNext());
                }
            }
        }
        return vehiculos;
    }

    public void elimina(int Id) {
        if (cabeza == null) {
            System.out.println("Lista vacía");
        } else if (cabeza.getDato().getId() == Id) {
            cabeza = cabeza.getNext();
            ultimo.setNext(cabeza);
        } else {
            nodoVehiculos aux = cabeza;
            while (aux.getNext() != ultimo
                    && aux.getNext().getDato().getId() < Id) {
                aux = aux.getNext();
            }
            if (aux.getNext().getDato().getId() == Id) {
                if (aux.getNext() == ultimo) {
                    aux.setNext(cabeza);
                    ultimo = aux;
                } else {
                    nodoVehiculos siguiente = aux.getNext();
                    aux.setNext(siguiente.getNext());
                }
            }
        }
    }
}
