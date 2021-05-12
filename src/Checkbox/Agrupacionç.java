package Checkbox;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;

public class Agrupacionç {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agrupacionç window = new Agrupacionç();
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
	public Agrupacionç() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 662, 406);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Hombre");
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Mujer");
		panel.add(rdbtnNewRadioButton_1);
		
		ButtonGroup bg=new ButtonGroup();    
        bg.add(rdbtnNewRadioButton);
        bg.add(rdbtnNewRadioButton_1);  
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("JAVA");
		panel_1.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("C++");
		panel_1.add(chckbxNewCheckBox);
	}

}
