/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expessoacomtostring;

import java.util.Scanner;

/**
 * @author Thiago Cury
 * @version 1.0
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Instanciando objeto "p".Dentro do objeto "p" temos o 
         nome e a idade da pessoa.*/
        Pessoa p = new Pessoa();

        //Instanciando objeto Scanner chamado "ler"
        Scanner ler = new Scanner(System.in);

        /* Recebendo dados do usuário através dos "sets". 
         Para receber os dados vamos utilizar o objeto "ler". Os métodos para
         ler podem ser: next() --> retorna String, 
         nextInt() --> retorna int,
         nextDouble() --> retorna double, entre outros. */
        System.out.println("Digite seu nome: ");
        p.setNome(ler.next());
        System.out.println("Digite sua idade: ");
        p.setIdade(ler.nextByte());

        /* Imprimindo o "toString()" do objeto "p". Quando
         tentamos imprimir o "p" o Java vai chamar o 
         método toString(). O que estiver programado
         lá no toString da classe será impresso
         para o usuário. */
        System.out.println(p);
    }//fecha main
}//fecha classe