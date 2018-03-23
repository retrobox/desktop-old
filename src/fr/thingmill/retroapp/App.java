//RetroApp Designed and created by StoneSet
package fr.thingmill.retroapp;

import java.io.File;
import java.io.IOException;
import fr.theshark34.supdate.BarAPI;
import fr.theshark34.supdate.SUpdate;
import fr.theshark34.supdate.application.integrated.FileDeleter;
import fr.theshark34.swinger.Swinger;


public class App {
	private static Thread updateThread;
	public static final File RA_OUT = new File (System.getenv("LOCALAPPDATA") + "\\Programs\\RetroApp\\");

	public static void update() throws Exception {
		SUpdate su = new SUpdate("http://supdate.stoneset.pw", RA_OUT);
		su.addApplication(new FileDeleter());
		
		updateThread = new Thread() {
			private int val;
			private int max;
			
			@Override
			
			public void run() {
				while(!this.isInterrupted()) {
					if(BarAPI.getNumberOfFileToDownload() == 0) {
					Frame.getInstance().getPanel().setInfoText("V\u00e9rification des fichiers");
					continue;
					}
					

					
					val = (int) (BarAPI.getNumberOfTotalDownloadedBytes() / 1000);
					max = (int) (BarAPI.getNumberOfTotalBytesToDownload() / 1000);
					
					Frame.getInstance().getPanel().getProgressBar().setMaximum(max);
					Frame.getInstance().getPanel().getProgressBar().setValue(val);
					
					Frame.getInstance().getPanel().setInfoText("T\u00e9l\u00e9chargement des fichiers " +
					BarAPI.getNumberOfDownloadedFiles() + "/" + BarAPI.getNumberOfFileToDownload() + " " +
					Swinger.percentage(val, max) + "%");
				}
			}
		};
		
		
		
		updateThread.start();		
		su.start();
		updateThread.interrupt();
		
	}
	
	public static void launch() throws IOException {
      	System.out.println("Connection réussi");
      	@SuppressWarnings("unused")
		fr.thingmill.retroapp.principal.SettingsFrame frame = new fr.thingmill.retroapp.principal.SettingsFrame();
      	Frame.getInstance().setVisible(false);
      	
	}
	
	public static void interruptThread() {
		updateThread.interrupt();
		
		
		}

	}
//RetroApp Designed and created by StoneSet