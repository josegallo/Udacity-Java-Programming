public class Tester
{
    public static void main(String[] args)
    {
        Manager Honcho = new Manager ("Honcho", 50000, 60000);
        System.out.println(Honcho.toString());
        System.out.println( "Bonus : " + Honcho.getBonus());
        System.out.println( "Total salary : " + Honcho.getSalary());
    }
}
