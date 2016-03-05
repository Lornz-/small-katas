public class Main {

    public static void main(String[] args) {
    	ConsoleSoundChannel channel = new ConsoleSoundChannel();
    	
        Humanoid humanoid1 = new Humanoid("Lady with high heels", channel);
        humanoid1.walk();

        Humanoid humanoid2 = new Humanoid("Ninja", channel);
        humanoid2.walk();

        Humanoid humanoid3 = new Humanoid("Pirate", channel);
        humanoid3.walk();

        Humanoid humanoid4 = new Humanoid("Robot", channel);
        humanoid4.walk();

        Humanoid humanoid5 = new Humanoid("Regular human", channel);
        humanoid5.walk();
    }
}
