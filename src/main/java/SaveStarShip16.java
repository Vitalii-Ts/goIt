import java.util.*;

public class SaveStarShip16 {
    public int calculateDistance(int distance) {
        if (distance < 0) {
            return distance * -1;
        }

        return distance;
    }
    public String[] getPlanets(String galaxy) {
        if (galaxy == "Miaru") {
            return new String[]{"Maux", "Reux", "Piax"};
        }
        else if (galaxy == "Milkyway") {
            return new String[]{"Earth", "Mars", "Jupiter"};
        }
        else if (galaxy == "DangerBanger"){
            return new String[]{"Fobius", "Demius"};

        }
        return new String[0];
    }


    //Test output
    public static void main(String[] args) {
        SaveStarShip16 ship = new SaveStarShip16();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));

        //Should be [Fobius, Demius]
        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));
    }
}