
public class NoninvertingAmplifier extends Amplifier
{
    // TODO: supply the implementation of NoninvertingAmplifier as a subclass of Amplifier

    // R1 and R2 represent resistance. The gain (g) is calculated from the resistance as follows:
    // NoninvertingAmplifier:      g = 1 + (R2 / R1)
    // TODO: the getGain method needs to return the correct gain (g)
    
    public NoninvertingAmplifier (int resistance1, int resistance2)
    {
       super(resistance1, resistance2);
    }
    
    public double getGain()
    {
        return 1 + (double ) super.getR2()/super.getR1();
        //return 1 + (double ) (getR2()/getR1());
    }
}
