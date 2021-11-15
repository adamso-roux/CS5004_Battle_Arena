import java.util.LinkedList;
//// New Stuff For File
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;



// Code for the button and sound were adapted from https://www.youtube.com/watch?v=qPVkRtuf9CQ&t=238s
public class ArenaDriver {
	//// For the window
	//// take this out if it doesn't work
	JFrame window;
	Container con;
	JPanel buttonPanel;
	JButton soundButton;
	String clickSound;
	ButtonHandler bHandler = new ButtonHandler();
	SoundEffect se = new SoundEffect();
	//////////////////////////
	
	
	
    public static void main(String[] args){
    	
    	new ArenaDriver();
    	// Remove comments if you want the fighting to take place independent of the button
    	// See below to 
        //Create our list of heroes and bad guys:
       /*
    	LinkedList<Hero>  heroes = new LinkedList<Hero>();
        LinkedList<BadGuy>  badguys = new LinkedList<BadGuy>();

        //Populate our rack of weapons:
        LinkedList<Weapon> weaponRack = ArenaDriver.getWeaponRack();
        BadGuy oliver = new BadGuy("Oliver", 100, 10);
        Hero drG = new Hero("Dr.G", 100, 100, 10);
        Hero kris = new Hero("Kris Barnes", 100, 50, 10);
        BadGuy derek = new BadGuy("Derek", 100, 10);
        Hero bailee = new Hero("Bailee", 100, 99, 99);

        //add some contestants:
        heroes.add(drG);
        heroes.add(kris);
        heroes.add(bailee);

        badguys.add(oliver);
        badguys.add(derek);

        //The basic structure of the Arena function calls:
        BattleArena ThunderDome = new BattleArena(heroes, badguys, weaponRack);
        ThunderDome.AnnounceContestants();
        ThunderDome.FIGHT();
        ThunderDome.AnnounceWinner();
*/
    }

    public static LinkedList<Weapon> getWeaponRack() {
        LinkedList<Weapon> weaponRack = new LinkedList<Weapon>();
        weaponRack.add(new Melee("Sword", 22.5, 10));
        weaponRack.add(new Magic("Mjolnir", 19.0, 10));
        weaponRack.add(new Ranged("Arrow", 15.750, 10));
        weaponRack.add(new Melee("Spear", 18.25, 10));
        weaponRack.add(new Magic("Wingardium Leviosa", 21.0, 10));
        weaponRack.add(new Ranged("Grenade", 25.0, 10));

        return weaponRack;
    }
    
public ArenaDriver(){
		
		window = new JFrame();
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		con = window.getContentPane();
		
		buttonPanel = new JPanel();
		buttonPanel.setBounds(300, 300, 200, 100);
		buttonPanel.setBackground(Color.black);
		con.add(buttonPanel);
		
		soundButton = new JButton("Play Game");
		soundButton.setFocusPainted(false);
		soundButton.addActionListener(bHandler);
		soundButton.setActionCommand("soundB");
		buttonPanel.add(soundButton);
				
		window.setVisible(true);
			
        // Type your audio file name in the res folder
		clickSound = ".//res//mixkit-long-game-over-notification-276.wav";
		


	}
	
	public class SoundEffect {
		
		Clip clip;
		
		public void setFile(String soundFileName){
			
			try{
				File file = new File(soundFileName);
				AudioInputStream sound = AudioSystem.getAudioInputStream(file);	
				clip = AudioSystem.getClip();
				clip.open(sound);
			}
			catch(Exception e){
				
			}
		}
		
		public void play(){
			
			clip.setFramePosition(0);
			clip.start();
		}

	}
	
	public class ButtonHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			
			se.setFile(clickSound);
			se.play();
			////Can be added back to the original driver but this works for the button to start play
			LinkedList<Hero>  heroes = new LinkedList<Hero>();
	        LinkedList<BadGuy>  badguys = new LinkedList<BadGuy>();

	        //Populate our rack of weapons:
	        LinkedList<Weapon> weaponRack = ArenaDriver.getWeaponRack();
	        BadGuy oliver = new BadGuy("Oliver", 100, 10);
	        Hero drG = new Hero("Dr.G", 100, 100, 10);
	        Hero kris = new Hero("Kris Barnes", 100, 50, 10);
	        BadGuy derek = new BadGuy("Derek", 100, 10);
	        Hero bailee = new Hero("Bailee", 100, 99, 99);

	        //add some contestants:
	        heroes.add(drG);
	        heroes.add(kris);
	        heroes.add(bailee);

	        badguys.add(oliver);
	        badguys.add(derek);

	        //The basic structure of the Arena function calls:
	        BattleArena ThunderDome = new BattleArena(heroes, badguys, weaponRack);
	        ThunderDome.AnnounceContestants();
	        ThunderDome.FIGHT();
	        ThunderDome.AnnounceWinner();
			
		}
	}

}




