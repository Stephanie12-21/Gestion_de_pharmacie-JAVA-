
package tableDark;

import com.raven.swing.scroll.ScrollBarCustom;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;

public class TableDark extends JTable 
{
    public TableDark()
    {
         getTableHeader().setDefaultRenderer(new TableHeader());
         getTableHeader().setPreferredSize(new Dimension(0, 35));
         setDefaultRenderer(Object.class, new TableCell());
         setRowHeight(30);
    }
    
    
    public void fixTable(JScrollPane scroll) {
       
        scroll.setVerticalScrollBar(new ScrollBarCustom());
       JPanel panel = new JPanel();
        panel.setBackground(new Color(30, 30, 30));
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, panel);
        scroll.getViewport().setBackground(new Color(30, 30, 30));
        scroll.setBorder(BorderFactory.createLineBorder(new Color(60, 60, 60), 2));
    }
   /* private  class TableHeader extends DefaultTableCellRenderer
    {
        @Override
        public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) 
        {
            Component com = super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1);
            com.setBackground(new Color(30, 30, 30));
            com.setForeground(new Color(200, 200, 200));
            com.setFont(com.getFont().deriveFont(Font.BOLD, 14));
            if (alignment.containsKey(i1)) {
                setHorizontalAlignment(alignment.get(i1));
            } else {
                setHorizontalAlignment(JLabel.CENTER);
            }
            return com;
        }    
    }*/
    public class TableHeader extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
        Component com = super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1);
        
        // Centrer le texte horizontalement
        ((JLabel) com).setHorizontalAlignment(JLabel.CENTER);

        // Personnalisation de la couleur de fond
        com.setBackground(new Color(30, 30, 30));

        // Personnalisation de la couleur du texte
        com.setForeground(new Color(200, 200, 200));

        // Définir une police en gras
        com.setFont(com.getFont().deriveFont(Font.BOLD, 14));

        return com;
    }
}
    /*private class TableCell extends DefaultTableCellRenderer
    {
        @Override
        public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int row, int column) {
            Component com = super.getTableCellRendererComponent(jtable, o, bln, bln1, row, column);
           if (isCellSelected(row, column)) {
                if (row % 2 == 0) {
                    com.setBackground(new Color(33, 103, 153));
                } else {
                    com.setBackground(new Color(29, 86, 127));
                }
            } else {
                if (row % 2 == 0) {
                    com.setBackground(new Color(50, 50, 50));
                } else {
                    com.setBackground(new Color(30, 30, 30));
                }
            }
             setBorder(new EmptyBorder(0, 5, 0, 5));
            com.setForeground(new Color(200, 200, 200));
            
           /* if (alignment.containsKey(column)) {
                setHorizontalAlignment(alignment.get(column));
            } else {
                setHorizontalAlignment(JLabel.LEFT);
            }
            return com;
        }
    }*/
    
    public class TableCell extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int row, int column) {
        Component com = super.getTableCellRendererComponent(jtable, o, bln, bln1, row, column);
        
        // Centrer le contenu horizontalement
        ((JLabel) com).setHorizontalAlignment(JLabel.CENTER);

        // Personnalisation de la couleur de fond en fonction de la sélection et de la parité de la ligne
        if (isCellSelected(row, column)) {
            if (row % 2 == 0) {
                com.setBackground(new Color(33, 103, 153));
            } else {
                com.setBackground(new Color(29, 86, 127));
            }
        } else {
            if (row % 2 == 0) {
                com.setBackground(new Color(50, 50, 50));
            } else {
                com.setBackground(new Color(30, 30, 30));
            }
        }

        // Supprimer la bordure par défaut et définir une marge pour améliorer l'apparence
       // com.setBorder(new EmptyBorder(0, 5, 0, 5));

        // Définir la couleur du texte
        com.setForeground(new Color(200, 200, 200));

        return com;
    }
}
}

