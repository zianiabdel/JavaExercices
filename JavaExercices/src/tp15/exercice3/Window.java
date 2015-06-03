package tp15.exercice3;

import java.awt.event.*;

import javax.swing.JFrame;
/**
 * @author Abderrahman
 *
 */
@SuppressWarnings("serial")
public class Window extends JFrame implements ActionListener, MouseListener {
	public static void main(String[] args){       
		JFrame fenetre = new JFrame();

		System.out.println("The window will be shown");
		fenetre.setBounds(750,300, 400,200);
		fenetre.setTitle("My First Window");
		fenetre.setVisible(true);
		System.out.println("The Window is shown!");
		fenetre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	public void mouseClicked (MouseEvent ev) {
		System.out.println ("clic dans fenetre") ;
	}
	public void mouseEntered(MouseEvent arg0) {	
	}
	public void mouseExited(MouseEvent arg0) {
	}
	public void mousePressed(MouseEvent arg0) {
	}
	public void mouseReleased(MouseEvent arg0) {
	}
	public void actionPerformed(ActionEvent arg0) {
	}
}