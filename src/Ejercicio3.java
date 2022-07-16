
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ejercicio3 {

    int cedulacion = 15, pasaporte = 20, retiro = 3;

    class nodo {

        String nombre, apellido, proceso;
        int cedula;
        nodo sig;

        public nodo(String nombre, String apellido, String proceso, int cedula) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.proceso = proceso;
            this.cedula = cedula;
        }
    }
    nodo L;
    FileReader fr;
    PrintWriter pf;

    boolean vacia() {
        return L == null;
    }

    void ingresar(String nombre, String apellido, String proceso, int cedula) {
        if (vacia()) {
            L = new nodo(nombre, apellido, proceso, cedula);
        } else {
            nodo aux = L;
            while (aux.sig != null) {
                aux = aux.sig;
            }
            aux.sig = new nodo(nombre, apellido, proceso, cedula);
        }
    }

    void leerClientes() throws FileNotFoundException, IOException {
        fr = new FileReader("Clientes.txt");
        BufferedReader br = new BufferedReader(fr);
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(" ");
            String nombre = datos[0];
            String apellido = datos[1];
            int cedula = Integer.parseInt(datos[2]);
            String proceso = datos[3];
            ingresar(nombre, apellido, proceso, cedula);
        }
    }

    void procesos() throws IOException {
        nodo temporal = L;
        Calendar calendar = Calendar.getInstance();
        pf = new PrintWriter(new FileWriter("Clientes atendidos.txt", true));
        String fecha = new SimpleDateFormat("yyyy/MM/dd").format(Calendar.getInstance().getTime());
        String hora = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
        nodo aux = L;
        int suma[] = new int[5];
        while (aux != null) {
            for (int i = 0; i < suma.length; i++) {
                if (null != aux.proceso) {
                    switch (aux.proceso) {
                        case "cedulacion":
                            pf.append("\nEl cliente " + aux.nombre + " " + aux.apellido + " realizo un tramite de cedulación.");
                            pf.append("\nEl tiempo estimado fue de " + cedulacion + " minutos a las " + hora + " el dia " + fecha);
                            suma[i] = cedulacion;
                            pf.append("\n");
                            break;
                        case "retirodocumentos":
                            pf.append("\nEl cliente " + aux.nombre + " " + aux.apellido + " realizo un tramite de retiro de documentos.");
                            pf.append("\nEl tiempo estimado fue de " + retiro + " minutos a las " + hora + " el dia " + fecha);
                            suma[i] = retiro;
                            pf.append("\n");
                            break;
                        case "citapasaporte":
                            pf.append("\nEl cliente " + aux.nombre + " " + aux.apellido + " realizo una cita de pasaporte.");
                            pf.append("\nEl tiempo estimado fue de " + pasaporte + " minutos a las " + hora + " el dia " + fecha);
                            suma[i] = pasaporte;
                            pf.append("\n");
                            break;
                        default:
                            break;
                    }
                }
                aux = aux.sig;
            }

            int resultado = suma[0] + suma[1] + suma[2] + suma[3] + suma[4];
            pf.append("\nEl tiempo transcurrido fue de: " + resultado + " minutos");

            pf.close();
            System.out.println("El archivo [Clientes atendidos] se ha creado con exito.");

        }

    }
}
