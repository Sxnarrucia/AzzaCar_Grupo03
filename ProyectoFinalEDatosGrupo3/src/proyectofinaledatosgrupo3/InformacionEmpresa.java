package proyectofinaledatosgrupo3;


public class InformacionEmpresa {
    
    String nombre= "AzzaCar"; 
    String tel= "8888-8888";
    String direccion= "Cartago, Cartago, Occidental";

    public String getNombre() {
        return nombre;
    }

    public String getTel() {
        return tel;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "InformacionEmpresa{" + "nombre=" + nombre + ", tel=" + tel + ", direccion=" + direccion + '}';
    }
    
    
    public static void verInfoEmpresa(){
        InformacionEmpresa info = new InformacionEmpresa();
        
        System.out.println(info.toString());  
    }
    
}
///Para acceder a la info de la empresa, usar "verInfoEmpresa();". Imprime la info en consola