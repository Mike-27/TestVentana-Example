package gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PaquetesInterface {

	JFrame ventana =new JFrame();
	JPanel panel=new JPanel();
	GridLayout gridLayout = new GridLayout(2, 3);
	JButton btn2,btn3,btn4,btn5,btn6;
	
	
	
	public void contruccion(){
		ventana.setLayout(gridLayout);
		ventana.add(panel);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		JButton btn1=new JButton("Boton1");
		ventana.add(btn1);
		ventana.add(btn2 =new JButton("Boton2"));
		ventana.add(btn3 =new JButton("Boton3"));
		ventana.add(btn4 =new JButton("Boton4"));
		ventana.add(btn5 =new JButton("Boton5"));
		ventana.add(btn6 =new JButton("Boton6"));
		
		
	}
	
}
