package Controlador;

import Modelo.NodoUsuario;
import Modelo.Usuario;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class ListaUsuarios {

    private NodoUsuario cabeza;

    public ListaUsuarios() {
        this.cabeza = null;
    }

    public void inserta(Usuario cDato) {
        //Crear el nuevo nodo a insertar
        NodoUsuario nuevo = new NodoUsuario(cDato);

        if (cabeza == null) {
            //Lista es vacia
            cabeza = nuevo;

        } else if (cDato.getIdUsuario() <= cabeza.getDato().getIdUsuario()) {
            //Lista el dato menor o igual a la cabeza
            nuevo.setSiguiente(cabeza);
            cabeza = nuevo;
            //EscribirEnArchivo(cDato.getCorreoEUsuario(), cDato.getContraseñaUsuario());

        } else if (cabeza.getSiguiente() == null) {
            //La lista solo tiene un elemento
            cabeza.setSiguiente(nuevo);
            //EscribirEnArchivo(cDato.getCorreoEUsuario(), cDato.getContraseñaUsuario());

        } else {
            //para todos los casos que no se cumpla el if y else if
            NodoUsuario aux = this.cabeza;
            while (aux.getSiguiente() != null
                    && aux.getSiguiente().getDato().getIdUsuario() < cDato.getIdUsuario()) {

                aux = aux.getSiguiente();
            }

            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);

        }
        EscribirEnArchivo(cDato.getCorreoEUsuario(), cDato.getContraseñaUsuario());
    }

    public boolean existe(int cId) {
        if (cabeza == null) {
            return false;
        } else if (cabeza.getDato().getIdUsuario() == cId) {
            return true;
        } else {
            NodoUsuario aux = cabeza;
            while (aux.getSiguiente() != null && aux.getDato().getIdUsuario() != cId) {
                aux = aux.getSiguiente();
            }
            return aux.getDato().getIdUsuario() == cId;
        }
    }

    public Usuario extrae(int id) {
        Usuario usuario = null;
        if (cabeza.getDato().getIdUsuario() == id) {
            usuario = cabeza.getDato();
            return usuario;
        } else {
            NodoUsuario aux = cabeza;
            while (aux.getSiguiente() != null && aux.getSiguiente().getDato().getIdUsuario() != id) {
                aux = aux.getSiguiente();
            }
            if (aux.getSiguiente() != null) {
                usuario = aux.getSiguiente().getDato();
                return usuario;
            } else {
                System.out.println("No existe un cliente registrado con este ID");
                return null;
            }
        }
    }

    public void elimina(int id) {
        if (cabeza.getDato().getIdUsuario() == id) {
            cabeza = cabeza.getSiguiente();
        } else {
            NodoUsuario aux = cabeza;
            while (aux.getSiguiente().getDato().getIdUsuario() != id) {
                aux = aux.getSiguiente();
            }
            NodoUsuario siguiente = aux.getSiguiente().getSiguiente();
            aux.setSiguiente(siguiente);
        }
    }

    public void EscribirEnArchivo(String correoUsuario, String passwordUsuario) {
        try {
            BufferedWriter archivo = new BufferedWriter(new FileWriter("C:\\Users\\esanarru\\Documents\\GitHub\\EstructuraDatos_Grupo03\\ProyectoFinalEDatosGrupo3\\usuarios.txt", true));
            archivo.write("Usuario: "+ correoUsuario);
            archivo.write(", Contraseña: " + passwordUsuario);
            archivo.newLine();
            JOptionPane.showMessageDialog(null, "Datos guardados correctamente!", "Agregar Datos",
                    JOptionPane.INFORMATION_MESSAGE);
            archivo.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        String r = "";
        NodoUsuario aux = cabeza;
        while (aux != null) {
            r += aux.toString() + "\n";
            aux = aux.getSiguiente();
        }
        return r;
    }
}
