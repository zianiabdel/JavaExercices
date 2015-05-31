package tp15.exercice3;

import javax.swing.JFrame;

/**
 * @author Abderrahman
 *
 */
public class Window {
  public static void main(String[] args){       
    JFrame fenetre = new JFrame();
   
    System.out.println("The window will be shown");
    fenetre.setBounds(750,300, 400,200);
    fenetre.setTitle("My First Window");
    fenetre.setVisible(true);
    System.out.println("The Window is shown!");
    fenetre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  }       
  
}