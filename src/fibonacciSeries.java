public class fibonacciSeries

    /*Fibonacci Series is the series in which the the number to the right
    is formed by the sum of previous two numbers
    --Usually starts from 0,1=1;    1,1=2;  2,1=3;  3,2=5;  5,3=8.....
    Example:0,1,1,2,3,5,8,13,21,34,55,89........
    */
{
    static void main(String[] args) {
        int limit=10;
        int firstnumber=0;
        int secondnumber=1;

        System.out.print(firstnumber+",");
        System.out.print(secondnumber+",");

        for(int i=0;i<limit;i++)
        {
            int nextnumber= firstnumber + secondnumber;
            firstnumber = secondnumber;
            secondnumber =  nextnumber;
            System.out.print(nextnumber+",");
        }
    }
}
