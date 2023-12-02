/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author jefer
 */
public class nodoVehiculos {
    //Atributos

    private Vehiculos dato;
    private nodoVehiculos next, back;

    public nodoVehiculos(Vehiculos dato) {
        this.dato = dato;
        this.back = this.next = null;
    }
    //gets and sets

    public Vehiculos getDato() {
        return dato;
    }

    public void setDato(Vehiculos dato) {
        this.dato = dato;
    }

    public nodoVehiculos getNext() {
        return next;
    }

    public void setNext(nodoVehiculos next) {
        this.next = next;
    }

    public nodoVehiculos getBack() {
        return back;
    }

    public void setBack(nodoVehiculos back) {
        this.back = back;
    }
    //ToString

    @Override
    public String toString() {
        return "Vehiculos: {" + dato;
    }

}
