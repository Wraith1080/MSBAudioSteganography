package com.msbaudiosteganography.gui;

import com.msbaudiosteganography.audio.AudioProcessor;
import com.msbaudiosteganography.text.TextProcessor;
import com.msbaudiosteganography.wavfile.WAVReader;
import com.msbaudiosteganography.wavfile.WavFile;
import com.msbaudiosteganography.wavfile.WavFileException;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.*;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Afina, Meisyal, Irfan
 */

public class MainGUI extends javax.swing.JFrame {
    /**
     * Creates new form MainGUI
     */
    File coverFile;
    File outFile;
    File currD;
    
    
    public MainGUI() {
        initComponents();
        WAVReader reader = new WAVReader();
        setLocationRelativeTo(null);
        outFile=null;
        coverFile=null;
        setTitle("MSB Audio Steganography");
//        try {
//            AudioProcessor ap = new AudioProcessor(new File("E:\\pcm1644s.wav"), new File("E:\\testhasil.wav"));
//            String Test = "R";
//            TextProcessor tp = new TextProcessor();
//            byte[] hasil = tp.convertBinaryStringToBytesWithPassKey(Test);
//            ap.WriteMsg(hasil);
//            AudioProcessor ap2 = new AudioProcessor(new File("E:\\testhasil.wav"), null);
//            byte[] hasil2 = ap2.ReadMsg();
//            if (hasil2==null)
//            {
//                System.out.println("Gagal");
//            }
//            else
//            {
//                System.out.println("Sukses. PSNR : "+ap.getPSNR());
//                System.out.println(tp.removePassKey(tp.convertByteToText(hasil2)));
//            }
//            
//        } catch (IOException ex) {
//            Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (WavFileException ex) {
//            Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        CmdBrowse = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtMessage = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        TxtCoverPath = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TxtResultPath = new javax.swing.JTextField();
        CmdBrowse2 = new javax.swing.JButton();
        CmdClose = new javax.swing.JButton();
        CmdEmbed = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtEmbedInfo = new javax.swing.JTextArea();
        PgbEmbed = new javax.swing.JProgressBar();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        CmdBrowse3 = new javax.swing.JButton();
        TxtEmbeddedPath1 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TxtExtractedMessage = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TxtExtractInfo = new javax.swing.JTextArea();
        PgbExtract = new javax.swing.JProgressBar();
        CmdExtract = new javax.swing.JButton();
        CmdClose2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setText("Instruction: Write your message below. And choose a cover using 'Browse...' button.");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Main Process"));

        CmdBrowse.setText("Browse...");
        CmdBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdBrowseActionPerformed(evt);
            }
        });

        TxtMessage.setColumns(20);
        TxtMessage.setRows(5);
        TxtMessage.setToolTipText("");
        jScrollPane1.setViewportView(TxtMessage);

        jLabel1.setText("Message Content: ");

        TxtCoverPath.setEditable(false);
        TxtCoverPath.setName("TxtCoverPath"); // NOI18N

        jLabel4.setText("Cover Path:");

        jLabel9.setText("Result Path:");

        TxtResultPath.setEditable(false);
        TxtResultPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtResultPathActionPerformed(evt);
            }
        });

        CmdBrowse2.setText("Browse...");
        CmdBrowse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdBrowse2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(17, 17, 17)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TxtResultPath, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                            .addComponent(TxtCoverPath))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CmdBrowse)
                            .addComponent(CmdBrowse2))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCoverPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(CmdBrowse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TxtResultPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CmdBrowse2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CmdClose.setText("Close");
        CmdClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdCloseActionPerformed(evt);
            }
        });

        CmdEmbed.setText("Embed");
        CmdEmbed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdEmbedActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Process Information"));

        TxtEmbedInfo.setEditable(false);
        TxtEmbedInfo.setColumns(20);
        TxtEmbedInfo.setRows(5);
        jScrollPane2.setViewportView(TxtEmbedInfo);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PgbEmbed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(PgbEmbed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 70, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CmdEmbed, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CmdClose)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {CmdClose, CmdEmbed});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CmdEmbed)
                    .addComponent(CmdClose))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(148, 148, 148))
        );

        jTabbedPane1.addTab("Embbeding", jPanel1);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Main Process"));

        jLabel10.setText("Cover Path:");

        CmdBrowse3.setText("Browse...");
        CmdBrowse3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdBrowse3ActionPerformed(evt);
            }
        });

        TxtEmbeddedPath1.setEditable(false);
        TxtEmbeddedPath1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtEmbeddedPath1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtEmbeddedPath1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CmdBrowse3)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(CmdBrowse3)
                    .addComponent(TxtEmbeddedPath1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Message Content"));

        TxtExtractedMessage.setEditable(false);
        TxtExtractedMessage.setColumns(20);
        TxtExtractedMessage.setRows(5);
        jScrollPane3.setViewportView(TxtExtractedMessage);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel12.setText("Instruction: Choose a cover using 'Browse...' button. And then press extract button to start");

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Process Information"));

        TxtExtractInfo.setEditable(false);
        TxtExtractInfo.setColumns(20);
        TxtExtractInfo.setRows(5);
        jScrollPane4.setViewportView(TxtExtractInfo);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PgbExtract, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(PgbExtract, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CmdExtract.setText("Extract");
        CmdExtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdExtractActionPerformed(evt);
            }
        });

        CmdClose2.setText("Close");
        CmdClose2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdClose2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CmdExtract)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CmdClose2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {CmdClose2, CmdExtract});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CmdExtract)
                    .addComponent(CmdClose2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(201, 201, 201))
        );

        jTabbedPane1.addTab("Extracting", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private String getFileSize(File selectedFile) {
        double bytes = selectedFile.length();
        
        final String[] units = new String[]{"Bi", "KiB", "MiB", "GiB", "TiB"};
        int digitGroups = (int) (Math.log10((bytes))/(Math.log10(1024)));
        DecimalFormat df = new DecimalFormat("#,##0.#");
        String convertedSize = df.format(bytes/Math.pow(1024, digitGroups)) +
                " " + units[digitGroups];
        
        return convertedSize;
    }
    
    private void Log(String log, int mode){
        if(mode==0)
        {
            if(TxtEmbedInfo.getText().equals(""))
            {
                TxtEmbedInfo.setText(log);
            }
            else
            {
                if (TxtEmbedInfo.getText().endsWith("\n") || TxtEmbedInfo.getText().endsWith("\r") || TxtEmbedInfo.getText().endsWith("\r\n")) {
                    TxtEmbedInfo.setText(TxtEmbedInfo.getText() + "--------------------------------------\n" + log);
                } else {
                    TxtEmbedInfo.setText(TxtEmbedInfo.getText() + "\n--------------------------------------\n" + log);
                }
                
            }
            
        }
        else
        {
            if(TxtExtractInfo.getText().equals(""))
            {
                TxtExtractInfo.setText(log);
            }
            else
            {
                if (TxtExtractInfo.getText().endsWith("\n") || TxtExtractInfo.getText().endsWith("\r") || TxtExtractInfo.getText().endsWith("\r\n")) {
                    TxtExtractInfo.setText(TxtExtractInfo.getText() + "--------------------------------------\n" + log);
                } else {
                    TxtExtractInfo.setText(TxtExtractInfo.getText() + "\n--------------------------------------\n" + log);
                }
            }
            
        }
    }
    private void CmdBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdBrowseActionPerformed
        JFileChooser OPF = new JFileChooser();
        
        if(currD==null) {
            OPF.setCurrentDirectory(new File(System.getProperty("user.home")));
        }
        else {
            OPF.setCurrentDirectory(currD);
        }
        OPF.setFileFilter(new FileNameExtensionFilter("Waveform Audio File","wav"));
        int result = OPF.showOpenDialog(this);
        
        if (result == JFileChooser.APPROVE_OPTION) {
            TxtCoverPath.setText(OPF.getSelectedFile().getPath());
            coverFile= OPF.getSelectedFile();
            currD = OPF.getCurrentDirectory();
            // user selects a file
        }
        else {
            currD = OPF.getCurrentDirectory();
        }
    }//GEN-LAST:event_CmdBrowseActionPerformed

    private void CmdCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CmdCloseActionPerformed

    private void CmdBrowse2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdBrowse2ActionPerformed
        JFileChooser SPF = new JFileChooser();
        if(currD==null) {
            SPF.setCurrentDirectory(new File(System.getProperty("user.home")));
        }
        else {
            SPF.setCurrentDirectory(currD);
        }
        SPF.setFileFilter(new FileNameExtensionFilter("Waveform Audio File","wav"));
        int result = SPF.showSaveDialog(this);
        
        if (result == JFileChooser.APPROVE_OPTION) {
            if (SPF.getSelectedFile().getPath().toUpperCase().endsWith(".WAV")) {
                TxtResultPath.setText(SPF.getSelectedFile().getPath());
                outFile = SPF.getSelectedFile();
            } else {
                TxtResultPath.setText(SPF.getSelectedFile().getPath()+".wav");
                outFile = new File(SPF.getSelectedFile().getPath()+".wav");
            }
             currD = SPF.getCurrentDirectory();
            // user selects a file
        }
        else {
            currD = SPF.getCurrentDirectory();
        }
    }//GEN-LAST:event_CmdBrowse2ActionPerformed

    private void TxtResultPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtResultPathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtResultPathActionPerformed

    private void TxtEmbeddedPath1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEmbeddedPath1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEmbeddedPath1ActionPerformed

    private void CmdBrowse3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdBrowse3ActionPerformed
        // TODO add your handling code here:
        JFileChooser OPF = new JFileChooser();
        if(currD==null) {
            OPF.setCurrentDirectory(new File(System.getProperty("user.home")));
        }
        else {
            OPF.setCurrentDirectory(currD);
        }
        OPF.setFileFilter(new FileNameExtensionFilter("Waveform Audio File","wav"));
        int result = OPF.showOpenDialog(this);
        
        if (result == JFileChooser.APPROVE_OPTION) {
            TxtEmbeddedPath1.setText(OPF.getSelectedFile().getPath());
             coverFile= OPF.getSelectedFile();
             
            // user selects a file
        }
        currD = OPF.getCurrentDirectory();
    }//GEN-LAST:event_CmdBrowse3ActionPerformed

    private void CmdExtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdExtractActionPerformed
        // TODO add your handling code here:
        TxtExtractInfo.setText("");
        if(coverFile==null)
        {
            Log("No cover file selected!!!", 1);
        }
        else
        {
            PgbExtract.setValue(PgbExtract.getMinimum());
            try {
                
                AudioProcessor ap = new AudioProcessor(coverFile, null);
                TextProcessor tp = new TextProcessor();
                Log(ap.getSourceInfo()+"File Size : "+getFileSize(coverFile),1);
                byte[] hasil;
                hasil = ap.ReadMsg();
                Log(ap.getLog(),1);
                if(ap.getStatus())
                {
                    String message = tp.removePassKey(tp.convertByteToText(hasil));
                    Log("Success. Read character(s) : "+message.length(),1);
                    TxtExtractedMessage.setText(message);
                }
                else
                {
                    Log("Failed. The file may be damaged \n or no message has been embedded",1);
                }
            } catch (IOException ex) {
                Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (WavFileException ex) {
                Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            PgbExtract.setValue(PgbExtract.getMaximum());
            
        }
    }//GEN-LAST:event_CmdExtractActionPerformed

    private void CmdClose2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdClose2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CmdClose2ActionPerformed

    private void CmdEmbedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdEmbedActionPerformed
        // TODO add your handling code here:
        TxtEmbedInfo.setText("");
        if(coverFile==null)
        {
            Log("No cover file selected!!!", 0);
            
        }
        else
        {
            if(outFile==null)
            {
                Log("No output file selected", 0);
            }
            else
            {
                PgbEmbed.setValue(PgbEmbed.getMinimum());
                try {
                    AudioProcessor ap=new AudioProcessor(coverFile,outFile);
                    TextProcessor tp = new TextProcessor();
                    byte[] hasil = tp.convertBinaryStringToBytesWithPassKey(TxtMessage.getText());
                    
                    Log(ap.getSourceInfo()+"File Size : "+getFileSize(coverFile),0);
                    ap.WriteMsg(hasil);
                    if(ap.getStatus())
                    {
                        Log(ap.getLog(),0);
                        Log("Success. PSNR : " + ap.getPSNR(), 0);
                        Log(ap.getDestinationInfo() + "File Size : " + getFileSize(outFile), 0);
                    }
                    else
                    {
                        Log(ap.getLog(),0);
                        Log("Failed.",0);
                    }
                    PgbEmbed.setValue(PgbEmbed.getMaximum());
                } catch (IOException ex) {
                    Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
                } catch (WavFileException ex) {
                    Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
    }//GEN-LAST:event_CmdEmbedActionPerformed

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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CmdBrowse;
    private javax.swing.JButton CmdBrowse2;
    private javax.swing.JButton CmdBrowse3;
    private javax.swing.JButton CmdClose;
    private javax.swing.JButton CmdClose2;
    private javax.swing.JButton CmdEmbed;
    private javax.swing.JButton CmdExtract;
    private javax.swing.JProgressBar PgbEmbed;
    private javax.swing.JProgressBar PgbExtract;
    private javax.swing.JTextField TxtCoverPath;
    private javax.swing.JTextArea TxtEmbedInfo;
    private javax.swing.JTextField TxtEmbeddedPath1;
    private javax.swing.JTextArea TxtExtractInfo;
    private javax.swing.JTextArea TxtExtractedMessage;
    private javax.swing.JTextArea TxtMessage;
    private javax.swing.JTextField TxtResultPath;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
