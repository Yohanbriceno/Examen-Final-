
import java.io.IOException;


public class main {
    
    public static void main(String[] args) throws IOException {
        Ejercicio1 uno = new Ejercicio1();
        Ejercicio2 dos = new Ejercicio2();
        Ejercicio3 tres = new Ejercicio3();
        System.out.println("------------ Ejercicio numero uno ---------------------");
        uno.darValores();
        uno.funcionalidad();
        System.out.println("-------------------------------------------------------");
        System.out.println("\n");
        System.out.println("------------ Ejercicio numero dos ---------------------");
        dos.ingresar("");
        dos.leer();
        dos.mostrar();
        System.out.println("-------------------------------------------------------");
        System.out.println("\n");
        System.out.println("------------ Ejercicio numero tres ---------------------");
        tres.leerClientes();
        tres.procesos();
        System.out.println("-------------------------------------------------------");
    }
    
}
