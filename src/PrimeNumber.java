import java.util.Scanner;

public class PrimeNumber
{
    static void main(String[] args)
    {

        System.out.println("Please enter the fucking number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        boolean isPrime=true;
        if(number<=1)
            isPrime=false;
        else
        {
            for(int i=2;i<number;i++)
            {
                if(number%i==0)
                {
                    isPrime=false;;
                    break;
                }
            }
        }
        if(isPrime)
            System.out.println("The number"+number+" is a prime number");
        else
            System.out.println("The number"+number+" is not a prime number");
    }
}
