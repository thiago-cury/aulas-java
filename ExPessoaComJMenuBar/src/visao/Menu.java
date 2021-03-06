/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.event.KeyEvent;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

/**
 *
 * @author QI
 */
public class Menu extends javax.swing.JFrame implements InternalFrameListener{

    private boolean flagCadPessoa = false;
    
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        //Maximizar a janela
        setExtendedState(MAXIMIZED_BOTH);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpAreaTrabalho = new javax.swing.JDesktopPane();
        jmbMenu = new javax.swing.JMenuBar();
        jmCadastro = new javax.swing.JMenu();
        jmiCadPessoa = new javax.swing.JMenuItem();
        jmSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jdpAreaTrabalhoLayout = new javax.swing.GroupLayout(jdpAreaTrabalho);
        jdpAreaTrabalho.setLayout(jdpAreaTrabalhoLayout);
        jdpAreaTrabalhoLayout.setHorizontalGroup(
            jdpAreaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );
        jdpAreaTrabalhoLayout.setVerticalGroup(
            jdpAreaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 257, Short.MAX_VALUE)
        );

        jmCadastro.setText("Cadastro");

        jmiCadPessoa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmiCadPessoa.setText("Pessoa");
        jmiCadPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadPessoaActionPerformed(evt);
            }
        });
        jmiCadPessoa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jmiCadPessoaKeyPressed(evt);
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
                .addComponent(jdpAreaTrabalho)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jdpAreaTrabalho)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrirCadPessoa(){
        if(!flagCadPessoa){
            UICadPessoa cp = new UICadPessoa();
            jdpAreaTrabalho.add(cp);
            cp.setVisible(true);
            cp.addInternalFrameListener(this);
            flagCadPessoa = true; //indicando que abriu
        }//fecha if
    }//fecha
    
    private void jmiCadPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadPessoaActionPerformed
        abrirCadPessoa();
    }//GEN-LAST:event_jmiCadPessoaActionPerformed
    private void jmiCadPessoaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jmiCadPessoaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            abrirCadPessoa();
        }//fecha if
    }//GEN-LAST:event_jmiCadPessoaKeyPressed

    private void jmSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSairMouseClicked
        System.exit(EXIT_ON_CLOSE);
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
    private javax.swing.JDesktopPane jdpAreaTrabalho;
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
        if(e.getInternalFrame() instanceof UICadPessoa){
            flagCadPessoa = false;
        }
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
