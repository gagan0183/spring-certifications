package soundsystem;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(CdConfig.class)
//@ComponentScan(basePackages = {"soundsystem"})
public class CdPlayerConfig {
	
	@Bean
	public CdPlayer cdPlayer(CompactDisc compactDisc) {
		return new CdPlayer(compactDisc);
	}
}
