package Controlador;

import Modelo.Cliente;
import Modelo.NodoVehiculo;
import Modelo.Usuario;
import Modelo.Vehiculo;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class ListaVehiculos {

    private NodoVehiculo cabeza;

    public ListaVehiculos() {
        this.cabeza = null;
    }

    public void ingresaDatos() {
        inserta(new Vehiculo("Rojo", "Toyota", "Hashback", "Corolla GR", 2023, 1600, 0, 2, 1000));
        inserta(new Vehiculo("Azul", "Nissan", "SUV", "Qashqai", 2010, 1300, 100000, 4, 1000));
        inserta(new Vehiculo("Negro", "Honda", "Sedan", "Civic", 2018, 2000, 50000, 4, 1500));
        inserta(new Vehiculo("Amarillo", "BMW", "Sedan", "M4 Coupe", 2023, 3000, 0, 2, 1500));

    }

    public void inserta(Vehiculo vDato) {
        //Crear el nuevo nodo a insertar
        NodoVehiculo nuevo = new NodoVehiculo(vDato);

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
            NodoVehiculo aux = this.cabeza;
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
            NodoVehiculo aux = cabeza;
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
            NodoVehiculo aux = cabeza;
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
                JOptionPane.showMessageDialog(null, "No existe");
            }
        }
    }

    public void cantidadVentasPorUsuario(int id) {
        NodoVehiculo aux = cabeza;
        int cantidad = 0;
        if (aux.getDato().getEstado().equals("Vendido")) {
            while (aux != null) {
                Vehiculo vehiculo = aux.getDato();
                if (vehiculo.getVendedor() != null && vehiculo.getVendedor().getIdUsuario() == id) {
                    cantidad++;
                }
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "El vendedor ha vendido: " + cantidad + " vehiculos");
        } else {
            JOptionPane.showMessageDialog(null, "El vendedor no tiene ventas registradas");
        }
    }

    public void cantidadReservasPorUsuario(int idR) {
        NodoVehiculo auxR = cabeza;
        int cantidadR = 0;
        if (auxR.getDato().getEstado().equals("Reservado")) {
            while (auxR != null) {
                Vehiculo vehiculoR = auxR.getDato();
                if (vehiculoR.getVendedor() != null && vehiculoR.getVendedor().getIdUsuario() == idR) {
                    cantidadR++;
                }
                auxR = auxR.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "El vendedor ha reservado: " + cantidadR + " vehiculos");
        } else {
            JOptionPane.showMessageDialog(null, "El vendedor no tiene reservas registradas");
        }
    }

    public void listarVehiculos() {
        NodoVehiculo aux = cabeza;
        int contadorDisponible = 0;
        int contadorReservado = 0;
        int contadorVendido = 0;
        while (aux != null) {
            if (aux.getDato().getEstado().equals("Disponible")) {
                contadorDisponible++;
            } else if (aux.getDato().getEstado().equals("Reservado")) {
                contadorReservado++;
            } else {
                contadorVendido++;
            }
            aux = aux.getSiguiente();
        }
        JOptionPane.showMessageDialog(null, "Hay " + contadorDisponible
                + " vehiculos disponibles\n " + contadorReservado + " reservados\n "
                + "y " + contadorVendido + " vendidos.");
    }

    @Override
    public String toString() {
        String r = "";
        NodoVehiculo aux = cabeza;
        while (aux != null) {
            r += aux.toString() + "\n";
            aux = aux.getSiguiente();
        }
        return r;
    }
}
