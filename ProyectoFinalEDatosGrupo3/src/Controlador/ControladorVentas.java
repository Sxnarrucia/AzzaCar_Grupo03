package Controlador;

import Modelo.Cliente;
import Modelo.Usuario;
import Modelo.Vehiculo;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class ControladorVentas {

    public void RegistrarVenta(Cliente cliente, Usuario usuario, Vehiculo vehiculo) {
        try {
            int VentaReserva = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción que desea: \n"
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
                        int ventasTotalesC = cliente.getTotalComprados() + 1;
                        cliente.setTotalComprados(ventasTotalesC);
                        JOptionPane.showMessageDialog(null, "La venta fue realizada con exito");
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
                        int reservasTotalesC = cliente.getTotalReservados() + 1;
                        cliente.setTotalReservados(reservasTotalesC);
                        JOptionPane.showMessageDialog(null, "La reserva fue realizada con exito");
                    }
                    break;
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingreso opcion incorrecta");
        }
    }

    public void eliminarVenta(Vehiculo vehiculo, Cliente cliente, Usuario usuario) {
        if (vehiculo.getEstado().equals("Vendido")) {
            vehiculo.setCliente(null);
            vehiculo.setVendedor(null);
            vehiculo.setEstado("Disponible");
            int ventaEliminada = cliente.getTotalComprados() - 1;
            cliente.setTotalComprados(ventaEliminada);
            JOptionPane.showMessageDialog(null, "La venta fue eliminada");
        } else {
            JOptionPane.showMessageDialog(null, "El auto aún no está vendido");
        }

    }

    public void eliminarReserva(Vehiculo vehiculo, Cliente cliente, Usuario usuario) {
        if (vehiculo.getEstado().equals("Reservado")) {
            vehiculo.setCliente(null);
            vehiculo.setVendedor(null);
            vehiculo.setEstado("Disponible");
            int reservaEliminada = cliente.getTotalReservados() - 1;
            cliente.setTotalReservados(reservaEliminada);
            JOptionPane.showMessageDialog(null, "La venta fue eliminada");
        } else {
            JOptionPane.showMessageDialog(null, "El auto aún no está reservado");
        }

    }
}
