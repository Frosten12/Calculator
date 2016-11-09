import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Fenetre extends JFrame implements ActionListener
{
	JPanel container = new JPanel();
	JPanel klawiatura = new JPanel();
	JPanel east = new JPanel();
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");
	JButton b6 = new JButton("6");
	JButton b7 = new JButton("7");
	JButton b8 = new JButton("8");
	JButton b9 = new JButton("9");
	JButton b0 = new JButton("0");
	JButton bPoint = new JButton(".");
	JButton bEgal = new JButton("=");
	
	JButton bC = new JButton("C");
	JButton bPlus = new JButton("+");
	JButton bMinus = new JButton("-");
	JButton bMnozenie = new JButton("*");
	JButton bDzielenie = new JButton("/");
	
	Border blackline = BorderFactory.createLineBorder(Color.black);
	//Border empty = BorderFactory.createEmptyBorder(5,5,5,5);
	
	JLabel ekran = new JLabel();
	
	public Fenetre()
	{
		this.setTitle("Kalkulator");
		this.setSize(300,320);
		this.setLocationRelativeTo(null);
		//this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		container.setLayout(new BorderLayout());
		klawiatura.setLayout(new GridLayout(4,4,5,5));
		east.setLayout(new GridLayout(5,1,5,5));

		klawiatura.add(b1);
		klawiatura.add(b2);
		klawiatura.add(b3);
		klawiatura.add(b4);
		klawiatura.add(b5);
		klawiatura.add(b6);
		klawiatura.add(b7);
		klawiatura.add(b8);
		klawiatura.add(b9);
		klawiatura.add(b0);
		klawiatura.add(bPoint);
		klawiatura.add(bEgal);
		
		east.add(bC);
		east.add(bPlus);
		east.add(bMinus);
		east.add(bMnozenie);
		east.add(bDzielenie);
		east.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		
		ekran.setPreferredSize(new Dimension(250,40));
		ekran.setBorder(blackline);
		
		container.add(ekran,BorderLayout.NORTH);
		container.add(klawiatura, BorderLayout.CENTER);
		container.add(east, BorderLayout.EAST);

		container.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		this.setContentPane(container);
		this.setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent arg0)
	{
		
	}

}
