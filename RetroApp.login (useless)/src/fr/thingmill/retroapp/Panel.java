//RetroApp Designed and created by StoneSet
package fr.thingmill.retroapp;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import fr.thingmill.retroapp.HttpRequest;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import fr.theshark34.swinger.Swinger;
import fr.theshark34.swinger.colored.SColoredBar;
import fr.theshark34.swinger.event.SwingerEvent;
import fr.theshark34.swinger.event.SwingerEventListener;
import fr.theshark34.swinger.textured.STexturedButton;
import java.awt.Font;

@SuppressWarnings({ "serial", "unused" })
public class Panel extends JPanel implements SwingerEventListener {	
	private Image background  = Swinger.getResource("Background.jpg");
	public static JTextField usernameField = new javax.swing.JTextField();
	public static JPasswordField passwordField = new javax.swing.JPasswordField();	
	private STexturedButton playButton = new STexturedButton(Swinger.getResource("login.png"));
	private STexturedButton hideButton = new STexturedButton(Swinger.getResource("quit.png"));
	private STexturedButton quitButton = new STexturedButton(Swinger.getResource("reduce.png"));
	private JLabel infoLabel2 = new JLabel("http://happyblocks.info/", SwingConstants.CENTER);
	private JLabel jLabel_Message = new javax.swing.JLabel();
	private JPanel jPanel_Message = new javax.swing.JPanel();
	private JLabel infoLabel = new JLabel(" ", SwingConstants.CENTER);
	
	
	private SColoredBar progressBar = new SColoredBar(Swinger.getTransparentWhite(100), Swinger.getTransparentWhite(175));
		
	
	public Panel() {
		this.setLayout(null);
		
		usernameField.setForeground(Color.BLACK);
		usernameField.setFont(usernameField.getFont().deriveFont(20f));
		usernameField.setCaretColor(Color.BLACK);
		usernameField.setBorder(null);
		usernameField.setOpaque(false);
		usernameField.setBounds(585, 163, 210, 50);
		this.add(usernameField);

		passwordField.setForeground(Color.BLACK);
		passwordField.setFont(usernameField.getFont());
		passwordField.setCaretColor(Color.BLACK);
		passwordField.setOpaque(false);
		passwordField.setBorder(null);
		passwordField.setBounds(583, 257, 210, 50);
		this.add(passwordField);
		
		playButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		playButton.setBounds(533, 358, 260, 50);
		playButton.addEventListener(this);
		this.add(playButton);
		
		progressBar.setBounds(0, 551, 995, 20);
		this.add(progressBar);
		
		infoLabel.setForeground(Color.WHITE);
		infoLabel.setFont(new Font("Roboto", Font.PLAIN, 20));
		infoLabel.setBounds(0, 530, 976, 25);
		this.add(infoLabel);
		
		infoLabel2.setForeground(Color.WHITE);
		infoLabel2.setFont(usernameField.getFont());
		infoLabel2.setBounds(0, 540, 976, 22);
		//this.add(infoLabel2);
		
        Component link = new JLabel("J'ai oublié mon mot de passe");
        link.setForeground(Color.LIGHT_GRAY);
        link.setFont(new Font("Roboto", Font.PLAIN, 18));
        link.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        link.setBounds(549, 434, 232, 22);
        link.addMouseListener(new MouseAdapter() {
        	public void mouseClicked(MouseEvent e) {
        		if (e.getClickCount() > 0) {
        			if (Desktop.isDesktopSupported()) {
        				Desktop desktop = Desktop.getDesktop();
        				try {
        					URI uri = new URI("https://retrobox.fr/renewpassword");
        					desktop.browse(uri);
        				} catch (IOException ex) {
	                } catch (URISyntaxException ex) {
					}
	        } else {
	        }
	      }
	   }
	});
	this.add(link);
	
	JLabel lblLogo = new JLabel("");
	lblLogo.setIcon(new ImageIcon(Frame.class.getResource("/Ressources/logo.png")));
	lblLogo.setBounds(26, 17, 394, 149);
	this.add(lblLogo);
	
	JLabel lblPrtARejoindre = new JLabel("PR\u00CAT A REJOINDRE LE FUTUR");
	lblPrtARejoindre.setHorizontalAlignment(SwingConstants.CENTER);
	lblPrtARejoindre.setForeground(Color.WHITE);
	lblPrtARejoindre.setFont(new Font("BigNoodleTitling", Font.PLAIN, 36));
	lblPrtARejoindre.setBounds(10, 228, 486, 41);
	this.add(lblPrtARejoindre);
	
	JLabel lblRetroboxVousLibre = new JLabel("Bienvenue dans le futur du pass\u00E9.");
	lblRetroboxVousLibre.setHorizontalAlignment(SwingConstants.CENTER);
	lblRetroboxVousLibre.setFont(new Font("BigNoodleTitling", Font.PLAIN, 24));
	lblRetroboxVousLibre.setForeground(Color.LIGHT_GRAY);
	lblRetroboxVousLibre.setBounds(36, 280, 439, 27);
	this.add(lblRetroboxVousLibre);
	
	JLabel lblV = new JLabel("v0.0.1");
	lblV.setFont(new Font("Roboto", Font.BOLD, 24));
	lblV.setForeground(Color.DARK_GRAY);
	lblV.setBounds(915, 526, 68, 29);
	this.add(lblV);
	
	JLabel lblConnexion = new JLabel("CONNEXION");
	lblConnexion.setHorizontalAlignment(SwingConstants.CENTER);
	lblConnexion.setForeground(Color.BLACK);
	lblConnexion.setFont(new Font("BigNoodleTitling", Font.PLAIN, 43));
	lblConnexion.setBounds(459, 67, 399, 48);
	this.add(lblConnexion);
		
	JLabel lblMessage = new JLabel("Email");
	lblMessage.setFont(new Font("Roboto", Font.ITALIC, 14));
	lblMessage.setForeground(Color.GRAY);
	lblMessage.setBounds(585, 182, 48, 17);	
	this.add(lblMessage);
	
	JLabel lblPassword = new JLabel("Mot de passe");
	lblPassword.setForeground(Color.GRAY);
	lblPassword.setFont(new Font("Roboto", Font.ITALIC, 14));
	lblPassword.setBounds(585, 276, 94, 17);
	this.add(lblPassword);
		
	JLabel lock = new JLabel(new ImageIcon(Panel.class.getResource("/Ressources/psw.png")));
	lock.setLocation(530, 243);
	lock.setSize(50, 50);
	this.add(lock);
	//MAIL ICON
	JLabel mail = new JLabel(new ImageIcon(Frame.class.getResource("/Ressources/email.png")));
	mail.setLocation(533, 149);
	mail.setSize(50, 50);
	this.add(mail);

	JLabel ligne1 = new JLabel(new ImageIcon(Frame.class.getResource("/Ressources/ligne.png")));
	ligne1.setLocation(533, 211);
	ligne1.setSize(259, 2);
	this.add(ligne1);
		
	JLabel ligne2 = new JLabel(new ImageIcon(Frame.class.getResource("/Ressources/ligne.png")));
	ligne2.setLocation(533, 304);
	ligne2.setSize(259, 2);
	this.add(ligne2);
		
	jPanel_Message.setBackground(java.awt.Color.decode("#3a5795"));
	jLabel_Message.setHorizontalAlignment(SwingConstants.CENTER);
	jLabel_Message.setFont(new java.awt.Font("BigNoodleTitling", Font.PLAIN, 20));
	jLabel_Message.setBounds(496, 467, 339, 27);
	this.add(jLabel_Message);
	    
	JLabel lblNewLabel_1 = new JLabel("");
	lblNewLabel_1.setIcon(new ImageIcon(Frame.class.getResource("/Ressources/blank.png")));
	lblNewLabel_1.setBounds(496, 55, 339, 439);
	this.add(lblNewLabel_1);
	
	JButton button = new JButton("");
       button.addMouseListener(new MouseAdapter() {
       	public void mouseClicked(MouseEvent e) {
        	if (e.getClickCount() > 0) {
        		if (Desktop.isDesktopSupported()) {
        			Desktop desktop = Desktop.getDesktop();
        			try {
        				URI uri = new URI("https://retrobox.fr/shop");
        				desktop.browse(uri);
        			} catch (IOException ex) {
	               } catch (URISyntaxException ex) {
				}
	       } else {
	       }
      }
   }
 });
	button.setIcon(new ImageIcon(Frame.class.getResource("/Ressources/sabonner.png")));
	button.setBounds(134, 380, 260, 50);
	button.setContentAreaFilled(false);
	button.setFocusable(false);
	button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	this.add(button);
	button.setBorder(BorderFactory.createEmptyBorder());	
	}
	
