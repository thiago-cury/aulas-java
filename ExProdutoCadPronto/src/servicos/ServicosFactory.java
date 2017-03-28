/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servicos;

/**
 * @author Thiago Cury
 * @version 1.0
 */
public class ServicosFactory {

    private static final ProdutoServicos PS = new ProdutoServicos();
    
    public static ProdutoServicos getProdutoServicos(){
        return PS;
    }
}//fecha classe
