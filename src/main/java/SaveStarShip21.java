import java.util.*;

public class SaveStarShip21 {

    public void calculateMaxPower(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();
        int max = a > b ? a : b;
        max = max > c ? max : c;
        if(max <10){
            float highPower = max * 0.7f;
            System.out.println(highPower);
        }else if ((10<= max) && (max <= 100)){
            float highPower = max *1.2f;
            System.out.println(highPower);
        }else{
            float highPower = max * 2.1f;
            System.out.println(highPower);
        }
    }

    //Test output
    public static void main(String[] args) {
        SaveStarShip21 ship = new SaveStarShip21();

        ship.calculateMaxPower();
    }
}