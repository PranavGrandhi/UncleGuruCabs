/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prana
 */
public class MyRides extends javax.swing.JFrame {

    /**
     * Creates new form MyRides
     */
    public MyRides() {
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

        jPanel1 = new javax.swing.JPanel();
        mapSideBar = new javax.swing.JPanel();
        ULogo = new javax.swing.JLabel();
        AcknowledgementsButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        MyProfileButton = new javax.swing.JButton();
        RideDetailsButton = new javax.swing.JButton();
        UncleCabsLabel = new javax.swing.JLabel();
        MyRidesLabel = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        RidesTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1281, 720));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        mapSideBar.setBackground(new java.awt.Color(60, 60, 60));

        ULogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoo.PNG"))); // NOI18N
        ULogo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

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

        MyRidesLabel.setBackground(new java.awt.Color(0, 0, 0));
        MyRidesLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 36)); // NOI18N
        MyRidesLabel.setForeground(new java.awt.Color(255, 255, 255));
        MyRidesLabel.setText("My Rides");

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
                            .addComponent(AcknowledgementsButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mapSideBarLayout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(MyRidesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(MyRidesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AcknowledgementsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(RideDetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
        );

        BackButton.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 36)); // NOI18N
        BackButton.setText("Back");
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonMouseClicked(evt);
            }
        });
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        RidesTextField.setBackground(new java.awt.Color(0, 0, 0));
        RidesTextField.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 24)); // NOI18N
        RidesTextField.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mapSideBar, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(RidesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(115, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(RidesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(mapSideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
        this.setVisible(false) ;
        map newmap = new map() ;
        newmap.setVisible(true) ;
    }//GEN-LAST:event_BackButtonMouseClicked

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MyRides.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyRides.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyRides.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyRides.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyRides().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcknowledgementsButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton MyProfileButton;
    private javax.swing.JLabel MyRidesLabel;
    private javax.swing.JButton RideDetailsButton;
    private javax.swing.JTextField RidesTextField;
    private javax.swing.JLabel ULogo;
    private javax.swing.JLabel UncleCabsLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mapSideBar;
    // End of variables declaration//GEN-END:variables
}
