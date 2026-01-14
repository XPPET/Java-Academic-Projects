import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame {
	
	private JPanel panel = new JPanel();
	
	private JTextField textField = new JTextField(20);
	private JButton button = new JButton("Press Me");
	private ImageIcon icon = new ImageIcon("uom.jpg");
	private JLabel label = new JLabel(icon);
	
	public GUI() {
		
		panel.add(textField);
		panel.add(button);
		panel.setBackground(Color.MAGENTA);
		panel.add(label);
		
		setContentPane(panel);
		
	}
	
	
}
