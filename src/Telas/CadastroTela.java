/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import Modelos.User;
import BancoDados.UserDAO;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcelinho
 */
public class CadastroTela extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro
     */
    public CadastroTela() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Icon/logo_square.png")).getImage());
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
        jPanel2 = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        nomeEmpresaLabel = new javax.swing.JLabel();
        direitosAutoraisLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        telaLabel = new javax.swing.JLabel();
        loginLabel = new javax.swing.JLabel();
        loginTextField = new javax.swing.JTextField();
        senhaLabel = new javax.swing.JLabel();
        senhaTextField = new javax.swing.JTextField();
        nomeCompletoLabel = new javax.swing.JLabel();
        nomeCompletoTextField = new javax.swing.JTextField();
        cpfLabel = new javax.swing.JLabel();
        cpfTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        idadeLabel = new javax.swing.JLabel();
        idadeTextField = new javax.swing.JTextField();
        sexoLabel = new javax.swing.JLabel();
        sexoComboBox = new javax.swing.JComboBox<>();
        comContaLabel = new javax.swing.JLabel();
        cadastroButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(190, 62, 51));

        nomeEmpresaLabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        nomeEmpresaLabel.setForeground(new java.awt.Color(242, 242, 242));
        nomeEmpresaLabel.setText("MVFOUR TECHNOLOGY");

        direitosAutoraisLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        direitosAutoraisLabel.setForeground(new java.awt.Color(242, 242, 242));
        direitosAutoraisLabel.setText("direitos autorais © mvfour technology Todos os direitos reservados");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeEmpresaLabel)
                    .addComponent(logoLabel))
                .addGap(68, 68, 68))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(direitosAutoraisLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(logoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nomeEmpresaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(direitosAutoraisLabel)
                .addGap(46, 46, 46))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 500);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        telaLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        telaLabel.setForeground(new java.awt.Color(190, 62, 51));
        telaLabel.setText("TELA DE CADASTRO");

        loginLabel.setBackground(new java.awt.Color(102, 102, 102));
        loginLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginLabel.setText("Login");

        loginTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginTextField.setForeground(new java.awt.Color(102, 102, 102));
        loginTextField.setToolTipText("");
        loginTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginTextFieldActionPerformed(evt);
            }
        });

        senhaLabel.setBackground(new java.awt.Color(102, 102, 102));
        senhaLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        senhaLabel.setText("Senha");

        senhaTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        senhaTextField.setForeground(new java.awt.Color(102, 102, 102));
        senhaTextField.setToolTipText("");
        senhaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaTextFieldActionPerformed(evt);
            }
        });

        nomeCompletoLabel.setBackground(new java.awt.Color(102, 102, 102));
        nomeCompletoLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nomeCompletoLabel.setText("Nome completo");

        nomeCompletoTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nomeCompletoTextField.setForeground(new java.awt.Color(102, 102, 102));
        nomeCompletoTextField.setToolTipText("");
        nomeCompletoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeCompletoTextFieldActionPerformed(evt);
            }
        });

        cpfLabel.setBackground(new java.awt.Color(102, 102, 102));
        cpfLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cpfLabel.setText("CPF");

        cpfTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cpfTextField.setForeground(new java.awt.Color(102, 102, 102));
        cpfTextField.setToolTipText("");
        cpfTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfTextFieldActionPerformed(evt);
            }
        });

        emailLabel.setBackground(new java.awt.Color(102, 102, 102));
        emailLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailLabel.setText("E-mail");

        emailTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailTextField.setForeground(new java.awt.Color(102, 102, 102));
        emailTextField.setToolTipText("");
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        idadeLabel.setBackground(new java.awt.Color(102, 102, 102));
        idadeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idadeLabel.setText("Idade");

        idadeTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        idadeTextField.setForeground(new java.awt.Color(102, 102, 102));
        idadeTextField.setToolTipText("");
        idadeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadeTextFieldActionPerformed(evt);
            }
        });

        sexoLabel.setBackground(new java.awt.Color(102, 102, 102));
        sexoLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sexoLabel.setText("Sexo");

        sexoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sexoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoComboBoxActionPerformed(evt);
            }
        });

        comContaLabel.setText("Eu possuo uma conta");

        cadastroButton.setBackground(new java.awt.Color(190, 62, 51));
        cadastroButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cadastroButton.setForeground(new java.awt.Color(242, 242, 242));
        cadastroButton.setText("Cadastrar");
        cadastroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroButtonActionPerformed(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(167, 196, 205));
        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(190, 62, 51));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 32, Short.MAX_VALUE)
                .addComponent(telaLabel)
                .addGap(28, 28, 28))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(comContaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cadastroButton))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginLabel)
                            .addComponent(cpfLabel)
                            .addComponent(nomeCompletoLabel)
                            .addComponent(senhaLabel)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(loginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomeCompletoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cpfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(senhaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailLabel)
                            .addComponent(idadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idadeLabel)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(sexoLabel)
                                .addGap(18, 18, 18)
                                .addComponent(sexoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(telaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeCompletoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeCompletoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpfLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idadeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idadeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(comContaLabel)
                    .addComponent(cadastroButton))
                .addContainerGap())
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginTextFieldActionPerformed
        //var novo
    }//GEN-LAST:event_loginTextFieldActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void senhaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaTextFieldActionPerformed

    private void cadastroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroButtonActionPerformed
        var novoLogin = loginTextField.getText();
        var novaSenha = new String(senhaTextField.getText());
        var novoNome = nomeCompletoTextField.getText();
        var novoCpf = cpfTextField.getText();
        var novoEmail = emailTextField.getText();
        var novaIdade = idadeTextField.getText();
        var novoSexo = sexoComboBox.getSelectedItem();
        
        if(!novaSenha.trim().isEmpty() && !novoLogin.trim().isEmpty() && !novoNome.trim().isEmpty() && !novoCpf.trim().isEmpty() && !novoEmail.trim().isEmpty() && !novaIdade.trim().isEmpty() && novoSexo != null){
            var user = new User(novoLogin, novaSenha, novoNome, novoCpf, novoEmail, novaIdade, novoSexo);
            var dao = new UserDAO();
            try {
                dao.cadastrar(user);
                if(dao.ha(user)){
                    JOptionPane.showMessageDialog(null, "Usuario Cadastrado");
                }else{
                    JOptionPane.showMessageDialog(null, "Não foi possivel realizar o cadastro");
                }
                
            } catch (Exception ex) {
                Logger.getLogger(CadastroTela.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Por favor, prencha todos os campos");
        }
    }//GEN-LAST:event_cadastroButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        LoginTela LoginFrame = new LoginTela();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        LoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_loginButtonActionPerformed

    private void nomeCompletoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeCompletoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeCompletoTextFieldActionPerformed

    private void cpfTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfTextFieldActionPerformed

    private void idadeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idadeTextFieldActionPerformed

    private void sexoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoComboBoxActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroTela().setVisible(true);
            }
        });
    }
    
    /**
     * @param args the command line arguments
     */
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastroButton;
    private javax.swing.JLabel comContaLabel;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JTextField cpfTextField;
    private javax.swing.JLabel direitosAutoraisLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel idadeLabel;
    private javax.swing.JTextField idadeTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel nomeCompletoLabel;
    private javax.swing.JTextField nomeCompletoTextField;
    private javax.swing.JLabel nomeEmpresaLabel;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JTextField senhaTextField;
    private javax.swing.JComboBox<String> sexoComboBox;
    private javax.swing.JLabel sexoLabel;
    private javax.swing.JLabel telaLabel;
    // End of variables declaration//GEN-END:variables
}
