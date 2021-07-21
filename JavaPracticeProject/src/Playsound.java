import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Toolkit;
import java.net.URL;

public class Playsound 
{
	public void PlayBeep() 
	{        
       /* AudioClip clip = Applet.newAudioClip(getClass().getResource("C:\\Users\\Admin\\RestAssuredAPITest\\JavaPracticeProject\\src\\sound\\mixkit-sport-start-bleeps-918.wav"));
        clip.play();*/
        
        URL url = getClass().getResource("sound\\mixkit-sport-start-bleeps-918.wav");
        AudioClip clip = Applet.newAudioClip(url);
        clip.play();
        System.out.println("sound was play");
      //  Toolkit.getDefaultToolkit().beep();
    }
	
	public void playsecondsoud() 
	{
		try {
		      URL url = new URL("mixkit-sport-start-bleeps-918.wav" );
		      AudioClip ac = Applet.newAudioClip(url);
		      ac.play();

		      System.out.println("Press any key to exit.");
		      System.in.read();
		      ac.stop();
		    } catch (Exception e) 
		{
		      System.out.println(e);
		    }
	}

	
	public static void main(String[] args) {
		Playsound playsound = new Playsound();
		playsound.playsecondsoud();
		
		
	
	}
}
