// 14.	Competitors are judged by five judges during the competition.
// Each judge can score 1, 2, 3, 4 or 5 points. Then, the highest score and the lowest score are thrown out.
// The arithmetic mean of the remaining three scores is calculated
// and this is the competitor's final result that is displayed.
// Create a class diagram for the competition scoring system.
// Define the class and write a program that calculates the final result for three players.





package pl.pankalla.weronika;

public class Main {

    public static void main(String[] args) {
        Player firstPlayer = new Player("Weronika");

        //First judge score:
        firstPlayer.scores[0] = 2;

        //Second judge score:
        firstPlayer.scores[1] = 2;

        //Third judge score:
        firstPlayer.scores[2] = 5;

        //Forth judge score:
        firstPlayer.scores[3] = 4;

        //Fifth judge score:
        firstPlayer.scores[4] = 1;

        
        firstPlayer.findTheHighest();

        firstPlayer.findTheLowest();

        firstPlayer.createFinalScore();



    }
}
