package ejecucion;

import java.util.InputMismatchException;
import java.util.Scanner;
import ui.UI;

public class Main {

    public static void main(String[] args) {
        //Luego se aplicara el patron arquitectonico Modelo - Vista - Controlador
        UI vista = new UI();
        Scanner scanner = new Scanner(System.in);
        boolean indicador = false;
        int opcion = 0;
        while (indicador == false) {

            vista.menu();
            System.out.println("Desea continuar...1. Si 2. No");
            opcion = scanner.nextInt();
            if (opcion != 1) {
                indicador = true;
            }
            System.out.println("Hasta luego!");
        }
    }

}
