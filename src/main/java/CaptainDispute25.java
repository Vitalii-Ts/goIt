public class CaptainDispute25 {
    public String evenOrOdd(int number) {
        return number%2 == 0 ? "even" : "odd";
    }



    public static void main(String[] args) {
        CaptainDispute25 captainDispute = new CaptainDispute25();

        //Should be even
        System.out.println(captainDispute.evenOrOdd(10));

        //Should be odd
        System.out.println(captainDispute.evenOrOdd(5));
    }
}