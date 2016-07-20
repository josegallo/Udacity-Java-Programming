// Complete the method getLength() which takes a Comparable object as its parameter.
// If the parameter references a String object, return the length of the String
// otherwise return -1.


public class DataMethods implements Comparable
{
    /**
     * Gets the length of the object if it is a string
     * @param c the object wehose length we want
     * @return the length if the object is a string otherwise -1
     */

    // TODO: implement the method described by this javadoc
    public int getLength(Comparable c) 
    {

       //if( c.getClass().equals(String.class) )  { //this work too
       if (c instanceof String) {    
           String object = (String) c;
           return object.length();
       }
       else {
           return -1;
       }
    }
    
    public int compareTo(Object object) {
        return 0;
    }
}
