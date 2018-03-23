package fr.thingmill.retroapp.principal;
import javax.swing.JFrame;

import fr.theshark34.swinger.Swinger;
import fr.theshark34.swinger.util.WindowMover;
import fr.thingmill.retroapp.principal.SettingsFrame;
@SuppressWarnings("serial")
public class SettingsFrame extends JFrame {

	private static SettingsFrame instance;
	private SettingsPanel Panel;

	public SettingsFrame() {
		this.setTitle("RetroApp for RetroBox console");
		this.setSize(1000, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setUndecorated(false);
		this.setResizable(false);
      	this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setIconImage(Swinger.getResource("icon.png"));
		this.setContentPane(Panel = new SettingsPanel());
		WindowMover mover = new WindowMover(this);
		this.addMouseListener(mover);
	    this.addMouseMotionListener(mover);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		Swinger.setSystemLookNFeel();
		Swinger.setResourcePath("/Ressources/");
		
		instance = new SettingsFrame();
		
		
	}

	public static  SettingsFrame getInstance() {
		return  instance;
		
	}
	public SettingsPanel getPanel() {
		return this.Panel;
	}
	
}
