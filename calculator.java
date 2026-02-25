import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the digit a");
        int a = sc.nextInt();
        System.out.println("enter the b digit");
        int b = sc.nextInt();
        
        String op = sc.next();
        switch(op){
                 
            case "+":
            System.out.println(a+b);
            break;
            case "-":
            System.out.println(a-b);
            break;
            case "*":
            System.out.println(a*b);
            break;
            case "/":
            System.out.println(a/b);
            break;
            default:
            System.out.println("invalid");

        }

    }
    
}
