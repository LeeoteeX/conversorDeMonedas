import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public void menu(){
        int opc;
        ConsultaDatos consulta = new ConsultaDatos();
        Scanner teclado = new Scanner(System.in);
        List<Solicitud> listaSolicitudes = new ArrayList<>();
        do {
            System.out.println("""
                
                *********************************************
                Bienvenido al Conversor de Monedas!
                
                Ingrese la opción que desea para comparar:
                
                1) Dólar =>> Peso Argentino.
                2) Peso Argentino =>> Dólar.
                3) Dólar =>> Real Brasileño.
                4) Real Brasileño =>> Dólar
                5) Peso Argentino =>> Peso Chileno.
                6) Peso Chileno =>> Peso Argentino.
                7) Listado de Solicitudes hechas.
                8) Salir.
                Elija una opción válida:
                *********************************************
                """);
            opc = teclado.nextInt();
            switch (opc){
                case 1:
                    System.out.println("El valor de 1 Dólar son " + consulta.consulta("USD","ARS") + " Pesos Argentinos.");
                    listaSolicitudes.add(new Solicitud(LocalTime.now(),"USD","ARS"));
                break;
                case 2:
                    System.out.println("El valor de 1 Peso Argentino son " + consulta.consulta("ARS", "USD") + " Dólares");
                    listaSolicitudes.add(new Solicitud(LocalTime.now(),"ARS","USD"));
                break;
                case 3:
                    System.out.println("El valor de 1 Dólar son " + consulta.consulta("USD","RSD") + " Reales.");
                    listaSolicitudes.add(new Solicitud(LocalTime.now(),"USD","RSD"));
                break;
                case 4:
                    System.out.println("El valor de 1 Real es de " + consulta.consulta("RSD","USD") + " Dólares.");
                    listaSolicitudes.add(new Solicitud(LocalTime.now(),"RSD","USD"));
                break;
                case 5:
                    System.out.println("El valor de 1 Peso Argentino son " + consulta.consulta("ARS","CLP") + " Pesos Chilenos.");
                    listaSolicitudes.add(new Solicitud(LocalTime.now(),"ARS","CLP"));
                break;
                case 6:
                    System.out.println("El valor de 1 Peso Chileno es " + consulta.consulta("CLP","ARS") + " Pesos Argentinos.");
                    listaSolicitudes.add(new Solicitud(LocalTime.now(),"CLP","ARS"));
                break;
                case 7:
                    if (listaSolicitudes.isEmpty()){
                        System.out.println("No ha realizado ninguna solicitud.");
                    } else {
                        for (Solicitud solicitud : listaSolicitudes){
                            System.out.println("Ha realizado una solicitud para convertir de " + solicitud.getMonedaOrigen() + " a" +
                                    " " + solicitud.getMonedaComparar() + " a las : " + solicitud.getHora());
                        }
                    }
                    break;
                case 9, 0:
                    System.out.println("Ingrese una opción válida!");
            }
        } while (opc != 8);
        teclado.close();
    }
}
