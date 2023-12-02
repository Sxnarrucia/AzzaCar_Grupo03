package Controlador;

import Modelo.Cliente;
import Modelo.NodoVehiculos;
import Modelo.Usuario;
import Modelo.Vehiculo;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class ListaVehiculos {

    private NodoVehiculos cabeza;

    public ListaVehiculos() {
        this.cabeza = null;
    }

    public void inserta(Vehiculo vDato) {
        //Crear el nuevo nodo a insertar
        NodoVehiculos nuevo = new NodoVehiculos(vDato);

        if (cabeza == null) {
            //Lista es vacia
            cabeza = nuevo;

        } else if (vDato.getId() <= cabeza.getDato().getId()) {
            //Lista el dato menor o igual a la cabeza
            nuevo.setSiguiente(cabeza);
            cabeza = nuevo;

        } else if (cabeza.getSiguiente() == null) {
            //La lista solo tiene un elemento
            cabeza.setSiguiente(nuevo);

        } else {
            //para todos los casos que no se cumpla el if y else if
            NodoVehiculos aux = this.cabeza;
            while (aux.getSiguiente() != null
                    && aux.getSiguiente().getDato().getId() < vDato.getId()) {

                aux = aux.getSiguiente();
            }

            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);

        }
    }

    public Vehiculo extrae(int id) {
        Vehiculo vehiculo = null;
        if (cabeza.getDato().getId() == id) {
            vehiculo = cabeza.getDato();
            return vehiculo;
        } else {
            NodoVehiculos aux = cabeza;
            while (aux.getSiguiente() != null && aux.getSiguiente().getDato().getId() != id) {
                aux = aux.getSiguiente();
            }
            if (aux.getSiguiente() != null) {
                vehiculo = aux.getSiguiente().getDato();
                return vehiculo;
            } else {
                System.out.println("No existe un vehiculo registrado con este ID");
                return null;
            }
        }
    }

    public void modificar(int id) {
        int opcion = 0;
        if (cabeza == null) {
            System.out.println("La lista se encuentra vacía");
        } else if (cabeza.getDato().getId() == id) {
            if (!cabeza.getDato().getEstado().equals("Vendido")) {
                try {
                    opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea modificar?\n"
                            + " 1 = Color del Vehiculo\n "
                            + " 2 = Año del Vehiculo\n "
                            + " 3 = Cilindraje del Vehiculo\n "
                            + " 4 = Marca del Vehiculo\n "
                            + " 5 = Modelo del Vehiculo\n "
                            + " 6 = Kilometraje del Vehiculo\n "
                            + " 7 = Tipo de Vehiculo\n "
                            + " 8 = Cantidad de puertas del Vehiculo\n "
                            + " 9 = Capacidad de carga del Vehiculo\n "));
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Ingreso opcion incorrecta");
                }
                switch (opcion) {
                    case 1 -> {
                        String color = JOptionPane.showInputDialog("Ingrese nuevo color");
                        cabeza.getDato().setColor(color);
                        JOptionPane.showMessageDialog(null, "Cambiado con exito");
                    }
                    case 2 -> {
                        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nuevo año"));
                        cabeza.getDato().setAnio(anio);
                        JOptionPane.showMessageDialog(null, "Cambiado con exito");
                    }
                    case 3 -> {
                        int cilindraje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nuevo cilindraje"));
                        cabeza.getDato().setCilindraje(cilindraje);
                        JOptionPane.showMessageDialog(null, "Cambiado con exito");
                    }
                    case 4 -> {
                        String marca = JOptionPane.showInputDialog("Ingrese nueva marca");
                        cabeza.getDato().setMarca(marca);
                        JOptionPane.showMessageDialog(null, "Cambiado con exito");
                    }
                    case 5 -> {
                        String modelo = JOptionPane.showInputDialog("Ingrese nuevo modelo");
                        cabeza.getDato().setModelo(modelo);
                        JOptionPane.showMessageDialog(null, "Cambiado con exito");
                    }
                    case 6 -> {
                        int kilometraje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nuevo kilometraje"));
                        cabeza.getDato().setKilometraje(kilometraje);
                        JOptionPane.showMessageDialog(null, "Cambiado con exito");
                    }
                    case 7 -> {
                        String tipo = JOptionPane.showInputDialog("Ingrese nuevo tipo");
                        cabeza.getDato().setTipo(tipo);
                        JOptionPane.showMessageDialog(null, "Cambiado con exito");
                    }
                    case 8 -> {
                        int puertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nueva cantidad de puertas"));
                        cabeza.getDato().setCantidadDePuertas(puertas);
                        JOptionPane.showMessageDialog(null, "Cambiado con exito");
                    }
                    case 9 -> {
                        int carga = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nueva capacidad de carga"));
                        cabeza.getDato().setCapacidadDeCarga(carga);
                        JOptionPane.showMessageDialog(null, "Cambiado con exito");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "El vehiculo ya fue vendido y no puede ser editado");
            }

        } else {
            NodoVehiculos aux = cabeza;
            while (aux.getSiguiente() != null && aux.getSiguiente().getDato().getId() <= id) {
                aux = aux.getSiguiente();
            }
            if (aux.getDato().getId() == id) {
                if (aux.getDato().getEstado().equals("Vendido")) {
                    JOptionPane.showMessageDialog(null, "El vehiculo ya fue vendido y no puede ser editado");

                } else {
                    try {
                        opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea modificar?\n"
                                + " 1 = Color del Vehiculo\n "
                                + " 2 = Año del Vehiculo\n "
                                + " 3 = Cilindraje del Vehiculo\n "
                                + " 4 = Marca del Vehiculo\n "
                                + " 5 = Modelo del Vehiculo\n "
                                + " 6 = Kilometraje del Vehiculo\n "
                                + " 7 = Tipo de Vehiculo\n "
                                + " 8 = Cantidad de puertas del Vehiculo\n "
                                + " 9 = Capacidad de carga del Vehiculo\n "));
                    } catch (HeadlessException | NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Ingreso opcion incorrecta");
                    }
                    switch (opcion) {
                        case 1 -> {
                            String color = JOptionPane.showInputDialog("Ingrese nuevo color");
                            aux.getDato().setColor(color);
                            JOptionPane.showMessageDialog(null, "Cambiado con exito");
                        }
                        case 2 -> {
                            int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nuevo año"));
                            aux.getDato().setAnio(anio);
                            JOptionPane.showMessageDialog(null, "Cambiado con exito");
                        }
                        case 3 -> {
                            int cilindraje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nuevo cilindraje"));
                            aux.getDato().setCilindraje(cilindraje);
                            JOptionPane.showMessageDialog(null, "Cambiado con exito");
                        }
                        case 4 -> {
                            String marca = JOptionPane.showInputDialog("Ingrese nueva marca");
                            aux.getDato().setMarca(marca);
                            JOptionPane.showMessageDialog(null, "Cambiado con exito");
                        }
                        case 5 -> {
                            String modelo = JOptionPane.showInputDialog("Ingrese nuevo modelo");
                            aux.getDato().setModelo(modelo);
                            JOptionPane.showMessageDialog(null, "Cambiado con exito");
                        }
                        case 6 -> {
                            int kilometraje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nuevo kilometraje"));
                            aux.getDato().setKilometraje(kilometraje);
                            JOptionPane.showMessageDialog(null, "Cambiado con exito");
                        }
                        case 7 -> {
                            String tipo = JOptionPane.showInputDialog("Ingrese nuevo tipo");
                            aux.getDato().setTipo(tipo);
                            JOptionPane.showMessageDialog(null, "Cambiado con exito");
                        }
                        case 8 -> {
                            int puertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nueva cantidad de puertas"));
                            aux.getDato().setCantidadDePuertas(puertas);
                            JOptionPane.showMessageDialog(null, "Cambiado con exito");
                        }
                        case 9 -> {
                            int carga = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nueva capacidad de carga"));
                            aux.getDato().setCapacidadDeCarga(carga);
                            JOptionPane.showMessageDialog(null, "Cambiado con exito");
                        }
                    }
                }
            } else {
                System.out.println("No existe");
            }
        }
    }

    public void registrarVenta(Cliente cliente, Usuario usuario) {
        int idVehiculo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del Vehiculo a vender o reservar"));
        if (cabeza.getDato().getId() == idVehiculo) {
            cabeza.getDato().setCliente(cliente);
            cabeza.getDato().setVendedor(usuario);
            cabeza.getDato().setEstado("Vendido");
            int totalCompras = cliente.getTotalComprados() + 1;
            cliente.setTotalComprados(totalCompras);
        } else {
            NodoVehiculos aux = cabeza;
            while (aux.getSiguiente() != null && aux.getSiguiente().getDato().getId() != idVehiculo) {
                aux = aux.getSiguiente();
            }
            if (aux.getSiguiente() != null) {
                if (aux.getDato().getId() == idVehiculo) {
                    aux.getDato().setCliente(cliente);
                    aux.getDato().setVendedor(usuario);
                    aux.getDato().setEstado("Vendido");
                    int totalCompras = cliente.getTotalComprados() + 1;
                    cliente.setTotalComprados(totalCompras);
            }
        }
        JOptionPane.showMessageDialog(null, "Venta Exitosa");
    }
    }

    @Override
    public String toString() {
        String r = "";
        NodoVehiculos aux = cabeza;
        while (aux != null) {
            r += aux.toString() + "\n";
            aux = aux.getSiguiente();
        }
        return r;
    }
}
