public class CreditCardTester1
{
    public static void main(String[] args)
    {
        System.out.println("visa 12345L");
        CreditCard1 validCard = new CreditCard1(12345L);
        validCard.sumCertainDigits();
        //System.out.println("Expected: 9");
        System.out.println("visa 45678L");
        CreditCard1 validCard2 = new CreditCard1(45678L);
        validCard2.sumCertainDigits();
        //System.out.println("Expected: 18");


        //CreditCard1 invalidCard = new CreditCard1(4417123456879113L);
        //System.out.println("Actual: " + invalidCard.sumCertainDigits());
        //System.out.println("Expected: false");

        //CreditCard1 easyToRememberValidCard = new CreditCard1(4111111111111111L);
        //System.out.println("Actual: " + easyToRememberValidCard.sumCertainDigits());
        //System.out.println("Expected: true");

    }
}
