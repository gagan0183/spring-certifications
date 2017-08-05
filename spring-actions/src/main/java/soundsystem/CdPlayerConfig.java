package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = {"soundsystem"})
public class CdPlayerConfig {
	
	@Bean
	public CompactDisc compactDisc() {
		return new SgtPeppers();
	}
	
	@Bean
	public CdPlayer cdPlayer() {
		return new CdPlayer(compactDisc());
	}
}
