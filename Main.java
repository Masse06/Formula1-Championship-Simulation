/*
Autor: Masse
Fecha: 03/2025
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Race.loadPilots();
        Race.loadCircuits();

        int option = -1;

        while (option != 0) {
            menu(option);
            option = sc.nextInt();
            sc.nextLine();
        }
    }

    public static void menu(int option) {
        switch (option) {
            case 1:
                Race.addPilot();
                break;
            case 2:
                Race.showPilots();
            case 3:
                Race.addCircuit();
                break;


            case 0:
                break;
            default:
                System.out.println("Número no válido.");
        }
        System.out.println("Elige una opción");
        System.out.println("---------------------------");
        System.out.println(Config.MENU);

    }
}
