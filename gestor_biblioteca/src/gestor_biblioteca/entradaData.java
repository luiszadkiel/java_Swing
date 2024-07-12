package gestor_biblioteca;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.ButtonGroup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import clases_biblioteca.libro;


public class entradaData extends JFrame  {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTable table;
     DefaultTableModel model;
    private libro nuevoLibro;



    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    entradaData framedata = new entradaData();
                    framedata.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public entradaData() {
    	// Inicialización del ArrayList en el constructor
    
        setType(Type.UTILITY);
        setTitle("Agregar Nuevo Libro");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 666, 381);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(85, 107, 47));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("NEW BOOK");
        lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
        Border borde = BorderFactory.createLineBorder(Color.black, 1);
        lblNewLabel.setBorder(borde);
        lblNewLabel.setForeground(new Color(0, 0, 0));
        lblNewLabel.setFont(new Font("Sitka Small", Font.PLAIN, 51));
        lblNewLabel.setBounds(27, 30, 601, 75);
        contentPane.add(lblNewLabel);

        textField = new JTextField();
        textField.setBounds(27, 141, 220, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("Nombre");
        lblNewLabel_1.setForeground(new Color(0, 0, 0));
        lblNewLabel_1.setBounds(27, 116, 210, 14);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Codigo del libro");
        lblNewLabel_2.setForeground(new Color(0, 0, 0));
        lblNewLabel_2.setBounds(27, 172, 210, 14);
        contentPane.add(lblNewLabel_2);

        textField_1 = new JTextField();
        textField_1.setBounds(27, 197, 220, 20);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        String[] categorias = {
            "INDEFINIDA",
            "Ficción",
            "No ficción",
            "Misterio y suspense",
            "Ciencia ficción y fantasía",
            "Romance",
            "Historia",
            "Biografías y memorias",
            "Ciencia y tecnología",
            "Arte y música",
            "Filosofía y religión",
            "Política y sociedad",
            "Negocios y economía",
            "Salud y bienestar",
            "Viajes y aventuras"
        };

        JComboBox<String> comboBox = new JComboBox<>(categorias);
        comboBox.setBounds(320, 140, 224, 22);
        contentPane.add(comboBox);

        JLabel lblNewLabel_3 = new JLabel("Categoria");
        lblNewLabel_3.setForeground(new Color(0, 0, 0));
        lblNewLabel_3.setBounds(320, 116, 172, 14);
        contentPane.add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("Agregar autor");
        lblNewLabel_4.setForeground(new Color(0, 0, 0));
        lblNewLabel_4.setBounds(27, 228, 214, 14);
        contentPane.add(lblNewLabel_4);

        textField_2 = new JTextField();
        textField_2.setBounds(27, 253, 220, 20);
        contentPane.add(textField_2);
        textField_2.setColumns(10);

        JButton btnNewButton = new JButton("Agregar");
        btnNewButton.setBounds(539, 295, 89, 23);
        contentPane.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Cancelar");
        btnNewButton_1.setBounds(421, 295, 89, 23);
        contentPane.add(btnNewButton_1);

        JRadioButton rdbtnNewRadioButton = new JRadioButton("Usado");
        rdbtnNewRadioButton.setForeground(new Color(0, 0, 0));
        rdbtnNewRadioButton.setBackground(new Color(85, 107, 47));
        rdbtnNewRadioButton.setBounds(320, 198, 84, 18);
        contentPane.add(rdbtnNewRadioButton);

        JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Semi - Usado");
        rdbtnNewRadioButton_1.setForeground(new Color(0, 0, 0));
        rdbtnNewRadioButton_1.setBackground(new Color(85, 107, 47));
        rdbtnNewRadioButton_1.setBounds(416, 198, 115, 18);
        contentPane.add(rdbtnNewRadioButton_1);

        JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Nuevo");
        rdbtnNewRadioButton_2.setForeground(new Color(0, 0, 0));
        rdbtnNewRadioButton_2.setBackground(new Color(85, 107, 47));
        rdbtnNewRadioButton_2.setBounds(320, 226, 115, 18);
        contentPane.add(rdbtnNewRadioButton_2);

        ButtonGroup estadoGroup = new ButtonGroup();
        estadoGroup.add(rdbtnNewRadioButton);
        estadoGroup.add(rdbtnNewRadioButton_1);
        estadoGroup.add(rdbtnNewRadioButton_2);

        JLabel lblNewLabel_5 = new JLabel("Precio de Renta");
        lblNewLabel_5.setForeground(new Color(0, 0, 0));
        lblNewLabel_5.setBounds(27, 278, 220, 16);
        contentPane.add(lblNewLabel_5);

        textField_3 = new JTextField();
        textField_3.setBounds(27, 296, 220, 20);
        contentPane.add(textField_3);
        textField_3.setColumns(10);
        
        

        // ActionListener para el botón "Agregar"
        btnNewButton.addActionListener(new ActionListener() {
            private Object window;

			public void actionPerformed(ActionEvent e) {
            
                    String titulo = textField.getText();
                    String codigo_libro = textField_1.getText();
                    String autor = textField_2.getText();
                    String categoria = (String) comboBox.getSelectedItem();
                    boolean estado = rdbtnNewRadioButton.isSelected() || rdbtnNewRadioButton_1.isSelected() || rdbtnNewRadioButton_2.isSelected();
                    double precio_renta = Double.parseDouble(textField_3.getText());

                    nuevoLibro = new libro(titulo, autor, categoria, codigo_libro, categoria, estado, precio_renta);
                     Object[] rowData = {titulo, codigo_libro, autor, categoria, estado ? "Usado" : "Nuevo", precio_renta};
                   // model.addRow(rowData);
                     administrador_biblioteca ventana = administrador_biblioteca.getInstance();
                     ventana.agregarFilaATabla(rowData);
               
            }
        });

        // ActionListener para el botón "Cancelar"
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }


}
