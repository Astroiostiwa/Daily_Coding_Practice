import java.util.Scanner;

public class ReverseNumber
{
    public static void main(String[] args)
    {
        System.out.println("Enter a number to be reversed:   ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int reversed = 0;

        while (number != 0)
        {
            int digit = number % 10;             //Takes the last digit seperate 1234 % 10 = 4
            reversed = reversed * 10 + digit;    //reversed number; shifts digit by a power of 10 each time
            number = number / 10;                //This gives the remaning number after taking tha last digit
        }
        System.out.println("The reversed number is " + reversed);
    }
}
