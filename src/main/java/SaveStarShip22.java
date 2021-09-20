import java.util.*;

public class SaveStarShip22 {
    public String getMyPrizes(int ticket){
        Scanner scanner = new Scanner(System.in);
        if ((ticket % 10 == 0) & (ticket > 200)){return "crystall coin";}
        if((ticket % 10 == 7) & (ticket > 200)){return "chip coin";}
        else if (ticket % 10 == 7){return "chip";}
        if ((ticket % 10 == 0) & (ticket % 10 == 7)){return "crystall chip";}
        else if(ticket % 10 == 0){return "crystall";}
        else if (ticket > 200){return "coin";}
        return "";
    }

    //Test output
    public static void main(String[] args) {
        SaveStarShip22 ship = new SaveStarShip22();


        //Should be "crystall coin"
        System.out.println(ship.getMyPrizes(250));
    }
}