import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors{

    public static void main(String[] args) {

        boolean playAgain = true;
        Scanner userInput = new Scanner(System.in);
        String answer;

        //Intro
        PlayGame newGame = new PlayGame();
        newGame.gameIntro();
        boolean isEndOfGame = false;

        do {
            //Start game
            newGame.playGame();
            while(!isEndOfGame) {
                //Redo
                if (newGame.isTie) {
                    newGame.playGame();
                }else{
                    isEndOfGame=true;
                }
            }
            //Play again?
            System.out.println("Would you like to play another round?");
            answer = userInput.nextLine().toLowerCase();
            if(answer.equals("no")){
                playAgain=false;
            }else{
                isEndOfGame=false;
            }
        }
        while (playAgain);

        newGame.findWinner();
        System.out.println("Good game.");

    }
}
