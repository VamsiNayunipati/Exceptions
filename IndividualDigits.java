public class IndividualDigits
{
    public static void DisplayDigitsInReverse(int number)
    {
        if (number == 0)
        {
            return;
        }

        System.out.println(number % 10);

        DisplayDigitsInReverse(number / 10);
    }

    public static void main(String[] args)
    {
        int number = 1234;
        DisplayDigitsInReverse(number);
    }
}



