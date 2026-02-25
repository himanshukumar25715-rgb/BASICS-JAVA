import java.util.Scanner;
public class filesw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a case number");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Hello!!");
                break;
            case 2:
                System.out.println("Furrr ho ja ");
                break;
            default:
                System.out.println("meow meow");
        }
       
    }
}
