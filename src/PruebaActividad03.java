import javax.swing.*;
import java.awt.*;

class VentanaInicio extends JFrame{
	
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	
	
	public VentanaInicio() {
		
		
		getContentPane().setLayout(gbl);
		
		gbc.insets = new Insets(5,15,5,15);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Ventana Principal");
		setSize(960, 620);
		setLocationRelativeTo(null);
		setVisible(true);
		
		/*JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(100,100,100));
		panel1.setLayout(null);*/
		
		JLabel txtTitulo = new JLabel("The Classic Form includes all visible fields");
		JLabel txtTitulo2 = new JLabel("for the list");
		
		metodoMagicoQueAcomodaTodo(txtTitulo, 0, 0, 1, 1, GridBagConstraints.HORIZONTAL);
		metodoMagicoQueAcomodaTodo(txtTitulo2, 0, 1, 1, 1, GridBagConstraints.HORIZONTAL);
		
		JLabel txtOpciones = new JLabel("Form Options");
		txtOpciones.setFont(new Font("Calibri",Font.PLAIN, 20));
		
		metodoMagicoQueAcomodaTodo(txtOpciones, 0, 2, 1, 1, GridBagConstraints.HORIZONTAL);
		
		JLabel txtInclude = new JLabel("Include the following");
		metodoMagicoQueAcomodaTodo(txtInclude, 0, 3, 1, 1, GridBagConstraints.HORIZONTAL);
		
		JCheckBox checkTitulo = new JCheckBox("a title for your form");
		metodoMagicoQueAcomodaTodo(checkTitulo, 0, 4, 1, 1, GridBagConstraints.HORIZONTAL);
		
		JTextField cajaNombre = new JTextField(8);
		metodoMagicoQueAcomodaTodo(cajaNombre, 0, 5, 1, 1, GridBagConstraints.HORIZONTAL);
		
		ButtonGroup bg = new ButtonGroup();
		JRadioButton radioOnly = new JRadioButton("only requiered fields");
		JRadioButton radioAll = new JRadioButton("all fields");
		bg.add(radioOnly);
		bg.add(radioAll);
		
		metodoMagicoQueAcomodaTodo(radioOnly, 0, 6, 1, 1, GridBagConstraints.HORIZONTAL);
		metodoMagicoQueAcomodaTodo(radioAll, 0, 7, 1, 1, GridBagConstraints.HORIZONTAL);
		
		JLabel txtEdit = new JLabel("<html><body>(edit requiered fields <b style=\"color:#00AAE4\";>in the form builder</b>)</body></html>");
		txtEdit.setFont(new Font("Calibri", Font.PLAIN, 11));
		metodoMagicoQueAcomodaTodo(txtEdit, 0, 8, 1, 1, GridBagConstraints.HORIZONTAL);
		
		JCheckBox checkInterest = new JCheckBox("interest group fields");
		metodoMagicoQueAcomodaTodo(checkInterest, 0, 9, 1, 1, GridBagConstraints.HORIZONTAL);
		
		JCheckBox checkIndi = new JCheckBox("required field indicators");
		metodoMagicoQueAcomodaTodo(checkIndi, 0, 10, 1, 1, GridBagConstraints.HORIZONTAL);
		
		JLabel txtSet = new JLabel("Set form width");
		metodoMagicoQueAcomodaTodo(txtSet, 0, 11, 1, 1, GridBagConstraints.HORIZONTAL);
		
		JTextField cajaWidth = new JTextField(10);
		metodoMagicoQueAcomodaTodo(cajaWidth, 0, 12, 1, 1, GridBagConstraints.HORIZONTAL);
		
		JLabel txtEn = new JLabel("Enhance your form");
		metodoMagicoQueAcomodaTodo(txtEn, 0, 13, 1, 1, GridBagConstraints.HORIZONTAL);
		
		JCheckBox checkEnable = new JCheckBox("enable evil popup mode");
		metodoMagicoQueAcomodaTodo(checkEnable, 0, 14, 1, 1, GridBagConstraints.HORIZONTAL);
		
		JCheckBox checkDisable = new JCheckBox("disable all JavaScript");
		metodoMagicoQueAcomodaTodo(checkDisable, 0, 15, 1, 1, GridBagConstraints.HORIZONTAL);
		
		JCheckBox checkInclude = new JCheckBox("include archive link");
		metodoMagicoQueAcomodaTodo(checkInclude, 0, 16, 1, 1, GridBagConstraints.HORIZONTAL);
		
		JCheckBox checkMonkey = new JCheckBox("<html><body> include <b style=\"color:#00AAE4\";> MonkeyRewards link </p></body></html>");
		metodoMagicoQueAcomodaTodo(checkMonkey, 0, 17, 1, 1, GridBagConstraints.HORIZONTAL);
		
		gbc.weightx = 0.1;
		
		JLabel txtPre = new JLabel("Preview");
		txtPre.setFont(new Font("Calibri", Font.PLAIN, 20));
		metodoMagicoQueAcomodaTodo(txtPre, 1, 0, 1, 1, GridBagConstraints.BOTH);
		
		JPanel panel2 = new JPanel();
		panel2.setLayout(gbl);
		//panel2.setBackground(new Color(250, 250 , 250));
		panel2.setBorder(BorderFactory.createLineBorder(new Color(180,180,180)));
		
		
		metodoMagicoQueAcomodaTodo(panel2, 1, 1, 5, 8, GridBagConstraints.BOTH);
		
		gbc.anchor = GridBagConstraints.NORTHEAST;
		
		JLabel txtReq = new JLabel("* indicates required");
		txtReq.setFont(new Font("Calibri", Font.PLAIN, 12));
		
		agregarAPanel(txtReq, panel2, 1, 0, 1, 1, 0);
		
		
		
		JLabel txtEmail = new JLabel("Email Addres");
		txtEmail.setFont(new Font("Calibri", Font.PLAIN, 16));
		
		agregarAPanel(txtEmail, panel2, 0, 0, 1, 1, GridBagConstraints.HORIZONTAL);
		
		JFormattedTextField cajaEmail = new JFormattedTextField();

		agregarAPanel(cajaEmail, panel2, 0, 1, 2, 1, GridBagConstraints.BOTH);
	
		
		JLabel txtFirst = new JLabel("First Name");
		txtFirst.setFont(new Font("Calibri", Font.PLAIN, 16));
		agregarAPanel(txtFirst, panel2, 0, 2, 1, 1, GridBagConstraints.HORIZONTAL);
		
		JTextField cajaFirst = new JTextField(10);

		agregarAPanel(cajaFirst, panel2, 0, 3, 2, 1, GridBagConstraints.BOTH);

		
		JLabel txtLast = new JLabel("Last Name");
		txtLast.setFont(new Font("Calibri", Font.PLAIN, 16));
		agregarAPanel(txtLast, panel2, 0, 4, 1, 1, GridBagConstraints.HORIZONTAL);
		
		JTextField cajaLast = new JTextField(10);
		agregarAPanel(cajaLast, panel2, 0, 5, 2, 1, GridBagConstraints.HORIZONTAL);
		
		gbc.anchor = GridBagConstraints.SOUTHWEST;
		
		ImageIcon iconobtn = new ImageIcon("./iconos/i1.png");
		
		JButton botonSus = new JButton("Suscribe");
		botonSus.setBackground(new Color(150,150,150));
		botonSus.setForeground(Color.white);
		botonSus.setFont(new Font("Calibri", Font.PLAIN, 18));
		
		botonSus.setIcon(iconobtn);
		
		agregarAPanel(botonSus, panel2, 0, 6, 1, 2, 0);
		
		
		JLabel txtCopy = new JLabel("Copy/paste onto your site");
		txtCopy.setFont(new Font("Calibri", Font.PLAIN, 18));
		metodoMagicoQueAcomodaTodo(txtCopy, 1, 10, 1, 1, GridBagConstraints.HORIZONTAL);
		
		JTextArea areaCodigo = new JTextArea();
		areaCodigo.setText("<form action=\"/my-handling-form-page\" method=\"post\">\r\n"
				+ " <ul>\r\n"
				+ "  <li>\r\n"
				+ "    <label for=\"name\">Nombre:</label>\r\n"
				+ "    <input type=\"text\" id=\"name\" name=\"user_name\">\r\n"
				+ "  </li>\r\n"
				+ "  <li>\r\n"
				+ "    <label for=\"mail\">Correo electrónico:</label>\r\n"
				+ "    <input type=\"email\" id=\"mail\" name=\"user_mail\">\r\n"
				+ "  </li>\r\n"
				+ "  <li>\r\n"
				+ "    <label for=\"msg\">Mensaje:</label>\r\n"
				+ "    <textarea id=\"msg\" name=\"user_message\"></textarea>\r\n"
				+ "  </li>\r\n"
				+ " </ul>\r\n"
				+ "</form>");
		
		
		areaCodigo.setLineWrap(true);
		areaCodigo.setBorder(BorderFactory.createLineBorder(new Color(180,180,180)));
		areaCodigo.setWrapStyleWord(true);
	
		areaCodigo.setFont(new Font("Calibri", Font.PLAIN, 16));
		areaCodigo.setBackground(new Color(250, 250, 250));
		
		
		JScrollPane scroll = new JScrollPane(areaCodigo);
		scroll.setBorder(BorderFactory.createLineBorder(new Color(180,180,180)));
		
		metodoMagicoQueAcomodaTodo(scroll, 1, 11, 1, 9, GridBagConstraints.BOTH);
		
		
	}
	
	
	public void metodoMagicoQueAcomodaTodo(Component c, int x, int y, int w, int h, int f) {
		gbc.gridx = x;
		gbc.gridy = y;
		
		gbc.gridwidth = w;
		gbc.gridheight = h;
		
		gbc.fill = f;
		gbl.setConstraints(c, gbc);
		add(c);
	}
	
	public void agregarAPanel(Component c, JPanel p, int x, int y, int w, int h, int f) {
		gbc.gridx = x;
		gbc.gridy = y;
		
		gbc.gridwidth = w;
		gbc.gridheight = h;
		
		gbc.fill = f;
		gbl.setConstraints(c, gbc);
		p.add(c);
	}
}

public class PruebaActividad03 {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {				
				// TODO Auto-generated method stub
				new VentanaInicio();
				
			}
		});
	}
}
