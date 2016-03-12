package humanoid;

import soundChannel.ISoundChannel;

/**
 * Created by lornz- on 2016-03-11.
 */
public class RegularHuman extends Humanoid {

    public RegularHuman(ISoundChannel soundChannel) {
        super(soundChannel);
    }

    @Override
    public void walk() {
        this.soundChannel.printSound("Tap, tap, tap, tap");
    }
}
