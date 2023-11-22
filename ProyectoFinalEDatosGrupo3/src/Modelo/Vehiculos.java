/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author jefer
 */
public class Vehiculos {

    //Atributos
    private String color, marca, tipo, estado;
    private int id, anio, cilindraje, modelo, kilometraje, cantidadDePuertas, capacidadDeCarga;
    private String cliente = null;
    private String vendedor = null;

    //Constructor
    public Vehiculos(String color, String marca, String tipo, int id, int anio, int cilindraje, int modelo, int kilometraje, int cantidadDePuertas, int capacidadDeCarga, String estado) {
        this.color = color;
        this.marca = marca;
        this.tipo = tipo;
        this.id = id;
        this.anio = anio;
        this.cilindraje = cilindraje;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.cantidadDePuertas = cantidadDePuertas;
        this.capacidadDeCarga = capacidadDeCarga;
        this.estado = estado;
    }
    // get and set

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getCantidadDePuertas() {
        return cantidadDePuertas;
    }

    public void setCantidadDePuertas(int cantidadDePuertas) {
        this.cantidadDePuertas = cantidadDePuertas;
    }

    public int getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public void setCapacidadDeCarga(int capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    //to string
    @Override
    public String toString() {
        return "Vehiculos{" + "color=" + color + ", marca=" + marca + ", tipo=" + tipo + ", a\u00f1o=" + anio + ", cilindraje=" + cilindraje + ", modelo=" + modelo + ", kilometraje=" + kilometraje + ", cantidadDePuertas=" + cantidadDePuertas + ", capacidadDeCarga=" + capacidadDeCarga + ", estado=" + estado + ", cliente=" + cliente + ", vendedor=" + vendedor + '}';
    }

}
