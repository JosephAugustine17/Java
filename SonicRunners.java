// The "CptCover" class.
import java.awt.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Image;


public class CptCover extends JFrame
{
    JFrame frame = new JFrame ("Math Maze");
    private static JFrame menu;
    private static JPanel menuPanel;
    private static JButton playButton;
    private static JButton instructionButton;
    private static File soundFile;
    private static Clip clip;
    private static JLabel background;
    ListenForButton action = new ListenForButton ();


    // The output console

    public static void main (String[] args) throws Exception
    {
	new CptCover ();



	// Place your program here.  'c' is the output console
    } // main method


    public void Sound () throws Exception
    {
	soundFile = new File ("SonicMusic.wav");
	AudioInputStream sound = AudioSystem.getAudioInputStream (soundFile);
	//load the sound into memory (a CLIP)
	DataLine.Info info = new DataLine.Info (Clip.class, sound.getFormat ());
	clip = (Clip) AudioSystem.getLine (info);
	clip.open (sound);
	clip.loop (Clip.LOOP_CONTINUOUSLY);
    }


    public CptCover () throws Exception

    {
	mainMenu ();

    }


    public void optionMenu ()
    {
	menu.setVisible (true);

	background = new JLabel (new ImageIcon (new ImageIcon ("Images/images.JPG").getImage ().getScaledInstance (800, 800, Image.SCALE_DEFAULT)));
	menuPanel.add (background);
	menu.getContentPane ().add (menuPanel);
     
    }



    public void mainMenu () throws Exception

    {
	Sound ();
	menu = new JFrame ("Sonic Runnners");
	menu.setSize (800, 800);
	Toolkit tk = Toolkit.getDefaultToolkit ();
	Dimension dim = tk.getScreenSize ();    //getScreenSize() returns the size of the screen
	int xPos = (dim.width / 2) - (menu.getWidth () / 2); //dim.width returns width of screen; this.getWidth() returns width of frame you are making
	int yPos = (dim.height / 2) - (menu.getHeight () / 2);
	menu.setLocation (xPos, yPos);      // positions the frame at centre of the screen
	menuPanel = new JPanel ();
	menuPanel.setLayout (null);
	menu.getContentPane ().add (menuPanel);
	playButton = new JButton (new ImageIcon (new ImageIcon ("Images/images.jpg").getImage ().getScaledInstance (200, 70, Image.SCALE_DEFAULT)));
	playButton.setToolTipText ("Its a button");
	playButton.setBounds (0, 100, 150, 45);
	playButton.addActionListener (action);
	menuPanel.add (playButton);
	menuPanel.add (playButton);
	instructionButton = new JButton ("Instructions");
	instructionButton.setBounds (0, 200, 150, 45);
	menuPanel.add (instructionButton);
	menu.setVisible (true);
	menu.setResizable (false);


	JLabel background1 = new JLabel (new ImageIcon (new ImageIcon ("Images/sonic.JPG").getImage ().getScaledInstance (200, 200, Image.SCALE_DEFAULT)));
	background1.setBounds (50, 50, 200, 200);
	menuPanel.add (background1);






	background = new JLabel (new ImageIcon (new ImageIcon ("Images/sonicrunners.PNG").getImage ().getScaledInstance (800, 800, Image.SCALE_DEFAULT)));
	background.setBounds (0, 0, 800, 800);
	menuPanel.add (background);
	background.setOpaque (false);
	menu.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	menu.setResizable (true);
	menu.setLocationRelativeTo (null);
	menu.setVisible (true);

    }


    private class ListenForButton implements ActionListener
    {
	public void actionPerformed (ActionEvent e)
	{
	    if (e.getSource () == playButton)
	    {
		clip.close ();
		menuPanel.removeAll ();
		menuPanel.revalidate ();
		menuPanel.repaint ();
		playButton.revalidate ();
		optionMenu ();
	    }

	}
    }
} // CptCover class



