import java.awt.Desktop;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

public class MainForm extends javax.swing.JFrame {
  
    public MainForm() {
        initComponents();
        setBounds(450,150,getWidth(),getHeight());
        setTitle("Blume Server Creator");
        setResizable(false);
        SetIcon();
        btnAddSpigotVersion.setVisible(false);
    }
    private void SetIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("blumeicon.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtServerGB = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtFileName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSelectVersion = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnAddSpigotVersion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnBlumePluginscom = new javax.swing.JButton();
        btnDiscord1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Sunucu kaç GB olacak: ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Klasörün adı ne olacak:");

        btnSelectVersion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSelectVersion.setText("Spigot sürümünüzü seçin");
        btnSelectVersion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSelectVersionMouseClicked(evt);
            }
        });

        lblStatus.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N

        btnCreate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCreate.setText("Oluştur");
        btnCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCreateMouseClicked(evt);
            }
        });

        btnAddSpigotVersion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddSpigotVersion.setText("Spigot sürümünü ekle");
        btnAddSpigotVersion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddSpigotVersionMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel3.setText("Sürüm: 1.0");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Blume Test Server Creator");

        btnBlumePluginscom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBlumePluginscom.setText("blumeplugins.com");
        btnBlumePluginscom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBlumePluginscomMouseClicked(evt);
            }
        });

        btnDiscord1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDiscord1.setText("Discord");
        btnDiscord1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDiscord1MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel5.setText("Made by Seloo#0548 ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddSpigotVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(388, 388, 388))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBlumePluginscom)
                    .addComponent(btnDiscord1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtServerGB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFileName))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSelectVersion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDiscord1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBlumePluginscom))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtServerGB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFileName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnSelectVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                        .addComponent(btnAddSpigotVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private static File selectedFile;
    
    
    private void btnSelectVersionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectVersionMouseClicked
        JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

                int returnValue = fileChooser.showOpenDialog(null);

                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    selectedFile = fileChooser.getSelectedFile();
                    System.out.println("Seçilen dosya: " + selectedFile.getAbsolutePath());
                } else {
                    System.out.println("Dosya seçme işlemi iptal edildi.");
                }
    }//GEN-LAST:event_btnSelectVersionMouseClicked

    private void btnCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateMouseClicked
        try{
           if(txtFileName!=null){
            if(txtServerGB!=null){
                if(txtFileName.getText().length()<10){
                    if(Integer.valueOf(txtServerGB.getText())<=8){
                        String masaustuYolu = System.getProperty("user.home") + "/Desktop";
                        String dosyaAdi = txtFileName.getText();
                        String dosyaYolu = masaustuYolu + File.separator + dosyaAdi;
                        String fileName = "baslat.bat";
                       
                        File file = new File(dosyaYolu);
                        File batFile = new File(file,fileName);
          
                        if (file.mkdir()) {
                            System.out.println("Klasör oluşturuldu: " + file.getAbsolutePath());
                            lblStatus.setText("Klasör oluşturuldu.");
                            btnAddSpigotVersion.setVisible(true);
                            if(batFile.createNewFile()){
                                 FileWriter fileWriter = new FileWriter(batFile);
                                 fileWriter.write("@echo off\n" +
                                                  "java -Xms1M -Xmx" + txtServerGB.getText() + "G -jar "+ selectedFile.getName().substring(0, 6) +".jar -o true -nogui\n" +
                                                  "PAUSE");
                                 fileWriter.close();                  
                               }
                             } else {
                                 System.out.println("Klasör oluşturulamadı.");
                                 lblStatus.setText("Klasör oluşturulamadı.");
                           }
                }else{
                    lblStatus.setText("Sunucu 8 GB'den büyük olamaz!"); 
                }
             }else{
                    lblStatus.setText("Dosya ismi 10 karakterden büyük olamaz!");
                }
            }
          } 
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btnCreateMouseClicked
    
    private void btnAddSpigotVersionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddSpigotVersionMouseClicked
        if (selectedFile != null) {
                    // Hedef klasörün yolu
                    String targetFolderPath = System.getProperty("user.home") + "/Desktop/"+txtFileName.getText()+"/";
                    File targetFolder = new File(targetFolderPath);

                    // Hedef klasörü oluştur
                    if (!targetFolder.exists()) {
                        targetFolder.mkdirs();
                    }

                    // Dosyayı hedef klasöre kopyala
                    String targetFilePath = targetFolderPath + selectedFile.getName();
                    File targetFile = new File(targetFilePath);  
                    
                    try {   
                        Files.copy(selectedFile.toPath(), targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                        System.out.println("Dosya başarıyla kopyalandı: " + targetFilePath);   
                        lblStatus.setText("Spigot sürümünüz eklendi.");
                    } catch (IOException ex) {
                        System.out.println("Dosya kopyalama hatası: " + ex.getMessage());
                    }
                } else {
                    System.out.println("Lütfen önce bir dosya seçin.");
          }
    }//GEN-LAST:event_btnAddSpigotVersionMouseClicked

    private void btnDiscord1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDiscord1MouseClicked
        try {
                    Desktop.getDesktop().browse(new URI("https://discord.gg/EDJrAYVZ"));
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
    }//GEN-LAST:event_btnDiscord1MouseClicked

    private void btnBlumePluginscomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBlumePluginscomMouseClicked
        try {
                    Desktop.getDesktop().browse(new URI("https://blumeplugins.com/"));
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
    }//GEN-LAST:event_btnBlumePluginscomMouseClicked

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAddSpigotVersion;
    private javax.swing.JButton btnBlumePluginscom;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDiscord1;
    private javax.swing.JButton btnSelectVersion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTextField txtFileName;
    private javax.swing.JTextField txtServerGB;
    // End of variables declaration//GEN-END:variables
}
