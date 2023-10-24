/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinaledatosgrupo3;

public class ProyectoFinalEDatosGrupo3 {

    public static void main(String[] args) {
        ListaClientes l = new ListaClientes();
        Cliente cliente = new Cliente();
        l.inserta(new Cliente("Esteban", "Sanarrucia Molina", 117410062, "esteban9926@hotmail.com", 60319926));
        l.inserta(new Cliente("Jose", "Perez Ortega", 117410892, "jose@hotmail.com", 60948504));
        System.out.println(l.toString());
        System.out.println(l.existe(3));
        l.elimina(1);
        l.inserta(new Cliente("Test", "Test test", 000000000000, "test@hotmail.com", 000000000));
        System.out.println(l.toString());
    }

}
