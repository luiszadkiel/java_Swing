package gestor_biblioteca;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.border.Border;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class administrador_biblioteca extends entradaData {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 JFrame frmBibliotecaVirtual;
	 private static administrador_biblioteca instance = null;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private buscador frameBus;
	private editor frameEdit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					administrador_biblioteca ventana = administrador_biblioteca.getInstance();
					ventana.frmBibliotecaVirtual.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public administrador_biblioteca() {
		initialize();
	}
	// patronde diseno singleton
	 public static administrador_biblioteca getInstance() {
	        if (instance == null) {
	            instance = new administrador_biblioteca();
	        }
	        return instance;
	    }

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBibliotecaVirtual = new JFrame();
		frmBibliotecaVirtual.setTitle("Biblioteca Virtual");
		frmBibliotecaVirtual.getContentPane().setBackground(new Color(85, 107, 47));
		frmBibliotecaVirtual.setBounds(100, 100, 931, 460);
		frmBibliotecaVirtual.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBibliotecaVirtual.getContentPane().setLayout(null);
		
		 // Crear el JLabel con texto
        JLabel lblNewLabel = new JLabel("BIBLIOTECA VIRTUAL", JLabel.CENTER);
        
     
        // Configurar el JLabel para mostrar el texto encima de la imagen
        lblNewLabel.setHorizontalTextPosition(JLabel.CENTER);
        lblNewLabel.setVerticalTextPosition(JLabel.CENTER);
        lblNewLabel.setForeground(new Color(0, 0, 0));
        Border borde = BorderFactory.createLineBorder(Color.black, 1);
        lblNewLabel.setBorder(borde);
        lblNewLabel.setFont(new Font("Sitka Small", Font.PLAIN, 48));
        lblNewLabel.setBounds(10, 30, 895, 98); // Ajusta el tamaño para abarcar toda la imagen
        frmBibliotecaVirtual.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cantidad de Libros");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(187, 139, 109, 14);
		frmBibliotecaVirtual.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(337, 136, 93, 20);
		textField.setEditable(false);
		frmBibliotecaVirtual.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Disponibles");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setBounds(461, 139, 109, 14);
		frmBibliotecaVirtual.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(571, 136, 93, 20);
		textField_1.setEditable(false);
		frmBibliotecaVirtual.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Rentados");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setBounds(719, 139, 93, 14);
		frmBibliotecaVirtual.getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(812, 136, 93, 20);
		textField_2.setEditable(false);
		frmBibliotecaVirtual.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(new Color(85, 107, 47));
		panel.setBounds(187, 161, 718, 227);
		frmBibliotecaVirtual.getContentPane().add(panel);
		panel.setLayout(null);
		
		 // Crear la tabla y su modelo
        table = new JTable();
        table.setModel(new DefaultTableModel(
                new Object[][] {},
                new String[] { "Nombre", "Código", "Autor", "Categoría", "Condición", "Estado", "Precio" }
        ));
        table.getColumnModel().getColumn(0).setPreferredWidth(98);
        table.getColumnModel().getColumn(1).setPreferredWidth(109);
        table.getColumnModel().getColumn(2).setPreferredWidth(84);
        table.getColumnModel().getColumn(3).setPreferredWidth(183);
        table.getColumnModel().getColumn(4).setPreferredWidth(82);
        // Repintamos la tabla para reflejar los cambios
        table.repaint();
	
		// Crea un JScrollPane y agrega la tabla a él
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 11, 698, 205); // Opcional, puedes ajustar el tamaño y posición del scroll pane

		// Añade el JScrollPane al panel
		panel.add(scrollPane);
		
		JLabel lblNewLabel_4 = new JLabel("     RENTAR");
		lblNewLabel_4.setFont(new Font("Sitka Small", Font.PLAIN, 24));
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setBounds(10, 161, 167, 29);
		frmBibliotecaVirtual.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Libro");
		lblNewLabel_5.setForeground(new Color(0, 0, 0));
		lblNewLabel_5.setBounds(10, 190, 165, 14);
		frmBibliotecaVirtual.getContentPane().add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 212, 165, 20);
		textField_3.setEditable(false);
		frmBibliotecaVirtual.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Autor");
		lblNewLabel_6.setForeground(new Color(0, 0, 0));
		
		lblNewLabel_6.setBounds(10, 243, 46, 14);
		frmBibliotecaVirtual.getContentPane().add(lblNewLabel_6);
		
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 267, 165, 20);
		textField_4.setEditable(false);

		frmBibliotecaVirtual.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(10, 320, 96, 20);
		textField_5.setEditable(false);
		frmBibliotecaVirtual.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Precio de renta");
		lblNewLabel_7.setForeground(new Color(0, 0, 0));
		lblNewLabel_7.setBounds(10, 297, 167, 14);
		frmBibliotecaVirtual.getContentPane().add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("RENTAR");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(7, 351, 170, 37);
		frmBibliotecaVirtual.getContentPane().add(btnNewButton);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setMargin(new Insets(2, 2, 2, 2));
		menuBar.setForeground(new Color(255, 0, 0));
		menuBar.setBackground(new Color(255, 255, 255));
		frmBibliotecaVirtual.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Libro");
		mnNewMenu.setForeground(new Color(0, 0, 0));
		menuBar.add(mnNewMenu);
		
		frameBus = new buscador();
		
		
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Agregar");
		mnNewMenu.add(mntmNewMenuItem);

		// Add action listener to the menu item
		mntmNewMenuItem.addActionListener(new ActionListener() {
		
		  public void actionPerformed(ActionEvent e) {
			  entradaData framedata = new entradaData();
			  framedata.setVisible(true);
		  }
		});


		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Buscar");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		// Add action listener to the menu item
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
		
		  public void actionPerformed(ActionEvent e) {
			  frameBus.setVisible(true);
		  }
		});

		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Eliminar");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		frameEdit = new editor();
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Editar");
		// Add action listener to the menu item
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
				
				  public void actionPerformed(ActionEvent e) {
					  frameEdit.setVisible(true);
				  }
				});
		
		
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_1 = new JMenu("Archivo");
		mnNewMenu_1.setForeground(new Color(0, 0, 0));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Mostrar archivos");
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_2 = new JMenu("Ayuda");
		mnNewMenu_2.setForeground(new Color(0, 0, 0));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Configuracion");
		mnNewMenu_2.add(mntmNewMenuItem_5);
	}
	
	  // Método donde intentas agregar filas a la tabla
    public void agregarFilaATabla(Object[] rowData) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(rowData);
        
        // Notifica a la JTable que se han realizado cambios en el modelo
        model.fireTableDataChanged();
        
    
        
    }

}
