package soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {
	
	private String title = "Sgt. Pepper's lonely hearts club bands";
	private String artist = "The beatles";
	
	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}
}
