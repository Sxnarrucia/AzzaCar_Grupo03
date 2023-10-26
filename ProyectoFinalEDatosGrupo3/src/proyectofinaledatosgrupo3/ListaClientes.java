package proyectofinaledatosgrupo3;

import Modelo.NodoClientes;
import Modelo.Cliente;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class ListaClientes {

    private NodoClientes cabeza;

    public ListaClientes() {
        this.cabeza = null;
    }

    public void inserta(Cliente cDato) {
        //Crear el nuevo nodo a insertar
        NodoClientes nuevo = new NodoClientes(cDato);

        if (cabeza == null) {
            //Lista es vacia
            cabeza = nuevo;

        } else if (cDato.getIdCliente() <= cabeza.getDato().getIdCliente()) {
            //Lista el dato menor o igual a la cabeza
            nuevo.setSiguiente(cabeza);
            cabeza = nuevo;

        } else if (cabeza.getSiguiente() == null) {
            //La lista solo tiene un elemento
            cabeza.setSiguiente(nuevo);

        } else {
            //para todos los casos que no se cumpla el if y else if
            NodoClientes aux = this.cabeza;
            while (aux.getSiguiente() != null
                    && aux.getSiguiente().getDato().getIdCliente() < cDato.getIdCliente()) {

                aux = aux.getSiguiente();
            }

            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);

        }
    }

    public boolean existe(int cId) {
        if (cabeza == null) {
            return false;
        } else if (cabeza.getDato().getIdCliente() == cId) {
            return true;
        } else {
            NodoClientes aux = cabeza;
            while (aux.getSiguiente() != null && aux.getSiguiente().getDato().getIdCliente() <= cId) {
                aux = aux.getSiguiente();
            }
            if (aux.getDato().getIdCliente() == cId) {
                return true;
            } else {
                return false;
            }
        }
    }

    public Cliente extrae(int id) {
        Cliente cliente = null;
        if (cabeza.getDato().getIdCliente() == id) {
            cliente = cabeza.getDato();
            return cliente;
        } else {
            NodoClientes aux = cabeza;
            while (aux.getSiguiente() != null && aux.getSiguiente().getDato().getIdCliente() != id) {
                aux = aux.getSiguiente();
            }
            cliente = aux.getSiguiente().getDato();
            return cliente;
        }
    }

    public void modificar(int id) {
        int opcion = 0;
        if (cabeza == null) {
            System.out.println("La lista se encuentra vacía");
        } else if (cabeza.getDato().getIdCliente() == id) {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea modificar?\n"
                        + " 1 = Primer Nombre del Cliente\n "
                        + " 2 = Apellidos del Cliente\n "
                        + " 3 = Cedula del Cliente\n "
                        + " 4 = Correo del Cliente\n "
                        + " 5 = Numero del Cliente\n "));
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingreso opcion incorrecta");
            }
            switch (opcion) {
                case 1 -> {
                    String nombre = JOptionPane.showInputDialog("Ingrese nuevo nombre");
                    cabeza.getDato().setNombreCliente(nombre);
                    JOptionPane.showMessageDialog(null, "Cambiado con exito");
                }
                case 2 -> {
                    String apellidos = JOptionPane.showInputDialog("Ingrese nuevos apellidos");
                    cabeza.getDato().setApellidosCliente(apellidos);
                    JOptionPane.showMessageDialog(null, "Cambiado con exito");
                }
                case 3 -> {
                    int cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nueva cedula"));
                    cabeza.getDato().setCedulaCliente(cedula);
                    JOptionPane.showMessageDialog(null, "Cambiado con exito");
                }
                case 4 -> {
                    String correo = JOptionPane.showInputDialog("Ingrese nuevo correo");
                    cabeza.getDato().setCorreoCliente(correo);
                    JOptionPane.showMessageDialog(null, "Cambiado con exito");
                }
                case 5 -> {
                    int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nuevo numero"));
                    cabeza.getDato().setNumCliente(numero);
                    JOptionPane.showMessageDialog(null, "Cambiado con exito");
                }
            }
        } else {
            NodoClientes aux = cabeza;
            while (aux.getSiguiente() != null && aux.getSiguiente().getDato().getIdCliente() <= id) {
                aux = aux.getSiguiente();
            }
            if (aux.getDato().getIdCliente() == id) {
                try {
                    opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea modificar?\n"
                            + " 1 = Primer Nombre del Cliente\n "
                            + " 2 = Apellidos del Cliente\n "
                            + " 3 = Cedula del Cliente\n "
                            + " 4 = Correo del Cliente\n "
                            + " 5 = Numero del Cliente\n "));
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Ingreso opcion incorrecta");
                }
                switch (opcion) {
                    case 1 -> {
                        String nombre = JOptionPane.showInputDialog("Ingrese nuevo nombre");
                        if (nombre.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Texto vacio");
                        } else {
                            aux.getDato().setNombreCliente(nombre);
                            JOptionPane.showMessageDialog(null, "Cambiado con exito");
                        }
                    }
                    case 2 -> {
                        String apellidos = JOptionPane.showInputDialog("Ingrese nuevos apellidos");
                        if (apellidos.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Texto vacio");
                        } else {
                            aux.getDato().setApellidosCliente(apellidos);
                            JOptionPane.showMessageDialog(null, "Cambiado con exito");
                        }
                    }
                    case 3 -> {
                        int cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nueva cedula"));
                        aux.getDato().setCedulaCliente(cedula);
                        JOptionPane.showMessageDialog(null, "Cambiado con exito");
                        JOptionPane.showMessageDialog(null, "Texto vacio");
                    }
                    case 4 -> {
                        String correo = JOptionPane.showInputDialog("Ingrese nuevo correo");
                        if (correo.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Texto vacio");
                        } else {
                            aux.getDato().setCorreoCliente(correo);
                            JOptionPane.showMessageDialog(null, "Cambiado con exito");
                        }
                    }
                    case 5 -> {
                        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nuevo numero"));
                        aux.getDato().setNumCliente(numero);
                        JOptionPane.showMessageDialog(null, "Texto vacio");
                    }
                }
            } else {
                System.out.println("No existe");
            }
        }
    }

    public void elimina(int id) {
        if (cabeza.getDato().getIdCliente() == id) {
            cabeza = cabeza.getSiguiente();
        } else {
            NodoClientes aux = cabeza;
            while (aux.getSiguiente().getDato().getIdCliente() != id) {
                aux = aux.getSiguiente();
            }
            NodoClientes siguiente = aux.getSiguiente().getSiguiente();
            aux.setSiguiente(siguiente);
        }
    }

    @Override
    public String toString() {
        String r = "";
        NodoClientes aux = cabeza;
        while (aux != null) {
            r += aux.toString() + "\n";
            aux = aux.getSiguiente();
        }
        return r;
    }
}
