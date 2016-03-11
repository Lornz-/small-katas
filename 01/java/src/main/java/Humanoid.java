import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Humanoid {
	private final String humanoidType;
	private static final Map<String, String> SOUNDS_BY_TYPE;
	private ISoundChannel channel;

	static {
		HashMap<String, String> soundsByType = new HashMap<>();

		soundsByType.put("Regular human", "Tap, tap, tap, tap");
		soundsByType.put("Robot", "Bzz, bang, bzzz, bang");
		soundsByType.put("Pirate", "Tap, toc, tap, toc.");
		soundsByType.put("Ninja", "...");
		soundsByType.put("Lady with high heels", "TOC! TOC! TOC!");

		SOUNDS_BY_TYPE = Collections.unmodifiableMap(soundsByType);
	}

	public Humanoid(String humanoidType, ISoundChannel channel) {
		this.humanoidType = humanoidType;
		this.channel = channel;
	}

	public void walk() {
		String sound = SOUNDS_BY_TYPE.get(this.humanoidType);
		channel.printSound(sound);
	}

	public String getHumanoidType() {
		return humanoidType;
	}

}
