/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nocturne;

/**
 *
 * @author Theo
 */
import datapacket.Datapacket;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FindUser extends javax.swing.JFrame {

    private String Username;

    public FindUser(String username) {
        initComponents();
        this.Username = username;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_left = new javax.swing.JPanel();
        cbx_filterGenre = new javax.swing.JComboBox<>();
        lbl_users = new javax.swing.JLabel();
        sp_users = new javax.swing.JScrollPane();
        ta_users = new javax.swing.JTextArea();
        seperator1 = new javax.swing.JSeparator();
        btn_filterGenre = new javax.swing.JButton();
        lbl_filterGenre = new javax.swing.JLabel();
        txt_homePost = new javax.swing.JTextField();
        lbl_users1 = new javax.swing.JLabel();
        seperator2 = new javax.swing.JSeparator();
        pnl_Right = new javax.swing.JPanel();
        btn_sendRequest = new javax.swing.JButton();
        lbl_icon = new javax.swing.JLabel();
        lbl_cancel = new javax.swing.JLabel();
        pnl_toolbar = new javax.swing.JPanel();
        icon_exit = new javax.swing.JLabel();
        lbl_title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 153));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(600, 330));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_left.setBackground(new java.awt.Color(7, 51, 73));
        pnl_left.setPreferredSize(new java.awt.Dimension(200, 200));

        cbx_filterGenre.setBackground(new java.awt.Color(0, 102, 255));
        cbx_filterGenre.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cbx_filterGenre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Classical", "Dance", "Folk", "Funk", "Hip-Hop", "Indie", "Jazz", "Pop", "Reggae", "Rock", "Soul/R&B", "Techno" }));

        lbl_users.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbl_users.setForeground(new java.awt.Color(57, 113, 177));
        lbl_users.setText("Or Search Manually:");

        ta_users.setBackground(new java.awt.Color(7, 51, 73));
        ta_users.setColumns(20);
        ta_users.setForeground(new java.awt.Color(255, 255, 255));
        ta_users.setRows(5);
        sp_users.setViewportView(ta_users);

        btn_filterGenre.setBackground(new java.awt.Color(57, 113, 177));
        btn_filterGenre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_filterGenre.setForeground(new java.awt.Color(255, 255, 255));
        btn_filterGenre.setText("Filter");
        btn_filterGenre.setPreferredSize(new java.awt.Dimension(250, 25));
        btn_filterGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_filterGenreActionPerformed(evt);
            }
        });

        lbl_filterGenre.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbl_filterGenre.setForeground(new java.awt.Color(57, 113, 177));
        lbl_filterGenre.setText("Filter:");

        txt_homePost.setBackground(new java.awt.Color(7, 51, 73));
        txt_homePost.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txt_homePost.setForeground(new java.awt.Color(255, 255, 255));
        txt_homePost.setBorder(null);
        txt_homePost.setCaretColor(new java.awt.Color(255, 255, 255));

        lbl_users1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbl_users1.setForeground(new java.awt.Color(57, 113, 177));
        lbl_users1.setText("All Users:");

        javax.swing.GroupLayout pnl_leftLayout = new javax.swing.GroupLayout(pnl_left);
        pnl_left.setLayout(pnl_leftLayout);
        pnl_leftLayout.setHorizontalGroup(
            pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_leftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seperator2)
                    .addGroup(pnl_leftLayout.createSequentialGroup()
                        .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(seperator1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_leftLayout.createSequentialGroup()
                                .addComponent(cbx_filterGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_filterGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_users, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sp_users, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_users1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_filterGenre, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txt_homePost))
                .addContainerGap())
        );
        pnl_leftLayout.setVerticalGroup(
            pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_leftLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lbl_filterGenre)
                .addGap(9, 9, 9)
                .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_filterGenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_filterGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(seperator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(lbl_users1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sp_users, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_users)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_homePost, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(seperator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        getContentPane().add(pnl_left, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 200, 280));

        pnl_Right.setBackground(new java.awt.Color(32, 33, 35));
        pnl_Right.setPreferredSize(new java.awt.Dimension(160, 200));

        btn_sendRequest.setBackground(new java.awt.Color(57, 113, 177));
        btn_sendRequest.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_sendRequest.setForeground(new java.awt.Color(255, 255, 255));
        btn_sendRequest.setText("Send Friend Request");
        btn_sendRequest.setPreferredSize(new java.awt.Dimension(250, 25));
        btn_sendRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sendRequestActionPerformed(evt);
            }
        });

        lbl_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nocturne/resources/nocturne_dark140.png"))); // NOI18N
        lbl_icon.setText("jLabel1");
        lbl_icon.setPreferredSize(new java.awt.Dimension(128, 128));

        lbl_cancel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbl_cancel.setForeground(new java.awt.Color(57, 113, 177));
        lbl_cancel.setText("or Cancel");
        lbl_cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_cancelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout pnl_RightLayout = new javax.swing.GroupLayout(pnl_Right);
        pnl_Right.setLayout(pnl_RightLayout);
        pnl_RightLayout.setHorizontalGroup(
            pnl_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_RightLayout.createSequentialGroup()
                .addGroup(pnl_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_RightLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(lbl_cancel)
                        .addGap(0, 58, Short.MAX_VALUE))
                    .addGroup(pnl_RightLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_sendRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pnl_RightLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbl_icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_RightLayout.setVerticalGroup(
            pnl_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_RightLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbl_icon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_sendRequest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_cancel)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        getContentPane().add(pnl_Right, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 180, 280));

        pnl_toolbar.setBackground(new java.awt.Color(57, 113, 177));
        pnl_toolbar.setPreferredSize(new java.awt.Dimension(600, 30));
        pnl_toolbar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnl_toolbarMouseDragged(evt);
            }
        });
        pnl_toolbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnl_toolbarMousePressed(evt);
            }
        });

        icon_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nocturne/resources/cancel.png"))); // NOI18N
        icon_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon_exitMousePressed(evt);
            }
        });

        lbl_title.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lbl_title.setForeground(new java.awt.Color(255, 255, 255));
        lbl_title.setText("Find A User");

        javax.swing.GroupLayout pnl_toolbarLayout = new javax.swing.GroupLayout(pnl_toolbar);
        pnl_toolbar.setLayout(pnl_toolbarLayout);
        pnl_toolbarLayout.setHorizontalGroup(
            pnl_toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_toolbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_title, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(icon_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_toolbarLayout.setVerticalGroup(
            pnl_toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_title, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(icon_exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(pnl_toolbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int xx;
    int xy;
    private void pnl_toolbarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_toolbarMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_pnl_toolbarMousePressed

    private void pnl_toolbarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_toolbarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_pnl_toolbarMouseDragged

    private void btn_filterGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_filterGenreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_filterGenreActionPerformed

    private void lbl_cancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cancelMousePressed
        this.dispose();
    }//GEN-LAST:event_lbl_cancelMousePressed

    private void btn_sendRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sendRequestActionPerformed
        try {

            Datapacket FriendRequest = new Datapacket();
            //GET MY FRIENDS
            FriendRequest.SetCommand("NEW_FRIEND_REQUEST");
            ArrayList<String> Users = new ArrayList();
            Users.add(Username);
            Users.add(ta_users.getSelectedText());
            FriendRequest.SetSingleData(Username);
            FriendRequest.SetArray(Users);

            Socket MainServer = new Socket("localhost", 9090);

            ObjectOutputStream OutToServer = new ObjectOutputStream(MainServer.getOutputStream());
            ObjectInputStream FromServerStream = new ObjectInputStream(MainServer.getInputStream());

            OutToServer.writeObject(FriendRequest);

            Datapacket ServerReply = (Datapacket) FromServerStream.readObject();

            String State = ServerReply.GetData();

            OutToServer.close();
            FromServerStream.close();

            if ("Exists".equals(State)) {
                JOptionPane.showMessageDialog(this,
                        "Request has been sent to " + ta_users.getSelectedText(),
                        "Friend Request",
                        JOptionPane.PLAIN_MESSAGE);
            } else if ("Doesnt".equals(State)) {
                JOptionPane.showMessageDialog(this,
                        "Declined, this username does not exist on Hitify",
                        "Friend Request",
                        JOptionPane.PLAIN_MESSAGE);
            } else if ("AlreadyFriends".equals(State)) {
                JOptionPane.showMessageDialog(this,
                        "You are already friends with this user, or they have sent you a friend request",
                        "Friend Request",
                        JOptionPane.PLAIN_MESSAGE);
            }


            OutToServer.close();
            FromServerStream.close();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_sendRequestActionPerformed

    private void icon_exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_exitMousePressed
        this.dispose();
    }//GEN-LAST:event_icon_exitMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_filterGenre;
    private javax.swing.JButton btn_sendRequest;
    private javax.swing.JComboBox<String> cbx_filterGenre;
    private javax.swing.JLabel icon_exit;
    private javax.swing.JLabel lbl_cancel;
    private javax.swing.JLabel lbl_filterGenre;
    private javax.swing.JLabel lbl_icon;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_users;
    private javax.swing.JLabel lbl_users1;
    private javax.swing.JPanel pnl_Right;
    private javax.swing.JPanel pnl_left;
    private javax.swing.JPanel pnl_toolbar;
    private javax.swing.JSeparator seperator1;
    private javax.swing.JSeparator seperator2;
    private javax.swing.JScrollPane sp_users;
    private javax.swing.JTextArea ta_users;
    private javax.swing.JTextField txt_homePost;
    // End of variables declaration//GEN-END:variables

}