import humanoid.Humanoid;
import soundChannel.ConsoleSoundChannel;

public class Main {

    public static void main(String[] args) {

    	ConsoleSoundChannel channel = new ConsoleSoundChannel();
    	
        Humanoid humanoid = HumanoidFactory.getHumanoid("Lady with high heels", channel);
        humanoid.walk();

        humanoid = HumanoidFactory.getHumanoid("Ninja", channel);
        humanoid.walk();

        humanoid = HumanoidFactory.getHumanoid("Pirate", channel);
        humanoid.walk();

        humanoid = HumanoidFactory.getHumanoid("Robot", channel);
        humanoid.walk();

        humanoid = HumanoidFactory.getHumanoid("Regular Human", channel);
        humanoid.walk();
    }
}
