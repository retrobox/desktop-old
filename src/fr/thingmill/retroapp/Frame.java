//RetroApp Designed and created by StoneSet
package fr.thingmill.retroapp;
import javax.swing.JFrame;
import fr.theshark34.swinger.Swinger;
import fr.theshark34.swinger.util.WindowMover;
import fr.thingmill.retroapp.Frame;
import fr.thingmill.retroapp.Panel;
@SuppressWarnings("serial")
public class Frame extends JFrame {

	private static Frame instance;
	private Panel Panel;

	public Frame() {
		this.setTitle("RetroApp for RetroBox console");
		this.setSize(1000, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setUndecorated(false);
		this.setResizable(false);
		this.setIconImage(Swinger.getResource("icon.png"));
		this.setContentPane(Panel = new Panel());
       WindowMover mover = new WindowMover(this);
		this.addMouseListener(mover);
	    this.addMouseMotionListener(mover);
	   
		this.setVisible(true);

	}

	public static void main(String[] args) {
		Swinger.setSystemLookNFeel();
		Swinger.setResourcePath("/Ressources/");
		
		instance = new Frame();
		
		
	}

	public static  Frame getInstance() {
		return  instance;
		
	}
	public Panel getPanel() {
		return this.Panel;
	}
	
}
//RetroApp Designed and created by StoneSet