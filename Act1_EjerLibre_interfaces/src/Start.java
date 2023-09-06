import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerListModel;
import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;

public class Start {

	private JFrame frame;
	private JTextField campo1;
	private JTextField campo2;
	private JTextField campo3;
	private JLabel label1; 
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private int dia=0;
	private int mes=0;
	private int anyo=0;
	private JTextField campoedadactual;
	private JLabel label5;
	private JComboBox combodia;
	private JComboBox combomes;
	private JComboBox comboanyo;
	

	
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
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().setLayout(null);
		
		label1 = new JLabel("DNI");
		label1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label1.setBounds(52, 50, 92, 29);
		frame.getContentPane().add(label1);
		
		label2 = new JLabel("Nombre");
		label2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label2.setBounds(52, 99, 92, 29);
		frame.getContentPane().add(label2);
		
		label3 = new JLabel("Apellidos");
		label3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label3.setBounds(52, 153, 80, 29);
		frame.getContentPane().add(label3);
		
		campo1 = new JTextField();
		campo1.setBounds(176, 56, 116, 22);
		frame.getContentPane().add(campo1);
		campo1.setColumns(10);
		
		label4 = new JLabel("Fecha de Nacimiento");
		label4.setBackground(Color.DARK_GRAY);
		label4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label4.setBounds(12, 259, 132, 34);
		frame.getContentPane().add(label4);
		
		JList list = new JList();
		list.setBounds(362, 296, 51, -31);
		frame.getContentPane().add(list);
		
		
		JButton boton1 = new JButton("Calcular Edad");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Calendar fechaActual= new GregorianCalendar();
				dia=  fechaActual.get(Calendar.DAY_OF_MONTH);
				mes=  fechaActual.get(Calendar.MONTH)+1;
				anyo= fechaActual.get(Calendar.YEAR);
				
				int dN=Integer.parseInt((String)combodia.getSelectedItem());
				int mN=Integer.parseInt((String)combomes.getSelectedItem());
				int aN=Integer.parseInt((String)comboanyo.getSelectedItem());
				String hora= fechaActual.get(Calendar.HOUR)+ ":"+ fechaActual.get(Calendar.MINUTE);
				int edad=anyo-aN;
				
				//edad=Integer.parseInt(periodo.getYears());//, periodo.getMonths(), periodo.getDays());
				
				campoedadactual.setText(" " + edad);
				
				
	       	
			}
		});
		boton1.setBounds(176, 404, 116, 25);
		frame.getContentPane().add(boton1);
		
		campo2 = new JTextField();
		campo2.setBounds(176, 105, 116, 22);
		frame.getContentPane().add(campo2);
		campo2.setColumns(10);
		
		campo3 = new JTextField();
		campo3.setBounds(176, 159, 116, 22);
		frame.getContentPane().add(campo3);
		campo3.setColumns(10);
		
		/*campo4 = new JTextField();
		campo4.setBounds(176, 238, 116, 22);
		frame.getContentPane().add(campo4);
		campo4.setColumns(10);*/
		
		campoedadactual = new JTextField();
		campoedadactual.setForeground(Color.YELLOW);
		campoedadactual.setBackground(Color.DARK_GRAY);
		campoedadactual.setHorizontalAlignment(SwingConstants.CENTER);
		campoedadactual.setBounds(176, 357, 116, 22);
		frame.getContentPane().add(campoedadactual);
		campoedadactual.setColumns(10);
		
		label5 = new JLabel("Edad actual");
		label5.setBounds(12, 360, 99, 16);
		frame.getContentPane().add(label5);
		
		combodia = new JComboBox();
		combodia.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		combodia.setBounds(153, 322, 51, 22);
		frame.getContentPane().add(combodia);
		
		combomes = new JComboBox();
		combomes.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		combomes.setBounds(220, 322, 51, 22);
		frame.getContentPane().add(combomes);
		
		comboanyo = new JComboBox();
		comboanyo.setModel(new DefaultComboBoxModel(new String[] {"1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021"}));
		comboanyo.setBounds(283, 322, 61, 22);
		frame.getContentPane().add(comboanyo);
		
		JLabel labeldia = new JLabel("Dia");
		labeldia.setBounds(148, 296, 56, 16);
		frame.getContentPane().add(labeldia);
		
		JLabel labelmes = new JLabel("Mes");
		labelmes.setBounds(220, 296, 56, 16);
		frame.getContentPane().add(labelmes);
		
		JLabel labelanyo = new JLabel("A\u00F1o");
		labelanyo.setBounds(283, 296, 56, 16);
		frame.getContentPane().add(labelanyo);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Manuel\\Desktop\\IFP 2\u00BA A\u00D1O 1er Semestre\\Desarrollo de interfaces\\UF1 ENTREGA LIMITE ACTIVIDAD 16 DE NOVIEMBRE\\Actividad UF1\\fondo8.jpg"));
		lblNewLabel.setBounds(0, -12, 476, 487);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		
	}
}
