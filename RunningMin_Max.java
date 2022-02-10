import java.util.Scanner;
public class RunningMin_Max
{
    public static void main (String[] args)
    {
        int num1; //hold the user input
        int max = 0; //holds max
        int min = 0; //holds min

        Scanner keyboard = new Scanner (System.in);
        System.out.println("This program evaluates Minimum and Maximum of the entered numbers \n" +
                "Please enter integer numbers, enter -99 to stop");

        do
        {
            num1 = keyboard.nextInt();

            if ((num1 < max) && (num1 != -99))
            {
                min = num1;
            }
            else if (num1 > max )
            {
                max = num1;
            }
        } while (num1 != -99);

        System.out.println("The maximum number is " + max + ".");
        System.out.println("The minimum number is " + min + ".\n\n" +
                "Program ends.");
    }
}

/*
Sample Output:
This program evaluates Minimum and Maximum of the entered numbers
Please enter integer numbers, enter -99 to stop
22
44
55
33
-99
The maximum number is 55.
The minimum number is 33.



Program ends.
 */




