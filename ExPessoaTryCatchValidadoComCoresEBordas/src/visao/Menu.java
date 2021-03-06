/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.JOptionPane;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

/**
 *
 * @author Thiago Cury
 * @version 1.0
 */
public class Menu extends javax.swing.JFrame implements InternalFrameListener{
    
    private boolean flagCadPessoa = false;

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH); //maximiza a janela
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jAreaTrabalho = new javax.swing.JDesktopPane();
        jmbMenu = new javax.swing.JMenuBar();
        jmCadastro = new javax.swing.JMenu();
        jmiCadPessoa = new javax.swing.JMenuItem();
        jmSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jAreaTrabalhoLayout = new javax.swing.GroupLayout(jAreaTrabalho);
        jAreaTrabalho.setLayout(jAreaTrabalhoLayout);
        jAreaTrabalhoLayout.setHorizontalGroup(
            jAreaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jAreaTrabalhoLayout.setVerticalGroup(
            jAreaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 257, Short.MAX_VALUE)
        );

        jmCadastro.setText("Cadastro");

        jmiCadPessoa.setText("Pessoa");
        jmiCadPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadPessoaActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiCadPessoa);

        jmbMenu.add(jmCadastro);

        jmSair.setText("Sair");
        jmSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmSairMouseClicked(evt);
            }
        });
        jmbMenu.add(jmSair);

        setJMenuBar(jmbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jAreaTrabalho)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jAreaTrabalho)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrirCadPessoa(){
        if(!flagCadPessoa){
            UiCadPessoa cp = new UiCadPessoa();
            jAreaTrabalho.add(cp);
            cp.setVisible(true);
            flagCadPessoa = true;
            cp.addInternalFrameListener(this);
        }//Fecha if
    }//Fecha abrirCadPessoa
    
    private void jmiCadPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadPessoaActionPerformed
        abrirCadPessoa();
    }//GEN-LAST:event_jmiCadPessoaActionPerformed

    private void jmSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSairMouseClicked
        int op = JOptionPane.showConfirmDialog(rootPane, "tem certeza?");
        if (op==0) System.exit(0);
    }//GEN-LAST:event_jmSairMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jAreaTrabalho;
    private javax.swing.JMenu jmCadastro;
    private javax.swing.JMenu jmSair;
    private javax.swing.JMenuBar jmbMenu;
    private javax.swing.JMenuItem jmiCadPessoa;
    // End of variables declaration//GEN-END:variables

    @Override
    public void internalFrameOpened(InternalFrameEvent e) {
        
    }

    @Override
    public void internalFrameClosing(InternalFrameEvent e) {
        
    }

    @Override
    public void internalFrameClosed(InternalFrameEvent e) {
        if(e.getInternalFrame() instanceof UiCadPessoa) flagCadPessoa = false;
    }

    @Override
    public void internalFrameIconified(InternalFrameEvent e) {
        
    }

    @Override
    public void internalFrameDeiconified(InternalFrameEvent e) {
        
    }

    @Override
    public void internalFrameActivated(InternalFrameEvent e) {
        
    }

    @Override
    public void internalFrameDeactivated(InternalFrameEvent e) {
        
    }
}
