package Modelo;


public class InformacionEmpresa {
    
    private static String nombre= "AzzaCar"; 
    private static String tel= "8888-8888";
    private static String direccion= "Cartago, Cartago, Occidental";

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