	@SuppressWarnings("deprecation")
	@Override
 public void onEvent(SwingerEvent e) {
	   if(e.getSource() == playButton) {
			System.out.println("Bouton 'Jouer' cliquer");

			
			//setFieldsEnabled(false); //Desactive les Fields et le bouton, une seule chance
			
			if(usernameField.getText().replaceAll(" ", "").length() == 0 || passwordField.getText().length() ==0) {	
             	jLabel_Message.setText("Veuillez entrer un pseudo et un mot de passe valides.");
              	jLabel_Message.setForeground(Color.RED);
              	System.out.println("Aucun Field completé");    
				//JOptionPane.showMessageDialog(this, "Erreur, veuiller entrer un pseudo et un mot de passe valides.", "Erreur 01", JOptionPane.ERROR_MESSAGE);
				setFieldsEnabled(true);
				return;
			}
			  
			try 
			{
			        URL url = new URL("http://www.google.com");
			 
			        URLConnection connection = url.openConnection();
			        connection.connect();   
			 
			        System.out.println("Connecté à internet");   

          Thread t = new Thread() {
        	  //request api http
        	  //ouverture du lien de connection
        	  //ouverture fenetre demande de code de verification
        	  //comparaison avec l'api code client et serveur
        	  //ouverture de l'app et mise a jour
        	  
        	  
        	  
              @Override
              public void run() {
            	  //HttpRequest.get("https://api.lefuturiste.fr/minecraft/mc01/start/confirm%22).basic(%22JiVhfFwirHvMsHPLMMq4%22,%22Z6dGr2b2N62oUabpbrb2k5yPLvZCSN%22).code();";
                  Connection connection;
                  PreparedStatement ps;
                  try {
                	  Driver myDriver = new com.mysql.jdbc.Driver();
                      DriverManager.registerDriver(myDriver);
                      
                      connection = DriverManager.getConnection("");
                      ps = connection.prepareStatement("SELECT `username`, `password` FROM `users` WHERE `username` = ? AND `password` = ?");
                      System.out.println("Connexion réussi a la base de donnée");
                      ps.setString(1, usernameField.getText());
                      ps.setString(2, String.valueOf(passwordField.getPassword()));
                      ResultSet result = ps.executeQuery();
                      if(result.next()){
                          jLabel_Message.setText("Connexion réussi !");
                          jLabel_Message.setForeground(Color.GREEN);
        	                try {
        						App.update();
        					} catch (Exception e1) {
        						e1.printStackTrace();
        					}
          	                try {
        						App.launch();
        					} catch (IOException e) {
        						e.printStackTrace();
        					}
                      }
                      else{
                    	jLabel_Message.setText("Erreur de connexion");
                      	jLabel_Message.setForeground(Color.RED);
                      	//timer1.start();
                      }
                      connection.close(); 
                      
                  } catch (SQLException ex) {
                	  System.out.println("Une erreur est survenue lors de la connexion à la BDD");
                  		jLabel_Message.setText("Erreur de connexion à la BDD");
                  		jLabel_Message.setForeground(Color.RED);
                  }
                  
              }
              
          };
          t.start();
			 }catch (Exception e1){
				 //String message = "Veuillez vérifier votre connexion Internet";
				 //JOptionPane.showMessageDialog(new JFrame(), message, "Dialog",
				 //JOptionPane.ERROR_MESSAGE);
             	jLabel_Message.setText("Veuillez vérifier votre connexion Internet");
              	jLabel_Message.setForeground(Color.RED);
			System.out.println("Pas de connexion internet disponible");     
			                                                            
			} 

          }

		}
		
	

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawImage(background, 0, 0, this.getWidth(), this.getHeight(), this);
	}
	
	private void setFieldsEnabled(boolean enabled) {
		usernameField.setEnabled(enabled);
		passwordField.setEnabled(enabled);
		playButton.setEnabled(enabled);
	}
	
	public SColoredBar getProgressBar() {	
		return progressBar;
	}
	
	public void setInfoText(String text) {
		infoLabel.setText(text);
	}
	
}

//RetroApp Designed and created by StoneSet