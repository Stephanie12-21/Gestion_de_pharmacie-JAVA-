
package com.raven.form;

import com.raven.chart.ModelChart;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FormHome extends javax.swing.JPanel {

    
    public FormHome() {
        initComponents();
        setOpaque(false);
        init();
       calculerEtAfficherTotalRecette() ;
        calculerTotalMedoc();
    }
 /* private void init() {
    // Ajouter les légendes au graphique
    chart.addLegend("Recettes totales", new Color(12, 84, 175), new Color(0, 108, 247));
    
    // Ajouter les données au graphique
    chart.addData(new ModelChart("Décembre", new double[]{869}));
    chart.addData(new ModelChart("Janvier", new double[]{3990}));
    chart.addData(new ModelChart("Février", new double[]{4910}));
    chart.addData(new ModelChart("Mars", new double[]{2080}));
    chart.addData(new ModelChart("Avril", new double[]{1340}));
    
    
    // Démarrer le graphique
    chart.start();
}
*/
 private void init() {
    // Connexion à la base de données
    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myjavadb", "root", "")) {
        // Préparation de la requête SQL avec PreparedStatement
        String sql = "SELECT CONCAT(UPPER(LEFT(MONTHNAME(dateAchat), 1)), LOWER(SUBSTRING(MONTHNAME(dateAchat), 2)), ' ', YEAR(dateAchat)) AS mois, " +
                     "SUM(qttAchat * puMedoc) AS recette_totale " +
                     "FROM achat JOIN medoc ON achat.numMedoc = medoc.numMedoc " +
                     "GROUP BY YEAR(dateAchat), MONTH(dateAchat) " +
                     "ORDER BY YEAR(dateAchat), MONTH(dateAchat)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            // Exécution de la requête
            try (ResultSet rs = stmt.executeQuery()) {
                // Ajout des données au graphique
                while (rs.next()) {
                    String mois = rs.getString("mois");
                    double recetteTotale = rs.getDouble("recette_totale");
                    
                    chart.addData(new ModelChart(mois, new double[]{recetteTotale}));
                }
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    
    // Ajouter les légendes au graphique
    chart.addLegend("Recettes totales", new Color(12, 84, 175), new Color(0, 108, 247));
    
    // Démarrer le graphique
    chart.start();
}


// Fonction pour obtenir le nom du mois à partir de son numéro
private String getNomMois(int mois) {
    String[] moisNoms = {"Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre"};
    return moisNoms[mois - 1];
}

  
    private double calculerTotalRecette() {
        // Connexion à votre base de données (vous devrez remplacer les détails de connexion par les vôtres)
        final String url = "jdbc:mysql://localhost:3306/myjavadb";
        final String user = "root";
        final String password = "";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);

            // Requête SQL pour obtenir le total des recettes des achats
            String query = "SELECT SUM(medoc.puMedoc * achat.qttAchat) AS total_recette " +
                    "FROM achat " +
                    "JOIN medoc ON achat.numMedoc = medoc.numMedoc";

            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                // Récupérer le total des recettes des achats
                double totalRecette = rs.getDouble("total_recette");
                conn.close(); // Fermer la connexion après utilisation
                return totalRecette;
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // En cas d'erreur ou si aucun achat n'est enregistré, retourner 0
        return 0.0;
    }
    private void calculerEtAfficherTotalRecette() {
        int totalRecette = (int) calculerTotalRecette();
        recettesLabel.setText(String.valueOf(totalRecette) + " Ar");
        System.out.println("Total des recettes : " + totalRecette+ "Ar");
        //JOptionPane.showMessageDialog(null, "Bonjour, bienvenue à vous");
    }
 
   private void calculerTotalMedoc() {
    // Connexion à votre base de données (vous devrez remplacer les détails de connexion par les vôtres)
    final String url = "jdbc:mysql://localhost:3306/myjavadb";
    final String user = "root";
    final String password = "";

    try {
        Connection conn = DriverManager.getConnection(url, user, password);

   
        String query = "SELECT COUNT(*) AS nbTotalMedoc FROM medoc ";

        PreparedStatement stmt = conn.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            // Récupérer le nombre de médicaments en rupture de stock
           int nbTotalMedoc = rs.getInt("nbTotalMedoc");
            RuptureLabel.setText(String.valueOf( nbTotalMedoc)); // Mettre à jour le texte de ruptureLabel avec le nombre
            System.out.println("Nombre total de médicaments en stock : " +  nbTotalMedoc);
        }

        conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel2 = new com.raven.swing.RoundPanel();
        chart = new com.raven.chart.Chart();
        roundPanel3 = new com.raven.swing.RoundPanel();
        jLabel3 = new javax.swing.JLabel();
        recettesLabel = new javax.swing.JLabel();
        roundPanel5 = new com.raven.swing.RoundPanel();
        jLabel4 = new javax.swing.JLabel();
        RuptureLabel = new javax.swing.JLabel();

        roundPanel2.setBackground(new java.awt.Color(60, 60, 60));
        roundPanel2.setPreferredSize(new java.awt.Dimension(845, 450));

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addContainerGap())
        );

        roundPanel3.setBackground(new java.awt.Color(60, 60, 60));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Recettes totales");

        recettesLabel.setBackground(new java.awt.Color(204, 204, 204));
        recettesLabel.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        recettesLabel.setForeground(new java.awt.Color(204, 204, 204));
        recettesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout roundPanel3Layout = new javax.swing.GroupLayout(roundPanel3);
        roundPanel3.setLayout(roundPanel3Layout);
        roundPanel3Layout.setHorizontalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(recettesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(roundPanel3Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundPanel3Layout.setVerticalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(recettesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        roundPanel5.setBackground(new java.awt.Color(60, 60, 60));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Total des médicaments");

        RuptureLabel.setBackground(new java.awt.Color(204, 204, 204));
        RuptureLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        RuptureLabel.setForeground(new java.awt.Color(204, 204, 204));
        RuptureLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout roundPanel5Layout = new javax.swing.GroupLayout(roundPanel5);
        roundPanel5.setLayout(roundPanel5Layout);
        roundPanel5Layout.setHorizontalGroup(
            roundPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel5Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(roundPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RuptureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        roundPanel5Layout.setVerticalGroup(
            roundPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RuptureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(roundPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(roundPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(roundPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RuptureLabel;
    private com.raven.chart.Chart chart;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel recettesLabel;
    private com.raven.swing.RoundPanel roundPanel2;
    private com.raven.swing.RoundPanel roundPanel3;
    private com.raven.swing.RoundPanel roundPanel5;
    // End of variables declaration//GEN-END:variables
}
