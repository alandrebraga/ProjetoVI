/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import controller.FormCadastroController;
import dao.Conexao;
import dao.UsuarioDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.Usuario;

/**
 *
 * @author Cassio
 */
public class frmLogin extends javax.swing.JDialog {

    private final FormCadastroController controller;

    /**
     * Creates new form frmLogin
     */
    public frmLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        controller = new FormCadastroController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPalavra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        psfSenha = new javax.swing.JPasswordField();
        psfSenha1 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        kButton2 = new keeptoo.KButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtPalavra1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        psfSenha2 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        kButton1 = new keeptoo.KButton();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(92, 37, 127));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        txtPalavra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPalavra.setForeground(new java.awt.Color(255, 255, 255));
        txtPalavra.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtPalavra.setCaretColor(new java.awt.Color(255, 153, 0));
        txtPalavra.setOpaque(false);
        jPanel1.add(txtPalavra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 320, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Senha");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Confirmar Senha");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        psfSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        psfSenha.setForeground(new java.awt.Color(255, 255, 255));
        psfSenha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        psfSenha.setCaretColor(new java.awt.Color(255, 153, 0));
        psfSenha.setOpaque(false);
        jPanel1.add(psfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 320, 40));

        psfSenha1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        psfSenha1.setForeground(new java.awt.Color(255, 255, 255));
        psfSenha1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        psfSenha1.setCaretColor(new java.awt.Color(255, 153, 0));
        psfSenha1.setOpaque(false);
        jPanel1.add(psfSenha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 320, 40));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Registrar Usuário");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        kButton2.setBorder(null);
        kButton2.setText("Cadastrar");
        kButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kButton2.setkBorderRadius(40);
        kButton2.setkEndColor(new java.awt.Color(153, 0, 153));
        kButton2.setkHoverEndColor(new java.awt.Color(153, 0, 153));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverStartColor(new java.awt.Color(153, 0, 153));
        kButton2.setkStartColor(new java.awt.Color(204, 0, 255));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 160, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 400, 490));

        jPanel3.setBackground(new java.awt.Color(118, 46, 166));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nome");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        txtPalavra1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPalavra1.setForeground(new java.awt.Color(255, 255, 255));
        txtPalavra1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtPalavra1.setCaretColor(new java.awt.Color(255, 153, 0));
        txtPalavra1.setOpaque(false);
        jPanel3.add(txtPalavra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 320, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Senha");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        psfSenha2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        psfSenha2.setForeground(new java.awt.Color(255, 255, 255));
        psfSenha2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        psfSenha2.setCaretColor(new java.awt.Color(255, 153, 0));
        psfSenha2.setOpaque(false);
        jPanel3.add(psfSenha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 320, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 90, 90));

        kButton1.setBorder(null);
        kButton1.setText("Entrar");
        kButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kButton1.setkBorderRadius(40);
        kButton1.setkEndColor(new java.awt.Color(51, 37, 78));
        kButton1.setkHoverEndColor(new java.awt.Color(214, 151, 255));
        kButton1.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        kButton1.setkHoverStartColor(new java.awt.Color(214, 151, 255));
        kButton1.setkStartColor(new java.awt.Color(92, 37, 127));
        jPanel3.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 160, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 580, 490));

        jPanel5.setBackground(new java.awt.Color(51, 37, 78));
        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 10, 1100, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        controller.salvaUsuario();
    }//GEN-LAST:event_kButton2ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmLogin dialog = new frmLogin(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    public JTextField getTxtPalavra() {
        return txtPalavra;
    }

    public void setTxtPalavra(JTextField txtPalavra) {
        this.txtPalavra = txtPalavra;
    }

    public JPasswordField getPsfSenha() {
        return psfSenha;
    }

    public void setPsfSenha(JPasswordField psfSenha) {
        this.psfSenha = psfSenha;
    }

    public JPasswordField getPsfSenha1() {
        return psfSenha1;
    }

    public void setPsfSenha1(JPasswordField psfSenha1) {
        this.psfSenha1 = psfSenha1;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private keeptoo.KButton kButton1;
    private keeptoo.KButton kButton2;
    public javax.swing.JPasswordField psfSenha;
    public javax.swing.JPasswordField psfSenha1;
    public javax.swing.JPasswordField psfSenha2;
    public javax.swing.JTextField txtPalavra;
    public javax.swing.JTextField txtPalavra1;
    // End of variables declaration//GEN-END:variables
}
