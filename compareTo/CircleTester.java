
import java.util.Arrays;
public class CircleTester
{
    public static void main(String[] args)
    {
        System.out.println ("Starting");
        UnitCircle[] circleArray =
        {
            new UnitCircle(1),
            new UnitCircle(3),
            new UnitCircle(2),
            new UnitCircle(9),
            new UnitCircle(12),
            new UnitCircle(5),
            new UnitCircle(4)
        };

        Arrays.sort(circleArray); //we need to have implemented compareTo() method for sort to work
        System.out.println(Arrays.asList(circleArray).toString());
    }
}
