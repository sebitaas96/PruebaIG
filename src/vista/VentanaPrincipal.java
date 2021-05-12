package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import javax.swing.JSlider;
import javax.swing.JTree;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.GridLayout;

public class VentanaPrincipal {

	private JFrame frmAplicacionfacturas;
	private JTextField textField;

	/**
	 * Launch the application.
	 * Esto es una panel sobre el cual iremos colocando todos los elementos que queramos
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal window = new VentanaPrincipal();
					window.frmAplicacionfacturas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAplicacionfacturas = new JFrame();
		frmAplicacionfacturas.setTitle("AplicacionFacturas");
		frmAplicacionfacturas.setBounds(100, 100, 455, 410);
		frmAplicacionfacturas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAplicacionfacturas.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panelNorte = new JPanel();
		frmAplicacionfacturas.getContentPane().add(panelNorte, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("New label");
		panelNorte.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		panelNorte.add(lblNewLabel_1);
		
		JPanel PanelWest = new JPanel();
		frmAplicacionfacturas.getContentPane().add(PanelWest, BorderLayout.WEST);
		PanelWest.setLayout(new BoxLayout(PanelWest, BoxLayout.Y_AXIS));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		PanelWest.add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		PanelWest.add(lblNewLabel_2);
		
		JTextPane textPane = new JTextPane();
		PanelWest.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		PanelWest.add(textPane_1);
		
		JPanel PanelSur = new JPanel();
		frmAplicacionfacturas.getContentPane().add(PanelSur, BorderLayout.SOUTH);
		
		JPanel PanelEast = new JPanel();
		frmAplicacionfacturas.getContentPane().add(PanelEast, BorderLayout.EAST);
		
		JPanel PanelCentral = new JPanel();
		frmAplicacionfacturas.getContentPane().add(PanelCentral, BorderLayout.CENTER);
		PanelCentral.setLayout(new GridLayout(2, 2, 2, 3));
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		PanelCentral.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		PanelCentral.add(lblNewLabel_4);
		
		textField = new JTextField();
		PanelCentral.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		PanelCentral.add(lblNewLabel_5);
	}
}
