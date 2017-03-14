
/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.JOptionPane;
import modelo.Pessoa;

/**
 *
 * @author Thiago Cury
 * @version 1.0
 */
public class Principal {
    public static void main(String[] args) {
        
        //Instanciando objeto "p" do tipo Pessoa
        Pessoa p = new Pessoa();
        
        //Entrada de dados a partir do JOptionPane
        
        /* Aqui não precisamos converter! Entra uma String para o nome que
           também é String. */
        p.setNome(
                JOptionPane.showInputDialog(
                        null,
                        "Digite o seu nome: "));
        
        /* Aqui precisamos converter de String para int a partir do método
           parseInt chamado da classe Integer. */
        p.setIdade(
            Integer.parseInt(
                JOptionPane.showInputDialog(
                    null,
                    "Digite a sua idade: ")));
                
        JOptionPane.showMessageDialog(
                null,
                p.toString(),
                "Relatório",
                JOptionPane.PLAIN_MESSAGE);
    }//fecha main
}//fecha classe