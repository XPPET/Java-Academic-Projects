import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class ContainerFrame extends JFrame {
	
	private JPanel panel = new JPanel();
	
	private JButton button = new JButton("Calculate Ship Cost");
	
	private Ship ship;

	private JList shipList = new JList();
	private DefaultListModel model = new DefaultListModel();
	
	private ArrayList<Ship> ships;
	
	public ContainerFrame(ArrayList<Ship> someShips) {
		
		ships = someShips;
		
		for(Ship ship: ships)
			model.addElement(ship.getName());
		
		shipList.setModel(model);
		
		panel.add(button);
		panel.add(shipList);
		this.setContentPane(panel);
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				String selectedShipName = (String)shipList.getSelectedValue();
				Ship selectedShip = null;
				for(Ship ship: ships)
					if(ship.getName().equals(selectedShipName)) {
						selectedShip = ship;
						break;
					}
				
				System.out.println(selectedShip.calculateTotalCharge());
			}
			
		});
	
		this.setVisible(true);
		this.setSize(400, 400);
		this.setTitle("Container Frame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
}
