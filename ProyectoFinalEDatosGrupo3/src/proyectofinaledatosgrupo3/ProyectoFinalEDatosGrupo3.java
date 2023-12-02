package proyectofinaledatosgrupo3;

import Controlador.ListaClientes;
import Modelo.Cliente;
import Modelo.Vehiculos;
import controlador.listaVehiculos;

public class ProyectoFinalEDatosGrupo3 {

    public static void main(String[] args) {

        
        ListaClientes l = new ListaClientes();
        l.inserta(new Cliente("Esteban", "Sanarrucia Molina", 1, "esteban9926@hotmail.com", 60319926));
        l.inserta(new Cliente("Jose", "Perez Ortega", 2, "jose@hotmail.com", 60948504));
        System.out.println(l.toString());
        System.out.println(l.existe(3));
        l.elimina(1);
        l.inserta(new Cliente("Test", "Test test", 3, "test@hotmail.com", 000000000));
        System.out.println(l.toString());
        System.out.println(l.extrae(3));
        System.out.println("***************");
        System.out.println(l.toString());
        l.modificar(3);
        System.out.println(l.toString());
        
        listaVehiculos listaV = new listaVehiculos();

        listaV.inserta(new Vehiculos("Rojo", "Toyota", "Suv", 1, 2004, 3000, 3, 55000, 4, 4000, "nuevo"));
        listaV.inserta(new Vehiculos("verde", "Mazda", "Suv", 2, 2004, 3000, 3, 55000, 4, 4000, "Usado"));
        System.out.println(listaV.extrae(2));
    }

}
