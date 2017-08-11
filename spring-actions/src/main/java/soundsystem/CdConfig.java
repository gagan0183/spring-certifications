package soundsystem;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("app.properties")
public class CdConfig {
	
	@Autowired
	private Environment environment;
	
	@Value("${prop}")
	String prop;
	
	@Bean
	public CompactDisc compactDisc() {
		List<String> tracks = new ArrayList<String>();
		tracks.add(prop);
		tracks.add("I got the uhg offer letter");
		tracks.add("I joined");
		tracks.add("I blessed with a baby boy");
		return new BlankDIsc("Sg peppers", "beatles", tracks);
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
