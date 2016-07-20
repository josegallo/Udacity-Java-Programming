import java.util.Scanner;

public class MonthPrinter
{
    public static void main(String[] args)
    {
        // create scanner
        Scanner in = new Scanner (System.in);
        // ask for input
        System.out.print ("Enter a month number (1 through 12) ");
        // variable input
        // avoid bad inputs (no -integers)
        while (in.hasNextInt())
        {
            int monthNumber = in.nextInt();
            //System.out.print ("Enter a month number (1 through 12) ");
            Month newMonth = new Month(monthNumber);
            System.out.println (newMonth.getMonthName() + " " + newMonth.getNumberOfDays());    
        }

        
        //else System.out.println ("Number must be 1 through 12");
        System.out.println ("Number must be 1 through 12");
        // initializate class month: Month newMont = new Month (input)

    }
}



// TODO:Make the loop count down the days left until vacation.

        
 