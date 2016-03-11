public class Main {

    public static void main(String[] args) {
    	
    	StatsCalculator statsCalculator = new StatsCalculator(System.getProperty("user.dir") + "/src/main/resources/input.csv");
    	
        System.out.println("Les équipes dont l'âge moyen est en dessous de la moyenne sont :");       
       
		statsCalculator.getTeamsUnderAgeAverage().forEach(System.out::println);
        
        System.out.println("");
        System.out.println("Les équipes dont le nombre de points moyen est au-dessus de la moyenne sont :");
        
        statsCalculator.getTeamsOverPointsAverage().forEach(System.out::println);
    }
}
