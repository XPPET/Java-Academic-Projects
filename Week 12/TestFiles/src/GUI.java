import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JFrame {
	
	private JFileChooser fc = new JFileChooser();
	private JPanel panel = new JPanel();
	private JButton button = new JButton("Open File");
	
	public GUI() {
		
		panel.add(button);
		
		this.getContentPane().add(panel);
		
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int returnVal = fc.showOpenDialog(panel);

				if(returnVal == JFileChooser.OPEN_DIALOG) {
					File file = fc.getSelectedFile();
					try {
						BufferedReader reader = new BufferedReader(new FileReader(file));
						String line = reader.readLine();
						while(line != null) 
						{
							System.out.println(line);
							line = reader.readLine();
						}
						reader.close();
					} catch (FileNotFoundException exc) {
						// TODO Auto-generated catch block
						exc.printStackTrace();
					}
					catch(IOException exc) {
						exc.printStackTrace();
					}
					
				}
			}
			
			
		});
		
		this.setSize(600, 600);
		this.setVisible(true);
	}

}
