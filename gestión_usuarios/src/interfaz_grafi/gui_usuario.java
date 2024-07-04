package interfaz_grafi;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import usuarios.Administrador;
import javax.swing.border.LineBorder;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JPasswordField;

class Gestoruser extends Administrador {
    boolean nivel_acceso = false;
    JTextField nombre;
    JTextField correro_electronico;
    
    protected JTextField contraseña;
    
    public String admin(boolean nivel_acceso) {
        if (nivel_acceso == true) {
            return "es admin";
        } else if (nivel_acceso == false) {
            return "no es admin";
        }
        return "nivel de acceso desconocido";
    }
}

public class gui_usuario extends Gestoruser {
    private JFrame frmGestorDeUsuario;
    private JTextField textField;
    private JTextField textField_1;
    private JPasswordField textField_2;
    private JPasswordField textField_3;
    private JTable table;
    private int selectedRow = -1;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    gui_usuario window = new gui_usuario();
                    window.frmGestorDeUsuario.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public gui_usuario() {
        initialize();
    }

    JLabel lblNewLabel_3 = new JLabel("Nombre");
    JLabel lblNewLabel_4 = new JLabel("Correo");
    JLabel lblNewLabel_5 = new JLabel("Contraseña");
    JLabel lblNewLabel_6 = new JLabel("Confirmar Contraseña");

