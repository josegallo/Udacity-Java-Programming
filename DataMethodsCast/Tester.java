
import java.util.Arrays;
public class Tester
{
    public static void main(String[] args)
    {
        
        System.out.println ("Starting");
        DataMethods data1 = new DataMethods();
        Comparable c1 = new String ("Hello");
        Comparable c2 = new Integer(21);
        
        System.out.println("length of c1 = " + data1.getLength(c1));
        System.out.println("length of c2 = " + data1.getLength(c2));
    }
}
