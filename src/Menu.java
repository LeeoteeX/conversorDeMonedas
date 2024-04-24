import java.util.Scanner;

public class Menu {

    public void menu(){
        int opc;
        ConsultaDatos consulta = new ConsultaDatos();
        Scanner teclado = new Scanner(System.in);
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
                7) Salir.
                Elija una opción válida:
                *********************************************
                """);
            opc = teclado.nextInt();
            switch (opc){
                case 1:
                    System.out.println("El valor de 1 Dólar son " + consulta.consulta("USD","ARS") + " Pesos Argentinos.");
                break;
                case 2:
                    System.out.println("El valor de 1 Peso Argentino son " + consulta.consulta("ARS", "USD") + " Dólares");
                break;
                case 3:
                    System.out.println("El valor de 1 Dólar son " + consulta.consulta("USD","RSD") + " Reales.");
                break;
                case 4:
                    System.out.println("El valor de 1 Real es de " + consulta.consulta("RSD","USD") + " Dólares.");
                break;
                case 5:
                    System.out.println("El valor de 1 Peso Argentino son " + consulta.consulta("ARS","CLP") + " Pesos Chilenos.");
                break;
                case 6:
                    System.out.println("El valor de 1 Peso Chileno es " + consulta.consulta("CLP","ARS") + " Pesos Argentinos.");
                break;
                case 7: break;
                case 8, 9, 0:
                    System.out.println("Ingrese una opción válida!");
            }
        } while (opc != 7);
        teclado.close();
    }
}
