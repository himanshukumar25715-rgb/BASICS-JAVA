import java.util.Scanner;
public class factorial {
    public static int fact(int number){
        if(number ==0 || number ==1){
            return 1;
        }
        else{
            return number*fact(number-1);
        }
    }
    
    public static void main(String[]args){
        System.out.println(" Enter a number ");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        System.out.println("Factorial: " + fact(number));
    }
}
    

