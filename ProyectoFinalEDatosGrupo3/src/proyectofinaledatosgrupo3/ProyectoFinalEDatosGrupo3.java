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

    static ListaVehiculos LV = new ListaVehiculos();
    static ListaClientes LC = new ListaClientes();
    static ListaUsuarios LU = new ListaUsuarios();
    static ControladorVentas CV = new ControladorVentas();

    public static void main(String[] args) {
        LU.inserta(new Usuario(117410062, "Esteban", "Sanarrucia", "esteban9926@hotmail.com", "60319926", "Geaninna"));
        JOptionPane.showMessageDialog(null, "¡Bienvenido!", "AzzaCar", 2);
        String correo = JOptionPane.showInputDialog("Ingrese el correo para iniciar sesión:");
        String password = JOptionPane.showInputDialog("Ingrese la contraseña para iniciar sesión:");
        if (LU.verificarUsuario(correo, password)) {
            LC.ingresarDatos();
            LU.ingresarDatos();
            LV.ingresaDatos();
            mostrarMenu();
        } else {
            JOptionPane.showMessageDialog(null, "¡Contraseña incorrecta!", "AzzaCar", 1);
        }
    }

    public static void mostrarMenu() {
        int opcion;

        do {
            String[] opciones = {"1. Crear Nuevo Usuario", "2. Ingresar Nuevo Vehiculo",
                "3.Registrar Nueva Venta", "4. Ver Listado de Vehiculos", "5. Registrar Nuevo Cliente",
                "6. Ver Listado de Clientes", "7. Consultar Garantias", "8. Consultar Reportes",
                "9. Cancelar Venta", "10. Cancelar Reserva", "0. Salir"};
            String seleccion = (String) JOptionPane.showInputDialog(null, "Selecciona una opción:",
                    "Menú Principal", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
            if (seleccion == null) {
                break;
            }

            opcion = Integer.parseInt(seleccion.substring(0, 1));

            switch (opcion) {
                case 1:
                    try {
                    JOptionPane.showMessageDialog(null, "¡Crear Nuevo Usuario!", "Usuario", 2);
                    int cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del Usuario:"));
                    String nombreU = JOptionPane.showInputDialog("Ingrese el primer nombre del usuario:");
                    String apellidosU = JOptionPane.showInputDialog("Ingrese los apellidos del usuario:");
                    String correoU = JOptionPane.showInputDialog("Ingrese el correo del usuario:");
                    String telefonoU = JOptionPane.showInputDialog("Ingrese el telefono del usuario:");
                    String passwordU = JOptionPane.showInputDialog("Ingrese la contraseña del usuario:");
                    LU.inserta(new Usuario(cedula, nombreU, apellidosU, correoU, telefonoU, passwordU));
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                case 2:
                    try {
                    JOptionPane.showMessageDialog(null, "¡Ingresar Nuevo Vehículo!", "Vehículo", 2);
                    String color = JOptionPane.showInputDialog("Ingrese el color del vehículo:");
                    String marca = JOptionPane.showInputDialog("Ingrese la marca del vehículo:");
                    String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
                    String tipo = JOptionPane.showInputDialog("Ingrese el tipo de vehículo:");
                    int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año del vehículo:"));
                    int km = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Kilometraje del vehículo:"));
                    int cPuertas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de puertas del vehículo:"));
                    int cCarga = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad de carga del vehículo:"));
                    int CC = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cilindraje del vehículo:"));
                    LV.inserta(new Vehiculo(color, marca, tipo, modelo, anio, CC, km, cPuertas, cCarga));
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                case 3:
                    try {
                    JOptionPane.showMessageDialog(null, "¡Registrar Venta!", "Vehículo", 2);
                    int idV = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del vehículo a vender:"));
                    int idC = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del cliente que va a comprar el vehiculo:"));
                    int idU = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su ID para registrar la venta:"));
                    Cliente cliente = LC.extrae(idC);
                    Usuario usuario = LU.extrae(idU);
                    Vehiculo vehiculo = LV.extrae(idV);
                    CV.RegistrarVenta(cliente, usuario, vehiculo);
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                case 4:
                    JOptionPane.showMessageDialog(null, "¡Mostrar Vehículos!", "Vehículo", 2);
                    JOptionPane.showMessageDialog(null, LV.toString());
                    break;
                case 5:
                    try {
                    JOptionPane.showMessageDialog(null, "¡Ingresar Nuevo Cliente!", "Cliente", 2);
                    String nombreC = JOptionPane.showInputDialog("Ingrese el primer nombre del cliente:");
                    String apellidosC = JOptionPane.showInputDialog("Ingrese el apellido del cliente:");
                    String correoC = JOptionPane.showInputDialog("Ingrese el correo del cliente:");
                    int idCliente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del cliente:"));
                    int telC = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el telefono del cliente:"));
                    LC.inserta(new Cliente(nombreC, apellidosC, idCliente, correoC, telC));
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                case 6:
                    JOptionPane.showMessageDialog(null, "¡Mostrar Clientes!", "Clientes", 2);
                    JOptionPane.showMessageDialog(null, LC.toString());
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Garantías");
                    break;
                case 8:
                    try {
                    JOptionPane.showMessageDialog(null, "¡Mostrar Reportes!", "Vehículo", 2);
                    int reportesSeleccion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el reporte que desea visualizar: \n"
                            + "1 = Cantidad total de Vehiculos \n"
                            + "2 = Cantidad total de Clientes \n"
                            + "3 = Top 3 Clientes con más compras \n"
                            + "4 = Cantidad de Vehiculos vendidos por vendedor \n"
                            + "5 = Cantidad de Vehiculos reservados por vendedor \n"));
                    switch (reportesSeleccion) {
                        case 1:
                            LV.listarVehiculos();
                            break;
                        case 2:
                            LC.listarClientes();
                            break;
                        case 3:
                            System.out.println("Top 3");
                            break;
                        case 4:
                            int idUsuario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del Usuario que desea revisar"));
                            LV.cantidadVentasPorUsuario(idUsuario);
                            break;
                        case 5:
                            int idUser = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del Usuario que desea revisar"));
                            LV.cantidadReservasPorUsuario(idUser);
                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                case 9:
                    try {
                    JOptionPane.showMessageDialog(null, "¡Cancelar Venta!", "Vehículo", 2);
                    int idVe = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del vehículo a cancelar:"));
                    int idCl = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del cliente que va a cancelar el vehiculo:"));
                    int idUs = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su ID para cancelar la venta:"));
                    Cliente cliente = LC.extrae(idCl);
                    Usuario usuario = LU.extrae(idUs);
                    Vehiculo vehiculo = LV.extrae(idVe);
                    CV.eliminarVenta(vehiculo, cliente, usuario);
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                case 10:
                    try {
                    JOptionPane.showMessageDialog(null, "¡Cancelar Venta!", "Vehículo", 2);
                    int idVeh = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del vehículo a cancelar:"));
                    int idCli = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del cliente que va a cancelar el vehiculo:"));
                    int idUsu = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su ID para cancelar la venta:"));
                    Cliente cliente = LC.extrae(idCli);
                    Usuario usuario = LU.extrae(idUsu);
                    Vehiculo vehiculo = LV.extrae(idVeh);
                    CV.eliminarReserva(vehiculo, cliente, usuario);
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 0);
    }
}
