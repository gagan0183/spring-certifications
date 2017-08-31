package soundsystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CdConfig.class);
		CompactDisc compactDisc = applicationContext.getBean(CompactDisc.class);
		compactDisc.play();
	}
}
