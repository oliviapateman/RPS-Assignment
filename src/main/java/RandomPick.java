import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomPick {

    private List<String> choices = new ArrayList<>(List.of("Rock","Paper","Scissors"));
    private String compChoice;

    String getCompChoice(){
        int choicesIndex = new Random().nextInt(choices.size());
        compChoice = choices.get(choicesIndex);
        return compChoice;
    }
}
