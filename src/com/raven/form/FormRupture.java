
package com.raven.form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;


public class FormRupture extends javax.swing.JPanel {

   private final String url = "jdbc:mysql://localhost:3306/myjavadb";
    private final String user = "root";
    private final String password = "";
    public FormRupture() {
        initComponents();
       chargerRuptureStockTable();
        setOpaque(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new com.raven.swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RuptureStockTable = new tableDark.TableDark();

        roundPanel1.setBackground(new java.awt.Color(60, 60, 60));
        roundPanel1.setForeground(new java.awt.Color(255, 255, 255));

        RuptureStockTable.setBackground(new java.awt.Color(60, 60, 60));
        RuptureStockTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numéro ", "Désignation", "Stock actuel"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(RuptureStockTable);
        if (RuptureStockTable.getColumnModel().getColumnCount() > 0) {
            RuptureStockTable.getColumnModel().getColumn(0).setResizable(false);
            RuptureStockTable.getColumnModel().getColumn(1).setResizable(false);
            RuptureStockTable.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

void chargerRuptureStockTable() {
    DefaultTableModel model = (DefaultTableModel) RuptureStockTable.getModel();
    model.setRowCount(0); // Effacer le contenu actuel de la table

    // Requête SQL pour sélectionner les médicaments dont le stockMedoc est inférieur à 5
    String query = "SELECT numMedoc, designMedoc, stockMedoc FROM medoc WHERE stockMedoc < 5";

    try (Connection connection = DriverManager.getConnection(url, user, password);
         PreparedStatement statement = connection.prepareStatement(query);
         ResultSet resultSet = statement.executeQuery()) {

        while (resultSet.next()) {
            String numMedoc = resultSet.getString("numMedoc");
            String designation = resultSet.getString("designMedoc");
           
            int stockMedoc = resultSet.getInt("stockMedoc");

            // Ajouter les données à la table
            model.addRow(new Object[]{numMedoc, designation, stockMedoc});
        }

    } catch (SQLException ex) {
        ex.printStackTrace(); // Gérer les exceptions liées à la connexion ou à la requête SQL
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private tableDark.TableDark RuptureStockTable;
    private javax.swing.JScrollPane jScrollPane1;
    private com.raven.swing.RoundPanel roundPanel1;
    // End of variables declaration//GEN-END:variables
}
