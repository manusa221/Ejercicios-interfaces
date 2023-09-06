import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.JScrollBar;
import javax.swing.JEditorPane;
import javax.swing.JTable;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JToolBar;
import javax.swing.JRadioButtonMenuItem;

public class Start {

	private JFrame frame;
	private JLabel label1;
	private JComboBox comboBox;
	private JRadioButton ration1;
	private JRadioButton ration2;
	private JRadioButton ration3;
	private JSlider slider;
	private JLabel label3;
	private JLabel label2;
	private int operador=0;
	private String etiqueta="";
	private ButtonGroup group = new ButtonGroup();//creo la clase buttongroup que nos servira para crear grupos
	private JButton boton1;
	
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
		frame.setBounds(100, 100, 575, 737);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		label1 = new JLabel("Modelo");
		label1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label1.setBounds(36, 45, 101, 25);
		frame.getContentPane().add(label1);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Arosa", "Ibiza", "Cordoba", "Toledo", "Altea"}));
		comboBox.setBounds(199, 35, 212, 44);
		frame.getContentPane().add(comboBox);
		
		ration1 = new JRadioButton("Como nuevo");
		ration1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ration1.setBounds(36, 189, 145, 25);
		frame.getContentPane().add(ration1);
		
		ration2 = new JRadioButton("Bueno");
		ration2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ration2.setBounds(36, 219, 127, 25);
		frame.getContentPane().add(ration2);
		
		ration3 = new JRadioButton("Alg\u00FAn desperfecto");
		ration3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ration3.setBounds(36, 249, 189, 25);
		frame.getContentPane().add(ration3);
		
		group.add(ration1);//añado al grupo ration1, ration2 y3. al estar añadidos solo se podra marcar 1.
		group.add(ration2);
		group.add(ration3);
		
		
		label3 = new JLabel("KM:");
		label3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label3.setBounds(224, 552, 91, 32);
		frame.getContentPane().add(label3);
		
		label2 = new JLabel("Kilometros:");
		label2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label2.setBounds(66, 405, 159, 32);
		frame.getContentPane().add(label2);
		
		slider = new JSlider();
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.addChangeListener(new ChangeListener() {//creo el evento
	    public void stateChanged(ChangeEvent e) {
			operador=slider.getValue();//paso el valor del slider a una variable entera
			etiqueta=Integer.toString(operador);//paso a la variable etiqueta el valor de operador
			label3.setText(etiqueta + "km");//a label3 le paso el valor que se realice a traves del slider
			 }
			});
		slider.setMajorTickSpacing(5000);
		slider.setMaximum(50000);
		slider.setToolTipText("");
		slider.setBounds(12, 464, 489, 61);
		frame.getContentPane().add(slider);
		
		boton1 = new JButton("Aceptar");
		boton1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		boton1.setBounds(382, 589, 119, 51);
		frame.getContentPane().add(boton1);
		
		
	}
}
