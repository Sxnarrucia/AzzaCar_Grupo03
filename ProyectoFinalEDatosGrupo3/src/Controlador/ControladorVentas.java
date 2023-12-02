package Controlador;

import Modelo.Cliente;
import Modelo.Usuario;
import Modelo.Vehiculo;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class ControladorVentas {

    public void RegistrarVenta(Cliente cliente, Usuario usuario, Vehiculo vehiculo) {
        try {
            int VentaReserva = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción que desea: "
                    + "1 = Vender un vehículo \n"
                    + "2 = Reservar un vehículo \n"));
            switch (VentaReserva) {
                case 1:
                    if (cliente == null) {
                        JOptionPane.showMessageDialog(null, "Ingreso opcion incorrecta o cliente no existe");
                    } else if (usuario == null) {
                        JOptionPane.showMessageDialog(null, "Ingreso opcion incorrecta o usuario no existe");
                    } else if (vehiculo == null) {
                        JOptionPane.showMessageDialog(null, "Ingreso opcion incorrecta o vehiculo no existe");
                    } else {
                        vehiculo.setCliente(cliente);
                        vehiculo.setVendedor(usuario);
                        vehiculo.setEstado("Vendido");
                        int ventasTotales = cliente.getTotalComprados() + 1;
                        cliente.setTotalComprados(ventasTotales);
                    }
                    break;
                case 2:
                    if (cliente == null) {
                        JOptionPane.showMessageDialog(null, "Ingreso opcion incorrecta");
                    } else if (usuario == null) {
                        JOptionPane.showMessageDialog(null, "Ingreso opcion incorrecta");
                    } else if (vehiculo == null) {
                        JOptionPane.showMessageDialog(null, "Ingreso opcion incorrecta");
                    } else {
                        vehiculo.setCliente(cliente);
                        vehiculo.setVendedor(usuario);
                        vehiculo.setEstado("Reservado");
                    }
                    break;
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingreso opcion incorrecta");
        }
    }
}
