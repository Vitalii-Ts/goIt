import java.util.*;
public class MoonComputerTests1 {
    public void testBasicInputOutput() {
        Scanner scanner = new Scanner(System.in);
        String ComputerTests = scanner.nextLine();
        System.out.println(ComputerTests);
        scanner.close();

    }

    public static void main(String[] args) {
        MoonComputerTests1 computerTests = new MoonComputerTests1();
        computerTests.testBasicInputOutput();
    }
}