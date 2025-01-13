public class PlayGame{

    static Player player = new Player();
    private String playersOption;
    private int playerCounter = 0;

    private RandomPick computer = new RandomPick();
    private String compsOption;
    private int compCounter = 0;

    public boolean isTie = false;

    void gameIntro(){
        System.out.println("Welcome to Rock Paper Scissors");
        player.setPlayerName();
        System.out.println("Hello "+player.getPlayerName());
    }

    void getChoices() {
        player.setPlayerChoice();
        System.out.println("3...\n2...\n1...\nGo!");
        playersOption = player.getPlayerChoice().toLowerCase();
        compsOption = computer.getCompChoice().toLowerCase();
        System.out.println("You: "+playersOption);
        System.out.println("Computer: "+compsOption);
    }

    boolean playGame(){
        getChoices();
        return checkForTie();
    }

    boolean checkForTie(){
        //getChoices();
        if(playersOption.equals(compsOption)){
            System.out.println("You tied.");
            isTie = true;
        }else{
            if (playerWins()){
                playerCounter+=1;
                System.out.println(player.getPlayerName()+" wins this round.");
            } else {
                compCounter+=1;
                System.out.println("Computer wins this round.");
            }
            isTie = false;
        }
        System.out.println(player.getPlayerName()+": "+playerCounter+"\t\tComputer: "+compCounter);
        return isTie;
    }

    boolean playerWins() {
        //true = player wins, false = player loses
        if (playersOption.equals("rock")) {
            return compsOption.equals("scissors");
        } else if (playersOption.equals("paper")) {
            return compsOption.equals("rock");
        } else {
            return compsOption.equals("paper");
        }
    }

    void findWinner(){
        if(playerCounter>compCounter){
            System.out.println("Player wins by "+(playerCounter-compCounter)+" points.");
        } else if(compCounter>playerCounter) {
            System.out.println("Computer wins by "+(compCounter-playerCounter)+" points.");
        }else{
            System.out.println("You tied points with the Computer.");
        }
    }

}
