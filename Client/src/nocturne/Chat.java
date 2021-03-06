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
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import datapacket.Datapacket;
import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Chat extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public String userName;
    public String friendName;

    InetAddress address;
    Socket msgServer;
    DataOutputStream outToMsgServer;
    DataInputStream inFromMsgServer;

    String chatName;
    File chatFile;
    boolean cont = true;

    public Chat(String input_username, String input_friendname) {
        initComponents();



        // Gets usernames
        userName = input_username;
        friendName = input_friendname;

        //Outputs name of user they're messaging 
        lbl_sendMessageTo.setText(friendName);

        try {
            // Creates connection with messaging server
            address = InetAddress.getByName("localhost");
            msgServer = new Socket(address, 9091);
            inFromMsgServer = new DataInputStream(msgServer.getInputStream());
            outToMsgServer = new DataOutputStream(msgServer.getOutputStream());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Runs thread which continuously updates message table
        Thread th = new Thread(new Runnable() {
            public void run() {

            }
        });
        th.start();

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
        lbl_chooseFile = new javax.swing.JLabel();
        btn_sendMessage = new javax.swing.JButton();
        seperator1 = new javax.swing.JSeparator();
        ta_chosenFile = new javax.swing.JTextArea();
        lbl_sendMessage = new javax.swing.JLabel();
        btn_chooseFile = new javax.swing.JButton();
        sp_sendMessage = new javax.swing.JScrollPane();
        ta_sendMessage = new javax.swing.JTextArea();
        lbl_cancel = new javax.swing.JLabel();
        lbl_sendMessageTo = new javax.swing.JLabel();
        pnl_Right = new javax.swing.JPanel();
        sp_dialogue = new javax.swing.JScrollPane();
        ta_dialogue = new javax.swing.JTextArea();
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
        pnl_left.setPreferredSize(new java.awt.Dimension(250, 260));

        lbl_chooseFile.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbl_chooseFile.setForeground(new java.awt.Color(57, 113, 177));
        lbl_chooseFile.setText("(Optional) Choose File:");

        btn_sendMessage.setBackground(new java.awt.Color(57, 113, 177));
        btn_sendMessage.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_sendMessage.setForeground(new java.awt.Color(255, 255, 255));
        btn_sendMessage.setText("Send");
        btn_sendMessage.setPreferredSize(new java.awt.Dimension(250, 25));
        btn_sendMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sendMessageActionPerformed(evt);
            }
        });

        ta_chosenFile.setBackground(new java.awt.Color(7, 51, 73));
        ta_chosenFile.setColumns(20);
        ta_chosenFile.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        ta_chosenFile.setForeground(new java.awt.Color(255, 255, 255));
        ta_chosenFile.setRows(5);
        ta_chosenFile.setText("Chosen File: ");

        lbl_sendMessage.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbl_sendMessage.setForeground(new java.awt.Color(57, 113, 177));
        lbl_sendMessage.setText("Send Message to:");

        btn_chooseFile.setBackground(new java.awt.Color(57, 113, 177));
        btn_chooseFile.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_chooseFile.setForeground(new java.awt.Color(255, 255, 255));
        btn_chooseFile.setText("Choose File");
        btn_chooseFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chooseFileActionPerformed(evt);
            }
        });

        ta_sendMessage.setBackground(new java.awt.Color(7, 51, 73));
        ta_sendMessage.setColumns(20);
        ta_sendMessage.setForeground(new java.awt.Color(255, 255, 255));
        ta_sendMessage.setRows(5);
        sp_sendMessage.setViewportView(ta_sendMessage);

        lbl_cancel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbl_cancel.setForeground(new java.awt.Color(57, 113, 177));
        lbl_cancel.setText("or Cancel");
        lbl_cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_cancelMousePressed(evt);
            }
        });

        lbl_sendMessageTo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbl_sendMessageTo.setForeground(new java.awt.Color(57, 113, 177));

        javax.swing.GroupLayout pnl_leftLayout = new javax.swing.GroupLayout(pnl_left);
        pnl_left.setLayout(pnl_leftLayout);
        pnl_leftLayout.setHorizontalGroup(
            pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_leftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl_leftLayout.createSequentialGroup()
                            .addComponent(lbl_sendMessage)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbl_sendMessageTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(pnl_leftLayout.createSequentialGroup()
                            .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnl_leftLayout.createSequentialGroup()
                                    .addComponent(btn_sendMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lbl_cancel))
                                .addComponent(sp_sendMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(seperator1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGroup(pnl_leftLayout.createSequentialGroup()
                        .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ta_chosenFile, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addGroup(pnl_leftLayout.createSequentialGroup()
                                .addComponent(lbl_chooseFile)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_chooseFile, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        pnl_leftLayout.setVerticalGroup(
            pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_leftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_sendMessage)
                    .addComponent(lbl_sendMessageTo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sp_sendMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seperator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_chooseFile)
                    .addComponent(btn_chooseFile, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(ta_chosenFile, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sendMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pnl_left, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 250, 260));

        pnl_Right.setBackground(new java.awt.Color(32, 33, 35));
        pnl_Right.setPreferredSize(new java.awt.Dimension(250, 260));

        ta_dialogue.setBackground(new java.awt.Color(32, 33, 35));
        ta_dialogue.setColumns(20);
        ta_dialogue.setForeground(new java.awt.Color(255, 255, 255));
        ta_dialogue.setRows(5);
        sp_dialogue.setViewportView(ta_dialogue);

        javax.swing.GroupLayout pnl_RightLayout = new javax.swing.GroupLayout(pnl_Right);
        pnl_Right.setLayout(pnl_RightLayout);
        pnl_RightLayout.setHorizontalGroup(
            pnl_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_RightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sp_dialogue, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_RightLayout.setVerticalGroup(
            pnl_RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_RightLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sp_dialogue, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        getContentPane().add(pnl_Right, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 250, 260));

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
        lbl_title.setText("Chat To Friends");

        javax.swing.GroupLayout pnl_toolbarLayout = new javax.swing.GroupLayout(pnl_toolbar);
        pnl_toolbar.setLayout(pnl_toolbarLayout);
        pnl_toolbarLayout.setHorizontalGroup(
            pnl_toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_toolbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_title, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addComponent(icon_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_toolbarLayout.setVerticalGroup(
            pnl_toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_title, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(icon_exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(pnl_toolbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 30));

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

    private void btn_sendMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sendMessageActionPerformed

        {
            // Checks if text message has been written to be sent

            String message = ta_sendMessage.getText();
            // Removes line breaks
            message = message.replaceAll("\r", " ").replaceAll("\n", " ");
            try {
                outToMsgServer.writeUTF(message);
            } catch (IOException ex) {
                Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btn_sendMessageActionPerformed

    private void btn_chooseFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chooseFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_chooseFileActionPerformed

    private void lbl_cancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cancelMousePressed
        this.dispose();
    }//GEN-LAST:event_lbl_cancelMousePressed

    private void icon_exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_exitMousePressed
        this.dispose();
    }//GEN-LAST:event_icon_exitMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_chooseFile;
    private javax.swing.JButton btn_sendMessage;
    private javax.swing.JLabel icon_exit;
    private javax.swing.JLabel lbl_cancel;
    private javax.swing.JLabel lbl_chooseFile;
    private javax.swing.JLabel lbl_sendMessage;
    private javax.swing.JLabel lbl_sendMessageTo;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JPanel pnl_Right;
    private javax.swing.JPanel pnl_left;
    private javax.swing.JPanel pnl_toolbar;
    private javax.swing.JSeparator seperator1;
    private javax.swing.JScrollPane sp_dialogue;
    private javax.swing.JScrollPane sp_sendMessage;
    private javax.swing.JTextArea ta_chosenFile;
    private javax.swing.JTextArea ta_dialogue;
    private javax.swing.JTextArea ta_sendMessage;
    // End of variables declaration//GEN-END:variables

}
