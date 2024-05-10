package com.raven.form;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormAchat extends javax.swing.JPanel  {

    private Date dateAchat;
    private final String url = "jdbc:mysql://localhost:3306/myjavadb";
    private final String user = "root";
    private final String password = "";
    formAchatAjout ajoutAchatForm = new formAchatAjout(this); // "this" fait référence à la fenêtre FormAchat actuelle

    public FormAchat() {
        initComponents();
       chargerAchat();
        setOpaque(false);
        chargerMedocs();
    }
    
    public void rafraichirTableau() {
        // Code pour recharger les données du tableau depuis la base de données
        chargerAchat(); // Exemple : Appel de votre méthode chargerAchat() existante
    }
    
    private void chargerMedocs() {
        String query = "SELECT numMedoc, designMedoc FROM medoc";

        try (Connection con = DriverManager.getConnection(url, user, password); PreparedStatement pst = con.prepareStatement(query); ResultSet rs = pst.executeQuery()) {

            MedocComboBox.addItem(""); // Ajoutez un élément vide

            while (rs.next()) {
               // String numMedoc = rs.getString("numMedoc");
                String designMedoc = rs.getString("designMedoc");
                // Concaténez le numéro de médicament avec la désignation
                MedocComboBox.addItem( designMedoc);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erreur lors du chargement des médicaments : " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new com.raven.swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDark1 = new tableDark.TableDark();
        ajoutAchatBtn = new javax.swing.JButton();
        modifAchat = new javax.swing.JButton();
        supAchatBtn = new javax.swing.JButton();
        factureBtn = new javax.swing.JButton();
        MedocComboBox = new javax.swing.JComboBox<>();

        roundPanel1.setBackground(new java.awt.Color(60, 60, 60));
        roundPanel1.setForeground(new java.awt.Color(255, 255, 255));

        tableDark1.setBackground(new java.awt.Color(60, 60, 60));
        tableDark1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sélection", "Numéro", "Médicaments", "Clients", "Quantité", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableDark1);
        if (tableDark1.getColumnModel().getColumnCount() > 0) {
            tableDark1.getColumnModel().getColumn(0).setResizable(false);
            tableDark1.getColumnModel().getColumn(0).setPreferredWidth(5);
            tableDark1.getColumnModel().getColumn(1).setResizable(false);
            tableDark1.getColumnModel().getColumn(1).setPreferredWidth(20);
            tableDark1.getColumnModel().getColumn(2).setResizable(false);
            tableDark1.getColumnModel().getColumn(2).setPreferredWidth(100);
            tableDark1.getColumnModel().getColumn(3).setResizable(false);
            tableDark1.getColumnModel().getColumn(3).setPreferredWidth(100);
            tableDark1.getColumnModel().getColumn(4).setResizable(false);
            tableDark1.getColumnModel().getColumn(4).setPreferredWidth(20);
            tableDark1.getColumnModel().getColumn(5).setResizable(false);
        }

        ajoutAchatBtn.setBackground(new java.awt.Color(60, 60, 60));
        ajoutAchatBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ajoutAchatBtn.setForeground(new java.awt.Color(255, 255, 255));
        ajoutAchatBtn.setText("Ajouter");
        ajoutAchatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutAchatBtnActionPerformed(evt);
            }
        });

        modifAchat.setBackground(new java.awt.Color(60, 60, 60));
        modifAchat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        modifAchat.setForeground(new java.awt.Color(255, 255, 255));
        modifAchat.setText("Modifier");
        modifAchat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifAchatActionPerformed(evt);
            }
        });

        supAchatBtn.setBackground(new java.awt.Color(60, 60, 60));
        supAchatBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        supAchatBtn.setForeground(new java.awt.Color(255, 255, 255));
        supAchatBtn.setText("Supprimer");
        supAchatBtn.setName(""); // NOI18N
        supAchatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supAchatBtnActionPerformed(evt);
            }
        });

        factureBtn.setBackground(new java.awt.Color(60, 60, 60));
        factureBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        factureBtn.setForeground(new java.awt.Color(255, 255, 255));
        factureBtn.setText("Facture");
        factureBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factureBtnActionPerformed(evt);
            }
        });

        MedocComboBox.setBackground(new java.awt.Color(60, 60, 60));
        MedocComboBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MedocComboBox.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(factureBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MedocComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(32, 32, 32)
                        .addComponent(ajoutAchatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(modifAchat, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(supAchatBtn)))
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(factureBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ajoutAchatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifAchat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supAchatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MedocComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void supAchatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supAchatBtnActionPerformed
DefaultTableModel model = (DefaultTableModel) tableDark1.getModel();

// Vérification de l'existance de lignes sélectionnées
if (model.getRowCount() == 0) {
    JOptionPane.showMessageDialog(this, "Aucune ligne sélectionnée.", "Information", JOptionPane.INFORMATION_MESSAGE);
    return;
}

try (Connection con = DriverManager.getConnection(url, user, password)) {
    con.setAutoCommit(false); // Début de la transaction

    // Parcourir le modèle de la JTable pour trouver les lignes sélectionnées
    for (int i = 0; i < model.getRowCount(); i++) {
        Boolean isSelected = (Boolean) model.getValueAt(i, 0); // Vérifier si la case à cocher est cochée
        if (isSelected) {
            String designMedoc = (String) model.getValueAt(i, 2); // Nom du médicament
            int qttAchat = Integer.parseInt((String) model.getValueAt(i, 4)); // Quantité d'achat

            // Obtenir le numéro de médicament à partir du nom
            String numMedoc = obtenirNumeroMedicament(designMedoc);

            if (numMedoc == null) {
                // Le médicament n'a pas été trouvé dans la base de données
                JOptionPane.showMessageDialog(this, "Médicament non trouvé : " + designMedoc, "Erreur", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Affichage des valeurs récupérées pour le débogage
            System.out.println("Numéro de médicament : " + numMedoc);
            System.out.println("Quantité d'achat : " + qttAchat);

            String queryUpdateMedoc = "UPDATE medoc SET stockMedoc = stockMedoc + ? WHERE numMedoc = ?";
            try (PreparedStatement pstUpdateMedoc = con.prepareStatement(queryUpdateMedoc)) {
                pstUpdateMedoc.setInt(1, qttAchat);
                pstUpdateMedoc.setString(2, numMedoc);
                pstUpdateMedoc.executeUpdate();
            } catch (SQLException ex) {
                con.rollback(); // Annulation de la transaction en cas d'erreur
                ex.printStackTrace(); // Gérer l'erreur de mise à jour
                JOptionPane.showMessageDialog(this, "Erreur lors de la mise à jour du stock dans la table medoc.", "Erreur", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Suppression des données de la table achat correspondant à la ligne sélectionnée
            String numAchat = (String) model.getValueAt(i, 1); // Numéro d'achat
            String queryDeleteAchat = "DELETE FROM achat WHERE numAchat = ?";
            try (PreparedStatement pstDeleteAchat = con.prepareStatement(queryDeleteAchat)) {
                pstDeleteAchat.setString(1, numAchat);
                pstDeleteAchat.executeUpdate();
            } catch (SQLException ex) {
                con.rollback(); // Annulation de la transaction en cas d'erreur
                ex.printStackTrace(); // Gérer l'erreur de suppression
                JOptionPane.showMessageDialog(this, "Erreur lors de la suppression des données dans la table achat.", "Erreur", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
    }

    con.commit(); // Validation de la transaction
    JOptionPane.showMessageDialog(this, "Suppression réussie!", "Succès", JOptionPane.INFORMATION_MESSAGE);
    chargerAchat(); // Recharger les données de la table achat
} catch (SQLException ex) {
    ex.printStackTrace(); // Gérer l'erreur de connexion à la base de données
}


// Méthode pour obtenir le numéro de médicament à partir du nom

    }//GEN-LAST:event_supAchatBtnActionPerformed
    
    private String obtenirNumeroMedicament(String designMedoc) {
    String query = "SELECT numMedoc FROM medoc WHERE designMedoc = ?";
    try (Connection con = DriverManager.getConnection(url, user, password);
         PreparedStatement pst = con.prepareStatement(query)) {
        pst.setString(1, designMedoc);
        try (ResultSet rs = pst.executeQuery()) {
            if (rs.next()) {
                return rs.getString("numMedoc");
            }
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    return null; 
}
    
    
    private void modifAchatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifAchatActionPerformed
  // Définissez un écouteur d'événements pour votre JComboBox de médicaments
MedocComboBox.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Récupérez la valeur sélectionnée dans le JComboBox
        String selectedMedicament = (String) MedocComboBox.getSelectedItem();

        // Assurez-vous que la valeur sélectionnée n'est pas nulle avant de la mettre à jour
        if (selectedMedicament != null) {
            // Mettez à jour la colonne "médicament" dans votre tableau avec la valeur sélectionnée
            int[] selectedRows = tableDark1.getSelectedRows();
            for (int row : selectedRows) {
                tableDark1.setValueAt(selectedMedicament, row, 2);
            }
        }
    }
});

// Créer une chaîne pour stocker les données modifiées
StringBuilder message = new StringBuilder();

// Récupérer les lignes sélectionnées
int[] selectedRows = tableDark1.getSelectedRows();

// Parcourir les lignes sélectionnées
for (int row : selectedRows) {
    // Récupérer les valeurs des colonnes modifiables
    String numeroAchat =  (String) tableDark1.getValueAt(row, 1);
    String selectedMedicament = (String) MedocComboBox.getSelectedItem();
    String client = (String) tableDark1.getValueAt(row, 3);
    String date = (String) tableDark1.getValueAt(row, 5);
    String quantiteStr = (String) tableDark1.getValueAt(row, 4);

    // Convertir la quantité en entier
    int quantite = Integer.parseInt(quantiteStr);

    // Supposons que vous ayez une méthode dans votre modèle de données pour obtenir le numéro de médicament correspondant
    String numeroMedicament = getNumeroMedicament(selectedMedicament);

    // Ajouter les valeurs au message
    message.append("Numéro de l'achat sélectionné: ").append(numeroAchat).append("\n"); 
    message.append("Médicament sélectionné: ").append(selectedMedicament).append("\n");
    message.append("Numéro de médicament :").append(numeroMedicament).append("\n");
    message.append("Client: ").append(client).append("\n");
    message.append("Quantité: ").append(quantite).append("\n");
    message.append("Date: ").append(date).append("\n\n");

    // Modifier les données dans la base de données
    /*try {
        // Établir la connexion à votre base de données
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myjavadb", "root", "");

        // Vérifier si le stockMedoc du médicament sélectionné est supérieur à 5
        PreparedStatement checkStockStatement = connection.prepareStatement("SELECT stockMedoc FROM medoc WHERE numMedoc = ?");
        checkStockStatement.setString(1, numeroMedicament);
        ResultSet stockResult = checkStockStatement.executeQuery();
        int stockMedoc = 0;
        if (stockResult.next()) {
            stockMedoc = stockResult.getInt("stockMedoc");
        }

        // Si le stockMedoc est inférieur ou égal à 5, ne pas effectuer la mise à jour
        if (stockMedoc > 5) {
            // Préparer la requête SQL de mise à jour pour la table achat
            PreparedStatement statementAchat = connection.prepareStatement("UPDATE achat SET numMedoc = ?, nomClient = ?, qttAchat = ?, dateAchat = ? WHERE numAchat = ?");
            statementAchat.setString(1, numeroMedicament);
            statementAchat.setString(2, client);
            statementAchat.setInt(3, quantite);
            statementAchat.setString(4, date);
            statementAchat.setString(5, numeroAchat);

            // Exécuter la requête pour la table achat
            statementAchat.executeUpdate();

            // Préparer la requête SQL de mise à jour pour la table medoc
            PreparedStatement statementMedoc = connection.prepareStatement("UPDATE medoc SET stockMedoc = stockMedoc - ? WHERE numMedoc = ?");
            statementMedoc.setInt(1, quantite);
            statementMedoc.setString(2, numeroMedicament);

            // Exécuter la requête pour la table medoc
            statementMedoc.executeUpdate();

            JOptionPane.showMessageDialog(this, "Succès de la mise à jour", "Succès", JOptionPane.INFORMATION_MESSAGE);
            chargerAchat();

            // Fermer les ressources de connexion
            statementAchat.close();
            statementMedoc.close();
        } else {
            JOptionPane.showMessageDialog(this, "Le stock du médicament est insuffisant.", "Erreur", JOptionPane.ERROR_MESSAGE);
        }

        // Fermer les ressources de connexion
        checkStockStatement.close();
        stockResult.close();
        connection.close();

        // Afficher un message de succès si nécessaire
    } catch (SQLException ex) {
        ex.printStackTrace();
        System.out.println("Message d'erreur : "+ex);
    }*/
    // Modifier les données dans la base de données
try {
    // Établir la connexion à votre base de données
    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myjavadb", "root", "");

    // Vérifier si le stockMedoc du médicament sélectionné est supérieur à 5
    PreparedStatement checkStockStatement = connection.prepareStatement("SELECT stockMedoc FROM medoc WHERE numMedoc = ?");
    checkStockStatement.setString(1, numeroMedicament);
    ResultSet stockResult = checkStockStatement.executeQuery();
    int stockMedoc = 0;
    if (stockResult.next()) {
        stockMedoc = stockResult.getInt("stockMedoc");
    }

    // Si le stockMedoc est inférieur ou égal à 5, ne pas effectuer la mise à jour
    if (stockMedoc > 5) {
        // Vérifier si la quantité d'achat est supérieure au stockMedoc
        if (quantite <= stockMedoc) {
            // Préparer la requête SQL de mise à jour pour la table achat
            PreparedStatement statementAchat = connection.prepareStatement("UPDATE achat SET numMedoc = ?, nomClient = ?, qttAchat = ?, dateAchat = ? WHERE numAchat = ?");
            statementAchat.setString(1, numeroMedicament);
            statementAchat.setString(2, client);
            statementAchat.setInt(3, quantite);
            statementAchat.setString(4, date);
            statementAchat.setString(5, numeroAchat);

            // Exécuter la requête pour la table achat
            statementAchat.executeUpdate();

            // Préparer la requête SQL de mise à jour pour la table medoc
            PreparedStatement statementMedoc = connection.prepareStatement("UPDATE medoc SET stockMedoc = stockMedoc - ? WHERE numMedoc = ?");
            statementMedoc.setInt(1, quantite);
            statementMedoc.setString(2, numeroMedicament);

            // Exécuter la requête pour la table medoc
            statementMedoc.executeUpdate();

            JOptionPane.showMessageDialog(this, "Succès de la mise à jour", "Succès", JOptionPane.INFORMATION_MESSAGE);
            chargerAchat();

            // Fermer les ressources de connexion
            statementAchat.close();
            statementMedoc.close();
        } else {
            JOptionPane.showMessageDialog(this, "La quantité d'achat est supérieure au stock disponible.", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Le stock du médicament est insuffisant.", "Erreur", JOptionPane.ERROR_MESSAGE);
    }

    // Fermer les ressources de connexion
    checkStockStatement.close();
    stockResult.close();
    connection.close();

    // Afficher un message de succès si nécessaire
} catch (SQLException ex) {
    ex.printStackTrace();
    System.out.println("Message d'erreur : "+ex);
}

}

// Afficher les valeurs dans un message box
JOptionPane.showMessageDialog(this, message.toString(), "Données modifiées", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_modifAchatActionPerformed
    public String getNumeroMedicament(String nomMedicament) {
        String numeroMedicament = null;
        // Établir la connexion à votre base de données et effectuer la requête pour obtenir le numéro du médicament
        try {
            // Ici, vous devriez exécuter votre requête SQL pour récupérer le numéro de médicament à partir de son nom
            // Par exemple, si vous utilisez JDBC pour accéder à votre base de données :
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myjavadb", "root", "");
            PreparedStatement statement = connection.prepareStatement("SELECT numMedoc FROM medoc WHERE designMedoc = ?");
            statement.setString(1, nomMedicament);
            ResultSet resultSet = statement.executeQuery();

            // Si vous obtenez un résultat, récupérez le numéro de médicament
            if (resultSet.next()) {
                numeroMedicament = resultSet.getString("numMedoc");
            }

            // Fermez les ressources de connexion
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            // Gérer les erreurs de connexion ou de requête
        }
        return numeroMedicament;
    }

    private void ajoutAchatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutAchatBtnActionPerformed

        formAchatAjout ajoutAchatForm = new formAchatAjout(this);
        JFrame frame = new JFrame("Ajout Achat");
        frame.getContentPane().add(ajoutAchatForm );
        frame.setSize(380, 670);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false); 
        frame.setVisible(true);
    }//GEN-LAST:event_ajoutAchatBtnActionPerformed

    private void factureBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factureBtnActionPerformed
       
     /*   DefaultTableModel model = (DefaultTableModel) tableDark1.getModel();

        
        ArrayList<Object[]> selectedRowsData = new ArrayList<>();

        
        for (int i = 0; i < model.getRowCount(); i++) {
            Boolean isSelected = (Boolean) model.getValueAt(i, 0); 
            if (isSelected) {
                Object[] rowData = new Object[model.getColumnCount()];
                for (int j = 0; j < model.getColumnCount(); j++) {
                    rowData[j] = model.getValueAt(i, j); 
                }
                selectedRowsData.add(rowData); 
            }
        }

    
        StringBuilder message = new StringBuilder();
        if (!selectedRowsData.isEmpty()) {
            for (Object[] rowData : selectedRowsData) {
                message.append("Numéro d'achat: ").append(rowData[1]).append("\n");
               
                message.append("Médicaments: ").append(rowData[2]).append("\n");
              
                message.append("Client: ").append(rowData[3]).append("\n");
                
                message.append("Quantité: ").append(rowData[4]).append("\n");
           
                message.append("Date: ").append(rowData[5]).append("\n\n");
            }
          
            JOptionPane.showMessageDialog(this, message.toString(), "Facture", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Aucune ligne sélectionnée.", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
 String path ="";
 JFileChooser j = new JFileChooser();
 j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
 int x = j.showSaveDialog(this);
 if(x == JFileChooser.APPROVE_OPTION)
 {
     path = j.getSelectedFile().getPath();
 }
 Document doc = new Document();
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path+"monPdf.pdf"));
            doc.open();
            PdfPTable table = new PdfPTable(2);
            
            table.addCell("Désignation");
            table.addCell("Prix unitaire");
            table.addCell("Nombre");
            table.addCell("Total");
            
            for(int i = 0; i < tableDark1.getRowCount(); i++)
            {
                String medicament = (String) tableDark1.getValueAt(i, 2);
                String puMedoc =  (String) tableDark1.getValueAt(i, 3);
                
            }
            
            
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FormAchat.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(FormAchat.class.getName()).log(Level.SEVERE, null, ex);
        }
 
*/
   /*DefaultTableModel model = (DefaultTableModel) tableDark1.getModel();
ArrayList<Object[]> selectedRowsData = new ArrayList<>();

// Parcourir les lignes sélectionnées et les ajouter à selectedRowsData
for (int i = 0; i < model.getRowCount(); i++) {
    Boolean isSelected = (Boolean) model.getValueAt(i, 0); 
    if (isSelected) {
        Object[] rowData = new Object[model.getColumnCount()];
        for (int j = 0; j < model.getColumnCount(); j++) {
            rowData[j] = model.getValueAt(i, j); 
        }
        selectedRowsData.add(rowData); 
    }
}

// Vérifier s'il y a des lignes sélectionnées
if (!selectedRowsData.isEmpty()) {
    String path ="";
    JFileChooser j = new JFileChooser();
    j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    int x = j.showSaveDialog(this);
    if(x == JFileChooser.APPROVE_OPTION) {
        path = j.getSelectedFile().getPath();
    }

    // Créer le document PDF
    Document doc = new Document();
    try {
        PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream(path + "/facture.pdf"));
        doc.open();
        
        // Ajouter les informations de chaque ligne au document PDF
        boolean contentAdded = false; // Pour suivre si du contenu a été ajouté
        for (Object[] rowData : selectedRowsData) {
            // Utiliser SimpleDateFormat pour parser la date au format "yyyy-MM-dd"
            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy");
            try {
                // Convertir la chaîne de caractères en objet Date
                Date date = inputFormat.parse((String) rowData[5]);
                // Formater la date au format "dd/MM/yyyy"
                String formattedDate = outputFormat.format(date);
                Paragraph dateParagraph = new Paragraph("Date: " + formattedDate);
                dateParagraph.setAlignment(Element.ALIGN_LEFT); // Aligner à gauche
                doc.add(dateParagraph);
            } catch (ParseException ex) {
                ex.printStackTrace();
            }

            Paragraph clientParagraph = new Paragraph("Nom du client: " + rowData[3]);
            clientParagraph.setAlignment(Element.ALIGN_LEFT); // Aligner à gauche
            doc.add(clientParagraph);

            // Ajouter de l'espace après le nom du client
            doc.add(new Paragraph("\n")); // Un paragraphe vide pour plus d'espace
            
            // Créer la table pour les données du médicament
            PdfPTable table = new PdfPTable(4);
            table.addCell("Désignation");
            table.addCell("Prix unitaire");
            table.addCell("Nombre");
            table.addCell("Total");

            // Ajouter les données du médicament à la table
            table.addCell(rowData[2].toString()); 
            table.addCell(String.valueOf(getPrixUnitaire(rowData[2].toString()))); 
            table.addCell(rowData[4].toString()); 
          
            double prixUnitaire = getPrixUnitaire(rowData[2].toString());
            int nombre = Integer.parseInt(rowData[4].toString());
            double total = prixUnitaire * nombre;
            table.addCell(String.valueOf(total));
            
         
            table.setHorizontalAlignment(Element.ALIGN_LEFT);
            
            doc.add(table); 
            doc.add(new Paragraph("\n")); 
            
            contentAdded = true; 
        }
        
      
        if (!contentAdded) {
            doc.add(new Paragraph(" "));
        }
        
     
        doc.close();
       
        writer.close();

        JOptionPane.showMessageDialog(this, "Facture générée avec succès!", "Information", JOptionPane.INFORMATION_MESSAGE);
    } catch (FileNotFoundException ex) {
        Logger.getLogger(FormAchat.class.getName()).log(Level.SEVERE, null, ex);
    } catch (DocumentException ex) {
        Logger.getLogger(FormAchat.class.getName()).log(Level.SEVERE, null, ex);
    }
} else {
    JOptionPane.showMessageDialog(this, "Aucune ligne sélectionnée.", "Information", JOptionPane.INFORMATION_MESSAGE);
}
*/
/*DefaultTableModel model = (DefaultTableModel) tableDark1.getModel();
ArrayList<Object[]> selectedRowsData = new ArrayList<>();

// Parcourir les lignes sélectionnées et les ajouter à selectedRowsData
for (int i = 0; i < model.getRowCount(); i++) {
    Boolean isSelected = (Boolean) model.getValueAt(i, 0); 
    if (isSelected) {
        Object[] rowData = new Object[model.getColumnCount()];
        for (int j = 0; j < model.getColumnCount(); j++) {
            rowData[j] = model.getValueAt(i, j); 
        }
        selectedRowsData.add(rowData); 
    }
}

// Vérifier s'il y a des lignes sélectionnées
if (!selectedRowsData.isEmpty()) {
    String path ="";
    JFileChooser j = new JFileChooser();
    j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    int x = j.showSaveDialog(this);
    if(x == JFileChooser.APPROVE_OPTION) {
        path = j.getSelectedFile().getPath();
    }

    // Créer une structure de données pour stocker les achats par client et par date
    Map<String, List<Object[]>> achatsParClientEtDate = new HashMap<>();

    // Regrouper les achats par client et par date
    for (Object[] rowData : selectedRowsData) {
        String nomClient = (String) rowData[3];
        String dateAchat = (String) rowData[5];
        String key = nomClient + "_" + dateAchat;
        
        if (!achatsParClientEtDate.containsKey(key)) {
            achatsParClientEtDate.put(key, new ArrayList<>());
        }
        
        achatsParClientEtDate.get(key).add(rowData);
    }

    // Générer la facture regroupant tous les achats pour chaque client et chaque date
    for (Map.Entry<String, List<Object[]>> entry : achatsParClientEtDate.entrySet()) {
        String[] parts = entry.getKey().split("_");
        String nomClient = parts[0];
        String dateAchat = parts[1];
        List<Object[]> achats = entry.getValue();
        
        // Générer la facture pour cette combinaison client/date
        Document doc = new Document();
        try {
            PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream(path + "/" + nomClient + "_" + dateAchat + "_facture.pdf"));
            doc.open();
            
            // Ajouter les informations du client et de la date à la facture
            Paragraph clientParagraph = new Paragraph("Nom du client: " + nomClient);
            clientParagraph.setAlignment(Element.ALIGN_LEFT);
            doc.add(clientParagraph);
            
            Paragraph dateParagraph = new Paragraph("Date: " + dateAchat);
            dateParagraph.setAlignment(Element.ALIGN_LEFT);
            doc.add(dateParagraph);
            
            doc.add(new Paragraph("\n")); // Espacement
            
            // Créer la table pour les achats du client à la date donnée
            PdfPTable table = new PdfPTable(4); // Pas de colonne supplémentaire pour le total
            table.addCell("Désignation");
            table.addCell("Prix unitaire");
            table.addCell("Nombre");
            table.addCell("Total");

            // Ajouter les achats à la table
            double totalAchats = 0.0;
            for (Object[] achat : achats) {
                table.addCell(achat[2].toString()); 
                table.addCell(String.valueOf(getPrixUnitaire(achat[2].toString()))); 
                table.addCell(achat[4].toString()); 

                double prixUnitaire = getPrixUnitaire(achat[2].toString());
                int nombre = Integer.parseInt(achat[4].toString());
                double total = prixUnitaire * nombre;
                table.addCell(String.valueOf(total));
                
                totalAchats += total; // Calculer la somme totale des achats
            }
            
            // Ajouter une ligne avec la somme totale des achats
            PdfPCell totalCell = new PdfPCell(new Phrase("Total Achats:"));
            totalCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            totalCell.setColspan(3);
            table.addCell(totalCell);
            
            PdfPCell totalValueCell = new PdfPCell(new Phrase(String.valueOf(totalAchats)));
            totalValueCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            table.addCell(totalValueCell);

            table.setHorizontalAlignment(Element.ALIGN_LEFT);
            
            doc.add(table); 

            doc.close();
            writer.close();

            JOptionPane.showMessageDialog(this, "Facture pour " + nomClient + " générée avec succès!", "Information", JOptionPane.INFORMATION_MESSAGE);
        } catch (FileNotFoundException | DocumentException ex) {
            ex.printStackTrace();
        }
    }
} else {
    JOptionPane.showMessageDialog(this, "Aucune ligne sélectionnée.", "Information", JOptionPane.INFORMATION_MESSAGE);
}*/

DefaultTableModel model = (DefaultTableModel) tableDark1.getModel();
ArrayList<Object[]> selectedRowsData = new ArrayList<>();

// Parcourir les lignes sélectionnées et les ajouter à selectedRowsData
for (int i = 0; i < model.getRowCount(); i++) {
    Boolean isSelected = (Boolean) model.getValueAt(i, 0); 
    if (isSelected) {
        Object[] rowData = new Object[model.getColumnCount()];
        for (int j = 0; j < model.getColumnCount(); j++) {
            rowData[j] = model.getValueAt(i, j); 
        }
        selectedRowsData.add(rowData); 
    }
}

// Vérifier s'il y a des lignes sélectionnées
if (!selectedRowsData.isEmpty()) {
    String path ="";
    JFileChooser j = new JFileChooser();
    j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    int x = j.showSaveDialog(this);
    if(x == JFileChooser.APPROVE_OPTION) {
        path = j.getSelectedFile().getPath();
    }

    // Créer une structure de données pour stocker les achats par client et par date
    Map<String, List<Object[]>> achatsParClientEtDate = new HashMap<>();

    // Regrouper les achats par client et par date
    for (Object[] rowData : selectedRowsData) {
        String nomClient = (String) rowData[3];
        String dateAchat = (String) rowData[5];
        String key = nomClient + "_" + dateAchat;
        
        if (!achatsParClientEtDate.containsKey(key)) {
            achatsParClientEtDate.put(key, new ArrayList<>());
        }
        
        achatsParClientEtDate.get(key).add(rowData);
    }

    // Générer la facture regroupant tous les achats pour chaque client et chaque date
    for (Map.Entry<String, List<Object[]>> entry : achatsParClientEtDate.entrySet()) {
        String[] parts = entry.getKey().split("_");
        String nomClient = parts[0];
        String dateAchat = parts[1];
        List<Object[]> achats = entry.getValue();
        
        // Générer la facture pour cette combinaison client/date
        Document doc = new Document();
        try {
            PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream(path + "/" + nomClient + "_" + dateAchat + "_facture.pdf"));
            doc.open();
            
            // Ajouter les informations du client et de la date à la facture
            Paragraph clientParagraph = new Paragraph("Nom du client: " + nomClient);
            clientParagraph.setAlignment(Element.ALIGN_LEFT);
            doc.add(clientParagraph);
            
            Paragraph dateParagraph = new Paragraph("Date: " + dateAchat);
            dateParagraph.setAlignment(Element.ALIGN_LEFT);
            doc.add(dateParagraph);
            
            doc.add(new Paragraph("\n")); // Espacement
            
            // Créer la table pour les achats du client à la date donnée
            PdfPTable table = new PdfPTable(4); // Pas de colonne supplémentaire pour le total
            table.addCell("Désignation");
            table.addCell("Prix unitaire");
            table.addCell("Nombre");
            table.addCell("Total");

            // Ajouter les achats à la table
            double totalAchats = 0.0;
            for (Object[] achat : achats) {
                table.addCell(achat[2].toString()); 
                table.addCell(String.valueOf(getPrixUnitaire(achat[2].toString()))); 
                table.addCell(achat[4].toString()); 

                double prixUnitaire = getPrixUnitaire(achat[2].toString());
                int nombre = Integer.parseInt(achat[4].toString());
                double total = prixUnitaire * nombre;
                table.addCell(String.valueOf(total));
                
                totalAchats += total; // Calculer la somme totale des achats
            }
            
            // Ajouter une ligne avec la somme totale des achats
            PdfPCell totalCell = new PdfPCell(new Phrase(String.valueOf(totalAchats)));
            totalCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
            totalCell.setColspan(4); // Utilisation de colspan pour fusionner toutes les colonnes
            table.addCell(totalCell);

            table.setHorizontalAlignment(Element.ALIGN_LEFT);
            
            doc.add(table); 

            doc.close();
            writer.close();

            JOptionPane.showMessageDialog(this, "Facture pour " + nomClient + " générée avec succès!", "Information", JOptionPane.INFORMATION_MESSAGE);
        } catch (FileNotFoundException | DocumentException ex) {
            ex.printStackTrace();
        }
    }
} else {
    JOptionPane.showMessageDialog(this, "Aucune ligne sélectionnée.", "Information", JOptionPane.INFORMATION_MESSAGE);
}


    }//GEN-LAST:event_factureBtnActionPerformed
 private double getPrixUnitaire(String designation) {
        double prixUnitaire = 0.0;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // Établir la connexion à votre base de données medoc
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myjavadb", "root", "");

            // Préparer la requête SQL pour obtenir le prix unitaire en fonction de la désignation
            String query = "SELECT puMedoc FROM medoc WHERE designMedoc = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, designation);

            // Exécuter la requête
            rs = pstmt.executeQuery();

            // Si un résultat est trouvé, obtenir le prix unitaire
            if (rs.next()) {
                prixUnitaire = rs.getDouble("puMedoc");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            // Fermer les ressources JDBC
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return prixUnitaire;
    }
    
    /*void chargerAchat() {
        String query = "SELECT achat.numAchat, medoc.designMedoc, achat.nomClient, achat.qttAchat, achat.dateAchat "
        + "FROM achat "
        + "JOIN medoc ON achat.numMedoc = medoc.numMedoc ";
        //+ "ORDER BY achat.numAchat ASC"; // Ajout d'un espace à la fin de la ligne précédente


        try (Connection con = DriverManager.getConnection(url, user, password); PreparedStatement pst = con.prepareStatement(query); ResultSet rs = pst.executeQuery()) {

            // Créer le modèle de table avec les colonnes spécifiées
            DefaultTableModel model = new DefaultTableModel(new Object[]{"Sélection", "Numéro", "Médicament", "Client", "Quantité", "Date"}, 0) {
                @Override
                public Class<?> getColumnClass(int columnIndex) {
                    // Retourner la classe de la colonne "Sélection" pour afficher une case à cocher
                    if (columnIndex == 0) {
                        return Boolean.class;
                    } else {
                        return super.getColumnClass(columnIndex);
                    }
                }
            };

            while (rs.next()) {
                String numAchat = rs.getString("numAchat");
                String designMedoc = rs.getString("designMedoc");
                String client = rs.getString("nomClient");
                String qttAchat = rs.getString("qttAchat");
                String dateAchat = rs.getString("dateAchat");

                model.addRow(new Object[]{false, numAchat, designMedoc, client, qttAchat, dateAchat});
            }

            tableDark1.setModel(model);

            tableDark1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int row = tableDark1.rowAtPoint(e.getPoint());
                    int column = tableDark1.columnAtPoint(e.getPoint());

                    if (column == 0 && row != -1) {
                        Boolean isSelected = (Boolean) tableDark1.getValueAt(row, column);
                        if (isSelected) {

                            for (int i = 0; i < model.getColumnCount(); i++) {
                                System.out.print(model.getValueAt(row, i) + "\t");
                            }
                            System.out.println();
                        }
                    }
                }
            });

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erreur lors du chargement des entrées : " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            System.out.println(ex.getMessage());
        }
    }*/
    void chargerAchat() {
    String query = "SELECT achat.numAchat, medoc.designMedoc, achat.nomClient, achat.qttAchat, achat.dateAchat "
            + "FROM achat "
            + "JOIN medoc ON achat.numMedoc = medoc.numMedoc ";

    try (Connection con = DriverManager.getConnection(url, user, password);
         PreparedStatement pst = con.prepareStatement(query);
         ResultSet rs = pst.executeQuery()) {

        DefaultTableModel model = new DefaultTableModel(new Object[]{"Sélection", "Numéro", "Médicament", "Client", "Quantité", "Date"}, 0) {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                if (columnIndex == 0) {
                    return Boolean.class;
                } else {
                    return super.getColumnClass(columnIndex);
                }
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                   return column != 1;

            }
        };

        while (rs.next()) {
            String numAchat = rs.getString("numAchat");
            String designMedoc = rs.getString("designMedoc");
            String client = rs.getString("nomClient");
            String qttAchat = rs.getString("qttAchat");
            String dateAchat = rs.getString("dateAchat");

            model.addRow(new Object[]{false, numAchat, designMedoc, client, qttAchat, dateAchat});
        }

        tableDark1.setModel(model);

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Erreur lors du chargement des entrées : " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        System.out.println(ex.getMessage());
    }
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> MedocComboBox;
    private javax.swing.JButton ajoutAchatBtn;
    private javax.swing.JButton factureBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifAchat;
    private com.raven.swing.RoundPanel roundPanel1;
    private javax.swing.JButton supAchatBtn;
    private tableDark.TableDark tableDark1;
    // End of variables declaration//GEN-END:variables
}
