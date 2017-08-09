package soundsystem;

import java.util.List;

public class BlankDIsc implements CompactDisc {
	
	private String title;
	private String artist;
	private List<String> tracks;
	
	public BlankDIsc(String title, String artist, List<String> tracks) {
		this.title = title;
		this.artist = artist;
		this.tracks = tracks;
	}
	
	@Override
	public void play() {
		System.out.println("playing " + title + " by " + artist);
		for(String track : tracks) {
			System.out.println("track " + track);
		}
	}
}
