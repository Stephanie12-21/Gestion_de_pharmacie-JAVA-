package com.raven.form;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormEntre extends javax.swing.JPanel {

    private Date dateEntre;
    private final String url = "jdbc:mysql://localhost:3306/myjavadb";
    private final String user = "root";
    private final String password = "";

    
    
    
     private void chargerMedocs() {
        String query = "SELECT numMedoc, designMedoc FROM medoc";

        try (Connection con = DriverManager.getConnection(url, user, password); PreparedStatement pst = con.prepareStatement(query); ResultSet rs = pst.executeQuery()) {

            MedocComboBox.addItem(""); // Ajoutez un élément vide

            while (rs.next()) {
                String numMedoc = rs.getString("numMedoc");
                String designMedoc = rs.getString("designMedoc");
                // Concaténez le numéro de médicament avec la désignation
                MedocComboBox.addItem(numMedoc + " - " + designMedoc);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erreur lors du chargement des médicaments : " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void chargerEntrees() {
        String query = "SELECT entre.numEntre, medoc.designMedoc, entre.stockEntre, entre.dateEntre "
                + "FROM entre "
                + "JOIN medoc ON entre.numMedoc = medoc.numMedoc";
              

        try (Connection con = DriverManager.getConnection(url, user, password); PreparedStatement pst = con.prepareStatement(query); ResultSet rs = pst.executeQuery()) {

            // Créer le modèle de table avec les colonnes spécifiées
            DefaultTableModel model = new DefaultTableModel(new String[]{"Numéro ", "Médicament", "Stock d'entrée", "Date"}, 0);

            // Parcourir les résultats de la requête et ajouter chaque ligne au modèle de table
            while (rs.next()) {
                String numEntre = rs.getString("numEntre");
                String Medoc = rs.getString("designMedoc");
                String stockEntre = rs.getString("stockEntre");
                String dateEntre = rs.getString("dateEntre");

                // Ajouter la ligne au modèle de table
                model.addRow(new Object[]{numEntre, Medoc, stockEntre, dateEntre});
            }

            // Appliquer le modèle de table au JTable
            EntreTable.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erreur lors du chargement des entrées : " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }


    public FormEntre() {
        initComponents();
        chargerMedocs();
        chargerEntrees();
        setOpaque(false);

        MedocComboBox.addActionListener((ActionEvent e) -> {
            String selectedMedoc = (String) MedocComboBox.getSelectedItem();

            // Diviser la chaîne en fonction du séparateur "-"
            String[] parts = selectedMedoc.split(" - ");

            // Vérifier si la division a réussi et qu'il y a au moins deux parties
            if (parts.length >= 2) {
                String numMedoc = parts[0];
                String designMedoc = parts[1];

                System.out.println("Numéro de médicament sélectionné : " + numMedoc);
                System.out.println("Design de médicament sélectionné : " + designMedoc);
            } else {
                // Gérer le cas où la division échoue ou où il n'y a pas assez de parties
                System.out.println("Sélection de médicament invalide : " + selectedMedoc);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new com.raven.swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EntreTable = new tableDark.TableDark();
        addEbtn = new javax.swing.JButton();
        supEbtn = new javax.swing.JButton();
        modifMedocBtn2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        MedocComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dateEntrechooser = new com.toedter.calendar.JDateChooser();
        stockEntre = new javax.swing.JSpinner();

        setPreferredSize(new java.awt.Dimension(836, 639));

        roundPanel1.setBackground(new java.awt.Color(60, 60, 60));

        EntreTable.setBackground(new java.awt.Color(60, 60, 60));
        EntreTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identifiant", "Médicaments", "Quantité", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EntreTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EntreTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(EntreTable);
        if (EntreTable.getColumnModel().getColumnCount() > 0) {
            EntreTable.getColumnModel().getColumn(0).setResizable(false);
            EntreTable.getColumnModel().getColumn(1).setResizable(false);
            EntreTable.getColumnModel().getColumn(3).setResizable(false);
        }

        addEbtn.setBackground(new java.awt.Color(60, 60, 60));
        addEbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addEbtn.setForeground(new java.awt.Color(255, 255, 255));
        addEbtn.setText("Ajouter");
        addEbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEbtnActionPerformed(evt);
            }
        });

        supEbtn.setBackground(new java.awt.Color(60, 60, 60));
        supEbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        supEbtn.setForeground(new java.awt.Color(255, 255, 255));
        supEbtn.setText("Supprimer");
        supEbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supEbtnActionPerformed(evt);
            }
        });

        modifMedocBtn2.setBackground(new java.awt.Color(60, 60, 60));
        modifMedocBtn2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        modifMedocBtn2.setForeground(new java.awt.Color(255, 255, 255));
        modifMedocBtn2.setText("Modifier");
        modifMedocBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifMedocBtn2ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(60, 60, 60));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Médicament :");

        MedocComboBox.setBackground(new java.awt.Color(60, 60, 60));
        MedocComboBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MedocComboBox.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(60, 60, 60));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quantité :");

        jLabel3.setBackground(new java.awt.Color(60, 60, 60));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date :");

        dateEntrechooser.setBackground(new java.awt.Color(60, 60, 60));
        dateEntrechooser.setForeground(new java.awt.Color(255, 255, 255));
        dateEntrechooser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        stockEntre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(supEbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modifMedocBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(addEbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MedocComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateEntrechooser, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                            .addComponent(stockEntre, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MedocComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(stockEntre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateEntrechooser, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(addEbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(modifMedocBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(supEbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
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

    private void addEbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEbtnActionPerformed


        try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    String url = "jdbc:mysql://localhost:3306/myjavadb";
    String user = "root";
    String password = "";

    try (Connection con = DriverManager.getConnection(url, user, password)) {
        // Utilisation de JSpinner pour récupérer le stock
        int stock = (int) stockEntre.getValue();
        
        if (stock <= 0) {
            JOptionPane.showMessageDialog(new JFrame(), "Veuillez saisir un stock valide", "Boîte de dialogue", JOptionPane.ERROR_MESSAGE);
        } else {
            String selectedMedoc = (String) MedocComboBox.getSelectedItem();
            String[] parts = selectedMedoc.split(" - ");

            if (parts.length >= 1) {
                String numMedoc = parts[0];

                java.util.Date date = dateEntrechooser.getDate();
                java.sql.Date sqlDate = new java.sql.Date(date.getTime());

                String insertQuery = "INSERT INTO entre (numMedoc, stockEntre, dateEntre) VALUES (?, ?, ?)";
                try (PreparedStatement pstmt = con.prepareStatement(insertQuery)) {
                    pstmt.setString(1, numMedoc);
                    pstmt.setInt(2, stock);
                    pstmt.setDate(3, sqlDate);
                    pstmt.executeUpdate();
                }

                String queryUpdateStock = "UPDATE medoc SET stockMedoc = stockMedoc + ? WHERE numMedoc = ?";
                try (PreparedStatement pstUpdateStock = con.prepareStatement(queryUpdateStock)) {
                    pstUpdateStock.setInt(1, stock);
                    pstUpdateStock.setString(2, numMedoc);
                    pstUpdateStock.executeUpdate();
                }

                chargerEntrees();
                JOptionPane.showMessageDialog(null, "L'ajout a été un succès");
                stockEntre.setValue(0); // Réinitialiser la valeur du spinner à zéro
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "Sélection de médicament invalide", "Boîte de dialogue", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
} catch (ClassNotFoundException ex) {
    JOptionPane.showMessageDialog(null, "Erreur de chargement du pilote JDBC : " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "Une erreur s'est produite lors de l'ajout : " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
} 


    }//GEN-LAST:event_addEbtnActionPerformed

    private void supEbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supEbtnActionPerformed
try {
    int selectedRow = EntreTable.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Veuillez sélectionner une entrée à supprimer.", "Aucune entrée sélectionnée", JOptionPane.WARNING_MESSAGE);
        return;
    }

    String[] options = {"Oui", "Non"};
    int response = JOptionPane.showOptionDialog(new JFrame(), 
                                                "Voulez-vous vraiment supprimer ces données?", 
                                                "Demande de confirmation", 
                                                JOptionPane.YES_NO_OPTION, 
                                                JOptionPane.QUESTION_MESSAGE, 
                                                null, 
                                                options, 
                                                options[0]);

    if (response == JOptionPane.YES_OPTION) {
        String numEntre = EntreTable.getValueAt(selectedRow, 0).toString();
        String nomMedoc = EntreTable.getValueAt(selectedRow, 1).toString(); // Récupérer le nom du médicament
        int stockEntreDeleted = Integer.parseInt(EntreTable.getValueAt(selectedRow, 2).toString());

        try (Connection con = DriverManager.getConnection(url, user, password)) {
            con.setAutoCommit(false);

            // Récupérer le numéro du médicament correspondant au nom du médicament sélectionné
            PreparedStatement pstGetNumMedoc = con.prepareStatement("SELECT numMedoc FROM medoc WHERE designMedoc = ?");
            pstGetNumMedoc.setString(1, nomMedoc);
            ResultSet rsNumMedoc = pstGetNumMedoc.executeQuery();
            String numMedoc = "";
            if (rsNumMedoc.next()) {
                numMedoc = rsNumMedoc.getString("numMedoc");
            }

            // Mettre à jour le stock du médicament dans la table medoc
            PreparedStatement pstUpdateStock = con.prepareStatement("UPDATE medoc SET stockMedoc = stockMedoc - ? WHERE numMedoc = ?");
            pstUpdateStock.setInt(1, stockEntreDeleted);
            pstUpdateStock.setString(2, numMedoc);
            pstUpdateStock.executeUpdate();

            // Supprimer la ligne sélectionnée de la table entre
            PreparedStatement pstDelete = con.prepareStatement("DELETE FROM entre WHERE numEntre = ?");
            pstDelete.setString(1, numEntre);
            pstDelete.executeUpdate();

            con.commit();

            // Recharger les données dans les tables
            chargerMedocs();
            chargerEntrees();

            JOptionPane.showMessageDialog(this, "L'entrée a été supprimée avec succès.", "Suppression réussie", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erreur lors de la suppression de l'entrée : " + ex.getMessage(), "Erreur de suppression", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Suppression annulée.", "Annulation de suppression", JOptionPane.INFORMATION_MESSAGE);
    }
} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Le stock de l'entrée sélectionnée n'est pas un nombre valide.", "Erreur de stock", JOptionPane.ERROR_MESSAGE);
}




    }//GEN-LAST:event_supEbtnActionPerformed

    private void EntreTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntreTableMouseClicked
    
       DefaultTableModel model = (DefaultTableModel) EntreTable.getModel();
    int index = EntreTable.getSelectedRow();

    if (index != -1) { // Vérifier si une ligne est sélectionnée
        try {
            // Récupérer la quantité de la ligne sélectionnée
            String quantiteStr = (String) model.getValueAt(index, 2);
            int quantite = Integer.parseInt(quantiteStr);
            // Afficher la quantité dans le JSpinner
            stockEntre.setValue(quantite);
           
            String medoc= model.getValueAt(index, 1).toString();
           
           for (int i = 0; i < MedocComboBox.getItemCount(); i++)
           {
               if(MedocComboBox.getItemAt(i).toString().equalsIgnoreCase(medoc))
               {
                   MedocComboBox.setSelectedIndex(i);
               }
           }
           
            // Récupérer et afficher la date de la ligne sélectionnée dans le JDateChooser
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String) model.getValueAt(index, 3));
            dateEntrechooser.setDate(date);
        } catch (ParseException | NumberFormatException ex) {
            Logger.getLogger(FormEntre.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }//GEN-LAST:event_EntreTableMouseClicked

    private void modifMedocBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifMedocBtn2ActionPerformed
    try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    String url = "jdbc:mysql://localhost:3306/myjavadb";
    String user = "root";
    String password = "";

    try (Connection con = DriverManager.getConnection(url, user, password)) {
        int selectedRow = EntreTable.getSelectedRow(); // Obtenez la ligne sélectionnée dans votre tableau
        String numEntre = EntreTable.getValueAt(selectedRow, 0).toString(); // Remplacez NUM_COLONNE_NUM_ENTRE par le numéro de colonne où se trouve numEntre
        
        // Utilisation de JSpinner pour récupérer le stock
        int stock = (int) stockEntre.getValue();
        
        if (stock <= 0) {
            JOptionPane.showMessageDialog(new JFrame(), "Veuillez saisir un stock valide", "Boîte de dialogue", JOptionPane.ERROR_MESSAGE);
        } else {
            String selectedMedoc = (String) MedocComboBox.getSelectedItem();
            String[] parts = selectedMedoc.split(" - ");

            if (parts.length >= 1) {
                String numMedoc = parts[0];

                java.util.Date date = dateEntrechooser.getDate();
                java.sql.Date sqlDate = new java.sql.Date(date.getTime());

                String insertQuery = "UPDATE entre SET numMedoc = ?, stockEntre = ?, dateEntre = ? WHERE numEntre = ?";
                try (PreparedStatement pstmt = con.prepareStatement(insertQuery)) {
                    pstmt.setString(1, numMedoc);
                    pstmt.setInt(2, stock);
                    pstmt.setDate(3, sqlDate);
                    pstmt.setString(4, numEntre); // Utilisation de numEntre sélectionné
                    pstmt.executeUpdate();
                }

                String queryUpdateStock = "UPDATE medoc SET stockMedoc = stockMedoc + ? WHERE numMedoc = ?";
                try (PreparedStatement pstUpdateStock = con.prepareStatement(queryUpdateStock)) {
                    pstUpdateStock.setInt(1, stock);
                    pstUpdateStock.setString(2, numMedoc);
                    pstUpdateStock.executeUpdate();
                }

                chargerEntrees();
                JOptionPane.showMessageDialog(null, "La modification a été un succès");
                stockEntre.setValue(0); // Réinitialiser la valeur du spinner à zéro
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "Sélection de médicament invalide", "Boîte de dialogue", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
} catch (ClassNotFoundException ex) {
    JOptionPane.showMessageDialog(null, "Erreur de chargement du pilote JDBC : " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "Une erreur s'est produite lors de la modification : " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);



    }//GEN-LAST:event_modifMedocBtn2ActionPerformed

    
    }

























    // Variables declaration - do not modify//GEN-BEGIN:variables
    private tableDark.TableDark EntreTable;
    private javax.swing.JComboBox<String> MedocComboBox;
    private javax.swing.JButton addEbtn;
    private com.toedter.calendar.JDateChooser dateEntrechooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifMedocBtn2;
    private com.raven.swing.RoundPanel roundPanel1;
    private javax.swing.JSpinner stockEntre;
    private javax.swing.JButton supEbtn;
    // End of variables declaration//GEN-END:variables
}
