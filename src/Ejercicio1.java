
public class Ejercicio1 {

    String data[] = new String[5];
    int datanumero[] = new int[5];

    void darValores() {
        data[0] = "Silvestre Cárdenas";
        datanumero[0] = 8;
        data[1] = "Andrés López";
        datanumero[1] = 1;
        data[2] = "Andreina Gonzalez";
        datanumero[2] = 5;
        data[3] = "Maria Perez";
        datanumero[3] = 0;
        data[4] = "Armando Paredes";
        datanumero[4] = 10;

    }

    void funcionalidad() {

        for (int i = 0; i < datanumero.length; i++) {
            if (datanumero[i] == 0) {

                System.out.println(data[i] + ", Su numero fue: " + datanumero[i] + ", el cliente no atendió.");
            } else if (datanumero[i] >= 1 && datanumero[i] <= 4) {
                System.out.println(data[i] + ", Su numero fue: " + datanumero[i] + ", no satisfecho.");
            } else if (datanumero[i] == 5) {
                System.out.println(data[i] + ", Su numero fue: " + datanumero[i] + ", neutro.");
            } else if (datanumero[i] >= 6 && datanumero[i] <= 8) {
                System.out.println(data[i] + ", Su numero fue: " + datanumero[i] + ", satisfecho.");
            } else if (datanumero[i] >= 9 && datanumero[i] <= 10) {
                System.out.println(data[i] + ", Su numero fue: " + datanumero[i] + ", muy satisfecho.");
            }
        }
        /*
        if (numero == 0) {

            System.out.println("[" + data[3] + ", " + datanumero[3] + "]");
        } else if(numero >= 1 && numero <= 4){
            System.out.println("[" + data[1] + ", " + datanumero[1] + "]");
        } else if (numero == 5){
            System.out.println("[" + data[2] + ", " + datanumero[2] + "]");
        } else if(numero >= 6 && numero <= 8){
            System.out.println("[" + data[0] + ", " + datanumero[0] + "]");
        } else if(numero >= 9 && numero <= 10){
            System.out.println("[" + data[4] + ", " + datanumero[4] + "]");
        }*/
    }

}
