
package com.raven.form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FormMedoc extends javax.swing.JPanel {

   
    public FormMedoc() {
        initComponents();
        MedocTable.fixTable(jScrollPane1);
        setOpaque(false);
        DefaultTableModel model;
        model = (DefaultTableModel) MedocTable.getModel();
        LoadData();
        modifMedocBtn.setEnabled(false);
        supMedocBtn.setEnabled(false);
 
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel2 = new com.raven.swing.RoundPanel();
        searchMedoc = new javax.swing.JTextField();
        ajoutMedocBtn = new javax.swing.JButton();
        supMedocBtn = new javax.swing.JButton();
        modifMedocBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        designation = new javax.swing.JTextField();
        prix_unitaire = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        MedocTable = new tableDark.TableDark();

        roundPanel2.setBackground(new java.awt.Color(60, 60, 60));

        searchMedoc.setBackground(new java.awt.Color(60, 60, 60));
        searchMedoc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchMedoc.setForeground(new java.awt.Color(255, 255, 255));
        searchMedoc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchMedoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchMedocActionPerformed(evt);
            }
        });

        ajoutMedocBtn.setBackground(new java.awt.Color(60, 60, 60));
        ajoutMedocBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ajoutMedocBtn.setForeground(new java.awt.Color(255, 255, 255));
        ajoutMedocBtn.setText("Ajouter");
        ajoutMedocBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ajoutMedocBtnMouseClicked(evt);
            }
        });
        ajoutMedocBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutMedocBtnActionPerformed(evt);
            }
        });

        supMedocBtn.setBackground(new java.awt.Color(60, 60, 60));
        supMedocBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        supMedocBtn.setForeground(new java.awt.Color(255, 255, 255));
        supMedocBtn.setText("Supprimer");
        supMedocBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supMedocBtnActionPerformed(evt);
            }
        });

        modifMedocBtn.setBackground(new java.awt.Color(60, 60, 60));
        modifMedocBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        modifMedocBtn.setForeground(new java.awt.Color(255, 255, 255));
        modifMedocBtn.setText("Modifier");
        modifMedocBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifMedocBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Désignation :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Prix unitaire :");

        designation.setBackground(new java.awt.Color(60, 60, 60));
        designation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        designation.setForeground(new java.awt.Color(255, 255, 255));
        designation.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        designation.setMinimumSize(new java.awt.Dimension(64, 41));

        prix_unitaire.setBackground(new java.awt.Color(60, 60, 60));
        prix_unitaire.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        prix_unitaire.setForeground(new java.awt.Color(255, 255, 255));
        prix_unitaire.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        prix_unitaire.setMinimumSize(new java.awt.Dimension(64, 41));
        prix_unitaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prix_unitaireActionPerformed(evt);
            }
        });

        MedocTable.setBackground(new java.awt.Color(60, 60, 60));
        MedocTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identifiant", "Désignation", "Prix unitaire", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        MedocTable.setEditingRow(0);
        MedocTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MedocTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MedocTable);

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel2Layout.createSequentialGroup()
                        .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(prix_unitaire, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(designation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(supMedocBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchMedoc, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(roundPanel2Layout.createSequentialGroup()
                        .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modifMedocBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ajoutMedocBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14))))
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel2Layout.createSequentialGroup()
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(roundPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(roundPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(searchMedoc, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(designation, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(prix_unitaire, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160)
                        .addComponent(ajoutMedocBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modifMedocBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(supMedocBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ajoutMedocBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ajoutMedocBtnMouseClicked
      
    }//GEN-LAST:event_ajoutMedocBtnMouseClicked

    private void prix_unitaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prix_unitaireActionPerformed
        
    }//GEN-LAST:event_prix_unitaireActionPerformed

    private void ajoutMedocBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutMedocBtnActionPerformed
       
       String designationMedoc;
    String prixUnitaire;
    String query;
    
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/myjavadb";
        String user = "root";
        String password = "";
        
        Connection con = DriverManager.getConnection(url, user, password);
        Statement st = con.createStatement();
        
        if ("".equals(designation.getText())) {
            JOptionPane.showMessageDialog(new JFrame(), "Veuillez remplir le champ de la désignation", "Boîte de dialogue", JOptionPane.ERROR_MESSAGE);
        } else if ("".equals(prix_unitaire.getText())) {
            JOptionPane.showMessageDialog(new JFrame(), "Veuillez remplir le champ du prix unitaire", "Boîte de dialogue", JOptionPane.ERROR_MESSAGE);
        } else {
            designationMedoc = designation.getText();
            prixUnitaire = prix_unitaire.getText();
            
            // Vérification de l'existence du médicament dans la base de données
            query = "SELECT * FROM medoc WHERE designMedoc = '" + designationMedoc + "'";
            ResultSet rs = st.executeQuery(query);
            
            if (rs.next()) {
                // Le médicament existe déjà dans la base de données
                JOptionPane.showMessageDialog(new JFrame(), "Ce médicament est déjà enregistré dans la base de données", "Boîte de dialogue", JOptionPane.ERROR_MESSAGE);
            } else {
                // Le médicament n'existe pas encore, on peut l'ajouter
                query = "INSERT INTO medoc(designMedoc, puMedoc) VALUES('" + designationMedoc + "', '" + prixUnitaire + "')";
                st.executeUpdate(query);
                LoadData();
                JOptionPane.showMessageDialog(null, "L'ajout a été un succès");
                designation.setText("");
                prix_unitaire.setText("");
            }
            
            con.close();
        }
        
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
    }//GEN-LAST:event_ajoutMedocBtnActionPerformed

    private void searchMedocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchMedocActionPerformed
   String design = searchMedoc.getText().trim(); // Récupère le texte du champ de recherche en supprimant les espaces inutiles

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/myjavadb";
        String user = "root";
        String password = "";

        Connection con = DriverManager.getConnection(url, user, password);
        Statement st = con.createStatement();
        String query = "SELECT * FROM medoc";

        if (!design.isEmpty()) {
            query += " WHERE designMedoc LIKE '%" + design + "%'";
        }

        ResultSet rs = st.executeQuery(query);

        // Création du modèle de tableau avec les résultats de la recherche
        DefaultTableModel model = new DefaultTableModel(new String[]{"Numéro", "Désignation", "Prix unitaire", "Stock"}, 0);

        // Ajout des résultats de la recherche dans le modèle de tableau
        while (rs.next()) {
            String numero = rs.getString("numMedoc");
            String designMedoc = rs.getString("designMedoc");
            String prixUnitaire = rs.getString("puMedoc");
            String stock = rs.getString("stockMedoc");
            model.addRow(new Object[]{numero, designMedoc, prixUnitaire, stock});
        }

        // Fermer les ressources
        rs.close();
        st.close();
        con.close();
        
        // Mettre à jour le tableau avec le modèle de données filtré
        MedocTable.setModel(model);
    } catch (ClassNotFoundException | SQLException ex) {
      
        ex.printStackTrace();
        JOptionPane.showMessageDialog(new JFrame(), "Erreur lors de la recherche.", "Boîte de dialogue", JOptionPane.ERROR_MESSAGE);
    }
 
    }//GEN-LAST:event_searchMedocActionPerformed
    
    private String numeroSelectionne;
    
    private void MedocTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MedocTableMouseClicked
      
     if (evt.getClickCount() == 1 && MedocTable.getSelectedRow() != -1) {
        int selectedRow = MedocTable.getSelectedRow();
        numeroSelectionne = (String) MedocTable.getValueAt(selectedRow, 0);
        String design = (String) MedocTable.getValueAt(selectedRow, 1);
        String prixUnitaire = (String) MedocTable.getValueAt(selectedRow, 2);
        String stock = (String) MedocTable.getValueAt(selectedRow, 3);
        
        designation.setText(design);
        prix_unitaire.setText(prixUnitaire);
        
        // Afficher les données dans la console pour le débogage
        System.out.println("Numéro: " + numeroSelectionne);
        System.out.println("Désignation: " + design);
        System.out.println("Prix unitaire: " + prixUnitaire);
        System.out.println("Stock: " + stock);
        
        // Activer les boutons de modification et de suppression
        modifMedocBtn.setEnabled(true);
        supMedocBtn.setEnabled(true);
        ajoutMedocBtn.setEnabled(false);
    }
    }//GEN-LAST:event_MedocTableMouseClicked

    private void supMedocBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supMedocBtnActionPerformed

    String[] options = {"Oui", "Non"};

   
    int response = JOptionPane.showOptionDialog(new JFrame(), 
                                                "Voulez-vous vraiment supprimer ces données?", 
                                                "Demande de confirmation", 
                                                JOptionPane.YES_NO_OPTION, 
                                                JOptionPane.QUESTION_MESSAGE, 
                                                null, 
                                                options, 
                                                options[0]);

  String designationMedoc = designation.getText(); // Récupère la désignation du médicament depuis le champ de texte
    String prixUnitaire = prix_unitaire.getText(); // Récupère le prix unitaire depuis le champ de texte

    // Affiche les données dans la console
    System.out.println("Désignation du médicament: " + designationMedoc);
    System.out.println("Prix unitaire: " + prixUnitaire);
    if (response == JOptionPane.YES_OPTION) {
       try {
            // Code pour supprimer les données de la base de données
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/myjavadb";
            String user = "root";
            String password = "";

            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();

            // Code de suppression des données
            String query = "DELETE FROM medoc WHERE designMedoc = '"+designationMedoc+"'"; 
            int rowsAffected = st.executeUpdate(query);

           
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Suppression réussie", "Information", JOptionPane.INFORMATION_MESSAGE);
                  designation.setText("");
                  prix_unitaire.setText("");
                LoadData();
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "Aucune donnée supprimée", "Information", JOptionPane.INFORMATION_MESSAGE);
            }

            // Fermer les ressources
            st.close();
            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            // Gérer les exceptions
            ex.printStackTrace();
            JOptionPane.showMessageDialog(new JFrame(), "Erreur lors de la suppression", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_supMedocBtnActionPerformed

    private void modifMedocBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifMedocBtnActionPerformed
       // Options des boutons personnalisés
    String[] options = {"Oui", "Non"};

    // Affiche une boîte de dialogue de confirmation avec les options personnalisées
    int response = JOptionPane.showOptionDialog(new JFrame(), 
                                                "Les données seront alors mises à jour, confirmez-vous cette modification?", 
                                                "Demande de confirmation", 
                                                JOptionPane.YES_NO_OPTION, 
                                                JOptionPane.QUESTION_MESSAGE, 
                                                null, 
                                                options, 
                                                options[0]);
    
    String designationMedoc = designation.getText(); // Récupère la désignation du médicament depuis le champ de texte
    String prixUnitaire = prix_unitaire.getText(); // Récupère le prix unitaire depuis le champ de texte

    // Vérifie la réponse de l'utilisateur
    if (response == JOptionPane.YES_OPTION) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/myjavadb";
            String user = "root";
            String password = "";

            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();

            // Vérifie si vous avez bien une variable numeroSelectionne définie
            if (numeroSelectionne != null) {
                String query = "UPDATE medoc SET designMedoc = '" + designationMedoc + "', puMedoc = '" + prixUnitaire + "' WHERE numMedoc = '"+numeroSelectionne+"'"; // Remplacez "..." par votre condition de mise à jour
                int rowsAffected = st.executeUpdate(query);

                // Vérifie si des lignes ont été affectées (c'est-à-dire si la mise à jour a réussi)
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Modification réussie", "Information", JOptionPane.INFORMATION_MESSAGE);
                    // Rechargez les données dans le tableau après la mise à jour
                    LoadData();
                } else {
                    JOptionPane.showMessageDialog(new JFrame(), "Aucune donnée modifiée", "Information", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "Aucun médicament sélectionné", "Erreur", JOptionPane.ERROR_MESSAGE);
            }

            // Fermer les ressources
            st.close();
            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            // Gérer les exceptions
            ex.printStackTrace();
            JOptionPane.showMessageDialog(new JFrame(), "Erreur lors de la modification", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_modifMedocBtnActionPerformed

   public void LoadData()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/myjavadb";
            String user = "root";
            String password = "";
            
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();

            DefaultTableModel model = new DefaultTableModel(new String[]{"Numéro", "Désignation", "Prix unitaire", "Stock"}, 0);
            
            String sql = "SELECT * FROM medoc";
            ResultSet rs = st.executeQuery(sql);
            String numero, design, prixUnitaire, stock;
            while (rs.next()) 
            {
                numero = rs.getString("numMedoc");
                design = rs.getString("designMedoc");
                prixUnitaire = rs.getString("puMedoc") +"  " +"Ar"  ;
                stock = rs.getString("stockMedoc");
                model.addRow(new Object[]{numero, design, prixUnitaire, stock});
            }
            
             MedocTable.setModel(model);
         ;

        }
        catch(Exception e)
        {
              System.out.println("Error :" + e.getMessage());
        }
    }
 

   
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private tableDark.TableDark MedocTable;
    private javax.swing.JButton ajoutMedocBtn;
    private javax.swing.JTextField designation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifMedocBtn;
    private javax.swing.JTextField prix_unitaire;
    private com.raven.swing.RoundPanel roundPanel2;
    private javax.swing.JTextField searchMedoc;
    private javax.swing.JButton supMedocBtn;
    // End of variables declaration//GEN-END:variables
}
