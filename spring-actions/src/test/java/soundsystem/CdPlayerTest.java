package soundsystem;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CdPlayerConfig.class)
public class CdPlayerTest {
		
	@Autowired
	private SgtPeppers compactDisc;
	
	@Autowired
	private MediaPlayer mediaPlayer;
	
	@Test
	public void cdShouldNotNull() {
		assertNotNull(compactDisc);
	}
	
	@Test
	public void play() {
		mediaPlayer.play();
	}
}
