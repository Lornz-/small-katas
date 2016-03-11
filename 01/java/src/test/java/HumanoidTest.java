import static org.junit.Assert.*;

import org.junit.Test;

public class HumanoidTest {

	private static final String REGULAR_HUMAN = "Regular Human";
	private static final String NINJA = "Ninja";
	private static final String ROBOT = "Robot";
	private static final String PIRATE = "Pirate";
	private static final String LADY_WITH_HIGH_HEELS = "Lady with high heels";

	TestableSoundChannel testChannel = new TestableSoundChannel();
	Humanoid humanoid;

	AbstractHumanoid aHumanoid;

	@Test
	public void should_return_tap_tap_sound_when_regular_human_walk() {

		this.aHumanoid = HumanoidFactory.getHumanoid(REGULAR_HUMAN, testChannel);
		this.aHumanoid.walk();

		assertEquals("Tap, tap, tap, tap", this.testChannel.printedSound);

	}

	@Test
	public void should_return_no_sound_when_ninja_walk() {

		this.aHumanoid = HumanoidFactory.getHumanoid(NINJA, testChannel);
		this.aHumanoid.walk();

		assertEquals("...", this.testChannel.printedSound);

	}

	@Test
	public void should_return_bzz_bang_sound_when_robot_walk() {

		this.aHumanoid = HumanoidFactory.getHumanoid(ROBOT, testChannel);
		this.aHumanoid.walk();

		assertEquals("Bzz, bang, bzzz, bang", this.testChannel.printedSound);

	}

	@Test
	public void should_return_tap_toc_sound_when_pirate_walk() {

		this.aHumanoid = HumanoidFactory.getHumanoid(PIRATE, testChannel);
		this.aHumanoid.walk();

		assertEquals("Tap, toc, tap, toc.", this.testChannel.printedSound);

	}

	@Test
	public void should_return_toc_toc_sound_when_lady_with_high_heels_walk() {

		this.aHumanoid = HumanoidFactory.getHumanoid(LADY_WITH_HIGH_HEELS, testChannel);
		this.aHumanoid.walk();

		assertEquals("TOC! TOC! TOC!", this.testChannel.printedSound);

	}

	public static class TestableSoundChannel implements ISoundChannel {

		public String printedSound;

		@Override
		public void printSound(String sound) {
			printedSound = sound;
		}

	}
}


