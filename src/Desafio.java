import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;

        System.out.println("\n*********************************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
        System.out.printf("Su saldo es: " + "Lps " + saldo);
        System.out.println("\n**********************************************");

        String menu = """
                *** Escriba el numero de la opcion deseada ***
                1 - Consultar saldo
                2 - Retirar dinero
                3 - Depositar dinero
                9 - Salir
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.printf("\nSu saldo actualizado es: " + "Lps " + saldo);
                    break;
                case 2:
                    System.out.print("\nCuanto dinero desea retirar? ");
                    double valorARetirar = teclado.nextDouble();
                    if(valorARetirar <= saldo){
                        saldo -= valorARetirar;
                        System.out.printf("\nRetirado exitosamente, su nuevo saldo es: " + "Lps " + saldo);
                    } else {
                        System.out.println("\nNo cuenta con suficiente saldo.");
                    }
                    break;
                case 3:
                    System.out.print("\nCuanto dinero desea depositar? ");
                    double depositar = teclado.nextDouble();
                    saldo += depositar;
                    System.out.printf("\nDepositado exitosamente");
                case 9:
                    System.out.println("\nSaliendo del programa, gracias por utilizar nuestro servicio");
                    break;
                default:
                    System.out.println("\nOpcion invalida, intente nuevamente");
            }
        }
    }
}
