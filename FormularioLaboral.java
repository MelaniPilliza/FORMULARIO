package FORMULARIO;

import javax.swing.*;
import java.awt.EventQueue;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import java.awt.*;
import java.io.File;
import javax.swing.SpinnerNumberModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;

public class FormularioLaboral extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ButtonGroup bg=new ButtonGroup();
	private JPasswordField passwordField;
	boolean archivoSeleccionado = false;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioLaboral frame = new FormularioLaboral();
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
	public FormularioLaboral() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1045, 853);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel JLabelNombre = new JLabel("Nombre* ");
		JLabelNombre.setBounds(38, 92, 72, 24);
		JLabelNombre.setFont(new Font("Verdana", Font.PLAIN, 12));
		contentPane.add(JLabelNombre);
		
		JTextArea textAreaNombre = new JTextArea();
		textAreaNombre.setBounds(38, 115, 546, 16);
		contentPane.add(textAreaNombre);
		
		JLabel JLabelDatosPersonales = new JLabel("DATOS PERSONALES");
		JLabelDatosPersonales.setBounds(38, 67, 181, 24);
		JLabelDatosPersonales.setFont(new Font("Verdana", Font.BOLD, 14));
		contentPane.add(JLabelDatosPersonales);
		
		JLabel JLabelPrimerApellido = new JLabel("Primer Apellido * ");
		JLabelPrimerApellido.setBounds(38, 139, 116, 24);
		JLabelPrimerApellido.setFont(new Font("Verdana", Font.PLAIN, 12));
		contentPane.add(JLabelPrimerApellido);
		
		JTextArea textAreaSegundoApellido = new JTextArea();
		textAreaSegundoApellido.setBounds(38, 207, 546, 16);
		contentPane.add(textAreaSegundoApellido);
		
		JLabel lblLugarDeResidencia = new JLabel("LUGAR DE RESIDENCIA");
		lblLugarDeResidencia.setBounds(39, 516, 243, 24);
		lblLugarDeResidencia.setFont(new Font("Verdana", Font.BOLD, 14));
		contentPane.add(lblLugarDeResidencia);
		
		JLabel JLabelSegundoApellido = new JLabel("Segundo Apellido (opcional)");
		JLabelSegundoApellido.setBounds(38, 186, 192, 24);
		JLabelSegundoApellido.setFont(new Font("Verdana", Font.PLAIN, 12));
		contentPane.add(JLabelSegundoApellido);
		
		JTextArea textAreaPrimerApellido = new JTextArea();
		textAreaPrimerApellido.setBounds(38, 160, 546, 16);
		contentPane.add(textAreaPrimerApellido);
		
		JLabel JLabelTipoDocumentoIdentidad = new JLabel("Tipo de documento de identidad* ");
		JLabelTipoDocumentoIdentidad.setBounds(38, 228, 213, 24);
		JLabelTipoDocumentoIdentidad.setFont(new Font("Verdana", Font.PLAIN, 12));
		contentPane.add(JLabelTipoDocumentoIdentidad);
		
		JComboBox<String> comboBox = new JComboBox<>(new String[] {"DNI", "PASAPORTE", "NIE"});
		comboBox.setBounds(38, 249, 546, 16);
		comboBox.setEditable(false); // El combo box no es editable
		comboBox.setFont(new Font("Verdana", Font.PLAIN, 10));
		comboBox.setSelectedIndex(-1);
		contentPane.add(comboBox);


		
		
		JLabel JLabelNumIdentificacion = new JLabel("Nº de identificación* ");
		JLabelNumIdentificacion.setBounds(38, 274, 129, 20);
		JLabelNumIdentificacion.setFont(new Font("Verdana", Font.PLAIN, 12));
		contentPane.add(JLabelNumIdentificacion);
		
		JTextArea textAreaNumIdentificacion = new JTextArea();
		textAreaNumIdentificacion.setBounds(38, 293, 546, 16);
		contentPane.add(textAreaNumIdentificacion);
		
		JLabel lblProvincia = new JLabel("Provincia*");
		lblProvincia.setBounds(39, 540, 213, 24);
		lblProvincia.setFont(new Font("Verdana", Font.PLAIN, 12));
		contentPane.add(lblProvincia);
		
		
		JComboBox<String> comboBox_1 = new JComboBox<>(new String[] {"A CORUÑA", "ÁLAVA", "ALBACETE", "ALICANTE", "ALMERÍA", "ASTURIAS", "ÁVILA", "BADAJOZ", "BALEARES", "BARCELONA", "BURGOS", "CÁCERES", "CÁDIZ", "CANTABRIA", "CASTELLÓN", "CIUDAD REAL", "CÓRDOBA", "CUENCA", "GIRONA", "GRANADA", "GUADALAJARA", "GIPUZCOA", "HUELVA", "HUESCA", "JAÉN", "LA RIOJA", "LAS PALMAS", "LEÓN", "LÉRIDA", "LUGO", "MADRID", "MÁLAGA", "MURCIA", "NAVARRA", "OURENSE", "PALENCIA", "PONTEVEDRA", "SALAMANCA", "SEGOVIA", "SEVILLA", "SORIA", "TARRAGONA", "SANTA CRUZ DE TENERIFE", "TERUEL", "TOLEDO", "VALENCIA", "VALLADOLID", "VIZCAYA", "ZAMORA", "ZARAGOZA"});
		comboBox_1.setBounds(39, 561, 546, 16);
		comboBox_1.setEditable(false); // El combo box no es editable
		comboBox_1.setFont(new Font("Verdana", Font.PLAIN, 10));
		comboBox_1.setSelectedIndex(-1);
		contentPane.add(comboBox_1);
		
		JLabel lblCodigoPostal = new JLabel("Código Postal*");
		lblCodigoPostal.setBounds(38, 583, 116, 24);
		lblCodigoPostal.setFont(new Font("Verdana", Font.PLAIN, 12));
		contentPane.add(lblCodigoPostal);
		
		JLabel labelError = new JLabel("");
		labelError.setForeground(Color.RED);
		labelError.setFont(new Font("Verdana", Font.PLAIN, 10));
		labelError.setBounds(38, 635, 452, 13);
		contentPane.add(labelError);
		
		JTextArea textArea_1_3 = new JTextArea();
		textArea_1_3.setBounds(38, 609, 546, 16);
		contentPane.add(textArea_1_3);
		textArea_1_3.addKeyListener(new KeyAdapter() {
		    public void keyTyped(KeyEvent e) {
		        char c = e.getKeyChar();
		        if (!Character.isDigit(c)) {
		            e.consume(); // Ignora cualquier carácter que no sea un dígito
		            labelError.setText("Error: Solo se permiten números."); // Muestra el mensaje de error
		        } else {
		            labelError.setText(""); // Limpia el mensaje de error si el carácter es un dígito
		        }
		    }
		});
		
		JLabel JLabelEdad = new JLabel("Edad*");
		JLabelEdad.setBounds(38, 319, 49, 24);
		JLabelEdad.setFont(new Font("Verdana", Font.PLAIN, 12));
		contentPane.add(JLabelEdad);
		
		
		JLabel lblOtrosDatos = new JLabel("OTROS DATOS");
		lblOtrosDatos.setBounds(38, 648, 181, 24);
		lblOtrosDatos.setFont(new Font("Verdana", Font.BOLD, 14));
		contentPane.add(lblOtrosDatos);
		
		JLabel lblNewLabel_1 = new JLabel("Jornada Laboral*");
		lblNewLabel_1.setBounds(39, 670, 116, 24);
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Completa");
		rdbtnNewRadioButton.setBackground(SystemColor.inactiveCaption);
		rdbtnNewRadioButton.setBounds(161, 672, 116, 21);
		rdbtnNewRadioButton.setFont(new Font("Verdana", Font.PLAIN, 12));
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnParcialManana = new JRadioButton("Parcial mañana");
		rdbtnParcialManana.setBackground(SystemColor.inactiveCaption);
		rdbtnParcialManana.setBounds(279, 672, 116, 21);
		rdbtnParcialManana.setFont(new Font("Verdana", Font.PLAIN, 12));
		contentPane.add(rdbtnParcialManana);
		
		JRadioButton rdbtnParcialTarde = new JRadioButton("Parcial tarde");
		rdbtnParcialTarde.setBackground(SystemColor.inactiveCaption);
		rdbtnParcialTarde.setBounds(426, 672, 116, 21);
		rdbtnParcialTarde.setFont(new Font("Verdana", Font.PLAIN, 12));
		contentPane.add(rdbtnParcialTarde);
		
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnParcialManana);
		bg.add(rdbtnParcialTarde);
		
		
		JLabel lblCV = new JLabel("CV*");
		lblCV.setBounds(38, 704, 37, 24);
		lblCV.setFont(new Font("Verdana", Font.PLAIN, 12));
		contentPane.add(lblCV);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\melan\\Downloads\\52991ad4d95008b377445982422fe7c6.jpg"));
		lblNewLabel_2.setBounds(630, -150, 452, 978);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("●●");
		lblNewLabel_3.setForeground(new Color(0, 0, 102));
		lblNewLabel_3.setFont(new Font("Verdana", Font.PLAIN, 50));
		lblNewLabel_3.setBounds(37, 0, 61, 43);
		contentPane.add(lblNewLabel_3);
		
		JLabel JLabelTitulo = new JLabel("TRABAJA CON NOSOTROS");
		JLabelTitulo.setFont(new Font("Verdana", Font.BOLD, 25));
		JLabelTitulo.setBounds(126, 10, 400, 43);
		contentPane.add(JLabelTitulo);
		
		JLabel lblNewLabel_3_1 = new JLabel("●●");
		lblNewLabel_3_1.setForeground(new Color(0, 0, 102));
		lblNewLabel_3_1.setFont(new Font("Verdana", Font.PLAIN, 50));
		lblNewLabel_3_1.setBounds(522, 0, 61, 43);
		contentPane.add(lblNewLabel_3_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Verdana", Font.PLAIN, 12));
		spinner.setModel(new SpinnerNumberModel(16, 16, 67, 1));
		spinner.setBounds(91, 319, 49, 20);
		contentPane.add(spinner);
		

		JLabel label = new JLabel("No se ha seleccionado ningún archivo");
		label.setFont(new Font("Verdana", Font.PLAIN, 9));
		label.setBounds(183, 707, 402, 20); 
		contentPane.add(label);

		JButton btnNewButton = new JButton("Adjuntar CV");
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
			        // No necesitas declarar archivoSeleccionado aquí, ya que es una variable de instancia
			        JFileChooser fileChooser = new JFileChooser();
			        fileChooser.setDialogTitle("Selecciona un archivo"); // Título del diálogo
			        int result = fileChooser.showOpenDialog(contentPane);
			        if (result == JFileChooser.APPROVE_OPTION) {
			            File selectedFile = fileChooser.getSelectedFile();
			            // Actualiza una etiqueta con la ruta del archivo y cambia la variable a true
			            label.setText("Archivo seleccionado: " + selectedFile.getAbsolutePath());
			            archivoSeleccionado = true;
			        }
			    }
		});
		btnNewButton.setBounds(74, 706, 103, 21);
		contentPane.add(btnNewButton);
		
		
		
		JLabel lblContacto = new JLabel("CONTACTO");
		lblContacto.setFont(new Font("Verdana", Font.BOLD, 14));
		lblContacto.setBounds(38, 353, 243, 24);
		contentPane.add(lblContacto);
		
		JLabel lblCorreo = new JLabel("Correo*");
		lblCorreo.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblCorreo.setBounds(38, 376, 129, 24);
		contentPane.add(lblCorreo);
		
		JTextArea textAreaCorreo = new JTextArea();
		textAreaCorreo.setBounds(38, 397, 546, 16);
		contentPane.add(textAreaCorreo);
		
		JLabel lblConstrasea = new JLabel("Constraseña*");
		lblConstrasea.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblConstrasea.setBounds(38, 420, 129, 24);
		contentPane.add(lblConstrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(38, 441, 546, 16);
		contentPane.add(passwordField);
		
		JTextArea numeroTelefono = new JTextArea();
		numeroTelefono.setBounds(38, 480, 546, 16);
		contentPane.add(numeroTelefono);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBackground(new Color(192, 192, 192));
		btnBorrar.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnBorrar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	textAreaNombre.setText(""); 
		    	textAreaSegundoApellido.setText("");
		    	textAreaPrimerApellido.setText("");
		    	textAreaNumIdentificacion.setText("");
		    	textArea_1_3.setText("");
		    	textAreaCorreo.setText("");
		    	numeroTelefono.setText("");
		    	passwordField.setText("");
		    	spinner.setValue(16);
		    	bg.clearSelection();
		    	label.setText("No se ha seleccionado ningún archivo");
		    	comboBox.setModel(new DefaultComboBoxModel<>(new String[] {"DNI", "PASAPORTE", "NIE"}));
		        comboBox.setSelectedIndex(-1); // Opcional: deseleccionar todos los ítems
		        comboBox_1.setModel(new DefaultComboBoxModel<>(new String[] {"A CORUÑA", "ÁLAVA", "ALBACETE", "ALICANTE", "ALMERÍA", "ASTURIAS", "ÁVILA", "BADAJOZ", "BALEARES", "BARCELONA", "BURGOS", "CÁCERES", "CÁDIZ", "CANTABRIA", "CASTELLÓN", "CIUDAD REAL", "CÓRDOBA", "CUENCA", "GIRONA", "GRANADA", "GUADALAJARA", "GIPUZCOA", "HUELVA", "HUESCA", "JAÉN", "LA RIOJA", "LAS PALMAS", "LEÓN", "LÉRIDA", "LUGO", "MADRID", "MÁLAGA", "MURCIA", "NAVARRA", "OURENSE", "PALENCIA", "PONTEVEDRA", "SALAMANCA", "SEGOVIA", "SEVILLA", "SORIA", "TARRAGONA", "SANTA CRUZ DE TENERIFE", "TERUEL", "TOLEDO", "VALENCIA", "VALLADOLID", "VIZCAYA", "ZAMORA", "ZARAGOZA"}));
		        comboBox_1.setSelectedIndex(-1); // Opcional: deseleccionar todos los ítems
		    }
		});
		btnBorrar.setBounds(313, 742, 112, 29);
		contentPane.add(btnBorrar);
		
		JLabel lblNmeroDeTelefono = new JLabel("Número de telefono*");
		lblNmeroDeTelefono.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNmeroDeTelefono.setBounds(38, 457, 129, 24);
		contentPane.add(lblNmeroDeTelefono);
		
		
		
		JLabel labelError_2 = new JLabel("");
		labelError_2.setForeground(Color.RED);
		labelError_2.setFont(new Font("Verdana", Font.PLAIN, 10));
		labelError_2.setBounds(38, 504, 452, 13);
		contentPane.add(labelError_2);
		numeroTelefono.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume(); // Ignora la entrada si no es un dígito
                    labelError_2.setText("Error: Solo se permiten números.");
                } else {
                    labelError_2.setText(""); // Limpia el mensaje de error si es un dígito
                }
            }
        });
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean jornadaSeleccionada = rdbtnNewRadioButton.isSelected() || 
                        rdbtnParcialManana.isSelected() || 
                        rdbtnParcialTarde.isSelected();

				if (textAreaNombre.getText().trim().isEmpty() ||
			            textAreaPrimerApellido.getText().trim().isEmpty() ||
			            comboBox.getSelectedIndex() == -1 ||
			            textAreaNumIdentificacion.getText().trim().isEmpty() ||
			            passwordField.getText().trim().isEmpty() ||
			            numeroTelefono.getText().trim().isEmpty() ||
			            comboBox_1.getSelectedIndex() == -1 ||
			            textArea_1_3.getText().trim().isEmpty() ||
			            textAreaCorreo.getText().trim().isEmpty() ||
			            !jornadaSeleccionada||
			            !archivoSeleccionado) {
			            // Mostrar un mensaje de error si algún campo está vacío
			            JOptionPane.showMessageDialog(contentPane, "Por favor, rellene todos los campos antes de enviar.");
			        } else {
			            // Cerrar la ventana actual
			            Frame.getFrames()[0].dispose();
			            // Crear la instancia de Enviar
			            Enviar ventanaEnviar = new Enviar();
			            // Hacer visible la instancia de Enviar
			            ventanaEnviar.setVisible(true);
			        }
			}
		});
		btnEnviar.setBackground(new Color(192, 192, 192));
		btnEnviar.setFont(new Font("Verdana", Font.PLAIN, 12));
		btnEnviar.setBounds(145, 742, 116, 29);
		contentPane.add(btnEnviar);

		
		
		
		

		
		
		

		
	}
}
