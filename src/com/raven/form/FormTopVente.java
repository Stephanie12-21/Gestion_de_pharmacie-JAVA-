
package com.raven.form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class FormTopVente extends javax.swing.JPanel {

   
    public FormTopVente() {
        initComponents();
       chargerTopVenteTable();
        setOpaque(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        TopVenteTable = new tableDark.TableDark();

        setBackground(new java.awt.Color(60, 60, 60));

        TopVenteTable.setBackground(new java.awt.Color(60, 60, 60));
        TopVenteTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numéro", "Désignation", "Recetttes", "Stock actuel"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TopVenteTable);
        if (TopVenteTable.getColumnModel().getColumnCount() > 0) {
            TopVenteTable.getColumnModel().getColumn(0).setResizable(false);
            TopVenteTable.getColumnModel().getColumn(1).setResizable(false);
            TopVenteTable.getColumnModel().getColumn(2).setResizable(false);
            TopVenteTable.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    void chargerTopVenteTable() {
    // Requête SQL paramétrée pour sélectionner les médicaments dont le nombre d'ajouts dans la table achat est supérieur ou égal à 5
    String query = "SELECT m.numMedoc, m.designMedoc, (a.qttAchat * m.puMedoc) AS recettes, m.stockMedoc " +
                   "FROM medoc m " +
                   "JOIN achat a ON m.numMedoc = a.numMedoc " +
                   "GROUP BY m.numMedoc " +
                   "HAVING COUNT(a.numAchat) >= ?";

    try {
        // Établir la connexion à votre base de données
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myjavadb", "root", "");
        
        // Créer une instruction pour exécuter la requête SQL
        PreparedStatement statement = connection.prepareStatement(query);
        
        // Définir la valeur du paramètre dans la requête SQL
        statement.setInt(1, 5); // Nombre minimum d'ajouts
        
        // Exécuter la requête SQL et obtenir le résultat dans un ResultSet
        ResultSet resultSet = statement.executeQuery();
        
        // Nettoyer la table avant de charger de nouvelles données
        DefaultTableModel model = (DefaultTableModel) TopVenteTable.getModel();
        model.setRowCount(0);
        
        // Parcourir le résultat et ajouter les données à la table
        while (resultSet.next()) {
            // Récupérer les valeurs de chaque colonne
            String numeroMedoc = resultSet.getString("numMedoc");
            String designation = resultSet.getString("designMedoc");
            int recettes = (int) resultSet.getDouble("recettes");
            int stockMedoc = resultSet.getInt("stockMedoc");
            
            String recettesWithPrefix =recettes + " " +"Ar";
            
            // Ajouter une nouvelle ligne à la table avec les valeurs récupérées
            model.addRow(new Object[]{numeroMedoc, designation, recettesWithPrefix, stockMedoc});
        }
        
        // Fermer les ressources de connexion
        resultSet.close();
        statement.close();
        connection.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
        // Gérer les exceptions liées à la connexion ou à la requête SQL
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private tableDark.TableDark TopVenteTable;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
