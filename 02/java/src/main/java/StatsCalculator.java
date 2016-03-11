import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StatsCalculator {
	
	 private String pathFile;
     private String line;
     private Double somme = 0.0;
     private int counter = 0;
     private List<String> teams;
	
	public StatsCalculator(String pathFile) {
		this.pathFile = pathFile;
		this.teams = new ArrayList<>();
		
	}

	
    public List<String> getTeamsUnderAgeAverage() {
    	
       

        try {
            BufferedReader br = new BufferedReader(new FileReader(pathFile));

            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] truc = line.split(",");

                double age = Double.valueOf(truc[2]);

                somme += age;
                counter++;

            }

           
            double moyenne = somme / counter;

            BufferedReader br2 = new BufferedReader(new FileReader(pathFile));

            br2.readLine();

            while ((line = br2.readLine()) != null) {
                String[] truc = line.split(",");

                double age = Double.valueOf(truc[2]);

                if(age >= moyenne) {
                   /* do nothing */
                } else {
                    teams.add(truc[1]);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return teams;
    }

    public List<String> getTeamsOverPointsAverage() {

        try {
            BufferedReader br = new BufferedReader(new FileReader(pathFile));

            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] truc = line.split(",");

                int points = Integer.valueOf(truc[7]);

                somme += points;
                counter++;

            }

            // Lire l'autre fichier
            double moyenne = somme / counter;

            BufferedReader br2 = new BufferedReader(new FileReader(pathFile));

            br2.readLine();

            while ((line = br2.readLine()) != null) {
                String[] truc = line.split(",");

                int points = Integer.valueOf(truc[7]);

                if(points > moyenne) {
                   teams.add(truc[1]);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return teams;
    }
}
