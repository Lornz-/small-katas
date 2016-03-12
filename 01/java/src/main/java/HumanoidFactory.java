import humanoid.*;
import soundChannel.ISoundChannel;

import java.security.InvalidParameterException;

/**
 * Created by lornz- on 2016-03-11.
 */
public class HumanoidFactory {

    public static Humanoid getHumanoid(String type, ISoundChannel soundChannel) {

        assert type != null : "<type> should not be null";

        if (type.equals("Regular Human"))
            return new RegularHuman(soundChannel);

        else if (type.equals("Ninja"))
            return new Ninja(soundChannel);

        else if (type.equals("Robot"))
            return new Robot(soundChannel);

        else if (type.equals("Pirate"))
            return new Pirate(soundChannel);

        else if (type.equals("Lady with high heels"))
            return new LadyWithHighHeels(soundChannel);

        else
            throw new InvalidParameterException();
    }
}
