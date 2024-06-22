package tarea_swing;

import java.awt.BorderLayout; 
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ListSelectionListener;
import java.awt.event.*;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorListener;
import javax.swing.event.ListSelectionEvent;


public class Ventana1 {
    JFrame ventana;
    JLabel label, label_f, label_e, label_t, lab_1,lab_2,lab_3, label_end ;
    JPanel panel, panel2, panel_medi,panel_medi1,panel_medi2,pane1,subpane1,subpane2, pane_chek, pane_fuen,pane_est,pane_tam, 
    subpane3, paneeL1,paneeL2,paneeL3, panelEND ;
    JButton boton1, boton2, boton3;
    JCheckBox checkBox;

    // Método para configurar la ventana
    void configurarVentana() {
        ventana = new JFrame();
        ventana.setTitle("jlabel1 [JLabel] - font");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(535, 438);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(new BorderLayout());

        // Crear un panel con un FlowLayout alineado a la izquierda
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.setBackground(Color.LIGHT_GRAY);
        
        pane_chek = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pane_chek.setBackground(Color.LIGHT_GRAY);
        
        pane_fuen = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pane_fuen.setBackground(Color.LIGHT_GRAY);
        
        pane_est = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pane_est.setBackground(Color.LIGHT_GRAY);
        
        pane_tam = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pane_tam.setBackground(Color.LIGHT_GRAY);
        
        // panel2
        JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panel2.setBackground(Color.LIGHT_GRAY);
        
        // panel del medio
        JPanel panel_medio = new JPanel();
        panel_medio.setLayout(new BorderLayout());
        panel_medio.setBackground(Color.ORANGE);       

        
        // paneles dentro del panel del medio
        panel_medi1 = new JPanel();
        panel_medi1.setLayout(
			new BoxLayout(panel_medi1,BoxLayout.Y_AXIS)
				);
        panel_medi1.setBackground(Color.lightGray);
        //panel_medi1.setBorder((border));
        EmptyBorder border = new EmptyBorder(10, 10, 10, 10);
        panel_medi1.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.gray, 2), border));
       
        
        // paneles dentro del panel del medio2
        panel_medi2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel_medi2.setBackground(Color.yellow);
        
        
        // panelitos 
        pane1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pane1.setBackground(Color.lightGray);
        
        
        
        
        
        //----------------------------------------------
        subpane1 = new JPanel();
        subpane1.setLayout(
			new BoxLayout(subpane1,BoxLayout.Y_AXIS)
				);
        subpane1.setBackground(Color.lightGray);
        //---------------------------------------------------
        subpane2 = new JPanel();
        subpane2.setLayout(
    			new BoxLayout(subpane2,BoxLayout.Y_AXIS)
    				);
        subpane2.setBackground(Color.lightGray);
        //---------------------------------------------------
        subpane3 = new JPanel();
        subpane3.setLayout(
    			new BoxLayout(subpane3,BoxLayout.Y_AXIS)
    				);
        subpane3.setBackground(Color.lightGray);
        
        //Panel final
        panelEND = new JPanel();
        panelEND.setBackground(Color.lightGray);
        
        
        // panel label
        paneeL1 = new JPanel();
        paneeL1.setLayout(
        		new FlowLayout(FlowLayout.LEFT,0,0));
        paneeL1.setBackground(Color.LIGHT_GRAY);
        
        paneeL2 = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));
        paneeL2.setBackground(Color.LIGHT_GRAY);
        
        paneeL3 = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));
        paneeL3.setBackground(Color.LIGHT_GRAY);
       
        // crear botones
        boton1 = new JButton("Aceptar");
        boton2 = new JButton("Cancelar");
        boton3 = new JButton("Ayuda");

        panel2.add(boton1);
        panel2.add(boton2);
        panel2.add(boton3);
        
        


        // Establecer el label
        label = new JLabel("Establecer propiedad Jlabel's font utilizando:");
        label.setBackground(Color.LIGHT_GRAY);
        
        
        
        label_end = new JLabel("The quick fox jumps over the lazy dog");
        Font boldFont = new Font("Dialog", Font.BOLD, 24); // Adjust font name, size, and style as needed
        label_end.setFont(boldFont);
        label_end.setBorder(BorderFactory.createLineBorder(Color.black,5, true));
        label_end.setBorder(BorderFactory.createTitledBorder("Vista Previa")); 
        panelEND.add(label_end);

       
        panel.add(label);
        label_f = new JLabel("Fuente:");
        pane_fuen.add(label_f);
        subpane1.add(pane_fuen);
        
        label_e = new JLabel("Estilo fuente:");
        pane_est.add(label_e);
        subpane2.add(pane_est);
        
        label_t = new JLabel("Tamano:");
        pane_tam.add(label_t);
        subpane3.add(pane_tam);
        //----------------------------------------------------fuente de abajo
     // Text field for fuente (Fuente)
        JTextField txtFuente = new JTextField(40); // Size: 20 characters
        paneeL1.add(txtFuente); // Add to panel
        paneeL1.setPreferredSize(new Dimension(240, 27)); // Maintain dimensions

        // Text field for estilo de fuente (Estilo de Fuente)
        JTextField txtEstiloFuente = new JTextField(20); // Size: 20 characters
        paneeL2.add(txtEstiloFuente); // Add to panel
        paneeL2.setPreferredSize(new Dimension(150, 27)); // Maintain dimensions

        // Text field for tamano (Tamano)
        JTextField txtTamano = new JTextField(5); // Size: 5 characters (assuming only numbers)
        paneeL3.add(txtTamano); // Add to panel
        paneeL3.setPreferredSize(new Dimension(80, 27)); // Maintain dimensions




        // Crear un JComboBox
        String[] editor = {"Editor predeterminado"};
        JComboBox<String> comboBox = new JComboBox<>(editor);
        comboBox.setPreferredSize(new Dimension(250, 20)); // Establecer tamaño preferido
        panel.add(comboBox);
        
        //Crear chebox
        checkBox = new JCheckBox("Obtener el tipo de letra apartir de de letra predesterminado");
        checkBox.setBackground(Color.LIGHT_GRAY);
        

        
        
        //listas
     // Create JLists with initial elements
        String[] fuentes = {
                "Arial", "Times New Roman", "Calibri", "Verdana", "Courier New",
                "Georgia", "Garamond", "Comic Sans MS", "Trebuchet MS", "Arial Black",
                "Impact", "Lucida Console", "Tahoma", "Palatino Linotype", "Segoe UI",
                "Helvetica", "Franklin Gothic Medium", "Century Gothic", "Consolas", "Gill Sans"
            };
        
        String[] fuentesYFormatos = {
                "Negrita", "Cursiva", "Negrita Cursiva"
            };
        String[] tamanos = new String[90];
        for (int i = 0; i < 90; i++) {
            tamanos[i] = " " + (i + 1);
        }
        
        
        
        
        JList<String> lista1 = new JList<>(fuentes);
        JList<String> lista2 = new JList<>(fuentesYFormatos);
        JList<String> lista3 = new JList<>(tamanos);

        // Set preferred size for each JList (optional, adjust as needed)
        //lista1.setPreferredSize(new Dimension(200, 150));
        //lista2.setPreferredSize(new Dimension(150, 150));
        //lista3.setPreferredSize(new Dimension(84, 150));

        // Create JScrollPanes to wrap each JList and enable scrolling
        JScrollPane scrollPane1 = new JScrollPane(lista1);
        JScrollPane scrollPane2 = new JScrollPane(lista2);
        JScrollPane scrollPane3 = new JScrollPane(lista3);

        // (Optional) Set scrollbar policy (e.g., always show vertical scrollbar)
        scrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane3.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        // Añadir a los paneles
        ventana.add(panel, BorderLayout.NORTH);
        ventana.add(panel2, BorderLayout.SOUTH);
        ventana.add(panel_medio, BorderLayout.CENTER);
        
        panel_medio.add(panel_medi1,BorderLayout.NORTH);
        pane_chek.add(checkBox);
        panel_medi1.add(pane_chek);
        panel_medio.add(panel_medi2);
        
        panel_medi1.add(pane1);
        
        pane1.add(subpane1);
        pane1.add(subpane2);
        pane1.add(subpane3);
        
        subpane1.add(paneeL1);
        subpane2.add(paneeL2);
        subpane3.add(paneeL3);
        
        // agregar lista
        subpane1.add(scrollPane1);
        subpane2.add(scrollPane2);
        subpane3.add(scrollPane3);
        
        // panel final
        panel_medi1.add(panelEND);
       

        lista1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String elementoSeleccionado = (String) lista1.getSelectedValue();
                txtFuente.setText(elementoSeleccionado);
            }
        });
     
        lista2.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String elementoSeleccionado = (String) lista2.getSelectedValue();
                txtEstiloFuente.setText(elementoSeleccionado);
            }
        });
     
        lista3.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String elementoSeleccionado = (String) lista3.getSelectedValue();
                txtTamano.setText(elementoSeleccionado);
            }
        });
     

    }

    // Constructor para iniciar la ventana
    public Ventana1() {
        configurarVentana();
        ventana.setVisible(true);
    }
	
}

