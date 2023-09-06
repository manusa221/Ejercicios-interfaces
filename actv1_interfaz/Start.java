package actv1_interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Checkbox;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;

public class Start {

	private JFrame frmVentana;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
					window.frmVentana.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVentana = new JFrame();
		frmVentana.setTitle("ventana");
		frmVentana.setBounds(100, 100, 645, 637);
		frmVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVentana.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(164, 64, 187, 36);
		frmVentana.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(164, 136, 187, 36);
		frmVentana.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(164, 211, 187, 36);
		frmVentana.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(29, 64, 77, 36);
		frmVentana.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1er Apellido");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(29, 136, 118, 36);
		frmVentana.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("2do Apellido");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(31, 211, 110, 36);
		frmVentana.getContentPane().add(lblNewLabel_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("1er Curso");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnNewRadioButton.setBounds(29, 491, 127, 25);
		frmVentana.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("2do Curso");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnNewRadioButton_1.setBounds(29, 536, 127, 25);
		frmVentana.getContentPane().add(rdbtnNewRadioButton_1);
		
		Checkbox checkbox = new Checkbox("Repetidor");
		checkbox.setBounds(205, 536, 108, 24);
		frmVentana.getContentPane().add(checkbox);
		
		JButton boton1 = new JButton("Aceptar");
		boton1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		boton1.setBounds(457, 509, 110, 52);
		frmVentana.getContentPane().add(boton1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Manuel\\Desktop\\IFP 2\u00BA A\u00D1O 1er Semestre\\Desarrollo de interfaces\\UF1 ENTREGA LIMITE ACTIVIDAD 16 DE NOVIEMBRE\\Actividad UF1\\logo.png"));
		lblNewLabel_3.setBounds(429, 64, 139, 183);
		frmVentana.getContentPane().add(lblNewLabel_3);
	}
}
