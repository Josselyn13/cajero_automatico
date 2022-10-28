package com.jimg.banco;

import java.math.BigDecimal;
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        System.out.println("Bienvenido al conversor de moneda");
        System.out.println("Por favor introduzca una cantidad en euros y el programa le devolvera la conversión en dolares americanos");

        Scanner sc = new Scanner(System.in);
        double euros = sc.nextDouble();

        double dolares = 1.09 * euros;

        System.out.println(euros + "euros equivalen a  " + dolares + " US dólares");

        //clase bigdecimal, primero convertir a string
        String eurosString = Double.toString(euros);
        BigDecimal eurosBigDecimal = new BigDecimal(eurosString);
        double tasaDeCambio = 1.09;
        String tasaDeCambioString = Double.toString(tasaDeCambio);
        BigDecimal tasaDeCambioBigDecimal = new BigDecimal(tasaDeCambioString);

        BigDecimal dolaresBigDecimal = eurosBigDecimal.multiply(tasaDeCambioBigDecimal);

        System.out.println(euros + " euros equivalen a " + dolaresBigDecimal.toString() + " US dólares");
    }
}
