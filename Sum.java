import java.util.Scanner;
public class Sum {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        System.out.println("hello world");
        System.out.println("Enter a number");
        int a= sc.nextInt();
        System.out.println("Enter second number");
        int b= sc.nextInt();
        int c= (a+b);
        System.out.println("The sum is:"+c);

    }
}