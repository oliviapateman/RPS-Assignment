import java.util.Scanner;

public class Player {
    private String playerName;
    private String playerChoice;

    Scanner userInput = new Scanner(System.in);

    void setPlayerName(){
        System.out.println("Please enter your name: ");
        playerName = userInput.nextLine();
    }

    String getPlayerName(){
        return playerName;
    }

    void setPlayerChoice(){
        System.out.println("Please enter rock/paper/scissors: ");
        playerChoice = userInput.nextLine();
    }

    String getPlayerChoice(){
        return playerChoice;
    }
}
