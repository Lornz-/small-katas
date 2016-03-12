package humanoid;

import soundChannel.ISoundChannel;

/**
 * Created by lornz- on 2016-03-11.
 */
public abstract class Humanoid {

    protected ISoundChannel soundChannel;

    public Humanoid(ISoundChannel soundChannel) {
        this.soundChannel = soundChannel;
    }

    public abstract void walk();
}
