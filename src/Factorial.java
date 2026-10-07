import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        int a;
        int result = 1;

        System.out.println("Please enter a fucking number");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        for(int i=a;i>=1;i--)
        {
            result = result *i;
        }
        System.out.println("The factorial of the number is " + result);
    }
}
