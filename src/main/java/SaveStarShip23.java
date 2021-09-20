import java.util.*;

public class SaveStarShip23 {

    public boolean isHangarOk(int side1, int side2, int price){
        double a = side1>side2 ? (double)side1/side2 : (double)side2/side1;
        return (side1*side2>=1500 & a<=2.0 & price <= 1000*side1*side2);
    }

    //Test output
    public static void main(String[] args) {
        SaveStarShip23 ship = new SaveStarShip23();


        //Should be true
        System.out.println(ship.isHangarOk(100, 75, 1000000));
    }
}