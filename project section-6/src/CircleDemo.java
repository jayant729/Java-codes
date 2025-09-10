public class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5);
        Circle circle3= new Circle(10);



        System.out.println("Radius is: " + circle1.getRadius());
        System.out.println("circle 1 Circumference: " +String.format("%.2f",+circle1.circumference()));
        System.out.println("Circle 1 Area: " +circle1.area());
        System.out.println();

        System.out.println("circle 2 Circumference: " +circle2.circumference());
        System.out.println("Circle 2 Area: " +String.format("%.2f",circle2.area()));
        System.out.println();

        System.out.println("circle 3 Circumference: " +circle3.circumference());
        System.out.println("Circle 3 Area: " +circle3.area());
        System.out.println();


    }
}
