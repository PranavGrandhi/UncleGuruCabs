public class map extends javax.swing.JFrame {

    /**
     * Creates new form map
     */
    public map() {
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

        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        mapBackground = new javax.swing.JPanel();
        mapSideBar = new javax.swing.JPanel();
        ULogo = new javax.swing.JLabel();
        MyRidesButton = new javax.swing.JButton();
        AcknowledgementsButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        MyProfileButton = new javax.swing.JButton();
        RideDetailsButton = new javax.swing.JButton();
        UncleCabsLabel = new javax.swing.JLabel();
        MapPanel = new javax.swing.JPanel();
        SourceDropDown = new javax.swing.JComboBox<>();
        SourceDropDown1 = new javax.swing.JComboBox<>();
        DestinationLabel = new javax.swing.JLabel();
        SourceLabel1 = new javax.swing.JLabel();
        GraphPanel = new javax.swing.JPanel();
        MicroVariable = new javax.swing.JLabel();
        SedanVariable = new javax.swing.JLabel();
        MiniLabel = new javax.swing.JLabel();
        MiniRadioButton = new javax.swing.JRadioButton();
        SedanRadioButton = new javax.swing.JRadioButton();
        MicroRadioButton = new javax.swing.JRadioButton();
        SUVRadioButton = new javax.swing.JRadioButton();
        BookRideButton = new javax.swing.JButton();
        ExpectedPriceText = new javax.swing.JTextField();
        PriceLabel = new javax.swing.JLabel();
        PriceLabel1 = new javax.swing.JLabel();
        ExpectedPriceText1 = new javax.swing.JTextField();
        SUVVariable = new javax.swing.JLabel();

        jRadioButton3.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton5.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 36)); // NOI18N
        jButton3.setText("My Profile");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 800));
        setResizable(false);

        mapBackground.setBackground(new java.awt.Color(0, 0, 0));
        mapBackground.setPreferredSize(new java.awt.Dimension(1280, 800));

        mapSideBar.setBackground(new java.awt.Color(60, 60, 60));

        ULogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoo.PNG"))); // NOI18N
        ULogo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        MyRidesButton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 36)); // NOI18N
        MyRidesButton.setText("My Rides");
        MyRidesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MyRidesButtonMouseClicked(evt);
            }
        });
        MyRidesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyRidesButtonActionPerformed(evt);
            }
        });

        AcknowledgementsButton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 28)); // NOI18N
        AcknowledgementsButton.setText("Acknowledgements");
        AcknowledgementsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AcknowledgementsButtonMouseClicked(evt);
            }
        });

        LogoutButton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 36)); // NOI18N
        LogoutButton.setText("Logout");
        LogoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutButtonMouseClicked(evt);
            }
        });

        MyProfileButton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 36)); // NOI18N
        MyProfileButton.setText("My Profile");
        MyProfileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MyProfileButtonMouseClicked(evt);
            }
        });

        RideDetailsButton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 36)); // NOI18N
        RideDetailsButton.setText("Ride Details");
        RideDetailsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RideDetailsButtonMouseClicked(evt);
            }
        });

        UncleCabsLabel.setBackground(new java.awt.Color(0, 0, 0));
        UncleCabsLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 48)); // NOI18N
        UncleCabsLabel.setForeground(new java.awt.Color(255, 255, 255));
        UncleCabsLabel.setText("UNCLE CABS");

        javax.swing.GroupLayout mapSideBarLayout = new javax.swing.GroupLayout(mapSideBar);
        mapSideBar.setLayout(mapSideBarLayout);
        mapSideBarLayout.setHorizontalGroup(
            mapSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mapSideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mapSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mapSideBarLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(ULogo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(mapSideBarLayout.createSequentialGroup()
                        .addComponent(UncleCabsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(mapSideBarLayout.createSequentialGroup()
                .addGroup(mapSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RideDetailsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LogoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mapSideBarLayout.createSequentialGroup()
                        .addGroup(mapSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(MyProfileButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MyRidesButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AcknowledgementsButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mapSideBarLayout.setVerticalGroup(
            mapSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mapSideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ULogo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UncleCabsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MyProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MyRidesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AcknowledgementsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(RideDetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        MapPanel.setBackground(new java.awt.Color(60, 60, 60));

        SourceDropDown.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 36)); // NOI18N
        SourceDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BITS", "Sathya", "Vceroy", "Secunderabad" }));
        SourceDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SourceDropDownActionPerformed(evt);
            }
        });

        SourceDropDown1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 36)); // NOI18N
        SourceDropDown1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BITS", "Sathya", "Vceroy", "Secunderabad" }));
        SourceDropDown1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SourceDropDown1ActionPerformed(evt);
            }
        });

        DestinationLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 36)); // NOI18N
        DestinationLabel.setForeground(new java.awt.Color(255, 255, 255));
        DestinationLabel.setText("Destination");

        SourceLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 36)); // NOI18N
        SourceLabel1.setForeground(new java.awt.Color(255, 255, 255));
        SourceLabel1.setText("Source");

        GraphPanel.setBackground(new java.awt.Color(100, 100, 100));

        javax.swing.GroupLayout GraphPanelLayout = new javax.swing.GroupLayout(GraphPanel);
        GraphPanel.setLayout(GraphPanelLayout);
        GraphPanelLayout.setHorizontalGroup(
            GraphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 879, Short.MAX_VALUE)
        );
        GraphPanelLayout.setVerticalGroup(
            GraphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 433, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout MapPanelLayout = new javax.swing.GroupLayout(MapPanel);
        MapPanel.setLayout(MapPanelLayout);
        MapPanelLayout.setHorizontalGroup(
            MapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MapPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(MapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SourceDropDown1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SourceLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SourceDropDown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DestinationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(116, 116, 116))
            .addGroup(MapPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GraphPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MapPanelLayout.setVerticalGroup(
            MapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MapPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SourceLabel1)
                    .addComponent(DestinationLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MapPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SourceDropDown1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SourceDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GraphPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        MicroVariable.setBackground(new java.awt.Color(204, 204, 255));
        MicroVariable.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 36)); // NOI18N
        MicroVariable.setForeground(new java.awt.Color(255, 255, 255));
        MicroVariable.setText("MICRO");

        SedanVariable.setBackground(new java.awt.Color(204, 204, 255));
        SedanVariable.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 36)); // NOI18N
        SedanVariable.setForeground(new java.awt.Color(255, 255, 255));
        SedanVariable.setText("SEDAN");

        MiniLabel.setBackground(new java.awt.Color(204, 204, 255));
        MiniLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 36)); // NOI18N
        MiniLabel.setForeground(new java.awt.Color(255, 255, 255));
        MiniLabel.setText("MINI");

        MiniRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        MiniRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiniRadioButtonActionPerformed(evt);
            }
        });

        SedanRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        SedanRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SedanRadioButtonActionPerformed(evt);
            }
        });

        MicroRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        MicroRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MicroRadioButtonActionPerformed(evt);
            }
        });

        SUVRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        SUVRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUVRadioButtonActionPerformed(evt);
            }
        });

        BookRideButton.setBackground(new java.awt.Color(70, 70, 70));
        BookRideButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        BookRideButton.setText("Book Ride");

        ExpectedPriceText.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 48)); // NOI18N
        ExpectedPriceText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpectedPriceTextActionPerformed(evt);
            }
        });

        PriceLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 36)); // NOI18N
        PriceLabel.setForeground(new java.awt.Color(255, 255, 255));
        PriceLabel.setText("ETA");

        PriceLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 36)); // NOI18N
        PriceLabel1.setForeground(new java.awt.Color(255, 255, 255));
        PriceLabel1.setText("PRICE");

        ExpectedPriceText1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 48)); // NOI18N
        ExpectedPriceText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpectedPriceText1ActionPerformed(evt);
            }
        });

        SUVVariable.setBackground(new java.awt.Color(204, 204, 255));
        SUVVariable.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 36)); // NOI18N
        SUVVariable.setForeground(new java.awt.Color(255, 255, 255));
        SUVVariable.setText("SUV");

        javax.swing.GroupLayout mapBackgroundLayout = new javax.swing.GroupLayout(mapBackground);
        mapBackground.setLayout(mapBackgroundLayout);
        mapBackgroundLayout.setHorizontalGroup(
            mapBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mapBackgroundLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(mapSideBar, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mapBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MapPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mapBackgroundLayout.createSequentialGroup()
                        .addGroup(mapBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mapBackgroundLayout.createSequentialGroup()
                                .addComponent(MiniRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MiniLabel))
                            .addGroup(mapBackgroundLayout.createSequentialGroup()
                                .addComponent(SedanRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SedanVariable)))
                        .addGap(7, 7, 7)
                        .addGroup(mapBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mapBackgroundLayout.createSequentialGroup()
                                .addComponent(SUVRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SUVVariable))
                            .addGroup(mapBackgroundLayout.createSequentialGroup()
                                .addComponent(MicroRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MicroVariable)))
                        .addGap(40, 40, 40)
                        .addGroup(mapBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PriceLabel)
                            .addComponent(ExpectedPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(mapBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PriceLabel1)
                            .addComponent(ExpectedPriceText1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(BookRideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mapBackgroundLayout.setVerticalGroup(
            mapBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mapBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mapBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mapSideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mapBackgroundLayout.createSequentialGroup()
                        .addComponent(MapPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(mapBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mapBackgroundLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(mapBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(mapBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(SUVVariable)
                                        .addComponent(PriceLabel)
                                        .addComponent(PriceLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(mapBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(MiniRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(MiniLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(SUVRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(mapBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(mapBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(mapBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(SedanVariable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(SedanRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(MicroRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(mapBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(MicroVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ExpectedPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(ExpectedPriceText1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(mapBackgroundLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BookRideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(mapBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 1274, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mapBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MiniRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiniRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MiniRadioButtonActionPerformed

    private void SedanRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SedanRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SedanRadioButtonActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void MicroRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MicroRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MicroRadioButtonActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void SUVRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUVRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SUVRadioButtonActionPerformed

    private void SourceDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SourceDropDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SourceDropDownActionPerformed

    private void SourceDropDown1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SourceDropDown1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SourceDropDown1ActionPerformed

    private void ExpectedPriceTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpectedPriceTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExpectedPriceTextActionPerformed

    private void MyRidesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyRidesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MyRidesButtonActionPerformed

    private void ExpectedPriceText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpectedPriceText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExpectedPriceText1ActionPerformed

    private void AcknowledgementsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AcknowledgementsButtonMouseClicked
        this.setVisible(false) ;
        Acknowledgements ack = new Acknowledgements() ;
        ack.setVisible(true) ;
    }//GEN-LAST:event_AcknowledgementsButtonMouseClicked

    private void LogoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutButtonMouseClicked
       this.setVisible(false) ;
       Start str = new Start() ;
       str.setVisible(true) ;
    }//GEN-LAST:event_LogoutButtonMouseClicked

    private void MyProfileButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MyProfileButtonMouseClicked
        this.setVisible(false) ;
        MyProfile mp = new MyProfile() ;
        mp.setVisible(true) ;
    }//GEN-LAST:event_MyProfileButtonMouseClicked

    private void RideDetailsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RideDetailsButtonMouseClicked
        this.setVisible(false);
        DriverDetails dridet = new DriverDetails();
        dridet.setVisible(true);
    }//GEN-LAST:event_RideDetailsButtonMouseClicked

    private void MyRidesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MyRidesButtonMouseClicked
        this.setVisible(false) ;
        MyRides mr = new MyRides() ;
        mr.setVisible(true) ;
    }//GEN-LAST:event_MyRidesButtonMouseClicked

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
            java.util.logging.Logger.getLogger(map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(map.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new map().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcknowledgementsButton;
    private javax.swing.JButton BookRideButton;
    private javax.swing.JLabel DestinationLabel;
    private javax.swing.JTextField ExpectedPriceText;
    private javax.swing.JTextField ExpectedPriceText1;
    private javax.swing.JPanel GraphPanel;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JPanel MapPanel;
    private javax.swing.JRadioButton MicroRadioButton;
    private javax.swing.JLabel MicroVariable;
    private javax.swing.JLabel MiniLabel;
    private javax.swing.JRadioButton MiniRadioButton;
    private javax.swing.JButton MyProfileButton;
    private javax.swing.JButton MyRidesButton;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JLabel PriceLabel1;
    private javax.swing.JButton RideDetailsButton;
    private javax.swing.JRadioButton SUVRadioButton;
    private javax.swing.JLabel SUVVariable;
    private javax.swing.JRadioButton SedanRadioButton;
    private javax.swing.JLabel SedanVariable;
    private javax.swing.JComboBox<String> SourceDropDown;
    private javax.swing.JComboBox<String> SourceDropDown1;
    private javax.swing.JLabel SourceLabel1;
    private javax.swing.JLabel ULogo;
    private javax.swing.JLabel UncleCabsLabel;
    private javax.swing.JButton jButton3;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JPanel mapBackground;
    private javax.swing.JPanel mapSideBar;
    // End of variables declaration//GEN-END:variables
}
