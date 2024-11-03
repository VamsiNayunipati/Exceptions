import java.util.Scanner;
public class TempAndHumidity
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String Temperature = "";
        String Humidity = "";

        while (true)
        {
            try
            {
                System.out.print("Enter Temperature or Enter 'X' to Exit: ");
                Temperature = scanner.next();
                if (Temperature.equalsIgnoreCase("X"))
                {
                    break;
                }

                System.out.print("Enter Humidity or Enter 'X' to Exit): ");
                Humidity = scanner.next();
                
                if (Humidity.equalsIgnoreCase("X"))
                {
                    break;
                }

                double temperature = Double.parseDouble(Temperature);
                double humidity = Double.parseDouble(Humidity);

                checkConditions(temperature, humidity);

                System.out.println("Temperature and Humidity conditions are fine to play golf.");

            } 

            catch (TooHotException | TooHumidException e) 
            {
                System.out.println(e.getMessage());
            }

            catch (NumberFormatException e)
            {
                System.out.println("Invalid input, please enter numeric values.");
            }
        }

        System.out.println("Program Exited.");
        scanner.close();
    }

    public static void checkConditions(double temperature, double humidity)
            throws TooHotException, TooHumidException
    {
        if (temperature > 85)
        {
            throw new TooHotException("Temperature is above 85 degrees. It is too hot to play golf.");
        }

        if (humidity > 90)
        {
            throw new TooHumidException("Humidity is above 90%. It is too humid to play golf.");
        }
    }
}
