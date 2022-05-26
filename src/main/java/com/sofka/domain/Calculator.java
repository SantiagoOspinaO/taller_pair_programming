package com.sofka.domain;

/**
 * La clase Calculator se crea con el objetivo de implementar los
 * métodos con las operaciones aritméticas básicas
 *
 * @version 1.0.0.000 22-05-2022
 *
 * @author Oscar Farfan - oscarfarfan92@gmail.com
 *
 * @since 1.00.000 22-05-2022
 */
public class Calculator {
    /**
     * Este método se encarga de sumar dos números
     *
     * @param numberOne este parámetro es requerido para realizar la suma
     * @param numerTwo  este parámetro es requerido para realizar la suma
     * @return al realizar la suma el método retorna un valor de tipo double
     */
    public double sumar(double numberOne, double numerTwo){
        return numberOne + numerTwo;
    }

    /**
     * Este método se encarga de restar dos números
     *
     * @param numberOne este parámetro es requerido para realizar la resta
     * @param numerTwo  este parámetro es requerido para realizar la resta
     * @return al realizar la resta el método retorna un valor de tipo double
     */
    public double resta(double numberOne, double numerTwo){
        return numberOne - numerTwo;
    }

    /**
     * Este método se encarga de multiplicar dos números
     *
     * @param numberOne este parámetro es requerido para realizar la multiplicación
     * @param numerTwo  este parámetro es requerido para realizar la multiplicación
     * @return al realizar la multiplicación el método retorna un valor de tipo double
     */
    public double multiplicar(double numberOne, double numerTwo){
        return numberOne * numerTwo;
    }

    /**
     * Este método se encarga de dividir dos números
     *
     * @param numberOne este parámetro es requerido para realizar la división
     * @param numerTwo  este parámetro es requerido para realizar la división
     * @return al realizar la división el método retorna un valor de tipo double
     */
    public double division(double numberOne, double numerTwo){
        return numberOne / numerTwo;
    }
}
