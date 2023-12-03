using System;

class Program
{
    static bool IsNumeric(string str)
    {
        foreach (char c in str)
        {
            if (!char.IsDigit(c) && c != '.')
            {
                return false;
            }
        }
        return true;
    }

    static void Main()
    {
        double price;
        string productName;
        string priceInput;

        Console.Write("Enter product name: ");
        productName = Console.ReadLine();

        do
        {
            Console.Write("Enter product price: ");
            priceInput = Console.ReadLine();

            if (IsNumeric(priceInput))
            {
                price = double.Parse(priceInput);

                if (price < 0)
                {
                    Console.WriteLine("Please enter a positive number again.");
                }
                else
                {
                    break;
                }
            }
            else
            {
                Console.WriteLine("Please enter a numeric value again.");
            }
        } while (true);

        Console.WriteLine($"You entered the product \"{productName}\" with a price of {price} hryvnias.");
    }
}
