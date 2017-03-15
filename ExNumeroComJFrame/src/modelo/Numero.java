/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Thiago Cury
 * @version 1.0
 */
public class Numero {

    private double numero;

    public Numero() {
    }

    public Numero(double numero) {
        this.numero = numero;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    /**
     *
     * @return raiz quadrada de número!
     */
    public double calcularRaiz() {
        return Math.sqrt(numero);
    }

    /**
     *
     * @param exp recebe o expoente.
     * @return o numero elevado ao expoente.
     */
    public double calcularPotencia(double exp) {
        return Math.pow(numero, exp);
    }

    public String verificarParImpar() {
        if (numero % 2 == 0) {
            return "O número é par";
        } else {
            return "O número é ímpar";
        }
    }

    @Override
    public String toString() {
        return "Numero{" + "numero=" + numero + '}';
    }
}//fecha classe