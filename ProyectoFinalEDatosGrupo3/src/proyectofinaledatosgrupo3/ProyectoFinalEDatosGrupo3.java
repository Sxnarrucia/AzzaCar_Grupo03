package proyectofinaledatosgrupo3;

import Controlador.ControladorVentas;
import Controlador.ListaClientes;
import Controlador.ListaUsuarios;
import Controlador.ListaVehiculos;
import Modelo.Cliente;
import Modelo.Usuario;
import Modelo.Vehiculo;
import javax.swing.JOptionPane;

public class ProyectoFinalEDatosGrupo3 {

    public static void main(String[] args) {

        ListaClientes l = new ListaClientes();
        l.inserta(new Cliente("Esteban", "Sanarrucia Molina", 1, "esteban9926@hotmail.com", 60319926));
        l.inserta(new Cliente("Jose", "Perez Ortega", 2, "jose@hotmail.com", 60948504));
        //l.modificar(2);
        //System.out.println(l.toString());
        //System.out.println(l.existe(3));
        //l.elimina(1);
        //l.inserta(new Cliente("Test", "Test test", 2, "test@hotmail.com", 000000000));
        //System.out.println(l.toString());
        //System.out.println(l.extrae(2));

        ListaVehiculos listaV = new ListaVehiculos();
        listaV.inserta(new Vehiculo("Rojo", "Toyota", "SUV", "Hilux", "Vendido", 2004, 2000, 100000, 4, 4000));
        listaV.inserta(new Vehiculo("Azul", "Mercedes", "Hatchback", "GLS", "Vendido", 2022, 2000, 0, 2, 1000));
        //listaV.modificar(2);
        //System.out.println(listaV.toString());
        ListaUsuarios listaU = new ListaUsuarios();
        listaU.inserta(new Usuario(1, "Esteban", "Sanarrucia", "esteban9926@hotmail.com", "60319926", "hola123"));
        listaU.inserta(new Usuario(2, "Francisco", "Molina", "francisco@hotmail.com", "60319926", "HolaMundo!"));
        ControladorVentas venta = new ControladorVentas();
        int idVehiculo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del Vehiculo a vender"));
        int idCliente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del Cliente que va a comprar el vehiculo"));
        int idUsuario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su ID para registrar la venta"));
        Cliente cliente = l.extrae(idCliente);
        Usuario usuario = listaU.extrae(idUsuario);
        Vehiculo vehiculo = listaV.extrae(idVehiculo);
        venta.RegistrarVenta(cliente, usuario, vehiculo);
        System.out.println(listaV.toString());
        System.out.println(l.toString());
        System.out.println(listaU.toString());

    }

}
