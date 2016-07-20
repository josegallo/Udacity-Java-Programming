
/**
 * Represents a circle whose radius is multiples of the unit circle - a circle with radius 1
 */
public class UnitCircle implements Comparable
{
    private int radius;

    public UnitCircle(int radius)
    {
        this.radius = radius;
    }

    public int getRadius()
    {
        return radius;
    }

    public String toString()
    {
        return "UnitCircle[r=" + radius + "]";
    }

    public int compareTo(Object otherObject)
    {
        UnitCircle otherCircle = (UnitCircle) otherObject;
        if (radius < otherCircle.getRadius()) 
        { 
            return -1;
        }
        else if (radius > otherCircle.getRadius()) 
        { 
            return 1;
            
        }
        else {return 0;}
    }

}
