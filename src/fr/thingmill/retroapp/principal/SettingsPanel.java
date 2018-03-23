package fr.thingmill.retroapp.principal;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import fr.theshark34.swinger.Swinger;

import fr.theshark34.swinger.event.SwingerEvent;
import fr.theshark34.swinger.event.SwingerEventListener;
import fr.theshark34.swinger.textured.STexturedButton;
import fr.thingmill.retroapp.Frame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class SettingsPanel extends JPanel implements SwingerEventListener {	
	private Image background  = Swinger.getResource("Background.jpg");
	@SuppressWarnings("unused")
	private STexturedButton hideButton = new STexturedButton(Swinger.getResource("quit.png"));
	@SuppressWarnings("unused")
	private STexturedButton quitButton = new STexturedButton(Swinger.getResource("reduce.png"));
	private JLabel infoLabel2 = new JLabel("http://happyblocks.info/", SwingConstants.CENTER);
	private STexturedButton playButton = new STexturedButton(Swinger.getResource("login.png"));
	private JLabel jLabel_Message = new javax.swing.JLabel();
	private JPanel jPanel_Message = new javax.swing.JPanel();
	private final JButton btnNewButton = new JButton("New button");
	public SettingsPanel() {
		this.setLayout(null);
		
		infoLabel2.setForeground(Color.WHITE);
		infoLabel2.setBounds(0, 540, 976, 22);
	
	JLabel lblLogo = new JLabel("");
	lblLogo.setIcon(new ImageIcon(Frame.class.getResource("/Ressources/logo.png")));
	lblLogo.setBounds(26, 17, 394, 149);
	this.add(lblLogo);
	
	playButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	playButton.setBounds(243, 350, 199, 46);
	playButton.addEventListener(this);
	this.add(playButton);
	
	jPanel_Message.setBackground(java.awt.Color.decode("#3a5795"));
	jLabel_Message.setHorizontalAlignment(SwingConstants.CENTER);
	jLabel_Message.setFont(new java.awt.Font("BigNoodleTitling", Font.PLAIN, 20));
	jLabel_Message.setBounds(496, 467, 339, 27);
	this.add(jLabel_Message);
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
	        Connection connection;
	        PreparedStatement ps;   
			try {                  
						      	Driver myDriver = new com.mysql.jdbc.Driver();
						        DriverManager.registerDriver(myDriver);
			                    connection = DriverManager.getConnection("jdbc:mysql://89.234.180.28/wn0xr5_retroapp", "wn0xr5_retroapp", "Musicderouet");
			                    ps = connection.prepareStatement("SELECT `serialnumber`, `username`, `password` FROM `users` WHERE `username`");
			                      ps.setString(1, fr.thingmill.retroapp.Panel.usernameField.getText());
			                      ps.setString(2, String.valueOf(fr.thingmill.retroapp.Panel.passwordField.getPassword()));
			                    ResultSet result = ps.executeQuery();
			                   while(result.next()){
			                       System.out.println("hi22");
			                       jLabel_Message.setText(result.getString("serialnumber"));
			                   }
			                      connection.close();  
			                   } catch (SQLException ex) {
			                 	  System.out.println("Une erreur est survenue lors de la connexion à la BDD");
			                   }
		}
	});
	btnNewButton.setBounds(584, 287, 89, 23);
	
	add(btnNewButton);

	}
	@Override
 public void onEvent(SwingerEvent e) {
		
		if(e.getSource() == playButton) {
			System.out.println("Bouton 'Jouer' cliquer");

	      	@SuppressWarnings("unused")
			fr.thingmill.retroapp.Frame frame1 = new fr.thingmill.retroapp.Frame();
	      	Frame.getInstance().setVisible(false);

		}
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawImage(background, 0, 0, this.getWidth(), this.getHeight(), this);
	}
	
	
}

//HappyBlocks Server, MOJANG AB, FORGE, LITARVAN, VERSION OFFICIELLE