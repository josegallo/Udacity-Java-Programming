// BlueJ project: lesson9/measure5
public class LargestTester
{
    public static void main(String[] args)
    {
        Country[] centralAmericanCountries =
        {
            new Country("Belize", 22966),
            new Country("Costa Rica", 51100),
            new Country("El Salvador", 21041),
            new Country("Guatemala", 108889),
            new Country("Honduras", 112492),
            new Country("Nicaragua", 130373),
            new Country("Panama", 75417)
        };

        // We want this as a Country, not as Measurable, so we can
        // call getName. But it doesn't work:
        //Country largestCountry = Data.largest(centralAmericanCountries); //they are imcopatibles, left is a Country, right is a Measurable
        //Measurable largest = Data.largest(centralAmericanCountries); //
        //System.out.println("Largest country: " + largest.getName()); // getName() for Measurable largest doesn't exist
        //System.out.println("Largest country: " + largest); // will print the Object Country@536d419c but not the name
        
        // so first we get the Measureable:
        Measurable largest = Data.largest(centralAmericanCountries);

        //and 2nd we cast (convert) the Measureable to Country:
        //so we can use the getName() method of Country:
        Country largestCountry = (Country) largest;
        System.out.println("Largest country: " + largestCountry.getName());
        System.out.println("Expected: Nicaragua");
        
        Measurable smallest = Data.smallest(centralAmericanCountries);
        Country smallestCountry = (Country) smallest;
        System.out.println("Largest country: " + smallestCountry.getName());
        System.out.println("Expected: El Salvador");
        
    }
}
