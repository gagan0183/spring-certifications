package soundsystem;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CdConfig {
	@Bean
	public CompactDisc compactDisc() {
		List<String> tracks = new ArrayList<String>();
		tracks.add("With a little god's help");
		tracks.add("I got the uhg offer letter");
		tracks.add("I joined");
		tracks.add("I blessed with a baby boy");
		return new BlankDIsc("Sg peppers", "beatles", tracks);
	}
}
