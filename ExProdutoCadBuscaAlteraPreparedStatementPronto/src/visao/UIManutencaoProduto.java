/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ProdutoVO;
import servicos.ProdutoServicos;
import servicos.ServicosFactory;

/**
 * @author Thiago Cury
 * @version 1.0
 */
public class UIManutencaoProduto extends javax.swing.JInternalFrame {

    /* Criando um modelo de tabela padrão 
     com o nome das colunas */
    DefaultTableModel dtm = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"Código", "Nome", "Valor Custo", "Quantidade"});

    /**
     * Creates new form GuiManutencaoProduto
     */
    public UIManutencaoProduto() {
        initComponents();
        /* Chamando o método preencherTabela 
         no construtor */
        preencherTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableProduto = new javax.swing.JTable();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jbBuscar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jlCodigo = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jlValorCusto = new javax.swing.JLabel();
        jlQuantidade = new javax.swing.JLabel();
        jbConfirmarAlteracao = new javax.swing.JButton();
        jtCodigo = new javax.swing.JTextField();
        jtNome = new javax.swing.JTextField();
        jtValorCusto = new javax.swing.JTextField();
        jtQuantidade = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("produtos cadastrados");

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "código", "nome", "valor custo", "quantidade"
            }
        ));
        jtableProduto.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtableProduto);

        jLayeredPane1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 20, 452, 160);

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbBuscar.setText("buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jLayeredPane2.add(jbBuscar);
        jbBuscar.setBounds(30, 20, 110, 23);

        jbLimpar.setText("limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });
        jLayeredPane2.add(jbLimpar);
        jbLimpar.setBounds(200, 20, 110, 23);

        jbAlterar.setText("alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });
        jLayeredPane2.add(jbAlterar);
        jbAlterar.setBounds(370, 20, 109, 23);

        jLayeredPane4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlCodigo.setText("Código");
        jLayeredPane4.add(jlCodigo);
        jlCodigo.setBounds(20, 20, 70, 14);

        jlNome.setText("Nome");
        jLayeredPane4.add(jlNome);
        jlNome.setBounds(20, 60, 70, 14);

        jlValorCusto.setText("Valor Custo");
        jLayeredPane4.add(jlValorCusto);
        jlValorCusto.setBounds(20, 100, 110, 14);

        jlQuantidade.setText("Quantidade");
        jLayeredPane4.add(jlQuantidade);
        jlQuantidade.setBounds(20, 140, 110, 14);

        jbConfirmarAlteracao.setText("confirmar alteração");
        jbConfirmarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarAlteracaoActionPerformed(evt);
            }
        });
        jLayeredPane4.add(jbConfirmarAlteracao);
        jbConfirmarAlteracao.setBounds(20, 180, 160, 30);

        jtCodigo.setEnabled(false);
        jLayeredPane4.add(jtCodigo);
        jtCodigo.setBounds(110, 10, 150, 30);
        jLayeredPane4.add(jtNome);
        jtNome.setBounds(110, 50, 210, 30);
        jLayeredPane4.add(jtValorCusto);
        jtValorCusto.setBounds(130, 90, 190, 30);
        jLayeredPane4.add(jtQuantidade);
        jtQuantidade.setBounds(130, 130, 190, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                    .addComponent(jLayeredPane2)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Método que seta o modelo de tabela para que fique sem linhas.
    private void limparTabela() {
        /* Para limpar a tabela temos que setar o número de
         linhas para zero no default table model */
        dtm.setNumRows(0);
    }

    /* Método responsável por popular novos dados na tabela. */
    private void preencherTabela() {
        try {
            //Buscando objeto ProdutoServicos     
            ProdutoServicos ps = ServicosFactory.getProdutoServicos();

            /* Criando um ArrayList<ProdutoVO> vazio
             para receber o ArrayList com os dados */
            ArrayList<ProdutoVO> p = new ArrayList<>();

            //Recebendo o ArrayList cheio em produtos
            p = ps.buscarProdutos();

            /* For que preenche o modelo de tabela (dtm) buscando 
               dados do ArrayList chamado p. */
            for (int i = 0; i < p.size(); i++) {
                dtm.addRow(new String[]{
                    String.valueOf(p.get(i).getIdProduto()),
                    p.get(i).getNome(),
                    String.valueOf(p.get(i).getValorCusto()),
                    String.valueOf(p.get(i).getQuantidade())
                });
            }//fecha for

            /* Adicionando o modelo de tabela 
             com os dados na tabela produto */
            jtableProduto.setModel(dtm);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro! " + e.getMessage());
        }
    }

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        limparTabela();
        preencherTabela();
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limparTabela();
    }//GEN-LAST:event_jbLimparActionPerformed

    /* Método que monta um objeto produto pVO e envia para o método 
       alterarProduto */
    private void confirmarAlteracao(){
        try {
            ProdutoVO pVO = new ProdutoVO();
            //Buscando dados alterados pelo usuário nos JTextFields
            pVO.setIdProduto(Long.parseLong(jtCodigo.getText()));
            pVO.setNome(jtNome.getText());
            pVO.setValorCusto(Double.parseDouble(jtValorCusto.getText()));
            pVO.setQuantidade(Long.parseLong(jtQuantidade.getText()));
            
            ProdutoServicos ps = ServicosFactory.getProdutoServicos();
            //Enviando o objeto para ser alterado
            ps.alterarProduto(pVO);
                        
            JOptionPane.showMessageDialog(
                    this, 
                    "Produto Alterado com sucesso!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Erro! "+e.getMessage());
        }//fecha catch
    }//fecha método confirmarAlteração
    
    /* Método responsável por limpar as JTextFields 
       onde o usuário alterou o conteúdo */
    private void limpar(){
        jtCodigo.setText("");
        jtNome.setText("");
        jtValorCusto.setText("");
        jtQuantidade.setText("");
    }
    
    private void jbConfirmarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarAlteracaoActionPerformed
        confirmarAlteracao();
        limparTabela();
        preencherTabela();
        limpar();
    }//GEN-LAST:event_jbConfirmarAlteracaoActionPerformed

    /* Esse método busca os valores da linha que o usuário selecionou na 
       tabela e coloca os mesmos nas JTextFields */
    private void alterar(){
        int linha = jtableProduto.getSelectedRow();
        if(linha != -1){
            /* Buscando valores da linha selecionada na tabela como Objeto e 
               transformando os mesmos para String */
            jtCodigo.setText((String)jtableProduto.getValueAt(linha, 0));
            jtNome.setText((String)jtableProduto.getValueAt(linha, 1));
            jtValorCusto.setText((String)jtableProduto.getValueAt(linha, 2));
            jtQuantidade.setText((String)jtableProduto.getValueAt(linha, 3));
        }else{
            JOptionPane.showMessageDialog(this, 
              "Você não selecionou nenhuma linha!");
        }//fecha else
    }//fecha método
    
    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        alterar();
    }//GEN-LAST:event_jbAlterarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbConfirmarAlteracao;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlQuantidade;
    private javax.swing.JLabel jlValorCusto;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtQuantidade;
    private javax.swing.JTextField jtValorCusto;
    private javax.swing.JTable jtableProduto;
    // End of variables declaration//GEN-END:variables
}