
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {

    FileReader fr;

    class nodo {

        String palabra;
        nodo sig;

        public nodo(String palabra) {
            this.palabra = palabra;
        }

    }
    nodo L;

    boolean siEsVacia() {
        return L == null;
    }

    void ingresar(String palabra) {
        if (siEsVacia()) {
            L = new nodo(palabra);
        } else {
            nodo aux = L;
            while (aux.sig != null) {
                aux = aux.sig;
            }
            aux.sig = new nodo(palabra);
        }

    }

    void leer() throws FileNotFoundException, IOException {
        fr = new FileReader("Lectura.txt");
        BufferedReader br = new BufferedReader(fr);
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(" ");
            for (int i = 0; i < datos.length; i++) {
                String nombre = datos[i];
                ingresar(nombre);
            }

        }

    }

    void mostrar() {
        nodo aux = L;
        nodo auxdos = L;
        System.out.println("Lectura sin sus espacios");
        while (aux != null) {
            System.out.print(aux.palabra);
            aux = aux.sig;
        } System.out.println("");
        System.out.println("Lectura con sus espacios");
        while (auxdos != null) {
            System.out.print(auxdos.palabra + " ");
            auxdos = auxdos.sig;
        } System.out.println("");
    }
}
