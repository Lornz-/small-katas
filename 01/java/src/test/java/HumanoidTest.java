import static org.junit.Assert.*;

import org.junit.Test;

public class HumanoidTest {
	
	TestSoundChannel testChannel = new TestSoundChannel();
	Humanoid humanoid;
    
	@Test
	public void printCorrectSound(){
		
		this.humanoid = new Humanoid("Lady with high heels", testChannel);
		this.humanoid.walk();
		
		assertEquals("TOC! TOC! TOC!", this.testChannel.printedSound);
		
		this.humanoid = new Humanoid("Ninja", testChannel);
		this.humanoid.walk();
		
		assertEquals("...", this.testChannel.printedSound);
		
		this.humanoid = new Humanoid("Pirate", testChannel);
		this.humanoid.walk();
		
		assertEquals("Tap, toc, tap, toc.", this.testChannel.printedSound);
		
		this.humanoid = new Humanoid("Robot", testChannel);
		this.humanoid.walk();
		
		assertEquals("Bzz, bang, bzzz, bang", this.testChannel.printedSound);
		
		this.humanoid = new Humanoid("Regular human", testChannel);
		this.humanoid.walk();
		
		assertEquals("Tap, tap, tap, tap", this.testChannel.printedSound);
		
		
	}
	
	
	public static class TestSoundChannel implements SoundChannel {

		public String printedSound;
		
		@Override
		public void printSound(String sound) {
			printedSound = sound;
		}
		
	}
}
