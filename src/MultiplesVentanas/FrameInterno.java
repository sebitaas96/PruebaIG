package MultiplesVentanas;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameInterno extends JInternalFrame {

	/**
	 * Create the frame.
	 */
	public FrameInterno() {
		setBounds(100, 100, 450, 300);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		getContentPane().add(btnNewButton, BorderLayout.WEST);

	}

}
