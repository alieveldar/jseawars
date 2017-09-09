import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by modus on 6/26/16.
 */
public class SimpleDotComGame {
    public static void main(String[] args) {
        int numofGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleDotComGame theDotCom = new SimpleDotComGame();
        int randomNum;
        randomNum = (int)  (Math.random()*5);
        ArrayList<String> locations = new ArrayList<>();
        Integer[] randomIntLocations = {randomNum, randomNum + 1, randomNum + 2};
        for (Integer randomInt : randomIntLocations) {
            locations.add(String.valueOf(randomInt));
        }
        DotCom.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive == true){
            String guess = helper.getUserInput("Введите число");
            String rezult = DotCom.checkYourself(guess);
            System.out.println(rezult);
            numofGuesses++;

            if(rezult.equals("Потопил")){
                isAlive = false;
                System.out.println("Вам потребовалось " + numofGuesses + " попыток или попытки");
            }

        }
    }
}
