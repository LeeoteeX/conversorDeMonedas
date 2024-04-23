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
                case 1: consulta.consulta("USD","ARS");
                break;
                case 2: consulta.consulta("ARS", "USD");
                break;
                case 3: consulta.consulta("USD","RSD");
                break;
                case 4: consulta.consulta("RSD","USD");
                break;
                case 5: consulta.consulta("ARS","CLP");
                break;
                case 6: consulta.consulta("CLP","ARS");
                break;
                case 7: break;
                case 8, 9, 0:
                    System.out.println("Ingrese una opción válida!");
            }
        } while (opc != 7);
        teclado.close();
    }
}
