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
 * @since 09/04/2014 - 09:55
 * @version 1.1 beta
 */
public class UIManutencaoProduto extends javax.swing.JInternalFrame {

    /* Criando um modelo de tabela padrão 
     com o nome das colunas */
    DefaultTableModel dtm = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"Código", "Nome", "Valor Custo", "Quantidade"});

    /**
     * Creates new form GUIManutencaoProduto
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
        jbAlterar = new javax.swing.JLayeredPane();
        jbPreencher = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbDeletar = new javax.swing.JButton();
        jbAlterarr = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtPesquisa = new javax.swing.JTextField();
        jcbPesquisa = new javax.swing.JComboBox();

        setClosable(true);
        setIconifiable(true);
        setTitle("Manutenção Produto");

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Valor Custo", "Quantidade"
            }
        ));
        jtableProduto.getTableHeader().setReorderingAllowed(false);
        jtableProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtableProduto);

        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(322, 322, 322))
        );

        jbAlterar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbPreencher.setText("preencher");
        jbPreencher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPreencherActionPerformed(evt);
            }
        });

        jbLimpar.setText("limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jbDeletar.setText("deletar");
        jbDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeletarActionPerformed(evt);
            }
        });

        jbAlterarr.setText("Alterar");
        jbAlterarr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarrActionPerformed(evt);
            }
        });

        jbAlterar.setLayer(jbPreencher, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jbAlterar.setLayer(jbLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jbAlterar.setLayer(jbDeletar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jbAlterar.setLayer(jbAlterarr, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jbAlterarLayout = new javax.swing.GroupLayout(jbAlterar);
        jbAlterar.setLayout(jbAlterarLayout);
        jbAlterarLayout.setHorizontalGroup(
            jbAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jbAlterarLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jbPreencher, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbAlterarr, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jbAlterarLayout.setVerticalGroup(
            jbAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jbAlterarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jbAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jbAlterarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbPreencher, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAlterarr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Pesquisa");

        jtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPesquisaKeyReleased(evt);
            }
        });

        jcbPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código", "Nome", "Valor Custo", "Quantidade" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAlterar))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void preencherTabela() {
        try {

            //Buscando objeto ProdutoServicos     
            ProdutoServicos ps = ServicosFactory.getProdutoServicos();

            /* Criando um ArrayList<ProdutoVO> vazio
             para receber o ArrayList com os dados */
            ArrayList<ProdutoVO> prod = new ArrayList<>();

            //Recebendo o ArrayList cheio em produtos
            prod = ps.buscarProdutos();

            for (int i = 0; i < prod.size(); i++) {
                dtm.addRow(new String[]{
                    String.valueOf(prod.get(i).getIdProduto()),
                    String.valueOf(prod.get(i).getNome()),
                    String.valueOf(prod.get(i).getValorCusto()),
                    String.valueOf(prod.get(i).getQuantidade())
                });
            }//fecha for

            /* Adicionando o modelo de tabela 
             com os dados na tabela produto */
            jtableProduto.setModel(dtm);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Erro! " + e.getMessage());
        }//fecha catch
    }//fecha preencherTabela

    private void limparTabela() {
        /* Para limpar a tabela temos que setar o número de
         linhas para zero no default table model */
        dtm.setNumRows(0);
    }//fecha limparTabela

    private void deletar() {
        try {
            /* Buscando a linha que o usuário clicou */
            int linha = jtableProduto.getSelectedRow();

            /* Testando se o usuário selecionou alguma linha. */
            if (linha == -1) {
                JOptionPane.showMessageDialog(
                        this,
                        "Você não selecionou nenhuma linha!");
            } else {
                ProdutoServicos ps = ServicosFactory.getProdutoServicos();

                /* Buscando o idProduto da linha selecionada. O zero(0) indica
                   que vamos buscar o valor da primeira coluna. */
                String idProduto = (String) jtableProduto.getValueAt(linha, 0);

                /* Enviando o idProduto para ser excluido. */
                ps.deletarProduto(Long.parseLong(idProduto));

                //Mensagem de sucesso para o usuário!
                JOptionPane.showMessageDialog(this,
                        "Produto excluido com sucesso!");

            }//fecha else
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao deletar! " + e.getMessage());
        }//fecha catch        
    }//fecha deletar

    private void filtrar() {
        try {
            if (jtPesquisa.getText().isEmpty()) {
                preencherTabela();
            } else {
                ProdutoServicos ps = ServicosFactory.getProdutoServicos();

                /* Buscando o valor da JComboBox. O método getSelectedItem
                    devolve um Object selecionado na JCombo */
                String pesquisa = (String) jcbPesquisa.getSelectedItem();

                //Criando variável que armazenará a consulta.
                String query;

                /* Testando o que o usuário escolheu no JComboBox. Conforme
                    o que foi escolhido uma determinada consulta será montada. */
                if (pesquisa.equals("Código")) {
                    query = "where idproduto = " + jtPesquisa.getText();
                } else if (pesquisa.equals("Nome")) {
                    query = "where nome like '%" + jtPesquisa.getText() + "%'";
                } else if (pesquisa.equals("Valor Custo")) {
                    query = "where valorcusto like '%" + jtPesquisa.getText() + "%'";
                } else {
                    query = "where quantidade = " + jtPesquisa.getText();
                }//fecha else

                /* Criando um ArrayList vazio para receber os dados do banco. */
                ArrayList<ProdutoVO> prod = new ArrayList<>();

                /* Buscando um ArrayList conforme o filtro que o usuário
                    solicitou. */
                prod = ps.filtrar(query);

                /* For que preenche o modelo de tabela (dtm) buscando 
                   dados do ArrayList chamado p. */
                for (int i = 0; i < prod.size(); i++) {
                    dtm.addRow(new String[]{
                        String.valueOf(prod.get(i).getIdProduto()),
                        String.valueOf(prod.get(i).getNome()),
                        String.valueOf(prod.get(i).getValorCusto()),
                        String.valueOf(prod.get(i).getQuantidade())
                    });
                }//fecha for
                jtableProduto.setModel(dtm);
            }//fecha else
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao buscar! " + e.getMessage());
        }//fecha catch        
    }//fecha filtrar

    private void alterar() {
        int linha = jtableProduto.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(rootPane,
                    "escolha uma linha para alterar");
        } else {
            
            String id = jtableProduto.getValueAt(linha, 0).toString();
            String nome = jtableProduto.getValueAt(linha, 1).toString();
            String valor = jtableProduto.getValueAt(linha, 2).toString();
            String qtd = jtableProduto.getValueAt(linha, 3).toString();

            ProdutoVO p = new ProdutoVO(Long.parseLong(id),nome,Double.parseDouble(valor),Integer.parseInt(qtd));
            
            UIAlterarProduto ap = new UIAlterarProduto(null, true, p);
            ap.setVisible(true);
        }
    }//fecha alterar

    private void jbPreencherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPreencherActionPerformed
        limparTabela();
        preencherTabela();
    }//GEN-LAST:event_jbPreencherActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limparTabela();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarActionPerformed
        deletar();
        limparTabela();
        preencherTabela();
    }//GEN-LAST:event_jbDeletarActionPerformed

    private void jtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesquisaKeyReleased
        limparTabela();
        filtrar();
    }//GEN-LAST:event_jtPesquisaKeyReleased

    private void jtableProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableProdutoMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jtableProdutoMouseClicked

    private void jbAlterarrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarrActionPerformed
        alterar();
        limparTabela();
        preencherTabela();
    }//GEN-LAST:event_jbAlterarrActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLayeredPane jbAlterar;
    private javax.swing.JButton jbAlterarr;
    private javax.swing.JButton jbDeletar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbPreencher;
    private javax.swing.JComboBox jcbPesquisa;
    private javax.swing.JTextField jtPesquisa;
    private javax.swing.JTable jtableProduto;
    // End of variables declaration//GEN-END:variables
}
