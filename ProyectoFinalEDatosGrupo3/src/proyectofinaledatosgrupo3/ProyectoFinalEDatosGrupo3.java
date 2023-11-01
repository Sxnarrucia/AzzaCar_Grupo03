package proyectofinaledatosgrupo3;

import Modelo.Cliente;
import Vista.MenuPrincipalView;

public class ProyectoFinalEDatosGrupo3 {

    public static void main(String[] args) {
               
        MenuPrincipalView.mostrarMenuPrincipal();
        
        
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
        
    }

}
