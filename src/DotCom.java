/**
 * Created by modus on 6/26/16.
 */
import java.util.ArrayList;
public class DotCom {
    private static ArrayList<String> locationCells;

    public static void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public static String checkYourself(String userInput) {
        String result = "Мимо";

            int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "Потопил";

            } else {
                result ="Попал";

            }
        }
        return result;
    }




}
