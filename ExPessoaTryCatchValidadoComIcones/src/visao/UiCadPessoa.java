/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Pessoa;

/**
 *
 * @author Thiago Cury
 * @version 1.0
 */
public class UiCadPessoa extends javax.swing.JInternalFrame {

    /**
     * Creates new form UiCadPessoa
     */
    public UiCadPessoa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlpDados = new javax.swing.JLayeredPane();
        jlNome = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jlIdade = new javax.swing.JLabel();
        jtIdade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jlNomeErro = new javax.swing.JLabel();
        jlIdadeErro = new javax.swing.JLabel();
        jlpAcoes = new javax.swing.JLayeredPane();
        jbCadastrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Pessoa");

        jlpDados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlNome.setText("Nome");

        jtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtNomeFocusLost(evt);
            }
        });

        jlIdade.setText("Idade");

        jtIdade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtIdadeFocusLost(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/people.png"))); // NOI18N

        jlpDados.setLayer(jlNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlIdade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jtIdade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlNomeErro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jlpDados.setLayer(jlIdadeErro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpDadosLayout = new javax.swing.GroupLayout(jlpDados);
        jlpDados.setLayout(jlpDadosLayout);
        jlpDadosLayout.setHorizontalGroup(
            jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlIdade)
                    .addComponent(jlNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addComponent(jtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlIdadeErro, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlNomeErro, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jlpDadosLayout.setVerticalGroup(
            jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpDadosLayout.createSequentialGroup()
                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNomeErro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jlpDadosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlNome))))
                        .addGap(18, 18, 18)
                        .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jlpDadosLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jlpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlIdade)
                                    .addComponent(jtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jlIdadeErro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jlpDadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlpAcoes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/add.png"))); // NOI18N
        jbCadastrar.setText("cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jlpAcoes.setLayer(jbCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jlpAcoesLayout = new javax.swing.GroupLayout(jlpAcoes);
        jlpAcoes.setLayout(jlpAcoesLayout);
        jlpAcoesLayout.setHorizontalGroup(
            jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpAcoesLayout.createSequentialGroup()
                .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 148, Short.MAX_VALUE))
        );
        jlpAcoesLayout.setVerticalGroup(
            jlpAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlpAcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlpAcoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlpDados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlpDados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlpAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * recebe os dados do usuário, cadastra na classe e imprime o resultado
     */
    private void cadastrar() {
        try {
            Pessoa p = new Pessoa();

            if (jtNome.getText().isEmpty()) {
                throw new NumberFormatException("Nome em branco!");
            } else {
                p.setNome(jtNome.getText());
            }

            if (jtIdade.getText().isEmpty()) {
                throw new NumberFormatException("Idade em branco!");
            } else {
                p.setIdade(Integer.parseInt(jtIdade.getText()));
            }

            //Exceção matemática caso descomente o código. 
            /*JOptionPane.showMessageDialog(
                    rootPane,
                    "Dividir!" + p.dividir(10,0),
                    "Relatório",
                    JOptionPane.PLAIN_MESSAGE);*/
            JOptionPane.showMessageDialog(
                    rootPane,
                    "Pessoa cadastrada com sucesso!\n" + p.toString(),
                    "Relatório",
                    JOptionPane.PLAIN_MESSAGE);

            limpar();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    rootPane, "Erro! " + e.getMessage());
        } catch (ArithmeticException ae) {
            JOptionPane.showMessageDialog(
                    rootPane, "Erro! " + ae.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    rootPane, "Algum erro ocorreu! " + e.getMessage());
        } finally {
            System.out.println("Passou aqui!");
        }
    }//Fecha cadastrar

    /**
     * limpa os campos
     */
    private void limpar() {
        jtNome.setText(null);
        jtIdade.setText(null);
        jtNome.grabFocus();
    }//Fecha limpar

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        cadastrar();
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtNomeFocusLost
        if (jtNome.getText().isEmpty()) {
            jlNomeErro.setIcon(
                    new ImageIcon(
                            getClass().getResource("/icones/error.png")));
        } else {
            jlNomeErro.setIcon(
                    new ImageIcon(
                            getClass().getResource("/icones/ok.png")));
        }
    }//GEN-LAST:event_jtNomeFocusLost

    private void jtIdadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtIdadeFocusLost
        if (jtIdade.getText().isEmpty()) {
            jlIdadeErro.setIcon(
                    new ImageIcon(
                            getClass().getResource("/icones/error.png")));
        } else {
            jlIdadeErro.setIcon(
                    new ImageIcon(
                            getClass().getResource("/icones/ok.png")));
        }
    }//GEN-LAST:event_jtIdadeFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JLabel jlIdade;
    private javax.swing.JLabel jlIdadeErro;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlNomeErro;
    private javax.swing.JLayeredPane jlpAcoes;
    private javax.swing.JLayeredPane jlpDados;
    private javax.swing.JTextField jtIdade;
    private javax.swing.JTextField jtNome;
    // End of variables declaration//GEN-END:variables
}