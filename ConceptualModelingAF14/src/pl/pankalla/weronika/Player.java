// 14.	Competitors are judged by five judges during the competition.
// Each judge can score 1, 2, 3, 4 or 5 points. Then, the highest score and the lowest score are thrown out.
// The arithmetic mean of the remaining three scores is calculated
// and this is the competitor's final result that is displayed.
// Create a class diagram for the competition scoring system.
// Define the class and write a program that calculates the final result for three players.



package pl.pankalla.weronika;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Player {
    private String playerName;
    private double finalScore;

    Player(String playerName) {
        this.playerName = playerName;
    }


    public int[] scores = new int[5];

    private int theHighest = 0;
    private int indexOfTheHighest = 0;
    public void findTheHighest() {
        for(int i = 0; i < scores.length; i++){
            if(scores[i] > theHighest){
                theHighest = scores[i];
                indexOfTheHighest = i;
            }
        }
        System.out.println("The highest score is: " + theHighest);
        System.out.println("And it's the score from: " + (indexOfTheHighest + 1) + " judge");
    }

    private int theLowest = 5;
    private int indexOfTheLowest = 0;
    public void findTheLowest() {
        for(int i = 0; i < scores.length; i++){
            if(scores[i] < theLowest){
                theLowest = scores[i];
                indexOfTheLowest = i;
            }
        }
        System.out.println("The lowest score is: " + theLowest);
        System.out.println("And it's the score from: " + (indexOfTheLowest + 1) + " judge");

    }

    private int sum = 0;
    public void createFinalScore() {
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] != theLowest && scores[i] != theHighest) {
                this.sum+=scores[i];
            }
        }
        this.finalScore = (double)this.sum/3;
        System.out.println("Final score result of player " + this.playerName + " is: " + this.finalScore);
    }








}
