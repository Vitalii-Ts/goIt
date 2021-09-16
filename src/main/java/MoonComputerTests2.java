import java.util.*;
public class MoonComputerTests2 {
    MoonComputerTests2 keyboard1 = new MoonComputerTests2();
    public static Scanner scanner = new Scanner(System.in);

    public static void inputOutput(){
        System.out.println("First sign");
        int sc1 = scanner.nextInt();
        System.out.println("Second sign");
        int sc2 = scanner.nextInt();
        int result1 = sc1 + sc2;
        int result2 = sc1 - sc2;
        int result3 = sc1 * sc2;
        int result4 = sc1 / sc2;
        System.out.printf("%d %d %d %d%n", result1, result2, result3, result4);

    }

    public static void main(String[] args) {

        MoonComputerTests2.inputOutput();
    }

}