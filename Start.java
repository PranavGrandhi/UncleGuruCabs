public class Start extends javax.swing.JFrame {  
    String username = "";
    String password = "";
    String userId = "";
    String emailId = "";
    String repassword = "";
    public Start() {
        initComponents();
        incorrectLabel.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parentPanel = new javax.swing.JPanel();
        startPanel = new javax.swing.JPanel();
        companyName = new javax.swing.JLabel();
        loginPageBtn = new javax.swing.JButton();
        registerPageBtn = new javax.swing.JButton();
        loginPanel = new javax.swing.JPanel();
        userIdLabel = new javax.swing.JLabel();
        userIdTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        loginBackBtn = new javax.swing.JButton();
        registerPanel = new javax.swing.JPanel();
        registerUsernameLabel = new javax.swing.JLabel();
        registerUsernameTextField = new javax.swing.JTextField();
        registerEmailIdLabel = new javax.swing.JLabel();
        registerEmailIdTextField = new javax.swing.JTextField();
        registerUserIdLabel = new javax.swing.JLabel();
        registerUserIdTextField = new javax.swing.JTextField();
        registerPasswordLabel = new javax.swing.JLabel();
        registerPasswordTextField = new javax.swing.JPasswordField();
        registerRePasswordLabel = new javax.swing.JLabel();
        registerRePasswordTextField = new javax.swing.JPasswordField();
        createRegisterBtn = new javax.swing.JButton();
        registerBackBtn = new javax.swing.JButton();
        incorrectLabel = new javax.swing.JLabel();
        registerUsernameLabel1 = new javax.swing.JLabel();
        registerUsernameTextField1 = new javax.swing.JTextField();
        signUpSuccessPanel = new javax.swing.JPanel();
        signedUpLabel = new javax.swing.JLabel();
        toSignInBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.black);
        setLocationByPlatform(true);

        parentPanel.setPreferredSize(new java.awt.Dimension(1280, 720));
        parentPanel.setLayout(new java.awt.CardLayout());

        startPanel.setBackground(new java.awt.Color(0, 0, 0));
        startPanel.setPreferredSize(new java.awt.Dimension(1280, 720));

        companyName.setFont(new java.awt.Font("Bahnschrift", 1, 40)); // NOI18N
        companyName.setForeground(new java.awt.Color(255, 255, 255));
        companyName.setText("UNCLE CHURU CABS");

        loginPageBtn.setBackground(new java.awt.Color(255, 255, 255));
        loginPageBtn.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        loginPageBtn.setText("SIGN IN");
        loginPageBtn.setBorder(null);
        loginPageBtn.setFocusPainted(false);
        loginPageBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loginPageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginPageBtnActionPerformed(evt);
            }
        });

        registerPageBtn.setBackground(new java.awt.Color(255, 255, 255));
        registerPageBtn.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        registerPageBtn.setText("SIGN UP");
        registerPageBtn.setBorder(null);
        registerPageBtn.setFocusPainted(false);
        registerPageBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registerPageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerPageBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout startPanelLayout = new javax.swing.GroupLayout(startPanel);
        startPanel.setLayout(startPanelLayout);
        startPanelLayout.setHorizontalGroup(
            startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startPanelLayout.createSequentialGroup()
                .addContainerGap(588, Short.MAX_VALUE)
                .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginPageBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerPageBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(588, 588, 588))
            .addGroup(startPanelLayout.createSequentialGroup()
                .addGap(434, 434, 434)
                .addComponent(companyName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        startPanelLayout.setVerticalGroup(
            startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startPanelLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(companyName)
                .addGap(18, 18, 18)
                .addComponent(loginPageBtn)
                .addGap(18, 18, 18)
                .addComponent(registerPageBtn)
                .addContainerGap(396, Short.MAX_VALUE))
        );

        parentPanel.add(startPanel, "card2");

        loginPanel.setBackground(new java.awt.Color(0, 0, 0));
        loginPanel.setPreferredSize(new java.awt.Dimension(1280, 720));

        userIdLabel.setFont(new java.awt.Font("Bahnschrift", 1, 30)); // NOI18N
        userIdLabel.setForeground(new java.awt.Color(250, 250, 250));
        userIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userIdLabel.setText("USER ID");

        userIdTextField.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        userIdTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userIdTextField.setToolTipText("");

        passwordLabel.setFont(new java.awt.Font("Bahnschrift", 1, 30)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(250, 250, 250));
        passwordLabel.setText("PASSWORD");

        passwordField.setFont(new java.awt.Font("Bahnschrift", 1, 22)); // NOI18N
        passwordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        loginBtn.setBackground(new java.awt.Color(250, 250, 250));
        loginBtn.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        loginBtn.setText("LOGIN");
        loginBtn.setBorder(null);
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        loginBackBtn.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        loginBackBtn.setText("BACK");
        loginBackBtn.setBorder(null);
        loginBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBackBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(553, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userIdTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userIdLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(553, 553, 553))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(userIdLabel)
                .addGap(18, 18, 18)
                .addComponent(userIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(passwordLabel)
                .addGap(18, 18, 18)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginBtn)
                    .addComponent(loginBackBtn))
                .addContainerGap(224, Short.MAX_VALUE))
        );

        parentPanel.add(loginPanel, "card3");

        registerPanel.setBackground(new java.awt.Color(0, 0, 0));
        registerPanel.setPreferredSize(new java.awt.Dimension(1280, 720));

        registerUsernameLabel.setBackground(new java.awt.Color(0, 0, 0));
        registerUsernameLabel.setFont(new java.awt.Font("Bahnschrift", 1, 28)); // NOI18N
        registerUsernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        registerUsernameLabel.setText("NAME");

        registerUsernameTextField.setBackground(new java.awt.Color(51, 51, 51));
        registerUsernameTextField.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        registerUsernameTextField.setForeground(new java.awt.Color(255, 255, 255));

        registerEmailIdLabel.setBackground(new java.awt.Color(0, 0, 0));
        registerEmailIdLabel.setFont(new java.awt.Font("Bahnschrift", 1, 28)); // NOI18N
        registerEmailIdLabel.setForeground(new java.awt.Color(255, 255, 255));
        registerEmailIdLabel.setText("E-MAIL");

        registerEmailIdTextField.setBackground(new java.awt.Color(51, 51, 51));
        registerEmailIdTextField.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        registerEmailIdTextField.setForeground(new java.awt.Color(255, 255, 255));

        registerUserIdLabel.setBackground(new java.awt.Color(0, 0, 0));
        registerUserIdLabel.setFont(new java.awt.Font("Bahnschrift", 1, 28)); // NOI18N
        registerUserIdLabel.setForeground(new java.awt.Color(255, 255, 255));
        registerUserIdLabel.setText("USER ID");

        registerUserIdTextField.setBackground(new java.awt.Color(51, 51, 51));
        registerUserIdTextField.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        registerUserIdTextField.setForeground(new java.awt.Color(255, 255, 255));

        registerPasswordLabel.setBackground(new java.awt.Color(0, 0, 0));
        registerPasswordLabel.setFont(new java.awt.Font("Bahnschrift", 1, 28)); // NOI18N
        registerPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        registerPasswordLabel.setText("PASSWORD");

        registerPasswordTextField.setBackground(new java.awt.Color(51, 51, 51));
        registerPasswordTextField.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        registerPasswordTextField.setForeground(new java.awt.Color(255, 255, 255));

        registerRePasswordLabel.setBackground(new java.awt.Color(0, 0, 0));
        registerRePasswordLabel.setFont(new java.awt.Font("Bahnschrift", 1, 28)); // NOI18N
        registerRePasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        registerRePasswordLabel.setText("RE-TYPE PASSWORD");
        registerRePasswordLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        registerRePasswordTextField.setBackground(new java.awt.Color(51, 51, 51));
        registerRePasswordTextField.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        registerRePasswordTextField.setForeground(new java.awt.Color(255, 255, 255));

        createRegisterBtn.setBackground(new java.awt.Color(250, 250, 250));
        createRegisterBtn.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        createRegisterBtn.setText("CREATE");
        createRegisterBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        createRegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createRegisterBtnActionPerformed(evt);
            }
        });

        registerBackBtn.setBackground(new java.awt.Color(250, 250, 250));
        registerBackBtn.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        registerBackBtn.setText("BACK");
        registerBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBackBtnActionPerformed(evt);
            }
        });

        incorrectLabel.setBackground(new java.awt.Color(0, 0, 0));
        incorrectLabel.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        incorrectLabel.setForeground(new java.awt.Color(255, 0, 0));
        incorrectLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        incorrectLabel.setText("FILL ALL FIELDS CORRECTLY");
        incorrectLabel.setOpaque(true);

        registerUsernameLabel1.setBackground(new java.awt.Color(0, 0, 0));
        registerUsernameLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 28)); // NOI18N
        registerUsernameLabel1.setForeground(new java.awt.Color(255, 255, 255));
        registerUsernameLabel1.setText("MOBILE NUMBER");

        registerUsernameTextField1.setBackground(new java.awt.Color(51, 51, 51));
        registerUsernameTextField1.setFont(new java.awt.Font("Bahnschrift", 0, 22)); // NOI18N
        registerUsernameTextField1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addComponent(incorrectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createRegisterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(registerBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(registerRePasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(registerPanelLayout.createSequentialGroup()
                                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(registerPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(registerUserIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(registerUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(registerEmailIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(registerPasswordTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                                    .addComponent(registerUserIdTextField)
                                    .addComponent(registerEmailIdTextField)
                                    .addComponent(registerUsernameTextField)
                                    .addComponent(registerRePasswordTextField))
                                .addGap(126, 126, 126)
                                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(registerUsernameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(registerUsernameTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE))))
                        .addGap(296, 296, 296))))
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerUsernameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerUsernameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(registerEmailIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerEmailIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(registerUserIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerUserIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(registerPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(registerRePasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerRePasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createRegisterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(incorrectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        parentPanel.add(registerPanel, "card5");

        signUpSuccessPanel.setBackground(new java.awt.Color(0, 0, 0));
        signUpSuccessPanel.setPreferredSize(new java.awt.Dimension(1280, 720));

        signedUpLabel.setBackground(new java.awt.Color(0, 0, 0));
        signedUpLabel.setFont(new java.awt.Font("Bahnschrift", 1, 40)); // NOI18N
        signedUpLabel.setForeground(new java.awt.Color(255, 255, 255));
        signedUpLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signedUpLabel.setText("SIGNED UP SUCCESSFULLY");

        toSignInBtn.setBackground(new java.awt.Color(255, 255, 255));
        toSignInBtn.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        toSignInBtn.setText("SIGN IN");
        toSignInBtn.setBorder(null);
        toSignInBtn.setFocusPainted(false);
        toSignInBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toSignInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toSignInBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout signUpSuccessPanelLayout = new javax.swing.GroupLayout(signUpSuccessPanel);
        signUpSuccessPanel.setLayout(signUpSuccessPanelLayout);
        signUpSuccessPanelLayout.setHorizontalGroup(
            signUpSuccessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpSuccessPanelLayout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addComponent(signedUpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signUpSuccessPanelLayout.createSequentialGroup()
                .addContainerGap(581, Short.MAX_VALUE)
                .addComponent(toSignInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(581, 581, 581))
        );
        signUpSuccessPanelLayout.setVerticalGroup(
            signUpSuccessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpSuccessPanelLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(signedUpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(toSignInBtn)
                .addContainerGap(361, Short.MAX_VALUE))
        );

        parentPanel.add(signUpSuccessPanel, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginPageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginPageBtnActionPerformed
        parentPanel.removeAll();
        parentPanel.add(loginPanel);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_loginPageBtnActionPerformed

    private void registerPageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerPageBtnActionPerformed
       parentPanel.removeAll();
       parentPanel.add(registerPanel);
       parentPanel.repaint();
       parentPanel.revalidate();
    }//GEN-LAST:event_registerPageBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        username = userIdTextField.getText();
        password = String.valueOf(passwordField.getPassword());
        this.setVisible(false) ;
        map newmap = new map() ;
        newmap.setVisible(true) ;
        //System.out.println(username);
        //System.out.println(password);
        //parentPanel.removeAll();
        //parentPanel.add(signUpSuccessPanel);
        //parentPanel.repaint();
        //parentPanel.revalidate();
    }//GEN-LAST:event_loginBtnActionPerformed

    private void loginBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBackBtnActionPerformed
        userIdTextField.setText("");
        passwordField.setText("");
        parentPanel.removeAll();
        parentPanel.add(startPanel);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_loginBackBtnActionPerformed

    private void createRegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createRegisterBtnActionPerformed
        username = registerUsernameTextField.getText();
        password = String.valueOf(registerPasswordTextField.getPassword());
        repassword=String.valueOf(registerRePasswordTextField.getPassword());
        userId=registerUserIdTextField.getText();
        emailId=registerEmailIdTextField.getText();
        if(password.equals(repassword)){
            registerUsernameTextField.setText("");
            registerPasswordTextField.setText("");
            registerRePasswordTextField.setText("");
            registerUserIdTextField.setText("");
            registerEmailIdTextField.setText("");
            incorrectLabel.setVisible(false);
            parentPanel.removeAll();
            parentPanel.add(signUpSuccessPanel);
            parentPanel.repaint();
            parentPanel.revalidate();
        }
        else
             incorrectLabel.setVisible(true);
    }//GEN-LAST:event_createRegisterBtnActionPerformed

    private void toSignInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toSignInBtnActionPerformed
       parentPanel.removeAll();
       parentPanel.add(loginPanel);
       parentPanel.repaint();
       parentPanel.revalidate();
    }//GEN-LAST:event_toSignInBtnActionPerformed

    private void registerBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBackBtnActionPerformed
        registerUsernameTextField.setText("");
        registerPasswordTextField.setText("");
        registerRePasswordTextField.setText("");
        registerUserIdTextField.setText("");
        registerEmailIdTextField.setText("");
        incorrectLabel.setVisible(false);
        parentPanel.removeAll();
        parentPanel.add(startPanel);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_registerBackBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel companyName;
    private javax.swing.JButton createRegisterBtn;
    private javax.swing.JLabel incorrectLabel;
    private javax.swing.JButton loginBackBtn;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton loginPageBtn;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton registerBackBtn;
    private javax.swing.JLabel registerEmailIdLabel;
    private javax.swing.JTextField registerEmailIdTextField;
    private javax.swing.JButton registerPageBtn;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JLabel registerPasswordLabel;
    private javax.swing.JPasswordField registerPasswordTextField;
    private javax.swing.JLabel registerRePasswordLabel;
    private javax.swing.JPasswordField registerRePasswordTextField;
    private javax.swing.JLabel registerUserIdLabel;
    private javax.swing.JTextField registerUserIdTextField;
    private javax.swing.JLabel registerUsernameLabel;
    private javax.swing.JLabel registerUsernameLabel1;
    private javax.swing.JTextField registerUsernameTextField;
    private javax.swing.JTextField registerUsernameTextField1;
    private javax.swing.JPanel signUpSuccessPanel;
    private javax.swing.JLabel signedUpLabel;
    private javax.swing.JPanel startPanel;
    private javax.swing.JButton toSignInBtn;
    private javax.swing.JLabel userIdLabel;
    private javax.swing.JTextField userIdTextField;
    // End of variables declaration//GEN-END:variables
}
