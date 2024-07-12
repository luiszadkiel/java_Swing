package gestor_biblioteca;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JSeparator;

public class editor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					editor frame = new editor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public editor() {
		setType(Type.UTILITY);
		setTitle("Editor");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 756, 425);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(85, 107, 47));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		
		JLabel lblNewLabel = new JLabel("Editor");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Sitka Small", Font.PLAIN, 48));
		   lblNewLabel.setBorder(new LineBorder(Color.black, 2)); 
		   // Borde de 2 píxeles de color rojo		  lblNewLabel.setFont(new Font("Sitka Small", Font.PLAIN, 22));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(492, 11, 238, 73);
		
		contentPane.add(lblNewLabel);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese el codigo del libro que desea editar:");
		lblNewLabel_1.setFont(new Font("Sitka Small", Font.PLAIN, 18));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBounds(10, 28, 436, 20);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(10, 53, 193, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBounds(10, 114, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 139, 149, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Codigo del libro");
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setBounds(10, 170, 149, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 193, 149, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Agregar autor");
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setBounds(10, 224, 149, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 250, 149, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Categoria");
		lblNewLabel_5.setForeground(new Color(0, 0, 0));
		lblNewLabel_5.setBounds(10, 335, 206, 14);
		contentPane.add(lblNewLabel_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 354, 238, 22);
		contentPane.add(comboBox);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Semi-usado");
		rdbtnNewRadioButton.setForeground(new Color(0, 0, 0));
		rdbtnNewRadioButton.setBackground(new Color(85, 107, 47));
		rdbtnNewRadioButton.setBounds(299, 138, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Nuevo");
		rdbtnNewRadioButton_1.setForeground(new Color(0, 0, 0));
		rdbtnNewRadioButton_1.setBackground(new Color(85, 107, 47));
		rdbtnNewRadioButton_1.setBounds(182, 138, 115, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Usado");
		rdbtnNewRadioButton_2.setForeground(new Color(0, 0, 0));
		rdbtnNewRadioButton_2.setBackground(new Color(85, 107, 47));
		rdbtnNewRadioButton_2.setBounds(410, 138, 115, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_6 = new JLabel("Precio");
		lblNewLabel_6.setForeground(new Color(0, 0, 0));
		lblNewLabel_6.setBounds(10, 282, 128, 14);
		contentPane.add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 300, 149, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("Guardar cambios");
		btnNewButton.setBounds(588, 335, 142, 42);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_7 = new JLabel("Condicion");
		lblNewLabel_7.setForeground(new Color(0, 0, 0));
		lblNewLabel_7.setBounds(182, 114, 347, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Estado");
		lblNewLabel_8.setForeground(new Color(0, 0, 0));
		lblNewLabel_8.setBounds(182, 170, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Disponible");
		rdbtnNewRadioButton_3.setForeground(new Color(0, 0, 0));
		rdbtnNewRadioButton_3.setBackground(new Color(85, 107, 47));
		rdbtnNewRadioButton_3.setBounds(182, 192, 109, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Rentado");
		rdbtnNewRadioButton_4.setForeground(new Color(0, 0, 0));
		rdbtnNewRadioButton_4.setBackground(new Color(85, 107, 47));
		rdbtnNewRadioButton_4.setBounds(299, 192, 109, 23);
		contentPane.add(rdbtnNewRadioButton_4);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.DARK_GRAY);
		separator.setBackground(new Color(0, 0, 0));
		separator.setBounds(10, 92, 720, 11);
		contentPane.add(separator);
		
		JButton btnNewButton_1 = new JButton("Buscar");
		btnNewButton_1.setBounds(213, 52, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
