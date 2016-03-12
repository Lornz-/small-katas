package humanoid;
import soundChannel.ISoundChannel;

/**
 * Created by lornz- on 2016-03-11.
 */
public class Ninja extends Humanoid {

    public Ninja(ISoundChannel soundChannel) {
        super(soundChannel);
    }

    @Override
    public void walk() {
        this.soundChannel.printSound("...");
    }
}