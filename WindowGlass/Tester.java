public class Tester {

    public static void main(String[] args)
    {
        System.out.println("Instance Methods");
        WindowShape Ventanal = new WindowShape (10.0, 20);
        double area = Ventanal.area(10.0, 20);
        System.out.printf("%.2f\n", area);
        
        System.out.println("Static Methods");
        System.out.printf("%.2f\n", WindowShape.area(10.0, 20));
        System.out.printf("%.2f\n", WindowShape.area(100, 300.0));
        System.out.printf("%.2f\n", WindowShape.area(100, 100));
    }
}
