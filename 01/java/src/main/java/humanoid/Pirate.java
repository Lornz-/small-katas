package humanoid;

import soundChannel.ISoundChannel;

/**
 * Created by lornz- on 2016-03-11.
 */
public class Pirate extends Humanoid {

    public Pirate(ISoundChannel soundChannel) {
        super(soundChannel);
    }

    @Override
    public void walk() {
        this.soundChannel.printSound("Tap, toc, tap, toc.");

    }
}
