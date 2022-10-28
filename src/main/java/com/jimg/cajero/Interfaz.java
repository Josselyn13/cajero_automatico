package com.jimg.cajero;

import java.util.Scanner;

public class Interfaz {
    public static void main(String[] args) {

        System.out.println("Introduzca su número de identificación");
        Scanner scanner = new Scanner(System.in);
        String identificador = scanner.nextLine();
        System.out.println("Ahora introduzca su contraseña");
        String contrasenia = scanner.nextLine();
        CajeroAutomatico cajero = new CajeroAutomatico(identificador, contrasenia);


        int opcionSeleccionada;

        do {
            System.out.println("Elija una de las siguientes opciones: ");
            System.out.println("    Escriba 1 para consultar su saldo");
            System.out.println("    Escriba 2 para ingresar dinero");
            System.out.println("    Escriba 3 para sacar dinero");
            System.out.println("    Escriba 4 para consultar sus últimos movimientos");
            System.out.println("    Escriba 5 para consultar las condiciones legales");
            System.out.println("Una vez elegida la opción, pulse la tecla Enter");
            System.out.println("Para salir escriba cualquier otro número");


            //asigna variable a la que se ingrese
            opcionSeleccionada = scanner.nextInt();

            switch (opcionSeleccionada){
                case 1:
                    cajero.mostrarSaldo();
                    break;
                case 2:
                    cajero.ingresarDinero();
                    break;
                case 3:
                    cajero.sacarDinero();
                    break;
                case 4:
                    cajero.consultarUltimosMovimientos();
                    break;
                case 5:
                    cajero.mostrarCondicionesLegales();
                    break;
                default:
                    cajero.salir();
            }


        } while(opcionSeleccionada == 1 || opcionSeleccionada == 2 || opcionSeleccionada == 3 || opcionSeleccionada ==4 || opcionSeleccionada ==5);


    }

}
