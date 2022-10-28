package com.jimg.cajero;

import com.jimg.banco.CuentaAhorro;
import com.jimg.banco.CuentaBancaria;
import com.jimg.mock.GeneradorAleatorioDeMovimientos;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CajeroAutomatico {

    CuentaBancaria cuentaBancariaActual;

    protected CajeroAutomatico(String identificador, String contrasenia){
        double cantidadAleatoria = ThreadLocalRandom.current().nextDouble(0,50000);
        cuentaBancariaActual = new CuentaAhorro("Nombre cualquiera", cantidadAleatoria);

    }
    protected void mostrarSaldo(){

        System.out.println("Su saldo es " + cuentaBancariaActual.obtenerSaldo());
    }

    protected void ingresarDinero(){
        System.out.println("¿Cuánto dinero quiere ingresar?");
        Scanner scanner = new Scanner(System.in);
        double cantidad = scanner.nextDouble();
        cuentaBancariaActual.ingresarDinero(cantidad);
    }
    protected void sacarDinero(){
        System.out.println("¿Cuánto dinero quiere sacar?");
        Scanner scanner = new Scanner(System.in);
        double cantidad = scanner.nextDouble();
        cuentaBancariaActual.sacarDinero(cantidad);
    }
    protected void consultarUltimosMovimientos(){
        GeneradorAleatorioDeMovimientos generadorAleatorioDeMovimientos = new GeneradorAleatorioDeMovimientos();
        System.out.println("¿Cuántos movimientos quiere consultar?");
        Scanner scanner = new Scanner(System.in);
        int numeroDeMovimientos = scanner.nextInt();
        ArrayList<String> movimientos = generadorAleatorioDeMovimientos.obtenerMovimientos(numeroDeMovimientos, "pesos");
        mostrarMovimientos(movimientos);
    }
    private void mostrarMovimientos(ArrayList<String> movimientos){
        for (String movimiento: movimientos){
            System.out.println(movimiento);
        }
    }
    protected void mostrarCondicionesLegales(){
        cuentaBancariaActual.informarSobreCondicionesLegales();
    }
    protected void salir(){

        System.out.println("Gracias por usar nuestros servicios");
    }

}
