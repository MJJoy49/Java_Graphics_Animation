import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.sound.sampled.*;
import java.io.*;



public class frame extends JFrame{

    
   public frame()
    {
        panel_Graphics panel=new panel_Graphics();
        panel.setBackground(Color.BLACK);
        setSize(800,600);
        music();
        ImageIcon icon= new ImageIcon("moon.png");
        setIconImage(icon.getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        add(panel);

    }
	
	void music()
	{
		try {
            File file = new File("M.wav");
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);

            Clip clip2 = AudioSystem.getClip();
            clip2.open(audioInputStream);
            clip2.loop(Clip.LOOP_CONTINUOUSLY);
            clip2.start();

            File file1 = new File("A.wav");
            AudioInputStream audioInputStreamm = AudioSystem.getAudioInputStream(file1);
            Clip clip1 = AudioSystem.getClip();
            clip1.open(audioInputStreamm);
            clip1.start();

        } 
		catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) 
		{
            e.printStackTrace();
        }
    

	}
	

}