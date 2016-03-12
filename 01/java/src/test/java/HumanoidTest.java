import static org.junit.Assert.*;

import humanoid.Humanoid;
import org.junit.Test;

import soundChannel.ISoundChannel;

import java.security.InvalidParameterException;

public class HumanoidTest {

	private static final String REGULAR_HUMAN = "Regular Human";
	private static final String NINJA = "Ninja";
	private static final String ROBOT = "Robot";
	private static final String PIRATE = "Pirate";
	private static final String LADY_WITH_HIGH_HEELS = "Lady with high heels";
	private static final String NONE_EXISTING_HUMANOID = "None";

	TestableSoundChannel testChannel = new TestableSoundChannel();
	Humanoid humanoid;

	@Test
	public void should_return_tap_tap_sound_when_regular_human_walk() {

		this.humanoid = HumanoidFactory.getHumanoid(REGULAR_HUMAN, testChannel);
		this.humanoid.walk();

		assertEquals("Tap, tap, tap, tap", this.testChannel.printedSound);

	}

	@Test
	public void should_return_no_sound_when_ninja_walk() {

		this.humanoid = HumanoidFactory.getHumanoid(NINJA, testChannel);
		this.humanoid.walk();

		assertEquals("...", this.testChannel.printedSound);

	}

	@Test
	public void should_return_bzz_bang_sound_when_robot_walk() {

		this.humanoid = HumanoidFactory.getHumanoid(ROBOT, testChannel);
		this.humanoid.walk();

		assertEquals("Bzz, bang, bzzz, bang", this.testChannel.printedSound);

	}


	@Test
	public void should_return_tap_toc_sound_when_pirate_walk() {

		this.humanoid = HumanoidFactory.getHumanoid(PIRATE, testChannel);
		this.humanoid.walk();

		assertEquals("Tap, toc, tap, toc.", this.testChannel.printedSound);

	}

	@Test(expected = AssertionError.class)
	public void should_AssertionError_when_humanoid_is_null() {

		this.humanoid = HumanoidFactory.getHumanoid(null, testChannel);

	}

	@Test(expected = InvalidParameterException.class)
	public void should_throw_invalidParameterException_when_humanoid_does_not_exist() {

		this.humanoid = HumanoidFactory.getHumanoid(NONE_EXISTING_HUMANOID, testChannel);

	}

	@Test
	public void should_return_toc_toc_sound_when_lady_with_high_heels_walk() {

		this.humanoid = HumanoidFactory.getHumanoid(LADY_WITH_HIGH_HEELS, testChannel);
		this.humanoid.walk();

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


