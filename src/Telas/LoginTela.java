package Telas;

import javax.swing.JOptionPane;
import Modelos.User;
import BancoDados.UserDAO;

/**
 *
 * @author Marcelinho
 */
public class LoginTela extends javax.swing.JFrame {

    /**
     * Creates new form LoginTela
     */
    public LoginTela() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        nomeEmpresaLabel = new javax.swing.JLabel();
        direitosAutoraisLabel = new javax.swing.JLabel();
        Left = new javax.swing.JPanel();
        telaLabel = new javax.swing.JLabel();
        usuarioLabel = new javax.swing.JLabel();
        usuarioTextField = new javax.swing.JTextField();
        senhaLabel = new javax.swing.JLabel();
        senhaPasswordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        cadastrarButton = new javax.swing.JButton();
        semContaLabel = new javax.swing.JLabel();
        senhaCheckBox = new javax.swing.JCheckBox();
        cancelarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(800, 500));
        mainPanel.setLayout(null);

        Right.setBackground(new java.awt.Color(190, 62, 51));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));

        logoLabel.setBackground(new java.awt.Color(242, 242, 242));
        logoLabel.setForeground(new java.awt.Color(0, 0, 0));
        logoLabel.setIcon(new javax.swing.ImageIcon("F:\\2024\\mvfour_technology\\src\\Icon\\logo.png")); // NOI18N

        nomeEmpresaLabel.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        nomeEmpresaLabel.setForeground(new java.awt.Color(242, 242, 242));
        nomeEmpresaLabel.setText("MVFOUR TECHNOLOGY");

        direitosAutoraisLabel.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        direitosAutoraisLabel.setForeground(new java.awt.Color(242, 242, 242));
        direitosAutoraisLabel.setText("direitos autorais © mvfour technology Todos os direitos reservados");

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                        .addComponent(logoLabel)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                        .addComponent(nomeEmpresaLabel)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                        .addComponent(direitosAutoraisLabel)
                        .addGap(26, 26, 26))))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(logoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeEmpresaLabel)
                .addGap(65, 65, 65)
                .addComponent(direitosAutoraisLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.add(Right);
        Right.setBounds(0, 0, 400, 500);

        Left.setBackground(new java.awt.Color(255, 255, 255));
        Left.setPreferredSize(new java.awt.Dimension(400, 500));

        telaLabel.setBackground(new java.awt.Color(242, 242, 242));
        telaLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        telaLabel.setForeground(new java.awt.Color(190, 62, 51));
        telaLabel.setText("TELA DE LOGIN");

        usuarioLabel.setBackground(new java.awt.Color(102, 102, 102));
        usuarioLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usuarioLabel.setForeground(new java.awt.Color(0, 0, 0));
        usuarioLabel.setText("Nome de usuário");

        usuarioTextField.setBackground(new java.awt.Color(255, 255, 255));
        usuarioTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usuarioTextField.setForeground(new java.awt.Color(102, 102, 102));
        usuarioTextField.setToolTipText("");
        usuarioTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioTextFieldActionPerformed(evt);
            }
        });

        senhaLabel.setBackground(new java.awt.Color(102, 102, 102));
        senhaLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        senhaLabel.setForeground(new java.awt.Color(0, 0, 0));
        senhaLabel.setText("Senha");

        senhaPasswordField.setBackground(new java.awt.Color(255, 255, 255));
        senhaPasswordField.setForeground(new java.awt.Color(102, 102, 102));

        loginButton.setBackground(new java.awt.Color(190, 62, 51));
        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(242, 242, 242));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        cadastrarButton.setBackground(new java.awt.Color(167, 196, 205));
        cadastrarButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cadastrarButton.setForeground(new java.awt.Color(190, 62, 51));
        cadastrarButton.setText("Cadastrar");
        cadastrarButton.setDoubleBuffered(true);
        cadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarButtonActionPerformed(evt);
            }
        });

        semContaLabel.setBackground(new java.awt.Color(242, 242, 242));
        semContaLabel.setForeground(new java.awt.Color(0, 0, 0));
        semContaLabel.setText("Eu não possuo uma conta");

        senhaCheckBox.setForeground(new java.awt.Color(0, 0, 0));
        senhaCheckBox.setText("Mostrar senha");
        senhaCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaCheckBoxActionPerformed(evt);
            }
        });

        cancelarButton.setBackground(new java.awt.Color(190, 62, 51));
        cancelarButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cancelarButton.setForeground(new java.awt.Color(242, 242, 242));
        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(telaLabel))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuarioLabel)
                            .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(senhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(LeftLayout.createSequentialGroup()
                                        .addComponent(senhaLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(senhaCheckBox))
                                    .addGroup(LeftLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(usuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(LeftLayout.createSequentialGroup()
                                                .addComponent(loginButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cancelarButton))
                                            .addGroup(LeftLayout.createSequentialGroup()
                                                .addComponent(semContaLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(cadastrarButton)))))))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(telaLabel)
                .addGap(18, 18, 18)
                .addComponent(usuarioLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaLabel)
                    .addComponent(senhaCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(cancelarButton))
                .addGap(32, 32, 32)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(semContaLabel)
                    .addComponent(cadastrarButton))
                .addGap(25, 112, Short.MAX_VALUE))
        );

        usuarioTextField.getAccessibleContext().setAccessibleName("Digite seu login");
        senhaPasswordField.getAccessibleContext().setAccessibleName("Digite sua senha");

        mainPanel.add(Left);
        Left.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioTextFieldActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        try{
            String usuario = usuarioTextField.getText();
            String senha = new String(senhaPasswordField.getPassword());
            var user = new User(usuario, senha);
            var dao = new UserDAO();

            if (usuario.equals("")){
                JOptionPane.showMessageDialog(null, "Por favor, insira o nome do usuário.");
            }
            else if (senha.equals("")){
                JOptionPane.showMessageDialog(null, "Por favor, insira a senha.");
            }
            else if(usuario.equals("admin") && senha.equals("admin")){
                JOptionPane.showMessageDialog(null, "Bem vindo, " + usuario + "!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválido!","Aviso",JOptionPane.ERROR_MESSAGE);

            }
            
            if(dao.existe(user) != null){
                JOptionPane.showMessageDialog(null, "Bem vindo");
                if(user.getTipo() == 1){
                   //admin
                   //construir uma AdminTela
                   var adminTela = new AdminTela();
                   //tornar a tela visível
                   //descartar a tela atual(dispose)
                   dispose();
                }
                else{
                    //comum
                    var comumTela = new ComumTela();
                    dispose();
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Par usuário/senha inválido");
            }
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Tente novamente mais tarde");
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void cadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarButtonActionPerformed
        CadastroTela CadastroFrame = new CadastroTela();
        CadastroFrame.setVisible(true);
        CadastroFrame.pack();
        CadastroFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_cadastrarButtonActionPerformed

    private void senhaCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaCheckBoxActionPerformed
        if (senhaCheckBox.isSelected()){
            senhaPasswordField.setEchoChar((char)0);
        }
        else {
            senhaPasswordField.setEchoChar('*');
        }
    }//GEN-LAST:event_senhaCheckBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JButton cadastrarButton;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JLabel direitosAutoraisLabel;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel nomeEmpresaLabel;
    private javax.swing.JLabel semContaLabel;
    private javax.swing.JCheckBox senhaCheckBox;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JPasswordField senhaPasswordField;
    private javax.swing.JLabel telaLabel;
    private javax.swing.JLabel usuarioLabel;
    private javax.swing.JTextField usuarioTextField;
    // End of variables declaration//GEN-END:variables
}
