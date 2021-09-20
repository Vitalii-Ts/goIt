public class SaveStarShip15 {
    public int calculateDistance(int distance){
        if(distance > 0) {
            return distance;
        }
        {
            return distance*-1;
        }
    }
    //Test output
    public static void main(String[] args) {
        SaveStarShip15 ship = new SaveStarShip15();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));
    }
}