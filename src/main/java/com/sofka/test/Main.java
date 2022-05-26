package com.sofka.test;

import com.sofka.domain.Calculator;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        String result = "";

        Calculator calculator = new Calculator();
        Scanner in = new Scanner(System.in);
        Logger logger = Logger.getLogger("logger");

        logger.log(Level.INFO, "Ingrese el primer numero");
        double numberOne = in.nextDouble();
        logger.log(Level.INFO, "Ingrese el segundo numero");
        double numberTwo = in.nextDouble();

        int response = 0;
         do {
             logger.log(Level.FINE, "Seleccione la operación");
             logger.log(Level.INFO, "1. Suma");
             logger.log(Level.INFO, "2. Resta");
             logger.log(Level.INFO, "3. Multiplicación");
             logger.log(Level.INFO, "4. División");
             logger.log(Level.INFO, "0. Salir");
             response = in.nextInt();

             switch (response) {
                 case 1:
                     result = "La suma de " + numberOne + " + " + numberTwo + " es " +  calculator.sumar(numberOne, numberTwo);
                     logger.info(result);
                     break;
                 case 2:
                     result = "La resta de " + numberOne + " + " + numberTwo + " es " +  calculator.resta(numberOne, numberTwo);
                     logger.info(result);
                     break;
                 case 3:
                     result = "La multiplicacion de " + numberOne + " + " + numberTwo + " es " +  calculator.multiplicar(numberOne, numberTwo);
                     logger.info(result);
                     break;
                 case 4:
                     result = "La division de " + numberOne + " + " + numberTwo + " es " +  calculator.division(numberOne, numberTwo);
                     logger.info(result);
                     break;
                 case 0:
                     logger.info("¡Vuelve pronto!");
                     break;
                 default:
                     logger.info("ERROR ¡Ingrese una opcion valida!");
                     break;
             }

         } while (response != 0);

    }

}
