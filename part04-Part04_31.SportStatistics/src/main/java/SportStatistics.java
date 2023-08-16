
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> statistics = new ArrayList<>();
                
        System.out.print("File: ");
        String file = scan.nextLine();
        System.out.print("Team: ");
        String searchTeam = scan.nextLine();
        
        int numberOfGames = 0;
        int numberOfWins = 0 ;
        int numberOfLosses = 0;
        
        try (Scanner fileScan = new Scanner(Paths.get(file))) {
            while (fileScan.hasNextLine()) {
                String line = fileScan.nextLine();
                
                String[] array = line.split(",");
                String homeTeam = array[0];
                String visitingTeam = array[1];
                int homeTeamPoints = Integer.parseInt(array[2]);
                int visitingTeamPoints = Integer.parseInt(array[3]);
                
                if ((!homeTeam.contains(searchTeam)) && (!visitingTeam.contains(searchTeam))) {
                    continue;
                }
                
                numberOfGames++;
                
                if ((homeTeam.contains(searchTeam) && homeTeamPoints > visitingTeamPoints)
                   || (visitingTeam.contains(searchTeam) && visitingTeamPoints > homeTeamPoints)) {
                    numberOfWins++;
                } else {
                    numberOfLosses++;
                }
                
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Games: " + numberOfGames);
        System.out.println("Wins: " + numberOfWins);
        System.out.println("Losses: " + numberOfLosses);
        
    }

}
