/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

/**
 * @author Thiago Cury
 * @version 1.0
 */
public class ServicosFactory {
    
    private  static ProdutoServicos produtoServicos=new ProdutoServicos();
    
    public static ProdutoServicos getProdutoServicos(){
        return produtoServicos;
    }
}
