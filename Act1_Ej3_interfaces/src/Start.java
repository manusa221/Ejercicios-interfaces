import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Start {

	private JFrame frame;
	private JTextField campo1;
	private JTextField textField_1;
	private JTextField campo3;
	private JTextField campo2;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	private JButton boton5;
	private String contenidoCaja1="";
	private String contenidoCaja2="";
	private String contenidoCaja3="";
	private float suma=0.0f;
	private float resta=0.0f;
	private float div=0.0f;
	private float multi=0.0f;
	private float num1=0.0f;
	private float num2=0.0f;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 690, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		label1 = new JLabel("N\u00BA 1");
		label1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label1.setBounds(54, 73, 56, 16);
		frame.getContentPane().add(label1);
		
		label3 = new JLabel("Resultado");
		label3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label3.setBounds(31, 338, 113, 25);
		frame.getContentPane().add(label3);
		
		label2 = new JLabel("N\u00BA 2");
		label2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label2.setBounds(54, 176, 56, 16);
		frame.getContentPane().add(label2);
		
		campo1 = new JTextField();
		campo1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		campo1.setHorizontalAlignment(SwingConstants.CENTER);
		campo1.setBounds(166, 73, 130, 42);
		frame.getContentPane().add(campo1);
		campo1.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(166, 73, 130, 30);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		campo3 = new JTextField();
		campo3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		campo3.setHorizontalAlignment(SwingConstants.CENTER);
		campo3.setBounds(166, 321, 130, 42);
		frame.getContentPane().add(campo3);
		campo3.setColumns(10);
		
		campo2 = new JTextField();
		campo2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		campo2.setHorizontalAlignment(SwingConstants.CENTER);
		campo2.setBounds(166, 176, 130, 42);
		frame.getContentPane().add(campo2);
		campo2.setColumns(10);
		
		boton1 = new JButton("+");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try
			{
				contenidoCaja1= campo1.getText();
				contenidoCaja2= campo2.getText();
				num1=Float.parseFloat(contenidoCaja1);
				num2=Float.parseFloat(contenidoCaja2);
				suma= num1 + num2;
				campo3.setText("" + suma);
				
			} 
			catch(Exception e1)
			{
				
			campo3.setText("Error");
		
			}
			}
			
		});
		
		boton1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		boton1.setBounds(358, 73, 56, 42);
		frame.getContentPane().add(boton1);
		
		boton2 = new JButton("-");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
				contenidoCaja1= campo1.getText();
				contenidoCaja2= campo2.getText();
				num1=Float.parseFloat(contenidoCaja1);
				num2=Float.parseFloat(contenidoCaja2);
				resta= num1 - num2;
				campo3.setText("" + resta);
				}
				catch (Exception e2) {
					
					campo3.setText("Error");
				}
			}
		});
		boton2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		boton2.setBounds(519, 73, 56, 42);
		frame.getContentPane().add(boton2);
		
		boton3 = new JButton("*");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try
			{
				contenidoCaja1= campo1.getText();
				contenidoCaja2= campo2.getText();
				num1=Float.parseFloat(contenidoCaja1);
				num2=Float.parseFloat(contenidoCaja2);
				multi= num1 * num2;
				campo3.setText("" + multi);
			}
			catch (Exception e3)
			{
				campo3.setText("Error");
			}
			}
		});
		boton3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		boton3.setBounds(358, 176, 56, 42);
		frame.getContentPane().add(boton3);
		
		boton4 = new JButton("/");
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {	
				contenidoCaja1= campo1.getText();
				contenidoCaja2= campo2.getText();
				num1=Float.parseFloat(contenidoCaja1);
				num2=Float.parseFloat(contenidoCaja2);
				div= num1 / num2;
				campo3.setText("" + div);
			}
			catch (Exception e4)
			{
				campo3.setText("Error");
			}
			}
		});
		boton4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		boton4.setBounds(519, 176, 56, 42);
		frame.getContentPane().add(boton4);
		
		boton5 = new JButton("Borrar");
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				campo3.setText(null);
				campo1.setText(null);
				campo2.setText(null);
			}
		});
		boton5.setBounds(358, 321, 217, 42);
		frame.getContentPane().add(boton5);
	}

}
