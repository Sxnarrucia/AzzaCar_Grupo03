package Vista;

import Modelo.Usuario;
import javax.swing.JOptionPane;

public class LoginView {

    public static String extraerDatosU() {

        // nombreUsuario = JOptionPane.showInputDialog("Por favor digite su usuario");
        //claveUsuario = JOptionPane.showInputDialog("Por favor digite su clave");
        return "No implementado aún";
    }

    public static Boolean vereficar() {

        return true;
    }

    public static Usuario crearUsuarioView() {

        MultiFrame creacionU = new MultiFrame();

        JOptionPane.showMessageDialog(null, creacionU);

        String nombre = creacionU.getjTextField1().getText();
        String apellido = creacionU.getjTextField2().getText();
        String id = creacionU.getjTextField3().getText();
        String correo = creacionU.getjTextField4().getText();
        String telf = creacionU.getjTextField5().getText();
        String contraseña = creacionU.getjTextField6().getText();


        Usuario nuevoUsuario = new Usuario(nombre, apellido, id, correo, telf, contraseña);
        return nuevoUsuario;
    }

    //Controlador.ControladorUsuario();   
}