    private void initialize() {
        frmGestorDeUsuario = new JFrame();
        frmGestorDeUsuario.setTitle("GESTOR DE USUARIO");
        frmGestorDeUsuario.getContentPane().setBackground(new Color(66, 162, 198));
        frmGestorDeUsuario.setBounds(100, 100, 906, 513);
        frmGestorDeUsuario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmGestorDeUsuario.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setForeground(Color.BLACK);
        panel.setBackground(new Color(115, 234, 247));
        panel.setBorder(UIManager.getBorder("TextField.border"));
        panel.setBounds(378, 40, 506, 413);
        frmGestorDeUsuario.getContentPane().add(panel);
        panel.setLayout(null);

        table = new JTable();
        table.setShowVerticalLines(true);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.setBorder(new LineBorder(new Color(0, 0, 0)));
        table.setModel(new DefaultTableModel(
            new Object[][] {},
            new String[] {"Nombre", "Correo", "Contrasena", "Admin"}
        ) {
            Class[] columnTypes = new Class[] {String.class, String.class, String.class, String.class};
            public Class getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
        });
        table.getColumnModel().getColumn(0).setPreferredWidth(140);
        table.getColumnModel().getColumn(1).setPreferredWidth(197);
        table.getColumnModel().getColumn(2).setPreferredWidth(174);
        table.getColumnModel().getColumn(3).setPreferredWidth(92);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(6, 24, 494, 368);
        panel.add(scrollPane);

        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    model.removeRow(selectedRow);
                    selectedRow = -1; // Clear selected row index
                }
            }
        });
        btnEliminar.setBounds(119, 68, 89, 23);
        frmGestorDeUsuario.getContentPane().add(btnEliminar);

        JButton btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lblNewLabel_3.setVisible(true);
                textField.setVisible(true);
                lblNewLabel_4.setVisible(true);
                textField_1.setVisible(true);
                lblNewLabel_5.setVisible(true);
                textField_2.setVisible(true);
                textField_3.setVisible(true);
                lblNewLabel_6.setVisible(true);

                textField.setEditable(true);
                textField_1.setEditable(true);
                textField_2.setEditable(true);
                textField_3.setEditable(true);

                selectedRow = -1; // Clear selected row index when adding a new entry
            }
        });

        btnAgregar.setBounds(20, 68, 89, 23);
        frmGestorDeUsuario.getContentPane().add(btnAgregar);

        JButton btnEditar = new JButton("Editar");
        btnEditar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setEditable(true);
                textField_1.setEditable(true);
                textField_2.setEditable(true);
                textField_3.setEditable(true);
            }
        });
        btnEditar.setBounds(20, 102, 89, 23);
        frmGestorDeUsuario.getContentPane().add(btnEditar);

        JButton btnMostrarUsuarios = new JButton("Mostrar Usuarios");
        btnMostrarUsuarios.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean isVisible = table.isVisible();
                table.setVisible(!isVisible);
            }
        });
        btnMostrarUsuarios.setBounds(119, 102, 152, 23);
        frmGestorDeUsuario.getContentPane().add(btnMostrarUsuarios);

        JLabel lblOpciones = new JLabel("Opciones");
        lblOpciones.setHorizontalAlignment(SwingConstants.CENTER);
        lblOpciones.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblOpciones.setBounds(70, 0, 165, 46);
        frmGestorDeUsuario.getContentPane().add(lblOpciones);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(115, 234, 247));
        panel_1.setBorder(UIManager.getBorder("TextField.border"));
        panel_1.setBounds(20, 161, 348, 268);
        frmGestorDeUsuario.getContentPane().add(panel_1);
        panel_1.setLayout(null);

        lblNewLabel_3.setVisible(false);
        lblNewLabel_3.setBounds(19, 21, 55, 16);
        panel_1.add(lblNewLabel_3);
        
        textField = new JTextField();
        nombre = textField;
        textField.setBounds(17, 41, 140, 28);
        textField.setVisible(false);
        textField.setEditable(false);
        panel_1.add(textField);
        textField.setColumns(10);

        lblNewLabel_4.setBounds(163, 21, 55, 16);
        lblNewLabel_4.setVisible(false);
        panel_1.add(lblNewLabel_4);

        textField_1 = new JTextField();
        correro_electronico = textField_1;
        textField_1.setBounds(159, 41, 183, 28);
        textField_1.setVisible(false);
        textField_1.setEditable(false);
        panel_1.add(textField_1);
        textField_1.setColumns(10);
        lblNewLabel_5.setBackground(new Color(4, 143, 155));

        lblNewLabel_5.setBounds(19, 93, 262, 16);
        lblNewLabel_5.setVisible(false);
        panel_1.add(lblNewLabel_5);

        textField_2 = new JPasswordField();
        contraseña = textField_2;
        textField_2.setBounds(17, 121, 264, 28);
        textField_2.setVisible(false);
        textField_2.setEditable(false);
        panel_1.add(textField_2);
        textField_2.setColumns(10);

        textField_3 = new JPasswordField();
        textField_3.setVisible(false);
        textField_3.setEditable(false);
        textField_3.setBounds(17, 188, 264, 28);
        panel_1.add(textField_3);
        textField_3.setColumns(10);

        lblNewLabel_6.setVisible(false);
        lblNewLabel_6.setBounds(19, 160, 262, 16);
        panel_1.add(lblNewLabel_6);

        JLabel lblTablaUsuarios = new JLabel("Tabla de usuarios");
        lblTablaUsuarios.setBounds(378, 11, 467, 23);
        frmGestorDeUsuario.getContentPane().add(lblTablaUsuarios);

        JLabel lblIngresarInfo = new JLabel("Ingresar informacion");
        lblIngresarInfo.setBounds(20, 136, 348, 14);
        frmGestorDeUsuario.getContentPane().add(lblIngresarInfo);

        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
           
                
            	String nombre = textField.getText();
                String correo = textField_1.getText();
                String contrasena = new String(textField_2.getPassword());
           
                
                
                if (nombre.equals("admin") && correo.equals("admin@gmail.com") && contrasena.equals("admin123")) {
                	nivel_acceso = true;
                }else {
                	nivel_acceso = false;
                }
                
                
                
                String admin = admin(nivel_acceso); 

                if (textField.getText().isEmpty() || textField_1.getText().isEmpty() || textField_2.getPassword().length == 0 || textField_3.getPassword().length == 0) {
                    JOptionPane.showMessageDialog(null, "Debe completar los campos");
                } else if (!new String(textField_2.getPassword()).equals(new String(textField_3.getPassword()))) {
                    JOptionPane.showMessageDialog(null, "Contraseña y confirmar contraseña deben ser iguales");
                } else {
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    if (selectedRow == -1) {
                        // Agregar nuevo usuario
                        model.addRow(new Object[]{nombre, correo, contrasena, admin});
                    } else {
                        // Editar usuario existente
                        model.setValueAt(nombre, selectedRow, 0);
                        model.setValueAt(correo, selectedRow, 1);
                        model.setValueAt(contrasena, selectedRow, 2);
                        model.setValueAt(admin, selectedRow, 3);
                        selectedRow = -1; // Limpiar la selección de la fila
                    }
                }

                textField.setText("");
                textField_1.setText("");
                textField_2.setText("");
                textField_3.setText("");

                lblNewLabel_3.setVisible(false);
                lblNewLabel_4.setVisible(false);
                lblNewLabel_5.setVisible(false);
                lblNewLabel_6.setVisible(false);
                textField.setVisible(false);
                textField_1.setVisible(false);
                textField_2.setVisible(false);
                textField_3.setVisible(false);

                textField.setEditable(false);
                textField_1.setEditable(false);
                textField_2.setEditable(false);
                textField_3.setEditable(false);
            }
        });
        btnGuardar.setBounds(279, 440, 89, 23);
        frmGestorDeUsuario.getContentPane().add(btnGuardar);

        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                textField_1.setText("");
                textField_2.setText("");
                textField_3.setText("");
                selectedRow = -1; // Clear selected row index when clearing fields
            }
        });
        btnLimpiar.setBounds(169, 440, 89, 23);
        frmGestorDeUsuario.getContentPane().add(btnLimpiar);

        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    selectedRow = table.getSelectedRow();
                    if (selectedRow != -1) {
                        String nombre = (String) table.getValueAt(selectedRow, 0);
                        String correo = (String) table.getValueAt(selectedRow, 1);
                        String contrasena = (String) table.getValueAt(selectedRow, 2);
                       

                        textField.setText(nombre);
                        textField_1.setText(correo);
                        textField_2.setText(contrasena);
                        textField_3.setText(contrasena);

                        lblNewLabel_3.setVisible(true);
                        lblNewLabel_4.setVisible(true);
                        lblNewLabel_5.setVisible(true);
                        lblNewLabel_6.setVisible(true);
                        textField.setVisible(true);
                        textField_1.setVisible(true);
                        textField_2.setVisible(true);
                        textField_3.setVisible(true);

                        textField.setEditable(false);
                        textField_1.setEditable(false);
                        textField_2.setEditable(false);
                        textField_3.setEditable(false);
                    }
                }
            }
        });
    }
}
