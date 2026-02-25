import java.util.Scanner;
public class greaterone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a ");
        int a = sc.nextInt();
         System.out.println("Enter b");
         int b = sc.nextInt();

         if(a>b){
            System.out.println("a is greater");
         }
         else if(b>a){
            System.out.println("b is greater");
         }
         else{
            System.out.println("both are equal");
         }
    }
    
}
