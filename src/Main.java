import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ageReq = 21;
        int age;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age as an integer.");
        if (scan.hasNextInt()) {
            age = scan.nextInt();
            if (age >= ageReq) {
                System.out.println("You get a paper wristband.");
            } else {
                System.exit(0);
            }
        } else {
            System.exit(0);
        }
    }
}