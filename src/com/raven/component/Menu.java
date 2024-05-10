
package com.raven.component;

import com.raven.event.MenuEvent;
import com.raven.swing.MenuButton;
import com.raven.swing.Split;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;


public class Menu extends javax.swing.JPanel 
{
        private MenuButton selectedMenu;
        private MenuButton unSelectedMenu;
        private Animator animator;
        private MenuEvent event;
    public Menu() 
    {
        initComponents();
        setOpaque(false);
        scroll.setViewportBorder(null); scroll.setViewportBorder(null);
        scroll.setBorder(null);
        scroll.getViewport().setOpaque(false);
        panelMenu.setLayout(new MigLayout("wrap, fillx, inset 0", "[fill]"));
        TimingTarget target = new TimingTargetAdapter(){
            @Override
            public void timingEvent(float fraction){
                 selectedMenu.setAnimate(fraction);
                if (unSelectedMenu != null) {
                    unSelectedMenu.setAnimate(1f - fraction);
                }
            }
        };
        animator = new Animator(300, target);
        animator.setAcceleration(.5f);
        animator.setDeceleration(.5f);
        animator.setResolution(0);
    }
    public void intMenu(MenuEvent event)
    {
            this.event = event;
            addMenu("1", "Dashboard", 0);
            addMenu("2", "Médicaments", 1);
            addMenu("3", "Entrées", 2);
            addMenu("4", "Achats", 3);
            addMenu("5", "Rupture de stocks", 4);
            addMenu("6", "Top vente", 5);
           
      
        
    }
     private void addMenu(String icon, String text, int index)
     {
            MenuButton menu = new MenuButton(index);
          menu.setFont(menu.getFont().deriveFont(Font.BOLD, 14));

            menu.setIcon(new ImageIcon(getClass().getResource("/com/raven/icon/" + icon + ".png")));
            menu.setText("  " + text);
            menu.addActionListener(new ActionListener ()
            {
                    @Override
                    public void actionPerformed(ActionEvent ae)
                    {
                        if (!animator.isRunning()) 
                        {
                                if (menu != selectedMenu) 
                                {
                                    unSelectedMenu = selectedMenu;
                                    selectedMenu = menu;
                                    animator.start();
                                    event.menuSelected(index);
                        
                                }
                        }
                    }
            });
            panelMenu.add(menu);
     }
     
     private void split (String name)
     {
         panelMenu.add(new Split(name), "h 30");
     }
    public void setSelected(int index) 
    {
           for (Component com : panelMenu.getComponents()) 
           {
               MenuButton menu = (MenuButton) com;
               if (menu.getIndex() == index) 
               {
                   if (menu != selectedMenu) 
                   {
                       unSelectedMenu = selectedMenu;
                       selectedMenu = menu;
                       animator.start();
                       event.menuSelected(index);
                   }
                   break;
               }
           }
       }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        panelMenu = new javax.swing.JPanel();

        panelMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        panelMenu.setOpaque(false);

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 194, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        scroll.setViewportView(panelMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scroll)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelMenu;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
