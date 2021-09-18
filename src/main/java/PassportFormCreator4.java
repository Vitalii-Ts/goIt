import java.util.*;
class PassportFormCreator4 {
    public void createForms(){
        Scanner scanner = new Scanner(System.in);
        String a= scanner.nextLine();
        String b=scanner.nextLine();
        int c=scanner.nextInt();
        scanner.close();
        c=c*10;
        System.out.println(a+ " "+b+" "+c);
        System.out.println(a.toUpperCase());
        System.out.println(b.toUpperCase());
        System.out.println(c);
    }
}
