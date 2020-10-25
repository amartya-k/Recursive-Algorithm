using System;


namespace FibonacciRecursive
{
    class FibonacciSequence
    {
        static void Main(string[] args)
        {
            int number = 0;
            Console.Write("\n\nRecursive Function : To calculate the Fibonacci number of a specific term :\n");
            Console.Write("-------------------------------------------------------------------------------\n");
            Console.Write("Enter a number: ");
            number = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("\nThe Fibonacci of {0} th term  is {1} \n", number, Fibonacci(number));
        }

        

        public static int Fibonacci(int n1)
        {
            //if ( (n1 == 1) || (number == 2) )
            if (n1 <= 2)
                return 1;
            else
                return Fibonacci(n1 - 1) + Fibonacci(n1 - 2);
        }


    }
}
