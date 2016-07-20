public class Tester
{
    public static void main (String[] args)
    {
        System.out.println("robot 1: ");
        Robot robot1 = new Robot (0,0);
        System.out.println(robot1.getLocation());
        for (int i = 0; i < 20; i++) {
            robot1.makeRandomMove();
        }
        System.out.println(robot1.getLocation());
        System.out.println(robot1.getDistanceFromStart());
        System.out.println("");
        System.out.println("robot 2: ");
        Robot robot2 = new Robot (0,0);
        System.out.println(robot2.getLocation());
        for (int i = 0; i < 200000; i++) {
            robot2.makeRandomMove();
        }
        System.out.println(robot2.getLocation());
        System.out.println(robot2.getDistanceFromStart());
    }
}
