import java.util.ArrayList;

public class Scene2
{
    public static void main(String[] args)
    {
        ArrayList<Animated> elements = new ArrayList<Animated>();
        elements.add(new Car(100, 300));
        elements.add(new Car(250, 300));
        elements.add(new Car(250, 350));

        elements.add(new House(100, 150, 100, 100));
        elements.add(new House(250, 100, 150, 150));

        elements.add(new Dog(200, 100, "Fido.jpg"));
        elements.add(new Dog(100, 400, "Rex.jpg"));
        elements.add(new Dog(200, 400, "Lucky.jpg"));
        for (int i = 1; i <= 10; i++)
        {
            for (Animated a : elements)
            {
                a.draw();
                a.move(1);
            }
        Canvas.snapshot();          
        }
    }
}
