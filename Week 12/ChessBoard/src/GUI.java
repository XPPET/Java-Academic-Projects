import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JFrame {
	
	private Board board;

	public GUI() {		
		board = new Board();
		this.setContentPane(board);
		
		MouseMoveListener listener = new MouseMoveListener();
		board.addMouseMotionListener(listener);
		
		this.setVisible(true);
		this.setSize(400, 400);
		this.setTitle("ChessBoard");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class Board extends JPanel {
		
		private int xCoord = 0;
		private int yCoord = 0;
		
		private int sqSize;
		
		public void setXY(int x, int y) {
			xCoord = x - sqSize/2;
			yCoord = y - sqSize/2;
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			
			int sqSize1 = this.getWidth()/8;
			int sqSize2 = this.getHeight()/8;
			
			sqSize = sqSize1;
			if(sqSize2 < sqSize1)
				sqSize = sqSize2;
			
			for(int i=0; i<8; i++) {
				for(int j=0; j<8; j++) {
					int x = j * sqSize;
					int y = i * sqSize;
					//g.drawRect(x, y, sqSize, sqSize);
					if( (i+j)%2 == 0) {
						g.setColor(Color.BLUE);
						g.fillRect(x, y, sqSize, sqSize);
					}
					else {
						g.setColor(Color.RED);
						g.fillRect(x, y, sqSize, sqSize);
					}
				}
			}
			
			g.setColor(Color.GREEN);
			g.fillOval(xCoord, yCoord, sqSize, sqSize);
		}	
	}
	
	class MouseClickListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent event) {
		
			int x = event.getX();
			int y = event.getY();
			board.setXY(x, y);
			board.repaint();
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class MouseMoveListener implements MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent event) {
			int x = event.getX();
			int y = event.getY();
			board.setXY(x, y);
			board.repaint();
			
		}

		@Override
		public void mouseMoved(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}

}


