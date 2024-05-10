
package com.raven.form;


import java.awt.Window;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class formAchatAjout1 extends javax.swing.JPanel {
   private Date dateAchat;
  private FormAchat parentForm;
    private final String url = "jdbc:mysql://localhost:3306/myjavadb";
    private final String user = "root";
    private final String password = "";
    

   
    private void chargerMedocs() {
        String query = "SELECT numMedoc, designMedoc FROM medoc";

        try (Connection con = DriverManager.getConnection(url, user, password); PreparedStatement pst = con.prepareStatement(query); ResultSet rs = pst.executeQuery()) {

           

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
    private void chargerMedocs2() {
        String query = "SELECT numMedoc, designMedoc FROM medoc";

        try (Connection con = DriverManager.getConnection(url, user, password); PreparedStatement pst = con.prepareStatement(query); ResultSet rs = pst.executeQuery()) {

           

            while (rs.next()) {
                String numMedoc = rs.getString("numMedoc");
                String designMedoc = rs.getString("designMedoc");
                // Concaténez le numéro de médicament avec la désignation
                MedocComboBox5.addItem(numMedoc + " - " + designMedoc);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erreur lors du chargement des médicaments : " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }
  private void chargerMedocs1() {
        String query = "SELECT numMedoc, designMedoc FROM medoc";

        try (Connection con = DriverManager.getConnection(url, user, password); PreparedStatement pst = con.prepareStatement(query); ResultSet rs = pst.executeQuery()) {

           

            while (rs.next()) {
                String numMedoc = rs.getString("numMedoc");
                String designMedoc = rs.getString("designMedoc");
                // Concaténez le numéro de médicament avec la désignation
                MedocComboBox1.addItem(numMedoc + " - " + designMedoc);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erreur lors du chargement des médicaments : " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }
  private void chargerMedocs3() {
        String query = "SELECT numMedoc, designMedoc FROM medoc";

        try (Connection con = DriverManager.getConnection(url, user, password); PreparedStatement pst = con.prepareStatement(query); ResultSet rs = pst.executeQuery()) {

           

            while (rs.next()) {
                String numMedoc = rs.getString("numMedoc");
                String designMedoc = rs.getString("designMedoc");
                // Concaténez le numéro de médicament avec la désignation
                MedocComboBox3.addItem(numMedoc + " - " + designMedoc);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erreur lors du chargement des médicaments : " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }
  private void chargerMedocs4() {
        String query = "SELECT numMedoc, designMedoc FROM medoc";

        try (Connection con = DriverManager.getConnection(url, user, password); PreparedStatement pst = con.prepareStatement(query); ResultSet rs = pst.executeQuery()) {

           

            while (rs.next()) {
                String numMedoc = rs.getString("numMedoc");
                String designMedoc = rs.getString("designMedoc");
                // Concaténez le numéro de médicament avec la désignation
                MedocComboBox4.addItem(numMedoc + " - " + designMedoc);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erreur lors du chargement des médicaments : " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }
  private void chargerMedocs5() {
        String query = "SELECT numMedoc, designMedoc FROM medoc";

        try (Connection con = DriverManager.getConnection(url, user, password); PreparedStatement pst = con.prepareStatement(query); ResultSet rs = pst.executeQuery()) {

           

            while (rs.next()) {
                String numMedoc = rs.getString("numMedoc");
                String designMedoc = rs.getString("designMedoc");
                // Concaténez le numéro de médicament avec la désignation
                MedocComboBox6.addItem(numMedoc + " - " + designMedoc);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erreur lors du chargement des médicaments : " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }
  private void chargerMedocs6() {
        String query = "SELECT numMedoc, designMedoc FROM medoc";

        try (Connection con = DriverManager.getConnection(url, user, password); PreparedStatement pst = con.prepareStatement(query); ResultSet rs = pst.executeQuery()) {

           

            while (rs.next()) {
                String numMedoc = rs.getString("numMedoc");
                String designMedoc = rs.getString("designMedoc");
                // Concaténez le numéro de médicament avec la désignation
                MedocComboBox7.addItem(numMedoc + " - " + designMedoc);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erreur lors du chargement des médicaments : " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }
  private void chargerMedocs7() {
        String query = "SELECT numMedoc, designMedoc FROM medoc";

        try (Connection con = DriverManager.getConnection(url, user, password); PreparedStatement pst = con.prepareStatement(query); ResultSet rs = pst.executeQuery()) {

           

            while (rs.next()) {
                String numMedoc = rs.getString("numMedoc");
                String designMedoc = rs.getString("designMedoc");
                // Concaténez le numéro de médicament avec la désignation
                MedocComboBox10.addItem(numMedoc + " - " + designMedoc);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erreur lors du chargement des médicaments : " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }
  private void chargerMedocs8() {
        String query = "SELECT numMedoc, designMedoc FROM medoc";

        try (Connection con = DriverManager.getConnection(url, user, password); PreparedStatement pst = con.prepareStatement(query); ResultSet rs = pst.executeQuery()) {

           

            while (rs.next()) {
                String numMedoc = rs.getString("numMedoc");
                String designMedoc = rs.getString("designMedoc");
                // Concaténez le numéro de médicament avec la désignation
                MedocComboBox8.addItem(numMedoc + " - " + designMedoc);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erreur lors du chargement des médicaments : " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }
  private void chargerMedocs11() {
        String query = "SELECT numMedoc, designMedoc FROM medoc";

        try (Connection con = DriverManager.getConnection(url, user, password); PreparedStatement pst = con.prepareStatement(query); ResultSet rs = pst.executeQuery()) {

           

            while (rs.next()) {
                String numMedoc = rs.getString("numMedoc");
                String designMedoc = rs.getString("designMedoc");
                // Concaténez le numéro de médicament avec la désignation
                MedocComboBox11.addItem(numMedoc + " - " + designMedoc);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erreur lors du chargement des médicaments : " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }
    public formAchatAjout1(FormAchat parentForm) {
         this.parentForm = parentForm;
        initComponents();
    chargerMedocs();
    chargerMedocs1();
    chargerMedocs2();
    chargerMedocs3();
    chargerMedocs4();
    chargerMedocs5();
    chargerMedocs6();
    chargerMedocs7();
    chargerMedocs8();
    chargerMedocs11();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panierAchat = new javax.swing.JPanel();
        CheckBox = new javax.swing.JCheckBox();
        qttspinner = new javax.swing.JSpinner();
        MedocComboBox = new javax.swing.JComboBox<>();
        clientText = new javax.swing.JTextField();
        ajoutBtn = new javax.swing.JButton();
        panierAchat1 = new javax.swing.JPanel();
        MedocComboBox1 = new javax.swing.JComboBox<>();
        CheckBox1 = new javax.swing.JCheckBox();
        qttspinner1 = new javax.swing.JSpinner();
        panierAchat3 = new javax.swing.JPanel();
        MedocComboBox3 = new javax.swing.JComboBox<>();
        CheckBox3 = new javax.swing.JCheckBox();
        qttspinner3 = new javax.swing.JSpinner();
        panierAchat4 = new javax.swing.JPanel();
        MedocComboBox4 = new javax.swing.JComboBox<>();
        CheckBox4 = new javax.swing.JCheckBox();
        qttspinner4 = new javax.swing.JSpinner();
        panierAchat5 = new javax.swing.JPanel();
        MedocComboBox5 = new javax.swing.JComboBox<>();
        CheckBox5 = new javax.swing.JCheckBox();
        qttspinner5 = new javax.swing.JSpinner();
        panierAchat6 = new javax.swing.JPanel();
        MedocComboBox6 = new javax.swing.JComboBox<>();
        CheckBox6 = new javax.swing.JCheckBox();
        qttspinner6 = new javax.swing.JSpinner();
        panierAchat7 = new javax.swing.JPanel();
        MedocComboBox7 = new javax.swing.JComboBox<>();
        CheckBox7 = new javax.swing.JCheckBox();
        qttspinner7 = new javax.swing.JSpinner();
        panierAchat10 = new javax.swing.JPanel();
        MedocComboBox10 = new javax.swing.JComboBox<>();
        CheckBox10 = new javax.swing.JCheckBox();
        qttspinner10 = new javax.swing.JSpinner();
        panierAchat8 = new javax.swing.JPanel();
        MedocComboBox8 = new javax.swing.JComboBox<>();
        CheckBox8 = new javax.swing.JCheckBox();
        qttspinner8 = new javax.swing.JSpinner();
        panierAchat11 = new javax.swing.JPanel();
        MedocComboBox11 = new javax.swing.JComboBox<>();
        CheckBox11 = new javax.swing.JCheckBox();
        qttspinner11 = new javax.swing.JSpinner();
        dateAchatchooser = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(60, 60, 60));
        setMaximumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(500, 500));

        panierAchat.setBackground(new java.awt.Color(60, 60, 60));

        CheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxActionPerformed(evt);
            }
        });

        MedocComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        javax.swing.GroupLayout panierAchatLayout = new javax.swing.GroupLayout(panierAchat);
        panierAchat.setLayout(panierAchatLayout);
        panierAchatLayout.setHorizontalGroup(
            panierAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panierAchatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MedocComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qttspinner, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CheckBox)
                .addGap(32, 32, 32))
        );
        panierAchatLayout.setVerticalGroup(
            panierAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panierAchatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(qttspinner)
                .addComponent(MedocComboBox))
        );

        ajoutBtn.setText("Enregistrer");
        ajoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutBtnActionPerformed(evt);
            }
        });

        panierAchat1.setBackground(new java.awt.Color(60, 60, 60));

        MedocComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        CheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panierAchat1Layout = new javax.swing.GroupLayout(panierAchat1);
        panierAchat1.setLayout(panierAchat1Layout);
        panierAchat1Layout.setHorizontalGroup(
            panierAchat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panierAchat1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MedocComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(qttspinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBox1)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panierAchat1Layout.setVerticalGroup(
            panierAchat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panierAchat1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panierAchat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(qttspinner1)
                    .addComponent(MedocComboBox1)
                    .addComponent(CheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        panierAchat3.setBackground(new java.awt.Color(60, 60, 60));

        MedocComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        CheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panierAchat3Layout = new javax.swing.GroupLayout(panierAchat3);
        panierAchat3.setLayout(panierAchat3Layout);
        panierAchat3Layout.setHorizontalGroup(
            panierAchat3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panierAchat3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MedocComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(qttspinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBox3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panierAchat3Layout.setVerticalGroup(
            panierAchat3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panierAchat3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panierAchat3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(qttspinner3)
                    .addComponent(MedocComboBox3)
                    .addComponent(CheckBox3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panierAchat4.setBackground(new java.awt.Color(60, 60, 60));

        MedocComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        CheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panierAchat4Layout = new javax.swing.GroupLayout(panierAchat4);
        panierAchat4.setLayout(panierAchat4Layout);
        panierAchat4Layout.setHorizontalGroup(
            panierAchat4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panierAchat4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MedocComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(qttspinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBox4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panierAchat4Layout.setVerticalGroup(
            panierAchat4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panierAchat4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panierAchat4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(qttspinner4)
                    .addComponent(MedocComboBox4)
                    .addComponent(CheckBox4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panierAchat5.setBackground(new java.awt.Color(60, 60, 60));

        MedocComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        CheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panierAchat5Layout = new javax.swing.GroupLayout(panierAchat5);
        panierAchat5.setLayout(panierAchat5Layout);
        panierAchat5Layout.setHorizontalGroup(
            panierAchat5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panierAchat5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MedocComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(qttspinner5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBox5))
        );
        panierAchat5Layout.setVerticalGroup(
            panierAchat5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panierAchat5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panierAchat5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(qttspinner5)
                    .addComponent(MedocComboBox5)
                    .addComponent(CheckBox5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panierAchat6.setBackground(new java.awt.Color(60, 60, 60));

        MedocComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        CheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panierAchat6Layout = new javax.swing.GroupLayout(panierAchat6);
        panierAchat6.setLayout(panierAchat6Layout);
        panierAchat6Layout.setHorizontalGroup(
            panierAchat6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panierAchat6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MedocComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(qttspinner6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBox6))
        );
        panierAchat6Layout.setVerticalGroup(
            panierAchat6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panierAchat6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panierAchat6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(qttspinner6)
                    .addComponent(MedocComboBox6)
                    .addComponent(CheckBox6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        panierAchat7.setBackground(new java.awt.Color(60, 60, 60));

        MedocComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        CheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panierAchat7Layout = new javax.swing.GroupLayout(panierAchat7);
        panierAchat7.setLayout(panierAchat7Layout);
        panierAchat7Layout.setHorizontalGroup(
            panierAchat7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panierAchat7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MedocComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(qttspinner7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBox7))
        );
        panierAchat7Layout.setVerticalGroup(
            panierAchat7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panierAchat7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panierAchat7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(qttspinner7)
                    .addComponent(MedocComboBox7)
                    .addComponent(CheckBox7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panierAchat10.setBackground(new java.awt.Color(60, 60, 60));

        MedocComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        CheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox10ActionPerformed(evt);
            }
        });

        panierAchat8.setBackground(new java.awt.Color(60, 60, 60));

        MedocComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        CheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panierAchat8Layout = new javax.swing.GroupLayout(panierAchat8);
        panierAchat8.setLayout(panierAchat8Layout);
        panierAchat8Layout.setHorizontalGroup(
            panierAchat8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panierAchat8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MedocComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(qttspinner8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBox8))
        );
        panierAchat8Layout.setVerticalGroup(
            panierAchat8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panierAchat8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panierAchat8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(qttspinner8)
                    .addComponent(MedocComboBox8)
                    .addComponent(CheckBox8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panierAchat10Layout = new javax.swing.GroupLayout(panierAchat10);
        panierAchat10.setLayout(panierAchat10Layout);
        panierAchat10Layout.setHorizontalGroup(
            panierAchat10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panierAchat10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panierAchat10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panierAchat10Layout.createSequentialGroup()
                        .addComponent(MedocComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(qttspinner10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CheckBox10))
                    .addComponent(panierAchat8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panierAchat10Layout.setVerticalGroup(
            panierAchat10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panierAchat10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panierAchat10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(qttspinner10)
                    .addComponent(MedocComboBox10)
                    .addComponent(CheckBox10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panierAchat8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panierAchat11.setBackground(new java.awt.Color(60, 60, 60));

        MedocComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        CheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panierAchat11Layout = new javax.swing.GroupLayout(panierAchat11);
        panierAchat11.setLayout(panierAchat11Layout);
        panierAchat11Layout.setHorizontalGroup(
            panierAchat11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panierAchat11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MedocComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(qttspinner11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBox11))
        );
        panierAchat11Layout.setVerticalGroup(
            panierAchat11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panierAchat11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panierAchat11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(qttspinner11)
                    .addComponent(MedocComboBox11)
                    .addComponent(CheckBox11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panierAchat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panierAchat4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panierAchat6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panierAchat5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panierAchat10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panierAchat7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ajoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panierAchat11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panierAchat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panierAchat, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dateAchatchooser, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(clientText))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(clientText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dateAchatchooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(panierAchat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panierAchat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panierAchat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panierAchat4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panierAchat5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panierAchat6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panierAchat7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panierAchat10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panierAchat11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ajoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxActionPerformed
        if (CheckBox.isSelected()) {
        String client = clientText.getText();
        String medication = (String) MedocComboBox.getSelectedItem();
        int quantity = (int) qttspinner.getValue();
        Date date = dateAchatchooser.getDate();

        // Formatter la date au format "yyyy-MM-dd"
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(date);

        // Diviser la chaîne medication en numéro de médicament et désignation
        String[] parts = medication.split(" - ");
        String numMedoc = parts[0];
        String designMedoc = parts[1];

        // Insérer les données dans la base de données
        insererAchat(numMedoc, client, quantity, formattedDate);
        FormAchat formAchat = new FormAchat();
        formAchat.chargerAchat();
        // Construire le message avec les informations récupérées
        StringBuilder message = new StringBuilder();
        message.append("Client: ").append(client).append("\n");
        message.append("Numéro de médicament: ").append(numMedoc).append("\n");
        message.append("Désignation de médicament: ").append(designMedoc).append("\n");
        message.append("Quantité: ").append(quantity).append("\n");
        message.append("Date d'achat: ").append(formattedDate).append("\n");

        // Afficher le message dans une boîte de dialogue
       // JOptionPane.showMessageDialog(this, message.toString(), "Informations d'achat", JOptionPane.INFORMATION_MESSAGE);
     
        
    }
    }//GEN-LAST:event_CheckBoxActionPerformed

    private void CheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox1ActionPerformed
       if (CheckBox1.isSelected()) {
        String client = clientText.getText();
        String medication = (String) MedocComboBox1.getSelectedItem();
        int quantity = (int) qttspinner1.getValue();
        Date date = dateAchatchooser.getDate();

        // Formatter la date au format "yyyy-MM-dd"
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(date);

        // Diviser la chaîne medication en numéro de médicament et désignation
        String[] parts = medication.split(" - ");
        String numMedoc = parts[0];
        String designMedoc = parts[1];

        // Insérer les données dans la base de données
        insererAchat(numMedoc, client, quantity, formattedDate);
        FormAchat formAchat = new FormAchat();
        formAchat.chargerAchat();
        // Construire le message avec les informations récupérées
        StringBuilder message = new StringBuilder();
        message.append("Client: ").append(client).append("\n");
        message.append("Numéro de médicament: ").append(numMedoc).append("\n");
        message.append("Désignation de médicament: ").append(designMedoc).append("\n");
        message.append("Quantité: ").append(quantity).append("\n");
        message.append("Date d'achat: ").append(formattedDate).append("\n");

        // Afficher le message dans une boîte de dialogue
       // JOptionPane.showMessageDialog(this, message.toString(), "Informations d'achat", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_CheckBox1ActionPerformed
    }
    private void CheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox3ActionPerformed
       if (CheckBox3.isSelected()) {
        String client = clientText.getText();
        String medication = (String) MedocComboBox3.getSelectedItem();
        int quantity = (int) qttspinner3.getValue();
        Date date = dateAchatchooser.getDate();

        // Formatter la date au format "yyyy-MM-dd"
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(date);

        // Diviser la chaîne medication en numéro de médicament et désignation
        String[] parts = medication.split(" - ");
        String numMedoc = parts[0];
        String designMedoc = parts[1];

        // Insérer les données dans la base de données
        insererAchat(numMedoc, client, quantity, formattedDate);
        FormAchat formAchat = new FormAchat();
        formAchat.chargerAchat();
        // Construire le message avec les informations récupérées
        StringBuilder message = new StringBuilder();
        message.append("Client: ").append(client).append("\n");
        message.append("Numéro de médicament: ").append(numMedoc).append("\n");
        message.append("Désignation de médicament: ").append(designMedoc).append("\n");
        message.append("Quantité: ").append(quantity).append("\n");
        message.append("Date d'achat: ").append(formattedDate).append("\n");

        // Afficher le message dans une boîte de dialogue
      //  JOptionPane.showMessageDialog(this, message.toString(), "Informations d'achat", JOptionPane.INFORMATION_MESSAGE);
    }    
    }//GEN-LAST:event_CheckBox3ActionPerformed

    private void CheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox4ActionPerformed
        if (CheckBox4.isSelected()) {
        String client = clientText.getText();
        String medication = (String) MedocComboBox4.getSelectedItem();
        int quantity = (int) qttspinner4.getValue();
        Date date = dateAchatchooser.getDate();

        // Formatter la date au format "yyyy-MM-dd"
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(date);

        // Diviser la chaîne medication en numéro de médicament et désignation
        String[] parts = medication.split(" - ");
        String numMedoc = parts[0];
        String designMedoc = parts[1];

        // Insérer les données dans la base de données
        insererAchat(numMedoc, client, quantity, formattedDate);
        FormAchat formAchat = new FormAchat();
        formAchat.chargerAchat();
        // Construire le message avec les informations récupérées
        StringBuilder message = new StringBuilder();
        message.append("Client: ").append(client).append("\n");
        message.append("Numéro de médicament: ").append(numMedoc).append("\n");
        message.append("Désignation de médicament: ").append(designMedoc).append("\n");
        message.append("Quantité: ").append(quantity).append("\n");
        message.append("Date d'achat: ").append(formattedDate).append("\n");

        // Afficher le message dans une boîte de dialogue
      //  JOptionPane.showMessageDialog(this, message.toString(), "Informations d'achat", JOptionPane.INFORMATION_MESSAGE);
    }    
    }//GEN-LAST:event_CheckBox4ActionPerformed

    private void CheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox5ActionPerformed
      if (CheckBox5.isSelected()) {
        String client = clientText.getText();
        String medication = (String) MedocComboBox5.getSelectedItem();
        int quantity = (int) qttspinner5.getValue();
        Date date = dateAchatchooser.getDate();

        // Formatter la date au format "yyyy-MM-dd"
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(date);

        // Diviser la chaîne medication en numéro de médicament et désignation
        String[] parts = medication.split(" - ");
        String numMedoc = parts[0];
        String designMedoc = parts[1];

        // Insérer les données dans la base de données
        insererAchat(numMedoc, client, quantity, formattedDate);
        FormAchat formAchat = new FormAchat();
        formAchat.chargerAchat();
        // Construire le message avec les informations récupérées
        StringBuilder message = new StringBuilder();
        message.append("Client: ").append(client).append("\n");
        message.append("Numéro de médicament: ").append(numMedoc).append("\n");
        message.append("Désignation de médicament: ").append(designMedoc).append("\n");
        message.append("Quantité: ").append(quantity).append("\n");
        message.append("Date d'achat: ").append(formattedDate).append("\n");

        // Afficher le message dans une boîte de dialogue
       // JOptionPane.showMessageDialog(this, message.toString(), "Informations d'achat", JOptionPane.INFORMATION_MESSAGE);
    }    
    }//GEN-LAST:event_CheckBox5ActionPerformed

    private void CheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox6ActionPerformed
      if (CheckBox6.isSelected()) {
        String client = clientText.getText();
        String medication = (String) MedocComboBox6.getSelectedItem();
        int quantity = (int) qttspinner6.getValue();
        Date date = dateAchatchooser.getDate();

        // Formatter la date au format "yyyy-MM-dd"
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(date);

        // Diviser la chaîne medication en numéro de médicament et désignation
        String[] parts = medication.split(" - ");
        String numMedoc = parts[0];
        String designMedoc = parts[1];

        // Insérer les données dans la base de données
        insererAchat(numMedoc, client, quantity, formattedDate);
        FormAchat formAchat = new FormAchat();
        formAchat.chargerAchat();
        // Construire le message avec les informations récupérées
        StringBuilder message = new StringBuilder();
        message.append("Client: ").append(client).append("\n");
        message.append("Numéro de médicament: ").append(numMedoc).append("\n");
        message.append("Désignation de médicament: ").append(designMedoc).append("\n");
        message.append("Quantité: ").append(quantity).append("\n");
        message.append("Date d'achat: ").append(formattedDate).append("\n");

        // Afficher le message dans une boîte de dialogue
       // JOptionPane.showMessageDialog(this, message.toString(), "Informations d'achat", JOptionPane.INFORMATION_MESSAGE);
    }    
    }//GEN-LAST:event_CheckBox6ActionPerformed

    private void CheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox7ActionPerformed
     if (CheckBox7.isSelected()) {
        String client = clientText.getText();
        String medication = (String) MedocComboBox7.getSelectedItem();
        int quantity = (int) qttspinner7.getValue();
        Date date = dateAchatchooser.getDate();

        // Formatter la date au format "yyyy-MM-dd"
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(date);

        // Diviser la chaîne medication en numéro de médicament et désignation
        String[] parts = medication.split(" - ");
        String numMedoc = parts[0];
        String designMedoc = parts[1];

        // Insérer les données dans la base de données
        insererAchat(numMedoc, client, quantity, formattedDate);
        FormAchat formAchat = new FormAchat();
        formAchat.chargerAchat();
        // Construire le message avec les informations récupérées
        StringBuilder message = new StringBuilder();
        message.append("Client: ").append(client).append("\n");
        message.append("Numéro de médicament: ").append(numMedoc).append("\n");
        message.append("Désignation de médicament: ").append(designMedoc).append("\n");
        message.append("Quantité: ").append(quantity).append("\n");
        message.append("Date d'achat: ").append(formattedDate).append("\n");

        // Afficher le message dans une boîte de dialogue
       // JOptionPane.showMessageDialog(this, message.toString(), "Informations d'achat", JOptionPane.INFORMATION_MESSAGE);
    }    
    }//GEN-LAST:event_CheckBox7ActionPerformed

    private void CheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox8ActionPerformed
      if (CheckBox8.isSelected()) {
        String client = clientText.getText();
        String medication = (String) MedocComboBox8.getSelectedItem();
        int quantity = (int) qttspinner8.getValue();
        Date date = dateAchatchooser.getDate();

        // Formatter la date au format "yyyy-MM-dd"
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(date);

        // Diviser la chaîne medication en numéro de médicament et désignation
        String[] parts = medication.split(" - ");
        String numMedoc = parts[0];
        String designMedoc = parts[1];

        // Insérer les données dans la base de données
        insererAchat(numMedoc, client, quantity, formattedDate);
        FormAchat formAchat = new FormAchat();
        formAchat.chargerAchat();
        // Construire le message avec les informations récupérées
        StringBuilder message = new StringBuilder();
        message.append("Client: ").append(client).append("\n");
        message.append("Numéro de médicament: ").append(numMedoc).append("\n");
        message.append("Désignation de médicament: ").append(designMedoc).append("\n");
        message.append("Quantité: ").append(quantity).append("\n");
        message.append("Date d'achat: ").append(formattedDate).append("\n");

        // Afficher le message dans une boîte de dialogue
        JOptionPane.showMessageDialog(this, message.toString(), "Informations d'achat", JOptionPane.INFORMATION_MESSAGE);
    }    
    }//GEN-LAST:event_CheckBox8ActionPerformed

    private void CheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox10ActionPerformed
        if (CheckBox10.isSelected()) {
        String client = clientText.getText();
        String medication = (String) MedocComboBox10.getSelectedItem();
        int quantity = (int) qttspinner10.getValue();
        Date date = dateAchatchooser.getDate();

        // Formatter la date au format "yyyy-MM-dd"
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(date);

        // Diviser la chaîne medication en numéro de médicament et désignation
        String[] parts = medication.split(" - ");
        String numMedoc = parts[0];
        String designMedoc = parts[1];

        // Insérer les données dans la base de données
        insererAchat(numMedoc, client, quantity, formattedDate);
        FormAchat formAchat = new FormAchat();
        formAchat.chargerAchat();
        // Construire le message avec les informations récupérées
        StringBuilder message = new StringBuilder();
        message.append("Client: ").append(client).append("\n");
        message.append("Numéro de médicament: ").append(numMedoc).append("\n");
        message.append("Désignation de médicament: ").append(designMedoc).append("\n");
        message.append("Quantité: ").append(quantity).append("\n");
        message.append("Date d'achat: ").append(formattedDate).append("\n");

        // Afficher le message dans une boîte de dialogue
      //  JOptionPane.showMessageDialog(this, message.toString(), "Informations d'achat", JOptionPane.INFORMATION_MESSAGE);
    }    
    }//GEN-LAST:event_CheckBox10ActionPerformed

    private void CheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox11ActionPerformed
      if (CheckBox11.isSelected()) {
        String client = clientText.getText();
        String medication = (String) MedocComboBox11.getSelectedItem();
        int quantity = (int) qttspinner11.getValue();
        Date date = dateAchatchooser.getDate();

        // Formatter la date au format "yyyy-MM-dd"
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(date);

        // Diviser la chaîne medication en numéro de médicament et désignation
        String[] parts = medication.split(" - ");
        String numMedoc = parts[0];
        String designMedoc = parts[1];

        // Insérer les données dans la base de données
        insererAchat(numMedoc, client, quantity, formattedDate);
        FormAchat formAchat = new FormAchat();
        formAchat.chargerAchat();
        // Construire le message avec les informations récupérées
        StringBuilder message = new StringBuilder();
        message.append("Client: ").append(client).append("\n");
        message.append("Numéro de médicament: ").append(numMedoc).append("\n");
        message.append("Désignation de médicament: ").append(designMedoc).append("\n");
        message.append("Quantité: ").append(quantity).append("\n");
        message.append("Date d'achat: ").append(formattedDate).append("\n");

        // Afficher le message dans une boîte de dialogue
        //JOptionPane.showMessageDialog(this, message.toString(), "Informations d'achat", JOptionPane.INFORMATION_MESSAGE);
    }    
    }//GEN-LAST:event_CheckBox11ActionPerformed

    private void afficherInfosAchat(String client, String medication, int quantity, String formattedDate) {
    StringBuilder message = new StringBuilder();
    message.append("Client: ").append(client).append("\n");
    message.append("Médicament: ").append(medication).append("\n");
    message.append("Quantité: ").append(quantity).append("\n");
    message.append("Date d'achat: ").append(formattedDate).append("\n");

    JOptionPane.showMessageDialog(this, message.toString(), "Informations d'achat", JOptionPane.INFORMATION_MESSAGE);
}
    private void ajoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutBtnActionPerformed
    JOptionPane.showMessageDialog(this, "Les données ont été ajoutées avec succès !", "Succès", JOptionPane.INFORMATION_MESSAGE);
Window parentWindow = SwingUtilities.getWindowAncestor(this);
    if (parentWindow instanceof JFrame) {
        JFrame parentFrame = (JFrame) parentWindow;
        parentFrame.dispose();
    }

    // Rafraîchir le tableau d'affichage dans la page FormAchat
    if (parentForm != null) { // Vérifiez si parentForm est null
        parentForm.rafraichirTableau(); // Utilisation de la référence à la fenêtre FormAchat
    } else {
        System.out.println("Erreur : parentForm est null");
    }
    }//GEN-LAST:event_ajoutBtnActionPerformed

private void insererAchat(String numMedoc, String nomClient, int qttAchat, String dateAchat) {
    String queryInsert = "INSERT INTO achat (numMedoc, nomClient, qttAchat, dateAchat) VALUES (?, ?, ?, ?)";
    String queryUpdate = "UPDATE medoc SET stockMedoc = stockMedoc - ? WHERE numMedoc = ?";
    
    try (Connection con = DriverManager.getConnection(url, user, password)) {
        con.setAutoCommit(false); // Début de la transaction
        
        // Insertion dans la table achat
        try (PreparedStatement pstInsert = con.prepareStatement(queryInsert)) {
            pstInsert.setString(1, numMedoc);
            pstInsert.setString(2, nomClient);
            pstInsert.setInt(3, qttAchat);
            pstInsert.setString(4, dateAchat);
            
            pstInsert.executeUpdate();
            System.out.println("Données insérées avec succès dans la table achat.");
        } catch (SQLException ex) {
            con.rollback(); // Annulation de la transaction en cas d'erreur
            ex.printStackTrace(); // Gérer l'erreur d'insertion
            return;
        }
        
        // Mise à jour du stock dans la table medoc
        try (PreparedStatement pstUpdate = con.prepareStatement(queryUpdate)) {
            pstUpdate.setInt(1, qttAchat);
            pstUpdate.setString(2, numMedoc);
            
            pstUpdate.executeUpdate();
            System.out.println("Stock mis à jour avec succès dans la table medoc.");
            
            con.commit(); // Fin de la transaction avec succès
        } catch (SQLException ex) {
            con.rollback(); // Annulation de la transaction en cas d'erreur
            ex.printStackTrace(); // Gérer l'erreur de mise à jour
        }
    } catch (SQLException ex) {
        ex.printStackTrace(); // Gérer l'erreur de connexion à la base de données
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBox;
    private javax.swing.JCheckBox CheckBox1;
    private javax.swing.JCheckBox CheckBox10;
    private javax.swing.JCheckBox CheckBox11;
    private javax.swing.JCheckBox CheckBox3;
    private javax.swing.JCheckBox CheckBox4;
    private javax.swing.JCheckBox CheckBox5;
    private javax.swing.JCheckBox CheckBox6;
    private javax.swing.JCheckBox CheckBox7;
    private javax.swing.JCheckBox CheckBox8;
    private javax.swing.JComboBox<String> MedocComboBox;
    private javax.swing.JComboBox<String> MedocComboBox1;
    private javax.swing.JComboBox<String> MedocComboBox10;
    private javax.swing.JComboBox<String> MedocComboBox11;
    private javax.swing.JComboBox<String> MedocComboBox3;
    private javax.swing.JComboBox<String> MedocComboBox4;
    private javax.swing.JComboBox<String> MedocComboBox5;
    private javax.swing.JComboBox<String> MedocComboBox6;
    private javax.swing.JComboBox<String> MedocComboBox7;
    private javax.swing.JComboBox<String> MedocComboBox8;
    private javax.swing.JButton ajoutBtn;
    private javax.swing.JTextField clientText;
    private com.toedter.calendar.JDateChooser dateAchatchooser;
    private javax.swing.JPanel panierAchat;
    private javax.swing.JPanel panierAchat1;
    private javax.swing.JPanel panierAchat10;
    private javax.swing.JPanel panierAchat11;
    private javax.swing.JPanel panierAchat3;
    private javax.swing.JPanel panierAchat4;
    private javax.swing.JPanel panierAchat5;
    private javax.swing.JPanel panierAchat6;
    private javax.swing.JPanel panierAchat7;
    private javax.swing.JPanel panierAchat8;
    private javax.swing.JSpinner qttspinner;
    private javax.swing.JSpinner qttspinner1;
    private javax.swing.JSpinner qttspinner10;
    private javax.swing.JSpinner qttspinner11;
    private javax.swing.JSpinner qttspinner3;
    private javax.swing.JSpinner qttspinner4;
    private javax.swing.JSpinner qttspinner5;
    private javax.swing.JSpinner qttspinner6;
    private javax.swing.JSpinner qttspinner7;
    private javax.swing.JSpinner qttspinner8;
    // End of variables declaration//GEN-END:variables
}
