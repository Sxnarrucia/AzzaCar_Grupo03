/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author jefer
 */
public class Vehiculo {

    //Atributos
    private String color, marca, tipo, estado, modelo;
    private int id, anio, cilindraje, kilometraje, cantidadDePuertas, capacidadDeCarga;
    private Cliente cliente;
    private Usuario vendedor;

    private static int nuevoIdVehiculo;

    public static void setNuevoId() {
        nuevoIdVehiculo++;
    }

    //Constructor

    public Vehiculo() {
    }
    
    public Vehiculo(String color, String marca, String tipo, String modelo, int anio, int cilindraje, int kilometraje, int cantidadDePuertas, int capacidadDeCarga) {
        setNuevoId();
        this.color = color;
        this.marca = marca;
        this.tipo = tipo;
        this.id = nuevoIdVehiculo;
        this.anio = anio;
        this.cilindraje = cilindraje;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.cantidadDePuertas = cantidadDePuertas;
        this.capacidadDeCarga = capacidadDeCarga;
        this.estado = "Disponible";
        this.cliente = null;
        this.vendedor = null;
    }
    // get and set

    public int getId() {
        return id;
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Usuario vendedor) {
        this.vendedor = vendedor;
    }

    //to string
    @Override
    public String toString() {
        return "ID Vehiculo: " + id + ", Color: " + color + ", Marca: " + marca
                + ", Tipo: " + tipo + ", Año: " + anio
                + ", Cilindraje: " + cilindraje + ", Modelo: " + modelo
                + ", Kilometraje: " + kilometraje + "\n"
                + "Cantidad De Puertas: " + cantidadDePuertas
                + ", Capacidad De Carga: " + capacidadDeCarga + ", Estado: " + estado + "\n"
                + "Cliente: " + cliente + "\n" +"Vendedor: " + vendedor + "\n" + "----------------------------";
    }

}
